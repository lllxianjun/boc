package com.boc.system.service;

import java.util.List;

import com.boc.common.core.domain.entity.SysUser;
import com.boc.system.domain.SysDeviceInfo;

/**
 * 设备信息Service接口
 * 
 * @author ruoyi
 * @date 2024-07-23
 */
public interface ISysDeviceInfoService 
{
    /**
     * 查询设备信息
     * 
     * @param id 设备信息主键
     * @return 设备信息
     */
    public SysDeviceInfo selectSysDeviceInfoById(Long id);

    /**
     * 查询设备信息列表
     * 
     * @param sysDeviceInfo 设备信息
     * @return 设备信息集合
     */
    public List<SysDeviceInfo> selectSysDeviceInfoList(SysDeviceInfo sysDeviceInfo);

    /**
     * 新增设备信息
     * 
     * @param sysDeviceInfo 设备信息
     * @return 结果
     */
    public int insertSysDeviceInfo(SysDeviceInfo sysDeviceInfo);

    /**
     * 修改设备信息
     * 
     * @param sysDeviceInfo 设备信息
     * @return 结果
     */
    public int updateSysDeviceInfo(SysDeviceInfo sysDeviceInfo);

    /**
     * 批量删除设备信息
     * 
     * @param ids 需要删除的设备信息主键集合
     * @return 结果
     */
    public int deleteSysDeviceInfoByIds(Long[] ids);

    /**
     * 删除设备信息信息
     * 
     * @param id 设备信息主键
     * @return 结果
     */
    public int deleteSysDeviceInfoById(Long id);




    /**
     * 新增主机信息
     *
     * @param sysDeviceInfo 主机信息
     * @return 结果
     */
    public int insertHostInfo(SysDeviceInfo sysDeviceInfo);

    /**
     * 导入主机信息信息
     *,
     * @param sysDeviceInfo 用户数据列表
     * @param isUpdateSupport 是否更新支持，如果已存在，则进行更新数据
     * @param operName 操作用户
     * @return 结果
     */
    public String importHostInfo(List<SysDeviceInfo> sysDeviceInfo, Boolean isUpdateSupport, String operName);
}
