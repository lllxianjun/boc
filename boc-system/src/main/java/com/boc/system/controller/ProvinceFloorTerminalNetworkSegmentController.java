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
import com.boc.system.domain.ProvinceFloorTerminalNetworkSegment;
import com.boc.system.service.IProvinceFloorTerminalNetworkSegmentService;
import com.boc.common.utils.poi.ExcelUtil;
import com.boc.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 省行楼层终端网段设备管理Controller
 * 
 * @author hnboc
 * @date 2024-08-14
 */
@RestController
@RequestMapping("/system/terminal")
public class ProvinceFloorTerminalNetworkSegmentController extends BaseController
{
    @Autowired
    private IProvinceFloorTerminalNetworkSegmentService provinceFloorTerminalNetworkSegmentService;

    /**
     * 导入终端IP地址
     */
    @PreAuthorize("@ss.hasPermi('system:terminal:import')")
    @Log(title = "导入终端IP地址", businessType = BusinessType.IMPORT)
    @PostMapping("/importData")
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<ProvinceFloorTerminalNetworkSegment> util = new ExcelUtil<ProvinceFloorTerminalNetworkSegment>(ProvinceFloorTerminalNetworkSegment.class);
        List<ProvinceFloorTerminalNetworkSegment> terminalList = util.importExcel(file.getInputStream());
        String operName = getUsername();
        String message = provinceFloorTerminalNetworkSegmentService.importProvinceFloorTerminalNetworkSegment(terminalList, updateSupport,operName);
        return AjaxResult.success(message);
    }

    /**
     * 导出终端IP地址模板
     */
    @PostMapping("/importTemplate")
    public void importTemplate(HttpServletResponse response)
    {
        ExcelUtil<ProvinceFloorTerminalNetworkSegment> util = new ExcelUtil<ProvinceFloorTerminalNetworkSegment>(ProvinceFloorTerminalNetworkSegment.class);
        util.importTemplateExcel(response, "终端IP地址");
    }

    /**
     * 查询省行楼层终端网段设备管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:terminal:list')")
    @GetMapping("/list")
    public TableDataInfo list(ProvinceFloorTerminalNetworkSegment provinceFloorTerminalNetworkSegment)
    {
        startPage();
        List<ProvinceFloorTerminalNetworkSegment> list = provinceFloorTerminalNetworkSegmentService.selectProvinceFloorTerminalNetworkSegmentList(provinceFloorTerminalNetworkSegment);
        return getDataTable(list);
    }

    /**
     * 导出省行楼层终端网段设备管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:terminal:export')")
    @Log(title = "省行楼层终端网段设备管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ProvinceFloorTerminalNetworkSegment provinceFloorTerminalNetworkSegment)
    {
        List<ProvinceFloorTerminalNetworkSegment> list = provinceFloorTerminalNetworkSegmentService.selectProvinceFloorTerminalNetworkSegmentList(provinceFloorTerminalNetworkSegment);
        ExcelUtil<ProvinceFloorTerminalNetworkSegment> util = new ExcelUtil<ProvinceFloorTerminalNetworkSegment>(ProvinceFloorTerminalNetworkSegment.class);
        util.exportExcel(response, list, "省行楼层终端网段设备管理数据");
    }

    /**
     * 获取省行楼层终端网段设备管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:terminal:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(provinceFloorTerminalNetworkSegmentService.selectProvinceFloorTerminalNetworkSegmentById(id));
    }

    /**
     * 新增省行楼层终端网段设备管理
     */
    @PreAuthorize("@ss.hasPermi('system:terminal:add')")
    @Log(title = "省行楼层终端网段设备管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ProvinceFloorTerminalNetworkSegment provinceFloorTerminalNetworkSegment)
    {
        return toAjax(provinceFloorTerminalNetworkSegmentService.insertProvinceFloorTerminalNetworkSegment(provinceFloorTerminalNetworkSegment));
    }

    /**
     * 修改省行楼层终端网段设备管理
     */
    @PreAuthorize("@ss.hasPermi('system:terminal:edit')")
    @Log(title = "省行楼层终端网段设备管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ProvinceFloorTerminalNetworkSegment provinceFloorTerminalNetworkSegment)
    {
        return toAjax(provinceFloorTerminalNetworkSegmentService.updateProvinceFloorTerminalNetworkSegment(provinceFloorTerminalNetworkSegment));
    }

    /**
     * 删除省行楼层终端网段设备管理
     */
    @PreAuthorize("@ss.hasPermi('system:terminal:remove')")
    @Log(title = "省行楼层终端网段设备管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(provinceFloorTerminalNetworkSegmentService.deleteProvinceFloorTerminalNetworkSegmentByIds(ids));
    }
}
