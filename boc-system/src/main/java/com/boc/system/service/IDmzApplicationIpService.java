package com.boc.system.service;

import java.util.List;
import com.boc.system.domain.DmzApplicationIp;

/**
 * DMZ区应用系统IPService接口
 * 
 * @author hnboc
 * @date 2024-08-13
 */
public interface IDmzApplicationIpService 
{
    /**
     * 查询DMZ区应用系统IP
     * 
     * @param id DMZ区应用系统IP主键
     * @return DMZ区应用系统IP
     */
    public DmzApplicationIp selectDmzApplicationIpById(Long id);

    /**
     * 查询DMZ区应用系统IP列表
     * 
     * @param dmzApplicationIp DMZ区应用系统IP
     * @return DMZ区应用系统IP集合
     */
    public List<DmzApplicationIp> selectDmzApplicationIpList(DmzApplicationIp dmzApplicationIp);

    /**
     * 新增DMZ区应用系统IP
     * 
     * @param dmzApplicationIp DMZ区应用系统IP
     * @return 结果
     */
    public int insertDmzApplicationIp(DmzApplicationIp dmzApplicationIp);

    /**
     * 修改DMZ区应用系统IP
     * 
     * @param dmzApplicationIp DMZ区应用系统IP
     * @return 结果
     */
    public int updateDmzApplicationIp(DmzApplicationIp dmzApplicationIp);

    /**
     * 批量删除DMZ区应用系统IP
     * 
     * @param ids 需要删除的DMZ区应用系统IP主键集合
     * @return 结果
     */
    public int deleteDmzApplicationIpByIds(Long[] ids);

    /**
     * 删除DMZ区应用系统IP信息
     * 
     * @param id DMZ区应用系统IP主键
     * @return 结果
     */
    public int deleteDmzApplicationIpById(Long id);

    /**
     * 导入DMZ区应用系统IP
     * @param dmzApplicationIpList
     * @param updateSupport
     * @param operName
     * @return
     */
    public String importDmzApplicationIp(List<DmzApplicationIp> dmzApplicationIpList, boolean updateSupport, String operName);
}
