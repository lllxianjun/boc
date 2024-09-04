package com.boc.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.boc.common.annotation.Excel;
import com.boc.common.core.domain.BaseEntity;

/**
 * 省行楼层终端网段设备管理对象 province_floor_terminal_network_segment
 * 
 * @author hnboc
 * @date 2024-08-14
 */
public class ProvinceFloorTerminalNetworkSegment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** IP地址 */
    @Excel(name = "IP地址")
    private String ipAddress;

    /** 主机类型 */
    @Excel(name = "主机类型")
    private String hostType;

    /** 应用类型 */
    @Excel(name = "应用类型")
    private String applicationType;

    /** 主机名 */
    @Excel(name = "主机名")
    private String hostname;

    /** 交换机IP */
    @Excel(name = "交换机IP")
    private String switchIp;

    /** 交换机端口 */
    @Excel(name = "交换机端口")
    private String switchPort;

    /** 设备信息点 */
    @Excel(name = "设备信息点")
    private String deviceInfoPoint;

    /** 位置 */
    @Excel(name = "位置")
    private String location;

    /** 管理员 */
    @Excel(name = "管理员")
    private String admin;

    /** 固定资产编号 */
    @Excel(name = "固定资产编号")
    private String assetNumber;

    /** 日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date recordDate;

    /** 网段 */
    @Excel(name = "网段")
    private String subnet;

    /** VLAN */
    @Excel(name = "VLAN")
    private String vlan;

    /** 控制列表 */
    @Excel(name = "控制列表")
    private String controlList;

    /** 用途 */
    @Excel(name = "用途")
    private String usageType;

    /** 分布 */
    @Excel(name = "分布")
    private String distribution;

    /** 原服务器IP */
    @Excel(name = "原服务器IP")
    private String originalServerIp;

    /** 机柜 */
    @Excel(name = "机柜")
    private String rack;

    /** 使用人 */
    @Excel(name = "使用人")
    private String user;

    /** 电话信息点 */
    @Excel(name = "电话信息点")
    private String phoneInfoPoint;

    /** 是否清空回收 */
    @Excel(name = "是否清空回收")
    private String isEmptyRecycled;

    /** 资产信息标号 */
    @Excel(name = "资产信息标号")
    private String assetInfoNumber;

    /** 投产日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "投产日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date commissioningDate;

    /** NAT1#IP地址 */
    @Excel(name = "NAT1#IP地址")
    private String natIpAddress1;

    /** 版本 */
    @Excel(name = "版本")
    private String version;

    /** 年限 */
    @Excel(name = "年限")
    private String lifespan;

    /** MAC地址 */
    @Excel(name = "MAC地址")
    private String macAddress;

    /** 计算机名 */
    @Excel(name = "计算机名")
    private String computerName;

    /** 网关 */
    @Excel(name = "网关")
    private String gateway;

    /** 网络划分 */
    @Excel(name = "网络划分")
    private String networkDivision;

    /** IP所在区域 */
    @Excel(name = "IP所在区域",readConverterExp = "1=省行楼层区,2=国商12楼中心机房,3=网管,4=金融4楼灾备机房,5=金融四楼,6=公共服务器,7=服务器区,8=生产DMZ区,9=测试DMZ区")
    private String ipArea;

    /** 设备类型 */
    @Excel(name = "设备类型",readConverterExp = "1=虚拟机,2=物理服务器,3=PC,4=打印机,5=智能柜台,6=安保设备,7=冠字号机具,8=多媒体终端,9=视频终端,10=BL核心终端,11=负载均衡器")
    private String deviceType;

    /**
     * 备注
     */
    @Excel(name = "备注")
    private String remark;

    @Override
    public String getRemark() {
        return remark;
    }

    @Override
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /** 创建者 */
//    @Excel(name = "创建者")
    private String createdBy;

    /** 最后更新者 */
//    @Excel(name = "最后更新者")
    private String updatedBy;

    /** 记录创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
//    @Excel(name = "记录创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdAt;

    /** 记录最后更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
//    @Excel(name = "记录最后更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updatedAt;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setIpAddress(String ipAddress) 
    {
        this.ipAddress = ipAddress;
    }

    public String getIpAddress() 
    {
        return ipAddress;
    }
    public void setHostType(String hostType) 
    {
        this.hostType = hostType;
    }

    public String getHostType() 
    {
        return hostType;
    }
    public void setApplicationType(String applicationType) 
    {
        this.applicationType = applicationType;
    }

    public String getApplicationType() 
    {
        return applicationType;
    }
    public void setHostname(String hostname) 
    {
        this.hostname = hostname;
    }

    public String getHostname() 
    {
        return hostname;
    }
    public void setSwitchIp(String switchIp) 
    {
        this.switchIp = switchIp;
    }

    public String getSwitchIp() 
    {
        return switchIp;
    }
    public void setSwitchPort(String switchPort) 
    {
        this.switchPort = switchPort;
    }

    public String getSwitchPort() 
    {
        return switchPort;
    }
    public void setDeviceInfoPoint(String deviceInfoPoint) 
    {
        this.deviceInfoPoint = deviceInfoPoint;
    }

    public String getDeviceInfoPoint() 
    {
        return deviceInfoPoint;
    }
    public void setLocation(String location) 
    {
        this.location = location;
    }

    public String getLocation() 
    {
        return location;
    }
    public void setAdmin(String admin) 
    {
        this.admin = admin;
    }

    public String getAdmin() 
    {
        return admin;
    }
    public void setAssetNumber(String assetNumber) 
    {
        this.assetNumber = assetNumber;
    }

    public String getAssetNumber() 
    {
        return assetNumber;
    }
    public void setRecordDate(Date recordDate) 
    {
        this.recordDate = recordDate;
    }

    public Date getRecordDate() 
    {
        return recordDate;
    }
    public void setSubnet(String subnet) 
    {
        this.subnet = subnet;
    }

    public String getSubnet() 
    {
        return subnet;
    }
    public void setVlan(String vlan) 
    {
        this.vlan = vlan;
    }

    public String getVlan() 
    {
        return vlan;
    }
    public void setControlList(String controlList) 
    {
        this.controlList = controlList;
    }

    public String getControlList() 
    {
        return controlList;
    }
    public void setUsageType(String usageType) 
    {
        this.usageType = usageType;
    }

    public String getUsageType() 
    {
        return usageType;
    }
    public void setDistribution(String distribution) 
    {
        this.distribution = distribution;
    }

    public String getDistribution() 
    {
        return distribution;
    }
    public void setOriginalServerIp(String originalServerIp) 
    {
        this.originalServerIp = originalServerIp;
    }

    public String getOriginalServerIp() 
    {
        return originalServerIp;
    }
    public void setRack(String rack) 
    {
        this.rack = rack;
    }

    public String getRack() 
    {
        return rack;
    }
    public void setUser(String user) 
    {
        this.user = user;
    }

    public String getUser() 
    {
        return user;
    }
    public void setPhoneInfoPoint(String phoneInfoPoint) 
    {
        this.phoneInfoPoint = phoneInfoPoint;
    }

    public String getPhoneInfoPoint() 
    {
        return phoneInfoPoint;
    }
    public void setIsEmptyRecycled(String isEmptyRecycled) 
    {
        this.isEmptyRecycled = isEmptyRecycled;
    }

    public String getIsEmptyRecycled() 
    {
        return isEmptyRecycled;
    }
    public void setAssetInfoNumber(String assetInfoNumber) 
    {
        this.assetInfoNumber = assetInfoNumber;
    }

    public String getAssetInfoNumber() 
    {
        return assetInfoNumber;
    }
    public void setCommissioningDate(Date commissioningDate) 
    {
        this.commissioningDate = commissioningDate;
    }

    public Date getCommissioningDate() 
    {
        return commissioningDate;
    }
    public void setNatIpAddress1(String natIpAddress1) 
    {
        this.natIpAddress1 = natIpAddress1;
    }

    public String getNatIpAddress1() 
    {
        return natIpAddress1;
    }
    public void setVersion(String version) 
    {
        this.version = version;
    }

    public String getVersion() 
    {
        return version;
    }
    public void setLifespan(String lifespan) 
    {
        this.lifespan = lifespan;
    }

    public String getLifespan() 
    {
        return lifespan;
    }
    public void setMacAddress(String macAddress) 
    {
        this.macAddress = macAddress;
    }

    public String getMacAddress() 
    {
        return macAddress;
    }
    public void setComputerName(String computerName) 
    {
        this.computerName = computerName;
    }

    public String getComputerName() 
    {
        return computerName;
    }
    public void setGateway(String gateway) 
    {
        this.gateway = gateway;
    }

    public String getGateway() 
    {
        return gateway;
    }
    public void setNetworkDivision(String networkDivision) 
    {
        this.networkDivision = networkDivision;
    }

    public String getNetworkDivision() 
    {
        return networkDivision;
    }
    public void setIpArea(String ipArea) 
    {
        this.ipArea = ipArea;
    }

    public String getIpArea() 
    {
        return ipArea;
    }
    public void setDeviceType(String deviceType) 
    {
        this.deviceType = deviceType;
    }

    public String getDeviceType() 
    {
        return deviceType;
    }
    public void setCreatedBy(String createdBy) 
    {
        this.createdBy = createdBy;
    }

    public String getCreatedBy() 
    {
        return createdBy;
    }
    public void setUpdatedBy(String updatedBy) 
    {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedBy() 
    {
        return updatedBy;
    }
    public void setCreatedAt(Date createdAt) 
    {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt() 
    {
        return createdAt;
    }
    public void setUpdatedAt(Date updatedAt) 
    {
        this.updatedAt = updatedAt;
    }

    public Date getUpdatedAt() 
    {
        return updatedAt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("ipAddress", getIpAddress())
            .append("hostType", getHostType())
            .append("applicationType", getApplicationType())
            .append("hostname", getHostname())
            .append("switchIp", getSwitchIp())
            .append("switchPort", getSwitchPort())
            .append("deviceInfoPoint", getDeviceInfoPoint())
            .append("location", getLocation())
            .append("admin", getAdmin())
            .append("assetNumber", getAssetNumber())
            .append("recordDate", getRecordDate())
            .append("subnet", getSubnet())
            .append("vlan", getVlan())
            .append("controlList", getControlList())
            .append("usageType", getUsageType())
            .append("distribution", getDistribution())
            .append("originalServerIp", getOriginalServerIp())
            .append("rack", getRack())
            .append("user", getUser())
            .append("phoneInfoPoint", getPhoneInfoPoint())
            .append("isEmptyRecycled", getIsEmptyRecycled())
            .append("assetInfoNumber", getAssetInfoNumber())
            .append("commissioningDate", getCommissioningDate())
            .append("natIpAddress1", getNatIpAddress1())
            .append("version", getVersion())
            .append("lifespan", getLifespan())
            .append("macAddress", getMacAddress())
            .append("computerName", getComputerName())
            .append("gateway", getGateway())
            .append("networkDivision", getNetworkDivision())
            .append("ipArea", getIpArea())
            .append("deviceType", getDeviceType())
            .append("remark", getRemark())
            .append("createdBy", getCreatedBy())
            .append("updatedBy", getUpdatedBy())
            .append("createdAt", getCreatedAt())
            .append("updatedAt", getUpdatedAt())
            .toString();
    }
}
