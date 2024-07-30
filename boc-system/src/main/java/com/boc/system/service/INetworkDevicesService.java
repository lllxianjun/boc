package com.boc.system.service;

import java.util.List;
import com.boc.system.domain.NetworkDevices;
import com.boc.system.domain.SysDeviceInfo;
import org.springframework.transaction.annotation.Transactional;

/**
 * VLAN管理Service接口
 * 
 * @author lllxianjun
 * @date 2024-07-28
 */
public interface INetworkDevicesService 
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
     * 批量删除VLAN管理
     * 
     * @param ids 需要删除的VLAN管理主键集合
     * @return 结果
     */
    public int deleteNetworkDevicesByIds(Long[] ids);

    /**
     * 删除VLAN管理信息
     * 
     * @param id VLAN管理主键
     * @return 结果
     */
    public int deleteNetworkDevicesById(Long id);

    /**
     * 导入VLAN管理数据
     * @param networkDevicesList
     * @param updateSupport
     * @param operName
     * @return
     */
    public String importNetworkDevices(List<NetworkDevices> networkDevicesList, boolean updateSupport, String operName);

}
