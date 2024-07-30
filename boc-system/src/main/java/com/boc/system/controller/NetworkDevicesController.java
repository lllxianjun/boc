package com.boc.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.boc.common.core.domain.entity.SysUser;
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
import com.boc.system.domain.NetworkDevices;
import com.boc.system.service.INetworkDevicesService;
import com.boc.common.utils.poi.ExcelUtil;
import com.boc.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * VLAN管理Controller
 * 
 * @author lllxianjun
 * @date 2024-07-28
 */
@RestController
@RequestMapping("/system/network_devices")
public class NetworkDevicesController extends BaseController
{
    @Autowired
    private INetworkDevicesService networkDevicesService;

    /**
     * 导入VLAN
     * @param file
     * @param updateSupport
     * @return
     * @throws Exception
     */
    @PreAuthorize("@ss.hasPermi('system:network_devices:import')")
    @Log(title = "导入VLAN", businessType = BusinessType.IMPORT)
    @PostMapping("/importData")
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<NetworkDevices> util = new ExcelUtil<NetworkDevices>(NetworkDevices.class);
        List<NetworkDevices> networkDevicesList = util.importExcel(file.getInputStream());
        String operName = getUsername();
        String message = networkDevicesService.importNetworkDevices(networkDevicesList, updateSupport, operName);
        return AjaxResult.success(message);
    }

    @PostMapping("/importTemplate")
    public void importTemplate(HttpServletResponse response)
    {
        ExcelUtil<NetworkDevices> util = new ExcelUtil<NetworkDevices>(NetworkDevices.class);
        util.importTemplateExcel(response, "VLAN表");
    }

    /**
     * 查询VLAN管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:network_devices:list')")
    @GetMapping("/list")
    public TableDataInfo list(NetworkDevices networkDevices)
    {
        startPage();
        List<NetworkDevices> list = networkDevicesService.selectNetworkDevicesList(networkDevices);
        return getDataTable(list);
    }

    /**
     * 导出VLAN管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:network_devices:export')")
    @Log(title = "VLAN管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NetworkDevices networkDevices)
    {
        List<NetworkDevices> list = networkDevicesService.selectNetworkDevicesList(networkDevices);
        ExcelUtil<NetworkDevices> util = new ExcelUtil<NetworkDevices>(NetworkDevices.class);
        util.exportExcel(response, list, "VLAN管理数据");
    }

    /**
     * 获取VLAN管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:network_devices:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(networkDevicesService.selectNetworkDevicesById(id));
    }

    /**
     * 新增VLAN管理
     */
    @PreAuthorize("@ss.hasPermi('system:network_devices:add')")
    @Log(title = "VLAN管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NetworkDevices networkDevices)
    {
        return toAjax(networkDevicesService.insertNetworkDevices(networkDevices));
    }

    /**
     * 修改VLAN管理
     */
    @PreAuthorize("@ss.hasPermi('system:network_devices:edit')")
    @Log(title = "VLAN管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NetworkDevices networkDevices)
    {
        return toAjax(networkDevicesService.updateNetworkDevices(networkDevices));
    }

    /**
     * 删除VLAN管理
     */
    @PreAuthorize("@ss.hasPermi('system:network_devices:remove')")
    @Log(title = "VLAN管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(networkDevicesService.deleteNetworkDevicesByIds(ids));
    }
}
