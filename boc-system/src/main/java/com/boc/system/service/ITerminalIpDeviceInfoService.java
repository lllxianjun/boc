package com.boc.system.service;

import java.util.List;
import com.boc.system.domain.TerminalIpDeviceInfo;

/**
 * 全辖终端IP_准入设备信息Service接口
 * 
 * @author hnboc
 * @date 2024-08-14
 */
public interface ITerminalIpDeviceInfoService 
{
    /**
     * 查询全辖终端IP_准入设备信息
     * 
     * @param id 全辖终端IP_准入设备信息主键
     * @return 全辖终端IP_准入设备信息
     */
    public TerminalIpDeviceInfo selectTerminalIpDeviceInfoById(Long id);

    /**
     * 查询全辖终端IP_准入设备信息列表
     * 
     * @param terminalIpDeviceInfo 全辖终端IP_准入设备信息
     * @return 全辖终端IP_准入设备信息集合
     */
    public List<TerminalIpDeviceInfo> selectTerminalIpDeviceInfoList(TerminalIpDeviceInfo terminalIpDeviceInfo);

    /**
     * 新增全辖终端IP_准入设备信息
     * 
     * @param terminalIpDeviceInfo 全辖终端IP_准入设备信息
     * @return 结果
     */
    public int insertTerminalIpDeviceInfo(TerminalIpDeviceInfo terminalIpDeviceInfo);

    /**
     * 修改全辖终端IP_准入设备信息
     * 
     * @param terminalIpDeviceInfo 全辖终端IP_准入设备信息
     * @return 结果
     */
    public int updateTerminalIpDeviceInfo(TerminalIpDeviceInfo terminalIpDeviceInfo);

    /**
     * 批量删除全辖终端IP_准入设备信息
     * 
     * @param ids 需要删除的全辖终端IP_准入设备信息主键集合
     * @return 结果
     */
    public int deleteTerminalIpDeviceInfoByIds(Long[] ids);

    /**
     * 删除全辖终端IP_准入设备信息信息
     * 
     * @param id 全辖终端IP_准入设备信息主键
     * @return 结果
     */
    public int deleteTerminalIpDeviceInfoById(Long id);

    /**
     * 导入全辖终端IP_准入设备信息数据
     */
    public String importTerminalIpDeviceInfo(List<TerminalIpDeviceInfo> terminalIpDeviceInfoList, boolean updateSupport, String operName);
}
