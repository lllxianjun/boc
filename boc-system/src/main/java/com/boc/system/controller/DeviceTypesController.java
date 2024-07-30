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
import com.boc.system.domain.DeviceTypes;
import com.boc.system.service.IDeviceTypesService;
import com.boc.common.utils.poi.ExcelUtil;
import com.boc.common.core.page.TableDataInfo;

/**
 * 设备类型字典Controller
 * 
 * @author lllxianjun
 * @date 2024-07-28
 */
@RestController
@RequestMapping("/system/types")
public class DeviceTypesController extends BaseController
{
    @Autowired
    private IDeviceTypesService deviceTypesService;

    /**
     * 查询设备类型字典列表
     */
    @PreAuthorize("@ss.hasPermi('system:types:list')")
    @GetMapping("/list")
    public TableDataInfo list(DeviceTypes deviceTypes)
    {
        startPage();
        List<DeviceTypes> list = deviceTypesService.selectDeviceTypesList(deviceTypes);
        return getDataTable(list);
    }

    /**
     * 导出设备类型字典列表
     */
    @PreAuthorize("@ss.hasPermi('system:types:export')")
    @Log(title = "设备类型字典", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DeviceTypes deviceTypes)
    {
        List<DeviceTypes> list = deviceTypesService.selectDeviceTypesList(deviceTypes);
        ExcelUtil<DeviceTypes> util = new ExcelUtil<DeviceTypes>(DeviceTypes.class);
        util.exportExcel(response, list, "设备类型字典数据");
    }

    /**
     * 获取设备类型字典详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:types:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(deviceTypesService.selectDeviceTypesById(id));
    }

    /**
     * 新增设备类型字典
     */
    @PreAuthorize("@ss.hasPermi('system:types:add')")
    @Log(title = "设备类型字典", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DeviceTypes deviceTypes)
    {
        return toAjax(deviceTypesService.insertDeviceTypes(deviceTypes));
    }

    /**
     * 修改设备类型字典
     */
    @PreAuthorize("@ss.hasPermi('system:types:edit')")
    @Log(title = "设备类型字典", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DeviceTypes deviceTypes)
    {
        return toAjax(deviceTypesService.updateDeviceTypes(deviceTypes));
    }

    /**
     * 删除设备类型字典
     */
    @PreAuthorize("@ss.hasPermi('system:types:remove')")
    @Log(title = "设备类型字典", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(deviceTypesService.deleteDeviceTypesByIds(ids));
    }
}
