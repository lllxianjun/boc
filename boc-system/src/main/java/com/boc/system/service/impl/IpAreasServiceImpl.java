package com.boc.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.boc.system.mapper.IpAreasMapper;
import com.boc.system.domain.IpAreas;
import com.boc.system.service.IIpAreasService;

/**
 * IP所在区域字典Service业务层处理
 * 
 * @author lllxianjun
 * @date 2024-07-28
 */
@Service
public class IpAreasServiceImpl implements IIpAreasService 
{
    @Autowired
    private IpAreasMapper ipAreasMapper;

    /**
     * 查询IP所在区域字典
     * 
     * @param id IP所在区域字典主键
     * @return IP所在区域字典
     */
    @Override
    public IpAreas selectIpAreasById(Long id)
    {
        return ipAreasMapper.selectIpAreasById(id);
    }

    /**
     * 查询IP所在区域字典列表
     * 
     * @param ipAreas IP所在区域字典
     * @return IP所在区域字典
     */
    @Override
    public List<IpAreas> selectIpAreasList(IpAreas ipAreas)
    {
        return ipAreasMapper.selectIpAreasList(ipAreas);
    }

    /**
     * 新增IP所在区域字典
     * 
     * @param ipAreas IP所在区域字典
     * @return 结果
     */
    @Override
    public int insertIpAreas(IpAreas ipAreas)
    {
        return ipAreasMapper.insertIpAreas(ipAreas);
    }

    /**
     * 修改IP所在区域字典
     * 
     * @param ipAreas IP所在区域字典
     * @return 结果
     */
    @Override
    public int updateIpAreas(IpAreas ipAreas)
    {
        return ipAreasMapper.updateIpAreas(ipAreas);
    }

    /**
     * 批量删除IP所在区域字典
     * 
     * @param ids 需要删除的IP所在区域字典主键
     * @return 结果
     */
    @Override
    public int deleteIpAreasByIds(Long[] ids)
    {
        return ipAreasMapper.deleteIpAreasByIds(ids);
    }

    /**
     * 删除IP所在区域字典信息
     * 
     * @param id IP所在区域字典主键
     * @return 结果
     */
    @Override
    public int deleteIpAreasById(Long id)
    {
        return ipAreasMapper.deleteIpAreasById(id);
    }
}
