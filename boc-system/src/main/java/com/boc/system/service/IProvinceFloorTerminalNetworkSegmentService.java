package com.boc.system.service;

import java.util.List;
import com.boc.system.domain.ProvinceFloorTerminalNetworkSegment;

/**
 * 省行楼层终端网段设备管理Service接口
 * 
 * @author hnboc
 * @date 2024-08-14
 */
public interface IProvinceFloorTerminalNetworkSegmentService 
{
    /**
     * 查询省行楼层终端网段设备管理
     * 
     * @param id 省行楼层终端网段设备管理主键
     * @return 省行楼层终端网段设备管理
     */
    public ProvinceFloorTerminalNetworkSegment selectProvinceFloorTerminalNetworkSegmentById(Long id);

    /**
     * 查询省行楼层终端网段设备管理列表
     * 
     * @param provinceFloorTerminalNetworkSegment 省行楼层终端网段设备管理
     * @return 省行楼层终端网段设备管理集合
     */
    public List<ProvinceFloorTerminalNetworkSegment> selectProvinceFloorTerminalNetworkSegmentList(ProvinceFloorTerminalNetworkSegment provinceFloorTerminalNetworkSegment);

    /**
     * 新增省行楼层终端网段设备管理
     * 
     * @param provinceFloorTerminalNetworkSegment 省行楼层终端网段设备管理
     * @return 结果
     */
    public int insertProvinceFloorTerminalNetworkSegment(ProvinceFloorTerminalNetworkSegment provinceFloorTerminalNetworkSegment);

    /**
     * 修改省行楼层终端网段设备管理
     * 
     * @param provinceFloorTerminalNetworkSegment 省行楼层终端网段设备管理
     * @return 结果
     */
    public int updateProvinceFloorTerminalNetworkSegment(ProvinceFloorTerminalNetworkSegment provinceFloorTerminalNetworkSegment);

    /**
     * 批量删除省行楼层终端网段设备管理
     * 
     * @param ids 需要删除的省行楼层终端网段设备管理主键集合
     * @return 结果
     */
    public int deleteProvinceFloorTerminalNetworkSegmentByIds(Long[] ids);

    /**
     * 删除省行楼层终端网段设备管理信息
     * 
     * @param id 省行楼层终端网段设备管理主键
     * @return 结果
     */
    public int deleteProvinceFloorTerminalNetworkSegmentById(Long id);

    /**
     * 导入终端IP
     */
    public String importProvinceFloorTerminalNetworkSegment(List<ProvinceFloorTerminalNetworkSegment> provinceFloorTerminalNetworkSegmentList, boolean updateSupport, String operName);
}
