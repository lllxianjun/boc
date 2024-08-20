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
import com.boc.system.mapper.DeviceSmartcounterForeignexchangeMapper;
import com.boc.system.domain.DeviceSmartcounterForeignexchange;
import com.boc.system.service.IDeviceSmartcounterForeignexchangeService;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Validator;

/**
 * 智能柜台及本外币兑换机IP地址Service业务层处理
 * 
 * @author hnboc
 * @date 2024-08-07
 */
@Service
public class DeviceSmartcounterForeignexchangeServiceImpl implements IDeviceSmartcounterForeignexchangeService 
{
    @Autowired
    private DeviceSmartcounterForeignexchangeMapper deviceSmartcounterForeignexchangeMapper;

    @Autowired
    protected Validator validator;

    private static final Logger log = LoggerFactory.getLogger(DeviceSmartcounterForeignexchangeServiceImpl.class);

    /**
     * 新增智能柜台及本外币兑换机IP地址
     *
     * @param deviceSmartcounterForeignexchange 智能柜台及本外币兑换机IP地址
     * @return 结果
     */
    @Override
    @Transactional
    public int insertDeviceForeignexchange(DeviceSmartcounterForeignexchange deviceSmartcounterForeignexchange)
    {
        // 新增主机信息
//        int rows = networkDevicesMapper.insertNetworkDevices(networkDevices);
        int rows = deviceSmartcounterForeignexchangeMapper.insertDeviceSmartcounterForeignexchange(deviceSmartcounterForeignexchange);
        return rows;
    }

    /**
     * 导入设备数据
     *
     * @param deviceSmartcounterForeignexchangeList 设备列表
     * @param updateSupport 是否更新已经存在的用户数据
     * @param operName 操作用户
     * @return 结果
     */

    @Override
    public String importDeviceSmartcounterForeignexchange(List<DeviceSmartcounterForeignexchange> deviceSmartcounterForeignexchangeList, boolean updateSupport, String operName){
        if (StringUtils.isNull(deviceSmartcounterForeignexchangeList) || deviceSmartcounterForeignexchangeList.size() == 0){
            throw new ServiceException("导入用户数据不能为空！");
        }
        int successNum = 0;
        int failureNum = 0;
        StringBuilder successMsg = new StringBuilder();
        StringBuilder failureMsg = new StringBuilder();
        for (DeviceSmartcounterForeignexchange deviceSmartcounterForeignexchanges : deviceSmartcounterForeignexchangeList){
            try {
                BeanValidators.validateWithException(validator, deviceSmartcounterForeignexchanges);
                this.insertDeviceForeignexchange(deviceSmartcounterForeignexchanges);
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
     * 查询智能柜台及本外币兑换机IP地址
     * 
     * @param deviceId 智能柜台及本外币兑换机IP地址主键
     * @return 智能柜台及本外币兑换机IP地址
     */
    @Override
    public DeviceSmartcounterForeignexchange selectDeviceSmartcounterForeignexchangeByDeviceId(Long deviceId)
    {
        return deviceSmartcounterForeignexchangeMapper.selectDeviceSmartcounterForeignexchangeByDeviceId(deviceId);
    }

    /**
     * 查询智能柜台及本外币兑换机IP地址列表
     * 
     * @param deviceSmartcounterForeignexchange 智能柜台及本外币兑换机IP地址
     * @return 智能柜台及本外币兑换机IP地址
     */
    @Override
    public List<DeviceSmartcounterForeignexchange> selectDeviceSmartcounterForeignexchangeList(DeviceSmartcounterForeignexchange deviceSmartcounterForeignexchange)
    {
        return deviceSmartcounterForeignexchangeMapper.selectDeviceSmartcounterForeignexchangeList(deviceSmartcounterForeignexchange);
    }

    /**
     * 新增智能柜台及本外币兑换机IP地址
     * 
     * @param deviceSmartcounterForeignexchange 智能柜台及本外币兑换机IP地址
     * @return 结果
     */
    @Override
    public int insertDeviceSmartcounterForeignexchange(DeviceSmartcounterForeignexchange deviceSmartcounterForeignexchange)
    {
        deviceSmartcounterForeignexchange.setCreateTime(DateUtils.getNowDate());
        return deviceSmartcounterForeignexchangeMapper.insertDeviceSmartcounterForeignexchange(deviceSmartcounterForeignexchange);
    }

    /**
     * 修改智能柜台及本外币兑换机IP地址
     * 
     * @param deviceSmartcounterForeignexchange 智能柜台及本外币兑换机IP地址
     * @return 结果
     */
    @Override
    public int updateDeviceSmartcounterForeignexchange(DeviceSmartcounterForeignexchange deviceSmartcounterForeignexchange)
    {
        deviceSmartcounterForeignexchange.setUpdateTime(DateUtils.getNowDate());
        return deviceSmartcounterForeignexchangeMapper.updateDeviceSmartcounterForeignexchange(deviceSmartcounterForeignexchange);
    }

    /**
     * 批量删除智能柜台及本外币兑换机IP地址
     * 
     * @param deviceIds 需要删除的智能柜台及本外币兑换机IP地址主键
     * @return 结果
     */
    @Override
    public int deleteDeviceSmartcounterForeignexchangeByDeviceIds(Long[] deviceIds)
    {
        return deviceSmartcounterForeignexchangeMapper.deleteDeviceSmartcounterForeignexchangeByDeviceIds(deviceIds);
    }

    /**
     * 删除智能柜台及本外币兑换机IP地址信息
     * 
     * @param deviceId 智能柜台及本外币兑换机IP地址主键
     * @return 结果
     */
    @Override
    public int deleteDeviceSmartcounterForeignexchangeByDeviceId(Long deviceId)
    {
        return deviceSmartcounterForeignexchangeMapper.deleteDeviceSmartcounterForeignexchangeByDeviceId(deviceId);
    }
}
