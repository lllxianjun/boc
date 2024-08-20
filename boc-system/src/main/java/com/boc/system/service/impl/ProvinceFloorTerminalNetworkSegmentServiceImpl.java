package com.boc.system.service.impl;

import java.util.List;

import com.boc.common.exception.ServiceException;
import com.boc.common.utils.StringUtils;
import com.boc.common.utils.bean.BeanValidators;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.boc.system.mapper.ProvinceFloorTerminalNetworkSegmentMapper;
import com.boc.system.domain.ProvinceFloorTerminalNetworkSegment;
import com.boc.system.service.IProvinceFloorTerminalNetworkSegmentService;

import javax.validation.Validator;

/**
 * 省行楼层终端网段设备管理Service业务层处理
 * 
 * @author hnboc
 * @date 2024-08-14
 */
@Service
public class ProvinceFloorTerminalNetworkSegmentServiceImpl implements IProvinceFloorTerminalNetworkSegmentService 
{
    @Autowired
    private ProvinceFloorTerminalNetworkSegmentMapper provinceFloorTerminalNetworkSegmentMapper;

    @Autowired
    protected Validator validator;

    private static final Logger log = LoggerFactory.getLogger(ProvinceFloorTerminalNetworkSegmentServiceImpl.class);

    /**
     * 导入终端IP地址
     */
    public int insertTerminalip(ProvinceFloorTerminalNetworkSegment provinceFloorTerminalNetworkSegment){
        int rows = provinceFloorTerminalNetworkSegmentMapper.insertProvinceFloorTerminalNetworkSegment(provinceFloorTerminalNetworkSegment);
        return rows;
    }

    /**
     * 批量导入终端IP地址
     */
    public String importProvinceFloorTerminalNetworkSegment(List<ProvinceFloorTerminalNetworkSegment> provinceFloorTerminalNetworkSegmentList, boolean updateSupport, String operName)
    {
        if (StringUtils.isNull(provinceFloorTerminalNetworkSegmentList) || provinceFloorTerminalNetworkSegmentList.size() == 0){
            throw new ServiceException("导入终端IP地址不能为空");
        }
        int successNum = 0;
        int failureNum = 0;
        StringBuilder successMsg = new StringBuilder();
        StringBuilder failureMsg = new StringBuilder();
       for (ProvinceFloorTerminalNetworkSegment provinceFloorTerminalNetworkSegment : provinceFloorTerminalNetworkSegmentList){
           try {
               BeanValidators.validateWithException(validator, provinceFloorTerminalNetworkSegment);
               this.insertTerminalip(provinceFloorTerminalNetworkSegment);
               successNum++;
               successMsg.append("<br/>" + successNum + " 导入成功");
           } catch (Exception e){
               failureNum++;
               String msg = "<br/>" + failureNum + " 导入失败：";
               failureMsg.append(msg + e.getMessage());
               log.error(msg, e);
           }
       }
       if (failureNum > 0){
           failureMsg.insert(0, "很抱歉，导入失败！共 " + failureNum + " 条数据格式不正确，错误如下：");
           throw new ServiceException(failureMsg.toString());
       }else if(successNum > 0){
           successMsg.insert(0, "恭喜您，数据已全部导入成功！共 " + successNum + " 条，数据如下：");
       }
        return successMsg.toString();
    }

    /**
     * 查询省行楼层终端网段设备管理
     * 
     * @param id 省行楼层终端网段设备管理主键
     * @return 省行楼层终端网段设备管理
     */
    @Override
    public ProvinceFloorTerminalNetworkSegment selectProvinceFloorTerminalNetworkSegmentById(Long id)
    {
        return provinceFloorTerminalNetworkSegmentMapper.selectProvinceFloorTerminalNetworkSegmentById(id);
    }

    /**
     * 查询省行楼层终端网段设备管理列表
     * 
     * @param provinceFloorTerminalNetworkSegment 省行楼层终端网段设备管理
     * @return 省行楼层终端网段设备管理
     */
    @Override
    public List<ProvinceFloorTerminalNetworkSegment> selectProvinceFloorTerminalNetworkSegmentList(ProvinceFloorTerminalNetworkSegment provinceFloorTerminalNetworkSegment)
    {
        return provinceFloorTerminalNetworkSegmentMapper.selectProvinceFloorTerminalNetworkSegmentList(provinceFloorTerminalNetworkSegment);
    }

    /**
     * 新增省行楼层终端网段设备管理
     * 
     * @param provinceFloorTerminalNetworkSegment 省行楼层终端网段设备管理
     * @return 结果
     */
    @Override
    public int insertProvinceFloorTerminalNetworkSegment(ProvinceFloorTerminalNetworkSegment provinceFloorTerminalNetworkSegment)
    {
        return provinceFloorTerminalNetworkSegmentMapper.insertProvinceFloorTerminalNetworkSegment(provinceFloorTerminalNetworkSegment);
    }

    /**
     * 修改省行楼层终端网段设备管理
     * 
     * @param provinceFloorTerminalNetworkSegment 省行楼层终端网段设备管理
     * @return 结果
     */
    @Override
    public int updateProvinceFloorTerminalNetworkSegment(ProvinceFloorTerminalNetworkSegment provinceFloorTerminalNetworkSegment)
    {
        return provinceFloorTerminalNetworkSegmentMapper.updateProvinceFloorTerminalNetworkSegment(provinceFloorTerminalNetworkSegment);
    }

    /**
     * 批量删除省行楼层终端网段设备管理
     * 
     * @param ids 需要删除的省行楼层终端网段设备管理主键
     * @return 结果
     */
    @Override
    public int deleteProvinceFloorTerminalNetworkSegmentByIds(Long[] ids)
    {
        return provinceFloorTerminalNetworkSegmentMapper.deleteProvinceFloorTerminalNetworkSegmentByIds(ids);
    }

    /**
     * 删除省行楼层终端网段设备管理信息
     * 
     * @param id 省行楼层终端网段设备管理主键
     * @return 结果
     */
    @Override
    public int deleteProvinceFloorTerminalNetworkSegmentById(Long id)
    {
        return provinceFloorTerminalNetworkSegmentMapper.deleteProvinceFloorTerminalNetworkSegmentById(id);
    }
}
