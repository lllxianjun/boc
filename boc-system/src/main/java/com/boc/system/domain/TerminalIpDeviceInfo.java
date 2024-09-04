package com.boc.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.boc.common.annotation.Excel;
import com.boc.common.core.domain.BaseEntity;

/**
 * 全辖终端IP_准入设备信息对象 terminal_ip_device_info
 * 
 * @author hnboc
 * @date 2024-08-14
 */
public class TerminalIpDeviceInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 源IP */
    @Excel(name = "源IP")
    private String sourceIp;

    /** MAC地址 */
    @Excel(name = "MAC地址")
    private String macAddress;

    /** 部门名称 */
    @Excel(name = "部门名称")
    private String departmentName;

    /** 用户姓名 */
    @Excel(name = "用户姓名")
    private String userName;

    /** 网络设备 */
    @Excel(name = "网络设备")
    private String networkDevice;

    /** 网络设备IP */
    @Excel(name = "网络设备IP")
    private String networkDeviceIp;

    /** 端口 */
    @Excel(name = "端口")
    private String port;

    /** 操作系统 */
    @Excel(name = "操作系统")
    private String operatingSystem;

    /** 电子邮箱 */
    @Excel(name = "电子邮箱")
    private String email;

    /** 电话号码 */
    @Excel(name = "电话号码")
    private String phoneNumber;

    /** 管辖行 */
    @Excel(name = "管辖行")
    private String branchName;

    /** 行名 */
    @Excel(name = "行名")
    private String subBranchName;

    /** 设备 */
    @Excel(name = "设备")
    private String device;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String deviceName;

    /** 设备型号 */
    @Excel(name = "设备型号")
    private String deviceType;

    /** 固定资产编号 */
    @Excel(name = "固定资产编号")
    private String assetNumber;

    /** 设备年限 */
    @Excel(name = "设备年限")
    private String deviceAge;

    /** 老旧设备更换 */
    @Excel(name = "老旧设备更换")
    private  String oldDeviceReplacement;

    /** 局域网地址范围（掩码） */
    @Excel(name = "局域网地址范围")
    private String localNetworkIpRange;

    /** Ethernet IP（默认掩码24） */
    @Excel(name = "Ethernet IP")
    private String ethernetIp;

    /** 网关（默认掩码24） */
    @Excel(name = "网关")
    private String gatewayIp;

    /** PC地址段（21和22段） */
    @Excel(name = "PC地址段")
    private String pcIpRange;

    /** ATM地址段（21网段） */
    @Excel(name = "ATM地址段")
    private String atmIpRange;

    /** 监控地址段（22网段） */
    @Excel(name = "监控地址段")
    private String monitorIpRange;

    /** WLAN地址段（21网段） */
    @Excel(name = "WLAN地址段")
    private String wlanIpRange;

    /** 冠字号机具（21网段） */
    @Excel(name = "冠字号机具")
    private String currencyMachineIpRange;

    /** 新loopback/32 */
    @Excel(name = "新loopback/32")
    private String loopbackIp;

    /** 同城电信/30 */
    @Excel(name = "同城电信/30")
    private String telecomCircuitIp;

    /** 同城移动/30 */
    @Excel(name = "同城移动/30")
    private String mobileCircuitIp;

    /** 同城联通/30 */
    @Excel(name = "同城联通/30")
    private String unicomCircuitIp;

    /** 同城有线电视/30 */
    @Excel(name = "同城有线电视/30")
    private String cableTvCircuitIp;

    /** 电信mstp vlan */
    @Excel(name = "电信mstp vlan")
    private String telecomMstpVlan;

    /** 移动mstp vlan */
    @Excel(name = "移动mstp vlan")
    private String mobileMstpVlan;

    /** 联通mstp vlan */
    @Excel(name = "联通mstp vlan")
    private String unicomMstpVlan;

    /** 有线电视mstp vlan */
    @Excel(name = "有线电视mstp vlan")
    private String cableTvMstpVlan;

    /** 主机名 */
    @Excel(name = "主机名")
    private String hostName;

    /** 创建人 */
//    @Excel(name = "创建人")
    private String createdBy;

    /** 最后更新人 */
//    @Excel(name = "最后更新人")
    private String updatedBy;

    /** 备注 */
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

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
//    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdAt;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
//    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updatedAt;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSourceIp(String sourceIp) 
    {
        this.sourceIp = sourceIp;
    }

    public String getSourceIp() 
    {
        return sourceIp;
    }
    public void setMacAddress(String macAddress) 
    {
        this.macAddress = macAddress;
    }

    public String getMacAddress() 
    {
        return macAddress;
    }
    public void setDepartmentName(String departmentName) 
    {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() 
    {
        return departmentName;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setNetworkDevice(String networkDevice) 
    {
        this.networkDevice = networkDevice;
    }

    public String getNetworkDevice() 
    {
        return networkDevice;
    }
    public void setNetworkDeviceIp(String networkDeviceIp) 
    {
        this.networkDeviceIp = networkDeviceIp;
    }

    public String getNetworkDeviceIp() 
    {
        return networkDeviceIp;
    }
    public void setPort(String port) 
    {
        this.port = port;
    }

    public String getPort() 
    {
        return port;
    }
    public void setOperatingSystem(String operatingSystem) 
    {
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() 
    {
        return operatingSystem;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }
    public void setBranchName(String branchName) 
    {
        this.branchName = branchName;
    }

    public String getBranchName() 
    {
        return branchName;
    }
    public void setSubBranchName(String subBranchName) 
    {
        this.subBranchName = subBranchName;
    }

    public String getSubBranchName() 
    {
        return subBranchName;
    }
    public void setDevice(String device) 
    {
        this.device = device;
    }

    public String getDevice() 
    {
        return device;
    }
    public void setDeviceName(String deviceName) 
    {
        this.deviceName = deviceName;
    }

    public String getDeviceName() 
    {
        return deviceName;
    }
    public void setDeviceType(String deviceType) 
    {
        this.deviceType = deviceType;
    }

    public String getDeviceType() 
    {
        return deviceType;
    }
    public void setAssetNumber(String assetNumber) 
    {
        this.assetNumber = assetNumber;
    }

    public String getAssetNumber() 
    {
        return assetNumber;
    }
    public void setDeviceAge(String deviceAge)
    {
        this.deviceAge = deviceAge;
    }

    public String getDeviceAge()
    {
        return deviceAge;
    }
    public void setOldDeviceReplacement(String oldDeviceReplacement)
    {
        this.oldDeviceReplacement = oldDeviceReplacement;
    }

    public String getOldDeviceReplacement()
    {
        return oldDeviceReplacement;
    }
    public void setLocalNetworkIpRange(String localNetworkIpRange) 
    {
        this.localNetworkIpRange = localNetworkIpRange;
    }

    public String getLocalNetworkIpRange() 
    {
        return localNetworkIpRange;
    }
    public void setEthernetIp(String ethernetIp) 
    {
        this.ethernetIp = ethernetIp;
    }

    public String getEthernetIp() 
    {
        return ethernetIp;
    }
    public void setGatewayIp(String gatewayIp) 
    {
        this.gatewayIp = gatewayIp;
    }

    public String getGatewayIp() 
    {
        return gatewayIp;
    }
    public void setPcIpRange(String pcIpRange) 
    {
        this.pcIpRange = pcIpRange;
    }

    public String getPcIpRange() 
    {
        return pcIpRange;
    }
    public void setAtmIpRange(String atmIpRange) 
    {
        this.atmIpRange = atmIpRange;
    }

    public String getAtmIpRange() 
    {
        return atmIpRange;
    }
    public void setMonitorIpRange(String monitorIpRange) 
    {
        this.monitorIpRange = monitorIpRange;
    }

    public String getMonitorIpRange() 
    {
        return monitorIpRange;
    }
    public void setWlanIpRange(String wlanIpRange) 
    {
        this.wlanIpRange = wlanIpRange;
    }

    public String getWlanIpRange() 
    {
        return wlanIpRange;
    }
    public void setCurrencyMachineIpRange(String currencyMachineIpRange) 
    {
        this.currencyMachineIpRange = currencyMachineIpRange;
    }

    public String getCurrencyMachineIpRange() 
    {
        return currencyMachineIpRange;
    }
    public void setLoopbackIp(String loopbackIp) 
    {
        this.loopbackIp = loopbackIp;
    }

    public String getLoopbackIp() 
    {
        return loopbackIp;
    }
    public void setTelecomCircuitIp(String telecomCircuitIp) 
    {
        this.telecomCircuitIp = telecomCircuitIp;
    }

    public String getTelecomCircuitIp() 
    {
        return telecomCircuitIp;
    }
    public void setMobileCircuitIp(String mobileCircuitIp) 
    {
        this.mobileCircuitIp = mobileCircuitIp;
    }

    public String getMobileCircuitIp() 
    {
        return mobileCircuitIp;
    }
    public void setUnicomCircuitIp(String unicomCircuitIp) 
    {
        this.unicomCircuitIp = unicomCircuitIp;
    }

    public String getUnicomCircuitIp() 
    {
        return unicomCircuitIp;
    }
    public void setCableTvCircuitIp(String cableTvCircuitIp) 
    {
        this.cableTvCircuitIp = cableTvCircuitIp;
    }

    public String getCableTvCircuitIp() 
    {
        return cableTvCircuitIp;
    }
    public void setTelecomMstpVlan(String telecomMstpVlan) 
    {
        this.telecomMstpVlan = telecomMstpVlan;
    }

    public String getTelecomMstpVlan() 
    {
        return telecomMstpVlan;
    }
    public void setMobileMstpVlan(String mobileMstpVlan) 
    {
        this.mobileMstpVlan = mobileMstpVlan;
    }

    public String getMobileMstpVlan() 
    {
        return mobileMstpVlan;
    }
    public void setUnicomMstpVlan(String unicomMstpVlan) 
    {
        this.unicomMstpVlan = unicomMstpVlan;
    }

    public String getUnicomMstpVlan() 
    {
        return unicomMstpVlan;
    }
    public void setCableTvMstpVlan(String cableTvMstpVlan) 
    {
        this.cableTvMstpVlan = cableTvMstpVlan;
    }

    public String getCableTvMstpVlan() 
    {
        return cableTvMstpVlan;
    }
    public void setHostName(String hostName) 
    {
        this.hostName = hostName;
    }

    public String getHostName() 
    {
        return hostName;
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
            .append("sourceIp", getSourceIp())
            .append("macAddress", getMacAddress())
            .append("departmentName", getDepartmentName())
            .append("userName", getUserName())
            .append("networkDevice", getNetworkDevice())
            .append("networkDeviceIp", getNetworkDeviceIp())
            .append("port", getPort())
            .append("operatingSystem", getOperatingSystem())
            .append("email", getEmail())
            .append("phoneNumber", getPhoneNumber())
            .append("branchName", getBranchName())
            .append("subBranchName", getSubBranchName())
            .append("device", getDevice())
            .append("deviceName", getDeviceName())
            .append("deviceType", getDeviceType())
            .append("assetNumber", getAssetNumber())
            .append("deviceAge", getDeviceAge())
            .append("oldDeviceReplacement", getOldDeviceReplacement())
            .append("localNetworkIpRange", getLocalNetworkIpRange())
            .append("ethernetIp", getEthernetIp())
            .append("gatewayIp", getGatewayIp())
            .append("pcIpRange", getPcIpRange())
            .append("atmIpRange", getAtmIpRange())
            .append("monitorIpRange", getMonitorIpRange())
            .append("wlanIpRange", getWlanIpRange())
            .append("currencyMachineIpRange", getCurrencyMachineIpRange())
            .append("loopbackIp", getLoopbackIp())
            .append("telecomCircuitIp", getTelecomCircuitIp())
            .append("mobileCircuitIp", getMobileCircuitIp())
            .append("unicomCircuitIp", getUnicomCircuitIp())
            .append("cableTvCircuitIp", getCableTvCircuitIp())
            .append("telecomMstpVlan", getTelecomMstpVlan())
            .append("mobileMstpVlan", getMobileMstpVlan())
            .append("unicomMstpVlan", getUnicomMstpVlan())
            .append("cableTvMstpVlan", getCableTvMstpVlan())
            .append("hostName", getHostName())
            .append("remark", getRemark())
            .append("createdBy", getCreatedBy())
            .append("updatedBy", getUpdatedBy())
            .append("createdAt", getCreatedAt())
            .append("updatedAt", getUpdatedAt())
            .toString();
    }
}
