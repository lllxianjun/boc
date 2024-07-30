package com.boc.system.mapper;

import java.util.List;
import com.boc.system.domain.SysDeviceInfo;

/**
 * 设备信息Mapper接口
 * 
 * @author ruoyi
 * @date 2024-07-23
 */
public interface SysDeviceInfoMapper 
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
     * 删除设备信息
     * 
     * @param id 设备信息主键
     * @return 结果
     */
    public int deleteSysDeviceInfoById(Long id);

    /**
     * 批量删除设备信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysDeviceInfoByIds(Long[] ids);
}
