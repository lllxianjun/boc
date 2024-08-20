package com.boc.system.service.impl;

import java.util.List;

import com.boc.common.exception.ServiceException;
import com.boc.common.utils.StringUtils;
import com.boc.common.utils.bean.BeanValidators;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.boc.system.mapper.DmzApplicationIpMapper;
import com.boc.system.domain.DmzApplicationIp;
import com.boc.system.service.IDmzApplicationIpService;

import javax.validation.Validator;

/**
 * DMZ区应用系统IPService业务层处理
 * 
 * @author hnboc
 * @date 2024-08-13
 */
@Service
public class DmzApplicationIpServiceImpl implements IDmzApplicationIpService 
{
    @Autowired
    private DmzApplicationIpMapper dmzApplicationIpMapper;

    @Autowired
    protected Validator validator;

    private static final Logger log = LoggerFactory.getLogger(DmzApplicationIpServiceImpl.class);

    /**
     * 添加DMZ区应用系统IP
     * @param dmzApplicationIp
     * @return
     */
    public int insertDmZip(DmzApplicationIp dmzApplicationIp){
        int rows = dmzApplicationIpMapper.insertDmzApplicationIp(dmzApplicationIp);
        return rows;
    }

    /**
     * 查询DMZ区应用系统IP
     * 
     * @param id DMZ区应用系统IP主键
     * @return DMZ区应用系统IP
     */
    @Override
    public DmzApplicationIp selectDmzApplicationIpById(Long id)
    {
        return dmzApplicationIpMapper.selectDmzApplicationIpById(id);
    }

    /**
     * 查询DMZ区应用系统IP列表
     * 
     * @param dmzApplicationIp DMZ区应用系统IP
     * @return DMZ区应用系统IP
     */
    @Override
    public List<DmzApplicationIp> selectDmzApplicationIpList(DmzApplicationIp dmzApplicationIp)
    {
        return dmzApplicationIpMapper.selectDmzApplicationIpList(dmzApplicationIp);
    }

    /**
     * 新增DMZ区应用系统IP
     * 
     * @param dmzApplicationIp DMZ区应用系统IP
     * @return 结果
     */
    @Override
    public int insertDmzApplicationIp(DmzApplicationIp dmzApplicationIp)
    {
        return dmzApplicationIpMapper.insertDmzApplicationIp(dmzApplicationIp);
    }

    /**
     * 批量导入DMZ区应用系统IP
     * @param dmzApplicationIpList
     * @param updateSupport
     * @param operName
     * @return
     */
    public String importDmzApplicationIp (List<DmzApplicationIp> dmzApplicationIpList, boolean updateSupport, String operName)
    {
        if (StringUtils.isNull(dmzApplicationIpList) || dmzApplicationIpList.size() == 0){
            throw new ServiceException("导入DMZ区应用系统IP不能为空！");
        }
        int successNum = 0;
        int failureNum = 0;
        StringBuilder successMsg = new StringBuilder();
        StringBuilder failureMsg = new StringBuilder();
        for (DmzApplicationIp dmzApplicationIp : dmzApplicationIpList) {
            try {
                BeanValidators.validateWithException(validator, dmzApplicationIp);
                this.insertDmZip(dmzApplicationIp);
                successNum++;
                successMsg.append("<br/>" + successNum + " 导入成功");
            } catch (Exception e) {
                failureNum++;
                String msg = "<br/>" + failureNum + " 导入失败：";
                failureMsg.append(msg + e.getMessage());
                log.error(msg, e);
            }
        }
            if(failureNum > 0)
            {
                failureMsg.insert(0, "很抱歉，导入失败！共 " + failureNum + " 条数据格式不正确，错误如下：");
                throw new ServiceException(failureMsg.toString());
            }else if(successNum > 0){
                successMsg.insert(0, "恭喜您，数据已全部导入成功！共 " + successNum + " 条，数据如下：");
            }
            return successMsg.toString();
    }

    /**
     * 修改DMZ区应用系统IP
     * 
     * @param dmzApplicationIp DMZ区应用系统IP
     * @return 结果
     */
    @Override
    public int updateDmzApplicationIp(DmzApplicationIp dmzApplicationIp)
    {
        return dmzApplicationIpMapper.updateDmzApplicationIp(dmzApplicationIp);
    }

    /**
     * 批量删除DMZ区应用系统IP
     * 
     * @param ids 需要删除的DMZ区应用系统IP主键
     * @return 结果
     */
    @Override
    public int deleteDmzApplicationIpByIds(Long[] ids)
    {
        return dmzApplicationIpMapper.deleteDmzApplicationIpByIds(ids);
    }


    /**
     * 删除DMZ区应用系统IP信息
     * 
     * @param id DMZ区应用系统IP主键
     * @return 结果
     */
    @Override
    public int deleteDmzApplicationIpById(Long id)
    {
        return dmzApplicationIpMapper.deleteDmzApplicationIpById(id);
    }
}
