package com.boc.system.mapper;

import java.util.List;
import com.boc.system.domain.NetworkDevices;
import com.boc.system.domain.SysDeviceInfo;

/**
 * VLAN管理Mapper接口
 * 
 * @author lllxianjun
 * @date 2024-07-28
 */
public interface NetworkDevicesMapper 
{
    /**
     * 查询VLAN管理
     * 
     * @param id VLAN管理主键
     * @return VLAN管理
     */
    public NetworkDevices selectNetworkDevicesById(Long id);

    /**
     * 查询VLAN管理列表
     * 
     * @param networkDevices VLAN管理
     * @return VLAN管理集合
     */
    public List<NetworkDevices> selectNetworkDevicesList(NetworkDevices networkDevices);

    /**
     * 新增VLAN管理
     * 
     * @param networkDevices VLAN管理
     * @return 结果
     */
    public int insertNetworkDevices(NetworkDevices networkDevices);

    /**
     * 修改VLAN管理
     * 
     * @param networkDevices VLAN管理
     * @return 结果
     */
    public int updateNetworkDevices(NetworkDevices networkDevices);

    /**
     * 删除VLAN管理
     * 
     * @param id VLAN管理主键
     * @return 结果
     */
    public int deleteNetworkDevicesById(Long id);

    /**
     * 批量删除VLAN管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNetworkDevicesByIds(Long[] ids);

    /**
     * 批量插入VLAN管理
     * @param networkDevicesList
     * @return
     */
    public int batchInsertNetworkDevices(List<NetworkDevices> networkDevicesList);

//    /**
//     * 导入数据
//     * @param networkDevicesList
//     * @param updateSupport
//     * @param operName
//     * @return
//     */

//    public int importNetworkDevices(List<NetworkDevices> networkDevicesList, boolean updateSupport, String operName);
//
//    int importNetworkDevices(NetworkDevices networkDevices);
}
