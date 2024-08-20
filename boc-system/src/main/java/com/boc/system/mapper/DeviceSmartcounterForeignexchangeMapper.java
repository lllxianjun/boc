package com.boc.system.mapper;

import java.util.List;
import com.boc.system.domain.DeviceSmartcounterForeignexchange;

/**
 * 智能柜台及本外币兑换机IP地址Mapper接口
 * 
 * @author hnboc
 * @date 2024-08-07
 */
public interface DeviceSmartcounterForeignexchangeMapper 
{
    /**
     * 查询智能柜台及本外币兑换机IP地址
     * 
     * @param deviceId 智能柜台及本外币兑换机IP地址主键
     * @return 智能柜台及本外币兑换机IP地址
     */
    public DeviceSmartcounterForeignexchange selectDeviceSmartcounterForeignexchangeByDeviceId(Long deviceId);

    /**
     * 查询智能柜台及本外币兑换机IP地址列表
     * 
     * @param deviceSmartcounterForeignexchange 智能柜台及本外币兑换机IP地址
     * @return 智能柜台及本外币兑换机IP地址集合
     */
    public List<DeviceSmartcounterForeignexchange> selectDeviceSmartcounterForeignexchangeList(DeviceSmartcounterForeignexchange deviceSmartcounterForeignexchange);

    /**
     * 新增智能柜台及本外币兑换机IP地址
     * 
     * @param deviceSmartcounterForeignexchange 智能柜台及本外币兑换机IP地址
     * @return 结果
     */
    public int insertDeviceSmartcounterForeignexchange(DeviceSmartcounterForeignexchange deviceSmartcounterForeignexchange);

    /**
     * 修改智能柜台及本外币兑换机IP地址
     * 
     * @param deviceSmartcounterForeignexchange 智能柜台及本外币兑换机IP地址
     * @return 结果
     */
    public int updateDeviceSmartcounterForeignexchange(DeviceSmartcounterForeignexchange deviceSmartcounterForeignexchange);

    /**
     * 删除智能柜台及本外币兑换机IP地址
     * 
     * @param deviceId 智能柜台及本外币兑换机IP地址主键
     * @return 结果
     */
    public int deleteDeviceSmartcounterForeignexchangeByDeviceId(Long deviceId);

    /**
     * 批量删除智能柜台及本外币兑换机IP地址
     * 
     * @param deviceIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDeviceSmartcounterForeignexchangeByDeviceIds(Long[] deviceIds);
}
