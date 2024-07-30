package com.boc.system.mapper;

import java.util.List;
import com.boc.system.domain.IpAreas;

/**
 * IP所在区域字典Mapper接口
 * 
 * @author lllxianjun
 * @date 2024-07-28
 */
public interface IpAreasMapper 
{
    /**
     * 查询IP所在区域字典
     * 
     * @param id IP所在区域字典主键
     * @return IP所在区域字典
     */
    public IpAreas selectIpAreasById(Long id);

    /**
     * 查询IP所在区域字典列表
     * 
     * @param ipAreas IP所在区域字典
     * @return IP所在区域字典集合
     */
    public List<IpAreas> selectIpAreasList(IpAreas ipAreas);

    /**
     * 新增IP所在区域字典
     * 
     * @param ipAreas IP所在区域字典
     * @return 结果
     */
    public int insertIpAreas(IpAreas ipAreas);

    /**
     * 修改IP所在区域字典
     * 
     * @param ipAreas IP所在区域字典
     * @return 结果
     */
    public int updateIpAreas(IpAreas ipAreas);

    /**
     * 删除IP所在区域字典
     * 
     * @param id IP所在区域字典主键
     * @return 结果
     */
    public int deleteIpAreasById(Long id);

    /**
     * 批量删除IP所在区域字典
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteIpAreasByIds(Long[] ids);
}
