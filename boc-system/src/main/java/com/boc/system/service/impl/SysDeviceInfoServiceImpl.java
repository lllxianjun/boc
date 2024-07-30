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
import com.boc.system.mapper.SysDeviceInfoMapper;
import com.boc.system.domain.SysDeviceInfo;
import com.boc.system.service.ISysDeviceInfoService;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Validator;

/**
 * 设备信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-07-23
 */
@Service
public class SysDeviceInfoServiceImpl implements ISysDeviceInfoService 
{
    @Autowired
    private SysDeviceInfoMapper sysDeviceInfoMapper;

    @Autowired
    protected Validator validator;

    private static final Logger log = LoggerFactory.getLogger(SysUserServiceImpl.class);


    /**
     * 查询设备信息
     * 
     * @param id 设备信息主键
     * @return 设备信息
     */
    @Override
    public SysDeviceInfo selectSysDeviceInfoById(Long id)
    {
        return sysDeviceInfoMapper.selectSysDeviceInfoById(id);
    }

    /**
     * 查询设备信息列表
     * 
     * @param sysDeviceInfo 设备信息
     * @return 设备信息
     */
    @Override
    public List<SysDeviceInfo> selectSysDeviceInfoList(SysDeviceInfo sysDeviceInfo)
    {
        return sysDeviceInfoMapper.selectSysDeviceInfoList(sysDeviceInfo);
    }

    /**
     * 新增设备信息
     * 
     * @param sysDeviceInfo 设备信息
     * @return 结果
     */
    @Override
    public int insertSysDeviceInfo(SysDeviceInfo sysDeviceInfo)
    {
        sysDeviceInfo.setCreateTime(DateUtils.getNowDate());
        return sysDeviceInfoMapper.insertSysDeviceInfo(sysDeviceInfo);
    }

    /**
     * 修改设备信息
     * 
     * @param sysDeviceInfo 设备信息
     * @return 结果
     */
    @Override
    public int updateSysDeviceInfo(SysDeviceInfo sysDeviceInfo)
    {
        sysDeviceInfo.setUpdateTime(DateUtils.getNowDate());
        return sysDeviceInfoMapper.updateSysDeviceInfo(sysDeviceInfo);
    }

    /**
     * 批量删除设备信息
     * 
     * @param ids 需要删除的设备信息主键
     * @return 结果
     */
    @Override
    public int deleteSysDeviceInfoByIds(Long[] ids)
    {
        return sysDeviceInfoMapper.deleteSysDeviceInfoByIds(ids);
    }

    /**
     * 删除设备信息信息
     * 
     * @param id 设备信息主键
     * @return 结果
     */
    @Override
    public int deleteSysDeviceInfoById(Long id)
    {
        return sysDeviceInfoMapper.deleteSysDeviceInfoById(id);
    }

    //新增
    /**
     * 新增保存用户信息
     *
     * @param sysDeviceInfo 用户信息
     * @return 结果
     */
    @Override
    @Transactional
    public int insertHostInfo(SysDeviceInfo sysDeviceInfo)
    {
        // 新增主机信息
        int rows = sysDeviceInfoMapper.insertSysDeviceInfo(sysDeviceInfo);
        return rows;
    }





    /**
     * 导入用户数据
     *
     * @param sysDeviceInfo 用户数据列表
     * @param isUpdateSupport 是否更新支持，如果已存在，则进行更新数据
     * @param operName 操作用户
     * @return 结果
     */
    @Override
    public String importHostInfo(List<SysDeviceInfo> sysDeviceInfo, Boolean isUpdateSupport, String operName)
    {
        if (StringUtils.isNull(sysDeviceInfo) || sysDeviceInfo.size() == 0)
        {
            throw new ServiceException("导入用户数据不能为空！");
        }
        int successNum = 0;
        int failureNum = 0;
        StringBuilder successMsg = new StringBuilder();
        StringBuilder failureMsg = new StringBuilder();
        for (SysDeviceInfo sysHostInfo : sysDeviceInfo)
        {
            try
            {
                BeanValidators.validateWithException(validator, sysHostInfo);
                this.insertHostInfo(sysHostInfo);
                successNum++;
                successMsg.append("<br/>" + successNum + " 导入成功");
            }
            catch (Exception e)
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
}
