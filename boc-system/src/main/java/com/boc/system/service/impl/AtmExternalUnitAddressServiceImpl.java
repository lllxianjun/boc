package com.boc.system.service.impl;

import java.util.List;
import com.boc.common.exception.ServiceException;
import com.boc.common.utils.StringUtils;
import com.boc.common.utils.bean.BeanValidators;
import com.boc.system.mapper.AtmExternalUnitAddressMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.boc.system.domain.AtmExternalUnitAddress;
import com.boc.system.service.IAtmExternalUnitAddressService;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Validator;

/**
 * 离行ATM及外联单位地址Service业务层处理
 * 
 * @author hnboc
 * @date 2024-08-12
 */
@Service
public class AtmExternalUnitAddressServiceImpl implements IAtmExternalUnitAddressService 
{
    @Autowired
    private AtmExternalUnitAddressMapper atmExternalUnitAddressMapper;

    @Autowired
    protected Validator validator;

    private static final Logger log = LoggerFactory.getLogger(AtmExternalUnitAddressServiceImpl.class);

    /**
     * 新增主机信息
     *
     * @param atmExternalUnitAddress 主机信息
     * @return 结果
     */
    @Transactional
    public int insertAtmtAddress(AtmExternalUnitAddress atmExternalUnitAddress)
    {
        // 新增主机信息
        int rows = atmExternalUnitAddressMapper. insertAtmExternalUnitAddress(atmExternalUnitAddress);
        return rows;
    }

    /**
     * 导入数据
     *
     * @param atmExternalUnitAddressList 导入用户数据列表
     * @param updateSupport 是否更新已经存在的用户数据
     * @param operName 操作用户
     * @return 结果
     */

    @Override
    public String importAtmExternalUnitAddress(List<AtmExternalUnitAddress> atmExternalUnitAddressList, boolean updateSupport, String operName){
        if (StringUtils.isNull(atmExternalUnitAddressList) || atmExternalUnitAddressList.size() == 0){
            throw new ServiceException("导入用户数据不能为空！");
        }
        int successNum = 0;
        int failureNum = 0;
        StringBuilder successMsg = new StringBuilder();
        StringBuilder failureMsg = new StringBuilder();
        for (AtmExternalUnitAddress atmExternalUnitAddress : atmExternalUnitAddressList){
            try {
                BeanValidators.validateWithException(validator, atmExternalUnitAddress);
                this.insertAtmtAddress(atmExternalUnitAddress);
                successNum++;
                successMsg.append("<br/>" + successNum + " 导入成功");

            } catch (Exception e)
            {
                failureNum++;
                String msg = "<br/>" + failureNum + " 导入失败：";
                failureMsg.append(msg + e.getMessage());
                log.error(msg, e);
            }
        }
        if (failureNum > 0)
        {
            failureMsg.insert(0, "很抱歉，导入失败！共 " + failureNum + " 条数据格式不正确，错误如下：");
            throw new ServiceException(failureMsg.toString());
        }
        else if(successNum > 0){
            successMsg.insert(0, "恭喜您，数据已全部导入成功！共 " + successNum + " 条，数据如下：");
        }
        return successMsg.toString();
    }

    /**
     * 查询离行ATM及外联单位地址
     * 
     * @param id 离行ATM及外联单位地址主键
     * @return 离行ATM及外联单位地址
     */
    @Override
    public AtmExternalUnitAddress selectAtmExternalUnitAddressById(Long id)
    {
        return atmExternalUnitAddressMapper.selectAtmExternalUnitAddressById(id);
    }

    /**
     * 查询离行ATM及外联单位地址列表
     * 
     * @param atmExternalUnitAddress 离行ATM及外联单位地址
     * @return 离行ATM及外联单位地址
     */
    @Override
    public List<AtmExternalUnitAddress> selectAtmExternalUnitAddressList(AtmExternalUnitAddress atmExternalUnitAddress)
    {
        return atmExternalUnitAddressMapper.selectAtmExternalUnitAddressList(atmExternalUnitAddress);
    }

    /**
     * 新增离行ATM及外联单位地址
     * 
     * @param atmExternalUnitAddress 离行ATM及外联单位地址
     * @return 结果
     */
    @Override
    public int insertAtmExternalUnitAddress(AtmExternalUnitAddress atmExternalUnitAddress)
    {
        return atmExternalUnitAddressMapper.insertAtmExternalUnitAddress(atmExternalUnitAddress);
    }

    /**
     * 修改离行ATM及外联单位地址
     * 
     * @param atmExternalUnitAddress 离行ATM及外联单位地址
     * @return 结果
     */
    @Override
    public int updateAtmExternalUnitAddress(AtmExternalUnitAddress atmExternalUnitAddress)
    {
        return atmExternalUnitAddressMapper.updateAtmExternalUnitAddress(atmExternalUnitAddress);
    }

    /**
     * 批量删除离行ATM及外联单位地址
     * 
     * @param ids 需要删除的离行ATM及外联单位地址主键
     * @return 结果
     */
    @Override
    public int deleteAtmExternalUnitAddressByIds(Long[] ids)
    {
        return atmExternalUnitAddressMapper.deleteAtmExternalUnitAddressByIds(ids);
    }

    /**
     * 删除离行ATM及外联单位地址信息
     * 
     * @param id 离行ATM及外联单位地址主键
     * @return 结果
     */
    @Override
    public int deleteAtmExternalUnitAddressById(Long id)
    {
        return atmExternalUnitAddressMapper.deleteAtmExternalUnitAddressById(id);
    }


}
