package com.boc.system.service;

import java.util.List;
import com.boc.system.domain.AtmExternalUnitAddress;

/**
 * 离行ATM及外联单位地址Service接口
 * 
 * @author hnboc
 * @date 2024-08-12
 */
public interface IAtmExternalUnitAddressService 
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
     * 批量删除离行ATM及外联单位地址
     * 
     * @param ids 需要删除的离行ATM及外联单位地址主键集合
     * @return 结果
     */
    public int deleteAtmExternalUnitAddressByIds(Long[] ids);

    /**
     * 删除离行ATM及外联单位地址信息
     * 
     * @param id 离行ATM及外联单位地址主键
     * @return 结果
     */
    public int deleteAtmExternalUnitAddressById(Long id);


    /**
     * 导入ATM地址
     * @param deviceSmartcounterForeignexchangeList
     * @param updateSupport
     * @param operName
     * @return
     */
    public String importAtmExternalUnitAddress(List<AtmExternalUnitAddress> deviceSmartcounterForeignexchangeList, boolean updateSupport, String operName);

}
