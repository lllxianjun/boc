package com.boc.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.boc.common.annotation.Excel;
import com.boc.common.core.domain.BaseEntity;

/**
 * IP所在区域字典对象 ip_areas
 * 
 * @author lllxianjun
 * @date 2024-07-28
 */
public class IpAreas extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键，自增 */
    private Long id;

    /** IP所在区域的名称 */
    @Excel(name = "IP所在区域的名称")
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
