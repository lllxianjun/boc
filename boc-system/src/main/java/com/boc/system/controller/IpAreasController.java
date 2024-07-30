package com.boc.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.boc.common.annotation.Log;
import com.boc.common.core.controller.BaseController;
import com.boc.common.core.domain.AjaxResult;
import com.boc.common.enums.BusinessType;
import com.boc.system.domain.IpAreas;
import com.boc.system.service.IIpAreasService;
import com.boc.common.utils.poi.ExcelUtil;
import com.boc.common.core.page.TableDataInfo;

/**
 * IP所在区域字典Controller
 * 
 * @author lllxianjun
 * @date 2024-07-28
 */
@RestController
@RequestMapping("/system/areas")
public class IpAreasController extends BaseController
{
    @Autowired
    private IIpAreasService ipAreasService;

    /**
     * 查询IP所在区域字典列表
     */
    @PreAuthorize("@ss.hasPermi('system:areas:list')")
    @GetMapping("/list")
    public TableDataInfo list(IpAreas ipAreas)
    {
        startPage();
        List<IpAreas> list = ipAreasService.selectIpAreasList(ipAreas);
        return getDataTable(list);
    }

    /**
     * 导出IP所在区域字典列表
     */
    @PreAuthorize("@ss.hasPermi('system:areas:export')")
    @Log(title = "IP所在区域字典", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, IpAreas ipAreas)
    {
        List<IpAreas> list = ipAreasService.selectIpAreasList(ipAreas);
        ExcelUtil<IpAreas> util = new ExcelUtil<IpAreas>(IpAreas.class);
        util.exportExcel(response, list, "IP所在区域字典数据");
    }

    /**
     * 获取IP所在区域字典详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:areas:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(ipAreasService.selectIpAreasById(id));
    }

    /**
     * 新增IP所在区域字典
     */
    @PreAuthorize("@ss.hasPermi('system:areas:add')")
    @Log(title = "IP所在区域字典", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody IpAreas ipAreas)
    {
        return toAjax(ipAreasService.insertIpAreas(ipAreas));
    }

    /**
     * 修改IP所在区域字典
     */
    @PreAuthorize("@ss.hasPermi('system:areas:edit')")
    @Log(title = "IP所在区域字典", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody IpAreas ipAreas)
    {
        return toAjax(ipAreasService.updateIpAreas(ipAreas));
    }

    /**
     * 删除IP所在区域字典
     */
    @PreAuthorize("@ss.hasPermi('system:areas:remove')")
    @Log(title = "IP所在区域字典", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(ipAreasService.deleteIpAreasByIds(ids));
    }
}
