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
import com.boc.system.domain.DeviceSmartcounterForeignexchange;
import com.boc.system.service.IDeviceSmartcounterForeignexchangeService;
import com.boc.common.utils.poi.ExcelUtil;
import com.boc.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 智能柜台及本外币兑换机IP地址Controller
 * 
 * @author hnboc
 * @date 2024-08-07
 */
@RestController
@RequestMapping("/system/foreignexchange")
public class DeviceSmartcounterForeignexchangeController extends BaseController
{
    @Autowired
    private IDeviceSmartcounterForeignexchangeService deviceSmartcounterForeignexchangeService;

    /**
     * 导入VLAN
     */
    @PreAuthorize("@ss.hasPermi('system:foreignexchange:import')")
    @Log(title = "导入设备", businessType = BusinessType.IMPORT)
    @PostMapping("/importData")
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<DeviceSmartcounterForeignexchange> util = new ExcelUtil<DeviceSmartcounterForeignexchange>(DeviceSmartcounterForeignexchange.class);
        List<DeviceSmartcounterForeignexchange> deviceSmartcounterForeignexchangeList = util.importExcel(file.getInputStream());
        String operName = getUsername();
        String message = deviceSmartcounterForeignexchangeService.importDeviceSmartcounterForeignexchange(deviceSmartcounterForeignexchangeList, updateSupport, operName);
        return AjaxResult.success(message);
    }

    @PostMapping("/importTemplate")
    public void importTemplate(HttpServletResponse response)
    {
        ExcelUtil<DeviceSmartcounterForeignexchange> util = new ExcelUtil<DeviceSmartcounterForeignexchange>(DeviceSmartcounterForeignexchange.class);
        util.importTemplateExcel(response, "智能柜台本外币IP表");
    }

    /**
     * 查询智能柜台及本外币兑换机IP地址列表
     */
    @PreAuthorize("@ss.hasPermi('system:foreignexchange:list')")
    @GetMapping("/list")
    public TableDataInfo list(DeviceSmartcounterForeignexchange deviceSmartcounterForeignexchange)
    {
        startPage();
        List<DeviceSmartcounterForeignexchange> list = deviceSmartcounterForeignexchangeService.selectDeviceSmartcounterForeignexchangeList(deviceSmartcounterForeignexchange);
        return getDataTable(list);
    }

    /**
     * 导出智能柜台及本外币兑换机IP地址列表
     */
    @PreAuthorize("@ss.hasPermi('system:foreignexchange:export')")
    @Log(title = "智能柜台及本外币兑换机IP地址", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DeviceSmartcounterForeignexchange deviceSmartcounterForeignexchange)
    {
        List<DeviceSmartcounterForeignexchange> list = deviceSmartcounterForeignexchangeService.selectDeviceSmartcounterForeignexchangeList(deviceSmartcounterForeignexchange);
        ExcelUtil<DeviceSmartcounterForeignexchange> util = new ExcelUtil<DeviceSmartcounterForeignexchange>(DeviceSmartcounterForeignexchange.class);
        util.exportExcel(response, list, "智能柜台及本外币兑换机IP地址数据");
    }

    /**
     * 获取智能柜台及本外币兑换机IP地址详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:foreignexchange:query')")
    @GetMapping(value = "/{deviceId}")
    public AjaxResult getInfo(@PathVariable("deviceId") Long deviceId)
    {
        return success(deviceSmartcounterForeignexchangeService.selectDeviceSmartcounterForeignexchangeByDeviceId(deviceId));
    }

    /**
     * 新增智能柜台及本外币兑换机IP地址
     */
    @PreAuthorize("@ss.hasPermi('system:foreignexchange:add')")
    @Log(title = "智能柜台及本外币兑换机IP地址", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DeviceSmartcounterForeignexchange deviceSmartcounterForeignexchange)
    {
        return toAjax(deviceSmartcounterForeignexchangeService.insertDeviceSmartcounterForeignexchange(deviceSmartcounterForeignexchange));
    }

    /**
     * 修改智能柜台及本外币兑换机IP地址
     */
    @PreAuthorize("@ss.hasPermi('system:foreignexchange:edit')")
    @Log(title = "智能柜台及本外币兑换机IP地址", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DeviceSmartcounterForeignexchange deviceSmartcounterForeignexchange)
    {
        return toAjax(deviceSmartcounterForeignexchangeService.updateDeviceSmartcounterForeignexchange(deviceSmartcounterForeignexchange));
    }

    /**
     * 删除智能柜台及本外币兑换机IP地址
     */
    @PreAuthorize("@ss.hasPermi('system:foreignexchange:remove')")
    @Log(title = "智能柜台及本外币兑换机IP地址", businessType = BusinessType.DELETE)
	@DeleteMapping("/{deviceIds}")
    public AjaxResult remove(@PathVariable Long[] deviceIds)
    {
        return toAjax(deviceSmartcounterForeignexchangeService.deleteDeviceSmartcounterForeignexchangeByDeviceIds(deviceIds));
    }
}
