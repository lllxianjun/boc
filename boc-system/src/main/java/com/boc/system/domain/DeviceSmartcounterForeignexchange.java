package com.boc.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.boc.common.annotation.Excel;
import com.boc.common.core.domain.BaseEntity;

/**
 * 智能柜台及本外币兑换机IP地址对象 device_smartcounter_foreignexchange
 * 
 * @author hnboc
 * @date 2024-08-07
 */
public class DeviceSmartcounterForeignexchange extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 设备ID */
    private Long deviceId;

    // Default constructor needed for JSON deserialization
    public DeviceSmartcounterForeignexchange() {
    }

    /** 使用单位 */
    @Excel(name = "使用单位")
    private String usageUnit;

    /** 3G号 */
    @Excel(name = "3G号")
    private String threeGNumber;

    /** IMSI码 */
    @Excel(name = "IMSI码")
    private String imsiCode;

    /** ICCID */
    @Excel(name = "ICCID")
    private String iccid;

    /** IP地址 */
    @Excel(name = "IP地址")
    private String ipAddress;

    /** 路由器地址 */
    @Excel(name = "路由器地址")
    private String routerAddress;

    /** 掩码 */
    @Excel(name = "掩码")
    private String subnetMask;

    /** PC地址 */
    @Excel(name = "PC地址")
    private String pcAddress;

    /** 用户/密码 */
    @Excel(name = "用户/密码")
    private String userPassword;

    /** 禁用时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "禁用时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date disableTime;

    /** 投产日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "投产日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date productionDate;

    /** 开通期限 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开通期限", width = 30, dateFormat = "yyyy-MM-dd")
    private Date activationPeriod;

    /** 终端号 */
    @Excel(name = "终端号")
    private String terminalNumber;

    /** 物联网卡号 */
    @Excel(name = "物联网卡号")
    private String iotCardNumber;

    /** SIM卡号 */
    @Excel(name = "SIM卡号")
    private String simCardNumber;

    /** 路由器序列号 */
    @Excel(name = "路由器序列号")
    private String routerSerialNumber;

    /** 路由器MAC */
    @Excel(name = "路由器MAC")
    private String routerMac;

    /** 路由器SN */
    @Excel(name = "路由器SN")
    private String routerSn;

    /** 路由器编号 */
    @Excel(name = "路由器编号")
    private String routerNumber;

    /** 路由器物联网卡号 */
    @Excel(name = "路由器物联网卡号")
    private String routerIotCardNumber;

    /** 路由器SIM卡号 */
    @Excel(name = "路由器SIM卡号")
    private String routerSimCardNumber;

    /** 归属单位 */
    @Excel(name = "归属单位")
    private String owningUnit;

    /** IP区域 */
    @Excel(name = "IP区域", readConverterExp = "1=网点,2=省行楼层,3=生产机房服务器区,4=灾备机房服务器区,5=外联DMZ,6=公共服务器区")
    private String ipArea;

    /** 设备类型 */
    @Excel(name = "设备类型", readConverterExp = "1=虚拟机,2=物理服务器,3=路由器,4=交换机,5=防火墙,6=PC,7=打印机,8=智能柜台,9=安保设备,10=冠字号机具,11=多媒体终端,12=视频终端")
    private String deviceType;

    /** 备注*/
    @Excel(name = "备注")
    private String remark;

    public DeviceSmartcounterForeignexchange(String remark) {
        this.remark = remark;
    }

    @Override
    public String getRemark() {
        return remark;
    }

    @Override
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setDeviceId(Long deviceId)
    {
        this.deviceId = deviceId;
    }

    public Long getDeviceId() 
    {
        return deviceId;
    }
    public void setUsageUnit(String usageUnit) 
    {
        this.usageUnit = usageUnit;
    }

    public String getUsageUnit() 
    {
        return usageUnit;
    }
    public void setThreeGNumber(String threeGNumber) 
    {
        this.threeGNumber = threeGNumber;
    }

    public String getThreeGNumber() 
    {
        return threeGNumber;
    }
    public void setImsiCode(String imsiCode) 
    {
        this.imsiCode = imsiCode;
    }

    public String getImsiCode() 
    {
        return imsiCode;
    }
    public void setIccid(String iccid) 
    {
        this.iccid = iccid;
    }

    public String getIccid() 
    {
        return iccid;
    }
    public void setIpAddress(String ipAddress) 
    {
        this.ipAddress = ipAddress;
    }

    public String getIpAddress() 
    {
        return ipAddress;
    }
    public void setRouterAddress(String routerAddress) 
    {
        this.routerAddress = routerAddress;
    }

    public String getRouterAddress() 
    {
        return routerAddress;
    }
    public void setSubnetMask(String subnetMask) 
    {
        this.subnetMask = subnetMask;
    }

    public String getSubnetMask() 
    {
        return subnetMask;
    }
    public void setPcAddress(String pcAddress) 
    {
        this.pcAddress = pcAddress;
    }

    public String getPcAddress() 
    {
        return pcAddress;
    }
    public void setUserPassword(String userPassword) 
    {
        this.userPassword = userPassword;
    }

    public String getUserPassword() 
    {
        return userPassword;
    }
    public void setDisableTime(Date disableTime) 
    {
        this.disableTime = disableTime;
    }

    public Date getDisableTime() 
    {
        return disableTime;
    }
    public void setProductionDate(Date productionDate) 
    {
        this.productionDate = productionDate;
    }

    public Date getProductionDate() 
    {
        return productionDate;
    }
    public void setActivationPeriod(Date activationPeriod) 
    {
        this.activationPeriod = activationPeriod;
    }

    public Date getActivationPeriod() 
    {
        return activationPeriod;
    }
    public void setTerminalNumber(String terminalNumber) 
    {
        this.terminalNumber = terminalNumber;
    }

    public String getTerminalNumber() 
    {
        return terminalNumber;
    }
    public void setIotCardNumber(String iotCardNumber) 
    {
        this.iotCardNumber = iotCardNumber;
    }

    public String getIotCardNumber() 
    {
        return iotCardNumber;
    }
    public void setSimCardNumber(String simCardNumber) 
    {
        this.simCardNumber = simCardNumber;
    }

    public String getSimCardNumber() 
    {
        return simCardNumber;
    }
    public void setRouterSerialNumber(String routerSerialNumber) 
    {
        this.routerSerialNumber = routerSerialNumber;
    }

    public String getRouterSerialNumber() 
    {
        return routerSerialNumber;
    }
    public void setRouterMac(String routerMac) 
    {
        this.routerMac = routerMac;
    }

    public String getRouterMac() 
    {
        return routerMac;
    }
    public void setRouterSn(String routerSn) 
    {
        this.routerSn = routerSn;
    }

    public String getRouterSn() 
    {
        return routerSn;
    }
    public void setRouterNumber(String routerNumber) 
    {
        this.routerNumber = routerNumber;
    }

    public String getRouterNumber() 
    {
        return routerNumber;
    }
    public void setRouterIotCardNumber(String routerIotCardNumber) 
    {
        this.routerIotCardNumber = routerIotCardNumber;
    }

    public String getRouterIotCardNumber() 
    {
        return routerIotCardNumber;
    }
    public void setRouterSimCardNumber(String routerSimCardNumber) 
    {
        this.routerSimCardNumber = routerSimCardNumber;
    }

    public String getRouterSimCardNumber() 
    {
        return routerSimCardNumber;
    }
    public void setOwningUnit(String owningUnit) 
    {
        this.owningUnit = owningUnit;
    }

    public String getOwningUnit() 
    {
        return owningUnit;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("deviceId", getDeviceId())
            .append("usageUnit", getUsageUnit())
            .append("threeGNumber", getThreeGNumber())
            .append("imsiCode", getImsiCode())
            .append("iccid", getIccid())
            .append("ipAddress", getIpAddress())
            .append("routerAddress", getRouterAddress())
            .append("subnetMask", getSubnetMask())
            .append("pcAddress", getPcAddress())
            .append("userPassword", getUserPassword())
            .append("remark", getRemark())
            .append("disableTime", getDisableTime())
            .append("productionDate", getProductionDate())
            .append("activationPeriod", getActivationPeriod())
            .append("terminalNumber", getTerminalNumber())
            .append("iotCardNumber", getIotCardNumber())
            .append("simCardNumber", getSimCardNumber())
            .append("routerSerialNumber", getRouterSerialNumber())
            .append("routerMac", getRouterMac())
            .append("routerSn", getRouterSn())
            .append("routerNumber", getRouterNumber())
            .append("routerIotCardNumber", getRouterIotCardNumber())
            .append("routerSimCardNumber", getRouterSimCardNumber())
            .append("owningUnit", getOwningUnit())
            .append("ipArea", getIpArea())
            .append("deviceType", getDeviceType())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
