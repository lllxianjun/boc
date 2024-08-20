package com.boc.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.boc.common.annotation.Excel;
import com.boc.common.core.domain.BaseEntity;

/**
 * DMZ区应用系统IP对象 dmz_application_ip
 * 
 * @author hnboc
 * @date 2024-08-13
 */
public class DmzApplicationIp extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 外联地址映射成VPN地址 */
    @Excel(name = "外联地址映射成VPN地址")
    private String externalAddressMappingVpn;

    /** 外联地址 */
    @Excel(name = "外联地址")
    private String externalAddress;

    /** 应用类型 */
    @Excel(name = "应用类型")
    private String applicationType;

    /** 应用日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "应用日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applicationDate;

    /** 外联访问地址 */
    @Excel(name = "外联访问地址")
    private String externalAccessAddress;

    /** WAN */
    @Excel(name = "WAN")
    private String wan;

    /** 外联路由器地址、端口 */
    @Excel(name = "外联路由器地址、端口")
    private String externalRouterAddressPort;

    /** 所属分类 */
    @Excel(name = "所属分类")
    private String category;

    /** 使用人 */
    @Excel(name = "使用人")
    private String user;

    /** 外联地址映射成内部地址 */
    @Excel(name = "外联地址映射成内部地址")
    private String externalAddressMappingInternal;

    /** 我行内部访问源地址 */
    @Excel(name = "我行内部访问源地址")
    private String internalAccessSourceAddress;

    /** 应用名称 */
    @Excel(name = "应用名称")
    private String applicationName;

    /** 访问目标的端口 */
    @Excel(name = "访问目标的端口")
    private String targetAccessPort;

    /** 接入路由器名称 */
    @Excel(name = "接入路由器名称")
    private String accessRouterName;

    /** 专线名称 */
    @Excel(name = "专线名称")
    private String dedicatedLineName;

    /** 内部地址映射成外部地址 */
    @Excel(name = "内部地址映射成外部地址")
    private String internalAddressMappingExternal;

    /** 内部地址 */
    @Excel(name = "内部地址")
    private String internalAddress;

    /** 外联访问源地址 */
    @Excel(name = "外联访问源地址")
    private String externalAccessSourceAddress;

    /** 端口用途描述 */
    @Excel(name = "端口用途描述")
    private String portUsageDescription;

    /** 是否为必要端口 */
    @Excel(name = "是否为必要端口")
    private String isNecessaryPort;

    /** dmz区IP地址 */
    @Excel(name = "dmz区IP地址")
    private String dmzIpAddress;

    /** 内部或外部地址 */
    @Excel(name = "内部或外部地址")
    private String internalOrExternalAddress;

    /** 访问端口 */
    @Excel(name = "访问端口")
    private String accessPort;

    /** 关联访问地址 */
    @Excel(name = "关联访问地址")
    private String associatedAccessAddress;

    /** 端口用途 */
    @Excel(name = "端口用途")
    private String portUsage;

    /** 内部应用服务器 */
    @Excel(name = "内部应用服务器")
    private String internalApplicationServer;

    /** 外联代办柜台 */
    @Excel(name = "外联代办柜台")
    private String externalProxyCounter;

    /** 线路类型、端口、ip */
    @Excel(name = "线路类型、端口、ip")
    private String lineTypePortIp;

    /** 开放端口 */
    @Excel(name = "开放端口")
    private String openPort;

    /** 发起方 */
    @Excel(name = "发起方")
    private String initiator;

    /** ip */
    @Excel(name = "ip")
    private String ip;

    /** 用途 */
    @Excel(name = "用途")
    private String purpose;

    /** 外部地址段 */
    @Excel(name = "外部地址段")
    private String externalAddressSegment;

    /** 内部地址段 */
    @Excel(name = "内部地址段")
    private String internalAddressSegment;

    /** 应用 */
    @Excel(name = "应用")
    private String application;

    /** 访问源 */
    @Excel(name = "访问源")
    private String accessSource;

    /** 路由器 */
    @Excel(name = "路由器")
    private String router;

    /** 内部地址映射成dmz地址 */
    @Excel(name = "内部地址映射成dmz地址")
    private String internalAddressMappingDmz;

    /** 端口 */
    @Excel(name = "端口")
    private String port;

    /** 创建者 */
    @Excel(name = "创建者")
    private String createdBy;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdTime;

    /** 最后更新者 */
    @Excel(name = "最后更新者")
    private String updatedBy;

    /** 最后更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最后更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updatedTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setExternalAddressMappingVpn(String externalAddressMappingVpn) 
    {
        this.externalAddressMappingVpn = externalAddressMappingVpn;
    }

    public String getExternalAddressMappingVpn() 
    {
        return externalAddressMappingVpn;
    }
    public void setExternalAddress(String externalAddress) 
    {
        this.externalAddress = externalAddress;
    }

    public String getExternalAddress() 
    {
        return externalAddress;
    }
    public void setApplicationType(String applicationType) 
    {
        this.applicationType = applicationType;
    }

    public String getApplicationType() 
    {
        return applicationType;
    }
    public void setApplicationDate(Date applicationDate) 
    {
        this.applicationDate = applicationDate;
    }

    public Date getApplicationDate() 
    {
        return applicationDate;
    }
    public void setExternalAccessAddress(String externalAccessAddress) 
    {
        this.externalAccessAddress = externalAccessAddress;
    }

    public String getExternalAccessAddress() 
    {
        return externalAccessAddress;
    }
    public void setWan(String wan) 
    {
        this.wan = wan;
    }

    public String getWan() 
    {
        return wan;
    }
    public void setExternalRouterAddressPort(String externalRouterAddressPort) 
    {
        this.externalRouterAddressPort = externalRouterAddressPort;
    }

    public String getExternalRouterAddressPort() 
    {
        return externalRouterAddressPort;
    }
    public void setCategory(String category) 
    {
        this.category = category;
    }

    public String getCategory() 
    {
        return category;
    }
    public void setUser(String user) 
    {
        this.user = user;
    }

    public String getUser() 
    {
        return user;
    }
    public void setExternalAddressMappingInternal(String externalAddressMappingInternal) 
    {
        this.externalAddressMappingInternal = externalAddressMappingInternal;
    }

    public String getExternalAddressMappingInternal() 
    {
        return externalAddressMappingInternal;
    }
    public void setInternalAccessSourceAddress(String internalAccessSourceAddress) 
    {
        this.internalAccessSourceAddress = internalAccessSourceAddress;
    }

    public String getInternalAccessSourceAddress() 
    {
        return internalAccessSourceAddress;
    }
    public void setApplicationName(String applicationName) 
    {
        this.applicationName = applicationName;
    }

    public String getApplicationName() 
    {
        return applicationName;
    }
    public void setTargetAccessPort(String targetAccessPort) 
    {
        this.targetAccessPort = targetAccessPort;
    }

    public String getTargetAccessPort() 
    {
        return targetAccessPort;
    }
    public void setAccessRouterName(String accessRouterName) 
    {
        this.accessRouterName = accessRouterName;
    }

    public String getAccessRouterName() 
    {
        return accessRouterName;
    }
    public void setDedicatedLineName(String dedicatedLineName) 
    {
        this.dedicatedLineName = dedicatedLineName;
    }

    public String getDedicatedLineName() 
    {
        return dedicatedLineName;
    }
    public void setInternalAddressMappingExternal(String internalAddressMappingExternal) 
    {
        this.internalAddressMappingExternal = internalAddressMappingExternal;
    }

    public String getInternalAddressMappingExternal() 
    {
        return internalAddressMappingExternal;
    }
    public void setInternalAddress(String internalAddress) 
    {
        this.internalAddress = internalAddress;
    }

    public String getInternalAddress() 
    {
        return internalAddress;
    }
    public void setExternalAccessSourceAddress(String externalAccessSourceAddress) 
    {
        this.externalAccessSourceAddress = externalAccessSourceAddress;
    }

    public String getExternalAccessSourceAddress() 
    {
        return externalAccessSourceAddress;
    }
    public void setPortUsageDescription(String portUsageDescription) 
    {
        this.portUsageDescription = portUsageDescription;
    }

    public String getPortUsageDescription() 
    {
        return portUsageDescription;
    }
    public void setIsNecessaryPort(String isNecessaryPort) 
    {
        this.isNecessaryPort = isNecessaryPort;
    }

    public String getIsNecessaryPort() 
    {
        return isNecessaryPort;
    }
    public void setDmzIpAddress(String dmzIpAddress) 
    {
        this.dmzIpAddress = dmzIpAddress;
    }

    public String getDmzIpAddress() 
    {
        return dmzIpAddress;
    }
    public void setInternalOrExternalAddress(String internalOrExternalAddress) 
    {
        this.internalOrExternalAddress = internalOrExternalAddress;
    }

    public String getInternalOrExternalAddress() 
    {
        return internalOrExternalAddress;
    }
    public void setAccessPort(String accessPort) 
    {
        this.accessPort = accessPort;
    }

    public String getAccessPort() 
    {
        return accessPort;
    }
    public void setAssociatedAccessAddress(String associatedAccessAddress) 
    {
        this.associatedAccessAddress = associatedAccessAddress;
    }

    public String getAssociatedAccessAddress() 
    {
        return associatedAccessAddress;
    }
    public void setPortUsage(String portUsage) 
    {
        this.portUsage = portUsage;
    }

    public String getPortUsage() 
    {
        return portUsage;
    }
    public void setInternalApplicationServer(String internalApplicationServer) 
    {
        this.internalApplicationServer = internalApplicationServer;
    }

    public String getInternalApplicationServer() 
    {
        return internalApplicationServer;
    }
    public void setExternalProxyCounter(String externalProxyCounter) 
    {
        this.externalProxyCounter = externalProxyCounter;
    }

    public String getExternalProxyCounter() 
    {
        return externalProxyCounter;
    }
    public void setLineTypePortIp(String lineTypePortIp) 
    {
        this.lineTypePortIp = lineTypePortIp;
    }

    public String getLineTypePortIp() 
    {
        return lineTypePortIp;
    }
    public void setOpenPort(String openPort) 
    {
        this.openPort = openPort;
    }

    public String getOpenPort() 
    {
        return openPort;
    }
    public void setInitiator(String initiator) 
    {
        this.initiator = initiator;
    }

    public String getInitiator() 
    {
        return initiator;
    }
    public void setIp(String ip) 
    {
        this.ip = ip;
    }

    public String getIp() 
    {
        return ip;
    }
    public void setPurpose(String purpose) 
    {
        this.purpose = purpose;
    }

    public String getPurpose() 
    {
        return purpose;
    }
    public void setExternalAddressSegment(String externalAddressSegment) 
    {
        this.externalAddressSegment = externalAddressSegment;
    }

    public String getExternalAddressSegment() 
    {
        return externalAddressSegment;
    }
    public void setInternalAddressSegment(String internalAddressSegment) 
    {
        this.internalAddressSegment = internalAddressSegment;
    }

    public String getInternalAddressSegment() 
    {
        return internalAddressSegment;
    }
    public void setApplication(String application) 
    {
        this.application = application;
    }

    public String getApplication() 
    {
        return application;
    }
    public void setAccessSource(String accessSource) 
    {
        this.accessSource = accessSource;
    }

    public String getAccessSource() 
    {
        return accessSource;
    }
    public void setRouter(String router) 
    {
        this.router = router;
    }

    public String getRouter() 
    {
        return router;
    }
    public void setInternalAddressMappingDmz(String internalAddressMappingDmz) 
    {
        this.internalAddressMappingDmz = internalAddressMappingDmz;
    }

    public String getInternalAddressMappingDmz() 
    {
        return internalAddressMappingDmz;
    }
    public void setPort(String port) 
    {
        this.port = port;
    }

    public String getPort() 
    {
        return port;
    }
    public void setCreatedBy(String createdBy) 
    {
        this.createdBy = createdBy;
    }

    public String getCreatedBy() 
    {
        return createdBy;
    }
    public void setCreatedTime(Date createdTime) 
    {
        this.createdTime = createdTime;
    }

    public Date getCreatedTime() 
    {
        return createdTime;
    }
    public void setUpdatedBy(String updatedBy) 
    {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedBy() 
    {
        return updatedBy;
    }
    public void setUpdatedTime(Date updatedTime) 
    {
        this.updatedTime = updatedTime;
    }

    public Date getUpdatedTime() 
    {
        return updatedTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("externalAddressMappingVpn", getExternalAddressMappingVpn())
            .append("externalAddress", getExternalAddress())
            .append("applicationType", getApplicationType())
            .append("applicationDate", getApplicationDate())
            .append("externalAccessAddress", getExternalAccessAddress())
            .append("wan", getWan())
            .append("externalRouterAddressPort", getExternalRouterAddressPort())
            .append("category", getCategory())
            .append("user", getUser())
            .append("externalAddressMappingInternal", getExternalAddressMappingInternal())
            .append("internalAccessSourceAddress", getInternalAccessSourceAddress())
            .append("applicationName", getApplicationName())
            .append("targetAccessPort", getTargetAccessPort())
            .append("accessRouterName", getAccessRouterName())
            .append("dedicatedLineName", getDedicatedLineName())
            .append("internalAddressMappingExternal", getInternalAddressMappingExternal())
            .append("internalAddress", getInternalAddress())
            .append("externalAccessSourceAddress", getExternalAccessSourceAddress())
            .append("portUsageDescription", getPortUsageDescription())
            .append("isNecessaryPort", getIsNecessaryPort())
            .append("dmzIpAddress", getDmzIpAddress())
            .append("internalOrExternalAddress", getInternalOrExternalAddress())
            .append("accessPort", getAccessPort())
            .append("associatedAccessAddress", getAssociatedAccessAddress())
            .append("portUsage", getPortUsage())
            .append("internalApplicationServer", getInternalApplicationServer())
            .append("externalProxyCounter", getExternalProxyCounter())
            .append("lineTypePortIp", getLineTypePortIp())
            .append("openPort", getOpenPort())
            .append("initiator", getInitiator())
            .append("ip", getIp())
            .append("purpose", getPurpose())
            .append("externalAddressSegment", getExternalAddressSegment())
            .append("internalAddressSegment", getInternalAddressSegment())
            .append("application", getApplication())
            .append("accessSource", getAccessSource())
            .append("router", getRouter())
            .append("internalAddressMappingDmz", getInternalAddressMappingDmz())
            .append("port", getPort())
            .append("remark", getRemark())
            .append("createdBy", getCreatedBy())
            .append("createdTime", getCreatedTime())
            .append("updatedBy", getUpdatedBy())
            .append("updatedTime", getUpdatedTime())
            .toString();
    }
}
