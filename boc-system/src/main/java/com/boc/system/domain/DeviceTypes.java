package com.boc.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.boc.common.annotation.Excel;
import com.boc.common.core.domain.BaseEntity;

/**
 * 设备类型字典对象 device_types
 * 
 * @author lllxianjun
 * @date 2024-07-28
 */
public class DeviceTypes extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键，自增 */
    private Long id;

    /** 设备类型的名称 */
    @Excel(name = "设备类型的名称")
    private String name;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .toString();
    }
}
