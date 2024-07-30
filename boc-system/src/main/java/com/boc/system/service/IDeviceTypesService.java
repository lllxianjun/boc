package com.boc.system.service;

import java.util.List;
import com.boc.system.domain.DeviceTypes;

/**
 * 设备类型字典Service接口
 * 
 * @author lllxianjun
 * @date 2024-07-28
 */
public interface IDeviceTypesService 
{
    /**
     * 查询设备类型字典
     * 
     * @param id 设备类型字典主键
     * @return 设备类型字典
     */
    public DeviceTypes selectDeviceTypesById(Long id);

    /**
     * 查询设备类型字典列表
     * 
     * @param deviceTypes 设备类型字典
     * @return 设备类型字典集合
     */
    public List<DeviceTypes> selectDeviceTypesList(DeviceTypes deviceTypes);

    /**
     * 新增设备类型字典
     * 
     * @param deviceTypes 设备类型字典
     * @return 结果
     */
    public int insertDeviceTypes(DeviceTypes deviceTypes);

    /**
     * 修改设备类型字典
     * 
     * @param deviceTypes 设备类型字典
     * @return 结果
     */
    public int updateDeviceTypes(DeviceTypes deviceTypes);

    /**
     * 批量删除设备类型字典
     * 
     * @param ids 需要删除的设备类型字典主键集合
     * @return 结果
     */
    public int deleteDeviceTypesByIds(Long[] ids);

    /**
     * 删除设备类型字典信息
     * 
     * @param id 设备类型字典主键
     * @return 结果
     */
    public int deleteDeviceTypesById(Long id);
}
