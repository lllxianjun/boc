package com.boc.system.service.impl;

import com.boc.common.exception.ServiceException;
import com.boc.common.utils.StringUtils;
import com.boc.common.utils.bean.BeanValidators;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.boc.system.domain.TerminalIpDeviceInfo;
import com.boc.system.mapper.TerminalIpDeviceInfoMapper;
import com.boc.system.service.ITerminalIpDeviceInfoService;
import java.util.List;
import javax.validation.Validator;
/**
 * 全辖终端IP_准入设备信息Service业务层处理
 * 
 * @author hnboc
 * @date 2024-08-14
 */
@Service
public class TerminalIpDeviceInfoServiceImpl implements ITerminalIpDeviceInfoService 
{
    @Autowired
    private TerminalIpDeviceInfoMapper terminalIpDeviceInfoMapper;

    @Autowired
    protected Validator validator;

    private static final Logger log = LoggerFactory.getLogger(TerminalIpDeviceInfoServiceImpl.class);

    /**
     * 导入全辖终端IP_准入设备信息
     */
    public int insertTerminalIpDevice(TerminalIpDeviceInfo terminalIpDeviceInfo){
        int rows = terminalIpDeviceInfoMapper.insertTerminalIpDeviceInfo(terminalIpDeviceInfo);
        return rows;
    }

    /**
     * 批量导入全辖终端IP_准入设备信息
     */
    public String importTerminalIpDeviceInfo(List<TerminalIpDeviceInfo> terminalIpDeviceInfoList, boolean updateSupport, String operName)
    {
        if (StringUtils.isNull(terminalIpDeviceInfoList) || terminalIpDeviceInfoList.size() == 0){
            throw new ServiceException("导入全辖终端IP_准入设备信息不能为空");
        }
        int successNum = 0;
        int failureNum = 0;
        StringBuilder successMsg = new StringBuilder();
        StringBuilder failureMsg = new StringBuilder();
        for (TerminalIpDeviceInfo terminalIpDeviceInfo : terminalIpDeviceInfoList){
            try {
                BeanValidators.validateWithException(validator, terminalIpDeviceInfo);
                this.insertTerminalIpDevice(terminalIpDeviceInfo);
                successNum++;
                successMsg.append("<br/>" + successNum + " 导入成功");
            } catch (Exception e) {
                failureNum++;
                String msg = "<br/>" + failureNum + " 导入失败：";
                failureMsg.append(msg + e.getMessage());
                log.error(msg, e);
            }
        }
        if (failureNum > 0){
            failureMsg.insert(0, "很抱歉，导入失败！共 " + failureNum + " 条数据格式不正确，错误如下：");
            throw new ServiceException(failureMsg.toString());
        }else if (successNum > 0){
            successMsg.insert(0, "恭喜您，数据已全部导入成功！共 " + successNum + " 条，数据如下：");
        }
        return successMsg.toString();
    }

    /**
     * 查询全辖终端IP_准入设备信息
     * 
     * @param id 全辖终端IP_准入设备信息主键
     * @return 全辖终端IP_准入设备信息
     */
    @Override
    public TerminalIpDeviceInfo selectTerminalIpDeviceInfoById(Long id)
    {
        return terminalIpDeviceInfoMapper.selectTerminalIpDeviceInfoById(id);
    }

    /**
     * 查询全辖终端IP_准入设备信息列表
     * 
     * @param terminalIpDeviceInfo 全辖终端IP_准入设备信息
     * @return 全辖终端IP_准入设备信息
     */
    @Override
    public List<TerminalIpDeviceInfo> selectTerminalIpDeviceInfoList(TerminalIpDeviceInfo terminalIpDeviceInfo)
    {
        return terminalIpDeviceInfoMapper.selectTerminalIpDeviceInfoList(terminalIpDeviceInfo);
    }

    /**
     * 新增全辖终端IP_准入设备信息
     * 
     * @param terminalIpDeviceInfo 全辖终端IP_准入设备信息
     * @return 结果
     */
    @Override
    public int insertTerminalIpDeviceInfo(TerminalIpDeviceInfo terminalIpDeviceInfo)
    {
        return terminalIpDeviceInfoMapper.insertTerminalIpDeviceInfo(terminalIpDeviceInfo);
    }

    /**
     * 修改全辖终端IP_准入设备信息
     * 
     * @param terminalIpDeviceInfo 全辖终端IP_准入设备信息
     * @return 结果
     */
    @Override
    public int updateTerminalIpDeviceInfo(TerminalIpDeviceInfo terminalIpDeviceInfo)
    {
        return terminalIpDeviceInfoMapper.updateTerminalIpDeviceInfo(terminalIpDeviceInfo);
    }

    /**
     * 批量删除全辖终端IP_准入设备信息
     * 
     * @param ids 需要删除的全辖终端IP_准入设备信息主键
     * @return 结果
     */
    @Override
    public int deleteTerminalIpDeviceInfoByIds(Long[] ids)
    {
        return terminalIpDeviceInfoMapper.deleteTerminalIpDeviceInfoByIds(ids);
    }

    /**
     * 删除全辖终端IP_准入设备信息信息
     * 
     * @param id 全辖终端IP_准入设备信息主键
     * @return 结果
     */
    @Override
    public int deleteTerminalIpDeviceInfoById(Long id)
    {
        return terminalIpDeviceInfoMapper.deleteTerminalIpDeviceInfoById(id);
    }
}
