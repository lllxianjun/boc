package com.boc.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.boc.common.annotation.Excel;
import com.boc.common.core.domain.BaseEntity;

/**
 * 设备信息对象 sys_device_info
 * 
 * @author ruoyi
 * @date 2024-07-23
 */
public class SysDeviceInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** IP地址 */
    @Excel(name = "IP地址")
    private String ipAddress;

    /** 主机类型 */
    @Excel(name = "主机类型")
    private String hostType;

    /** 应用类型 */
    @Excel(name = "应用类型")
    private String appType;

    /** 交换机IP */
    @Excel(name = "交换机IP")
    private String switchIp;

    /** 交换机部门 */
    @Excel(name = "交换机部门")
    private String switchDept;

    /** 设备信息点 */
    @Excel(name = "设备信息点")
    private String deviceInfoPoint;

    /** 位置 */
    @Excel(name = "位置")
    private String location;

    /** 管理员 */
    @Excel(name = "管理员")
    private String admin;

    /** 备注 */
    @Excel(name = "备注")
    private String remark;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

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
    public void setAppType(String appType) 
    {
        this.appType = appType;
    }

    public String getAppType() 
    {
        return appType;
    }
    public void setSwitchIp(String switchIp) 
    {
        this.switchIp = switchIp;
    }

    public String getSwitchIp() 
    {
        return switchIp;
    }
    public void setSwitchDept(String switchDept) 
    {
        this.switchDept = switchDept;
    }

    public String getSwitchDept() 
    {
        return switchDept;
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

    public void setRemark(String remark)
    {
        this.remark = remark;
    }

    @Override
    public String getRemark() {
        return remark;
    }

    public String getAdmin()
    {
        return admin;
    }



    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("ipAddress", getIpAddress())
            .append("hostType", getHostType())
            .append("appType", getAppType())
            .append("switchIp", getSwitchIp())
            .append("switchDept", getSwitchDept())
            .append("deviceInfoPoint", getDeviceInfoPoint())
            .append("location", getLocation())
            .append("admin", getAdmin())
            .append("remark", getRemark())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
