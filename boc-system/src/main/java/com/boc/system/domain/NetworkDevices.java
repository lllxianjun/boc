package com.boc.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.boc.common.annotation.Excel;
import com.boc.common.core.domain.BaseEntity;

/**
 * VLAN管理对象 network_devices
 * 
 * @author lllxianjun
 * @date 2024-07-28
 */
public class NetworkDevices extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键，自增 */
    private Long id;

    /** 设备的IP地址 */
    @Excel(name = "IP地址")
    private String ipAddress;

    /** 设备的MAC地址 */
    @Excel(name = "MAC地址")
    private String macAddress;

    /** 接入设备名称 */
    @Excel(name = "接入设备名称")
    private String accessDeviceName;

    /** 接入设备IP */
    @Excel(name = "接入设备IP")
    private String accessDeviceIp;

    /** 设备连接的端口号 */
    @Excel(name = "端口号")
    private Long portNumber;

    /** IP所在区域 */
    @Excel(name = "IP所在区域", readConverterExp = "1=网点,2=省行楼层,3=生产机房服务器区,4=灾备机房服务器区,5=外联DMZ,6=公共服务器区")
    private Long ipAreaId;

    /** 归属机构 */
    @Excel(name = "归属机构")
    private String organization;

    /** 负责人 */
    @Excel(name = "负责人")
    private String personInCharge;

    /** 设备类型，引用 device_types 表 */
    @Excel(name = "设备类型", readConverterExp = "1=虚拟机,2=物理服务器,3=路由器,4=交换机,5=防火墙,6=PC,7=打印机,8=智能柜台,9=安保设备,10=冠字号机具,11=多媒体终端,12=视频终端")
    private Long deviceTypeId;

    /** 设备的终端用途，自定义字段 */
    @Excel(name = "终端用途")
    private String devicePurpose;

    /** 备注*/
    @Excel(name = "备注")
    private String remark;

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

    @Override
    public String getRemark() {
        return remark;
    }

    @Override
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIpAddress()
    {
        return ipAddress;
    }
    public void setMacAddress(String macAddress) 
    {
        this.macAddress = macAddress;
    }

    public String getMacAddress() 
    {
        return macAddress;
    }
    public void setAccessDeviceName(String accessDeviceName) 
    {
        this.accessDeviceName = accessDeviceName;
    }

    public String getAccessDeviceName() 
    {
        return accessDeviceName;
    }
    public void setAccessDeviceIp(String accessDeviceIp) 
    {
        this.accessDeviceIp = accessDeviceIp;
    }

    public String getAccessDeviceIp() 
    {
        return accessDeviceIp;
    }
    public void setPortNumber(Long portNumber) 
    {
        this.portNumber = portNumber;
    }

    public Long getPortNumber() 
    {
        return portNumber;
    }
    public void setIpAreaId(Long ipAreaId) 
    {
        this.ipAreaId = ipAreaId;
    }

    public Long getIpAreaId() 
    {
        return ipAreaId;
    }
    public void setOrganization(String organization) 
    {
        this.organization = organization;
    }

    public String getOrganization() 
    {
        return organization;
    }
    public void setPersonInCharge(String personInCharge) 
    {
        this.personInCharge = personInCharge;
    }

    public String getPersonInCharge() 
    {
        return personInCharge;
    }
    public void setDeviceTypeId(Long deviceTypeId) 
    {
        this.deviceTypeId = deviceTypeId;
    }

    public Long getDeviceTypeId() 
    {
        return deviceTypeId;
    }
    public void setDevicePurpose(String devicePurpose) 
    {
        this.devicePurpose = devicePurpose;
    }

    public String getDevicePurpose() 
    {
        return devicePurpose;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("ipAddress", getIpAddress())
            .append("macAddress", getMacAddress())
            .append("accessDeviceName", getAccessDeviceName())
            .append("accessDeviceIp", getAccessDeviceIp())
            .append("portNumber", getPortNumber())
            .append("ipAreaId", getIpAreaId())
            .append("organization", getOrganization())
            .append("personInCharge", getPersonInCharge())
            .append("deviceTypeId", getDeviceTypeId())
            .append("devicePurpose", getDevicePurpose())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
