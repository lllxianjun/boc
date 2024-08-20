package com.boc.system.mapper;

import java.util.List;
import com.boc.system.domain.AtmExternalUnitAddress;

/**
 * 离行ATM及外联单位地址Mapper接口
 * 
 * @author hnboc
 * @date 2024-08-12
 */
public interface AtmExternalUnitAddressMapper 
{
    /**
     * 查询离行ATM及外联单位地址
     * 
     * @param id 离行ATM及外联单位地址主键
     * @return 离行ATM及外联单位地址
     */
    public AtmExternalUnitAddress selectAtmExternalUnitAddressById(Long id);

    /**
     * 查询离行ATM及外联单位地址列表
     * 
     * @param atmExternalUnitAddress 离行ATM及外联单位地址
     * @return 离行ATM及外联单位地址集合
     */
    public List<AtmExternalUnitAddress> selectAtmExternalUnitAddressList(AtmExternalUnitAddress atmExternalUnitAddress);

    /**
     * 新增离行ATM及外联单位地址
     * 
     * @param atmExternalUnitAddress 离行ATM及外联单位地址
     * @return 结果
     */
    public int insertAtmExternalUnitAddress(AtmExternalUnitAddress atmExternalUnitAddress);

    /**
     * 修改离行ATM及外联单位地址
     * 
     * @param atmExternalUnitAddress 离行ATM及外联单位地址
     * @return 结果
     */
    public int updateAtmExternalUnitAddress(AtmExternalUnitAddress atmExternalUnitAddress);

    /**
     * 删除离行ATM及外联单位地址
     * 
     * @param id 离行ATM及外联单位地址主键
     * @return 结果
     */
    public int deleteAtmExternalUnitAddressById(Long id);

    /**
     * 批量删除离行ATM及外联单位地址
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAtmExternalUnitAddressByIds(Long[] ids);
}
