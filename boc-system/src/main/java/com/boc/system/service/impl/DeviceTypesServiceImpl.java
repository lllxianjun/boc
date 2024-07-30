package com.boc.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.boc.system.mapper.DeviceTypesMapper;
import com.boc.system.domain.DeviceTypes;
import com.boc.system.service.IDeviceTypesService;

/**
 * 设备类型字典Service业务层处理
 * 
 * @author lllxianjun
 * @date 2024-07-28
 */
@Service
public class DeviceTypesServiceImpl implements IDeviceTypesService 
{
    @Autowired
    private DeviceTypesMapper deviceTypesMapper;

    /**
     * 查询设备类型字典
     * 
     * @param id 设备类型字典主键
     * @return 设备类型字典
     */
    @Override
    public DeviceTypes selectDeviceTypesById(Long id)
    {
        return deviceTypesMapper.selectDeviceTypesById(id);
    }

    /**
     * 查询设备类型字典列表
     * 
     * @param deviceTypes 设备类型字典
     * @return 设备类型字典
     */
    @Override
    public List<DeviceTypes> selectDeviceTypesList(DeviceTypes deviceTypes)
    {
        return deviceTypesMapper.selectDeviceTypesList(deviceTypes);
    }

    /**
     * 新增设备类型字典
     * 
     * @param deviceTypes 设备类型字典
     * @return 结果
     */
    @Override
    public int insertDeviceTypes(DeviceTypes deviceTypes)
    {
        return deviceTypesMapper.insertDeviceTypes(deviceTypes);
    }

    /**
     * 修改设备类型字典
     * 
     * @param deviceTypes 设备类型字典
     * @return 结果
     */
    @Override
    public int updateDeviceTypes(DeviceTypes deviceTypes)
    {
        return deviceTypesMapper.updateDeviceTypes(deviceTypes);
    }

    /**
     * 批量删除设备类型字典
     * 
     * @param ids 需要删除的设备类型字典主键
     * @return 结果
     */
    @Override
    public int deleteDeviceTypesByIds(Long[] ids)
    {
        return deviceTypesMapper.deleteDeviceTypesByIds(ids);
    }

    /**
     * 删除设备类型字典信息
     * 
     * @param id 设备类型字典主键
     * @return 结果
     */
    @Override
    public int deleteDeviceTypesById(Long id)
    {
        return deviceTypesMapper.deleteDeviceTypesById(id);
    }
}
