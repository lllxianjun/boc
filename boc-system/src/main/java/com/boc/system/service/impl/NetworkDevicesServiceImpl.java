package com.boc.system.service.impl;

import java.util.List;

import com.boc.common.exception.ServiceException;
import com.boc.common.utils.DateUtils;
import com.boc.common.utils.StringUtils;
import com.boc.common.utils.bean.BeanValidators;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.boc.system.mapper.NetworkDevicesMapper;
import com.boc.system.domain.NetworkDevices;
import com.boc.system.service.INetworkDevicesService;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Validator;

/**
 * VLAN管理Service业务层处理
 * 
 * @author lllxianjun
 * @date 2024-07-28
 */
@Service
public class NetworkDevicesServiceImpl implements INetworkDevicesService 
{
    @Autowired
    private NetworkDevicesMapper networkDevicesMapper;

    @Autowired
    protected Validator validator;

    private static final Logger log = LoggerFactory.getLogger(NetworkDevicesServiceImpl.class);

    /**
     * 新增保存用户信息
     *
     * @param  networkDevices 用户信息
     * @return 结果
     */
    @Override
    @Transactional
    public int insertNetworkDevices(NetworkDevices networkDevices)
    {
        // 新增主机信息
        int rows = networkDevicesMapper.insertNetworkDevices(networkDevices);
        return rows;
    }

    /**
     * 导入Excel，VLAN具体实现
     *
     * @param networkDevicesList 用户信息
     * @return 结果
     */

    @Override
    public String importNetworkDevices(List<NetworkDevices> networkDevicesList, boolean updateSupport, String operName){
        if (StringUtils.isNull(networkDevicesList) || networkDevicesList.size() == 0){
            throw new ServiceException("导入用户数据不能为空！");
        }
        int successNum = 0;
        int failureNum = 0;
        StringBuilder successMsg = new StringBuilder();
        StringBuilder failureMsg = new StringBuilder();
        for (NetworkDevices networkDevices : networkDevicesList){
            try {
                BeanValidators.validateWithException(validator, networkDevices);
                this.insertNetworkDevices(networkDevices);
                successNum++;
                successMsg.append("<br/>" + successNum + " 导入成功");

            } catch (Exception e)
            {
                failureNum++;
                String msg = "<br/>" + failureNum + " 导入失败：";
                failureMsg.append(msg + e.getMessage());
                log.error(msg, e);
            }
        }
        if (failureNum > 0)
        {
            failureMsg.insert(0, "很抱歉，导入失败！共 " + failureNum + " 条数据格式不正确，错误如下：");
            throw new ServiceException(failureMsg.toString());
        }
        else
        {
            successMsg.insert(0, "恭喜您，数据已全部导入成功！共 " + successNum + " 条，数据如下：");
        }
        return successMsg.toString();
    }


    /**
     * 查询VLAN管理
     * 
     * @param id VLAN管理主键
     * @return VLAN管理
     */
    @Override
    public NetworkDevices selectNetworkDevicesById(Long id)
    {
        return networkDevicesMapper.selectNetworkDevicesById(id);
    }

    /**
     * 查询VLAN管理列表
     * 
     * @param networkDevices VLAN管理
     * @return VLAN管理
     */
    @Override
    public List<NetworkDevices> selectNetworkDevicesList(NetworkDevices networkDevices)
    {
        return networkDevicesMapper.selectNetworkDevicesList(networkDevices);
    }


    /**
     * 修改VLAN管理
     * 
     * @param networkDevices VLAN管理
     * @return 结果
     */
    @Override
    public int updateNetworkDevices(NetworkDevices networkDevices)
    {
        networkDevices.setUpdateTime(DateUtils.getNowDate());
        return networkDevicesMapper.updateNetworkDevices(networkDevices);
    }

    /**
     * 批量删除VLAN管理
     * 
     * @param ids 需要删除的VLAN管理主键
     * @return 结果
     */
    @Override
    public int deleteNetworkDevicesByIds(Long[] ids)
    {
        return networkDevicesMapper.deleteNetworkDevicesByIds(ids);
    }

    /**
     * 删除VLAN管理信息
     * 
     * @param id VLAN管理主键
     * @return 结果
     */
    @Override
    public int deleteNetworkDevicesById(Long id)
    {
        return networkDevicesMapper.deleteNetworkDevicesById(id);
    }

}
