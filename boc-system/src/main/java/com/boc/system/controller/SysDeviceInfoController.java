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
import com.boc.system.domain.SysDeviceInfo;
import com.boc.system.service.ISysDeviceInfoService;
import com.boc.common.utils.poi.ExcelUtil;
import com.boc.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 设备信息Controller
 * 
 * @author ruoyi
 * @date 2024-07-23
 */
@RestController
@RequestMapping("/system/info")
public class SysDeviceInfoController extends BaseController
{
    @Autowired
    private ISysDeviceInfoService sysDeviceInfoService;

    /**
     * 查询设备信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:info:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysDeviceInfo sysDeviceInfo)
    {
        startPage();
        List<SysDeviceInfo> list = sysDeviceInfoService.selectSysDeviceInfoList(sysDeviceInfo);
        return getDataTable(list);
    }

    /**
     * 导出设备信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:info:export')")
    @Log(title = "设备信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysDeviceInfo sysDeviceInfo)
    {
        List<SysDeviceInfo> list = sysDeviceInfoService.selectSysDeviceInfoList(sysDeviceInfo);
        ExcelUtil<SysDeviceInfo> util = new ExcelUtil<SysDeviceInfo>(SysDeviceInfo.class);
        util.exportExcel(response, list, "设备信息数据");
    }

    /**
     * 获取设备信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:info:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(sysDeviceInfoService.selectSysDeviceInfoById(id));
    }

    /**
     * 新增设备信息
     */
    @PreAuthorize("@ss.hasPermi('system:info:add')")
    @Log(title = "设备信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysDeviceInfo sysDeviceInfo)
    {
        return toAjax(sysDeviceInfoService.insertSysDeviceInfo(sysDeviceInfo));
    }

    /**
     * 修改设备信息
     */
    @PreAuthorize("@ss.hasPermi('system:info:edit')")
    @Log(title = "设备信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysDeviceInfo sysDeviceInfo)
    {
        return toAjax(sysDeviceInfoService.updateSysDeviceInfo(sysDeviceInfo));
    }

    /**
     * 删除设备信息
     */
    @PreAuthorize("@ss.hasPermi('system:info:remove')")
    @Log(title = "设备信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysDeviceInfoService.deleteSysDeviceInfoByIds(ids));
    }

    @Log(title = "导入主机数据", businessType = BusinessType.IMPORT)
    @PreAuthorize("@ss.hasPermi('system:user:import')")
    @PostMapping("/importData")
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<SysDeviceInfo> util = new ExcelUtil<SysDeviceInfo>(SysDeviceInfo.class);
        List<SysDeviceInfo> deviceInfoList = util.importExcel(file.getInputStream());
        String operName = getUsername();
        String message = sysDeviceInfoService.importHostInfo(deviceInfoList, updateSupport, operName);
        return AjaxResult.success(message);
    }
}
