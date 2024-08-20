package com.boc.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.boc.common.annotation.Excel;
import com.boc.common.core.domain.BaseEntity;

/**
 * 离行ATM及外联单位地址对象 atm_external_unit_address
 * 
 * @author hnboc
 * @date 2024-08-12
 */
public class AtmExternalUnitAddress extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 唯一标识符 */
    private Long id;

    /** ATM位置 */
    @Excel(name = "ATM位置")
    private String atmLocation;

    /** 设备型号 */
    @Excel(name = "设备型号")
    private String deviceModel;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String deviceName;

    /** 路由器LOOPBACK */
    @Excel(name = "路由器LOOPBACK")
    private String routerLoopback;

    /** 上端路由器 */
    @Excel(name = "上端路由器")
    private String upstreamRouter;

    /** 省行WAN IP */
    @Excel(name = "省行WAN IP")
    private String provincialWanIp;

    /** 路由器WAN */
    @Excel(name = "路由器WAN")
    private String routerWan;

    /** MSTP VLAN */
    @Excel(name = "MSTP VLAN")
    private String mstpVlan;

    /** ATM地址段 */
    @Excel(name = "ATM地址段")
    private String atmAddressSegment;

    /** 监控地址段 */
    @Excel(name = "监控地址段")
    private String monitoringAddressSegment;

    /** 交换机地址 */
    @Excel(name = "交换机地址")
    private String switchAddress;

    /** 新路由器IP */
    @Excel(name = "新路由器IP")
    private String newRouterIp;

    /** 线路调试日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "线路调试日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lineDebugDate;

    /** 运营商 */
    @Excel(name = "运营商")
    private String carrier;

    /** 端口 */
    @Excel(name = "端口")
    private String port;

    /** 对端地址段 */
    @Excel(name = "对端地址段")
    private String oppositeAddressSegment;

    /** 对端前置机IP */
    @Excel(name = "对端前置机IP")
    private String oppositeFrontIp;

    /** ATM实际地址 */
    @Excel(name = "ATM实际地址")
    private String actualAtmAddress;

    /** 行内ATM地址 */
    @Excel(name = "行内ATM地址")
    private String intraAtmIp;

    /** 网关 */
    @Excel(name = "网关")
    private String gateway;

    /** PC地址 */
    @Excel(name = "PC地址")
    private String pcAddress;

    /** 掩码 */
    @Excel(name = "掩码")
    private String subnetMask;

    /** 行名 */
    @Excel(name = "行名")
    private String bankName;

    /** 记录创建者用户ID */
    @Excel(name = "记录创建者用户ID")
    private String createdBy;

    /** 记录创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "记录创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdTime;

    /** 记录最后更新者用户ID */
    @Excel(name = "记录最后更新者用户ID")
    private String updatedBy;

    /** 记录更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "记录更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updatedTime;

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

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setAtmLocation(String atmLocation) 
    {
        this.atmLocation = atmLocation;
    }

    public String getAtmLocation() 
    {
        return atmLocation;
    }
    public void setDeviceModel(String deviceModel) 
    {
        this.deviceModel = deviceModel;
    }

    public String getDeviceModel() 
    {
        return deviceModel;
    }
    public void setDeviceName(String deviceName) 
    {
        this.deviceName = deviceName;
    }

    public String getDeviceName() 
    {
        return deviceName;
    }
    public void setRouterLoopback(String routerLoopback) 
    {
        this.routerLoopback = routerLoopback;
    }

    public String getRouterLoopback() 
    {
        return routerLoopback;
    }
    public void setUpstreamRouter(String upstreamRouter) 
    {
        this.upstreamRouter = upstreamRouter;
    }

    public String getUpstreamRouter() 
    {
        return upstreamRouter;
    }
    public void setProvincialWanIp(String provincialWanIp) 
    {
        this.provincialWanIp = provincialWanIp;
    }

    public String getProvincialWanIp() 
    {
        return provincialWanIp;
    }
    public void setRouterWan(String routerWan) 
    {
        this.routerWan = routerWan;
    }

    public String getRouterWan() 
    {
        return routerWan;
    }
    public void setMstpVlan(String mstpVlan) 
    {
        this.mstpVlan = mstpVlan;
    }

    public String getMstpVlan() 
    {
        return mstpVlan;
    }
    public void setAtmAddressSegment(String atmAddressSegment) 
    {
        this.atmAddressSegment = atmAddressSegment;
    }

    public String getAtmAddressSegment() 
    {
        return atmAddressSegment;
    }
    public void setMonitoringAddressSegment(String monitoringAddressSegment) 
    {
        this.monitoringAddressSegment = monitoringAddressSegment;
    }

    public String getMonitoringAddressSegment() 
    {
        return monitoringAddressSegment;
    }
    public void setSwitchAddress(String switchAddress) 
    {
        this.switchAddress = switchAddress;
    }

    public String getSwitchAddress() 
    {
        return switchAddress;
    }
    public void setNewRouterIp(String newRouterIp) 
    {
        this.newRouterIp = newRouterIp;
    }

    public String getNewRouterIp() 
    {
        return newRouterIp;
    }
    public void setLineDebugDate(Date lineDebugDate) 
    {
        this.lineDebugDate = lineDebugDate;
    }

    public Date getLineDebugDate() 
    {
        return lineDebugDate;
    }
    public void setCarrier(String carrier) 
    {
        this.carrier = carrier;
    }

    public String getCarrier() 
    {
        return carrier;
    }
    public void setPort(String port) 
    {
        this.port = port;
    }

    public String getPort() 
    {
        return port;
    }
    public void setOppositeAddressSegment(String oppositeAddressSegment) 
    {
        this.oppositeAddressSegment = oppositeAddressSegment;
    }

    public String getOppositeAddressSegment() 
    {
        return oppositeAddressSegment;
    }
    public void setOppositeFrontIp(String oppositeFrontIp) 
    {
        this.oppositeFrontIp = oppositeFrontIp;
    }

    public String getOppositeFrontIp() 
    {
        return oppositeFrontIp;
    }
    public void setActualAtmAddress(String actualAtmAddress) 
    {
        this.actualAtmAddress = actualAtmAddress;
    }

    public String getActualAtmAddress() 
    {
        return actualAtmAddress;
    }
    public void setIntraAtmIp(String intraAtmIp) 
    {
        this.intraAtmIp = intraAtmIp;
    }

    public String getIntraAtmIp() 
    {
        return intraAtmIp;
    }
    public void setGateway(String gateway) 
    {
        this.gateway = gateway;
    }

    public String getGateway() 
    {
        return gateway;
    }
    public void setPcAddress(String pcAddress) 
    {
        this.pcAddress = pcAddress;
    }

    public String getPcAddress() 
    {
        return pcAddress;
    }
    public void setSubnetMask(String subnetMask) 
    {
        this.subnetMask = subnetMask;
    }

    public String getSubnetMask() 
    {
        return subnetMask;
    }
    public void setBankName(String bankName) 
    {
        this.bankName = bankName;
    }

    public String getBankName() 
    {
        return bankName;
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
            .append("atmLocation", getAtmLocation())
            .append("deviceModel", getDeviceModel())
            .append("deviceName", getDeviceName())
            .append("routerLoopback", getRouterLoopback())
            .append("upstreamRouter", getUpstreamRouter())
            .append("provincialWanIp", getProvincialWanIp())
            .append("routerWan", getRouterWan())
            .append("mstpVlan", getMstpVlan())
            .append("atmAddressSegment", getAtmAddressSegment())
            .append("monitoringAddressSegment", getMonitoringAddressSegment())
            .append("switchAddress", getSwitchAddress())
            .append("newRouterIp", getNewRouterIp())
            .append("lineDebugDate", getLineDebugDate())
            .append("carrier", getCarrier())
            .append("port", getPort())
            .append("oppositeAddressSegment", getOppositeAddressSegment())
            .append("oppositeFrontIp", getOppositeFrontIp())
            .append("actualAtmAddress", getActualAtmAddress())
            .append("intraAtmIp", getIntraAtmIp())
            .append("gateway", getGateway())
            .append("pcAddress", getPcAddress())
            .append("subnetMask", getSubnetMask())
            .append("bankName", getBankName())
            .append("remark", getRemark())
            .append("createdBy", getCreatedBy())
            .append("createdTime", getCreatedTime())
            .append("updatedBy", getUpdatedBy())
            .append("updatedTime", getUpdatedTime())
            .toString();
    }
}
