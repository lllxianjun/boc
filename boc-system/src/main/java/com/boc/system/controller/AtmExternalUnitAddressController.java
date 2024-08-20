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
import com.boc.system.domain.AtmExternalUnitAddress;
import com.boc.system.service.IAtmExternalUnitAddressService;
import com.boc.common.utils.poi.ExcelUtil;
import com.boc.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 离行ATM及外联单位地址Controller
 * 
 * @author hnboc
 * @date 2024-08-12
 */
@RestController
@RequestMapping("/system/atmaddress")
public class AtmExternalUnitAddressController extends BaseController
{
    @Autowired
    private IAtmExternalUnitAddressService atmExternalUnitAddressService;

    /**
     * 导入ATM地址
     */
    @PreAuthorize("@ss.hasPermi('system:atmaddress:import')")
    @Log(title = "导入ATM地址", businessType = BusinessType.IMPORT)
    @PostMapping("/importData")
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<AtmExternalUnitAddress> util = new ExcelUtil<AtmExternalUnitAddress>(AtmExternalUnitAddress.class);
        List<AtmExternalUnitAddress> atmExternalUnitAddressControllerList = util.importExcel(file.getInputStream());
        String operName = getUsername();
        String message = atmExternalUnitAddressService.importAtmExternalUnitAddress(atmExternalUnitAddressControllerList, updateSupport, operName);
        return AjaxResult.success(message);
    }

    /**
     * 导出模板
     */
    @PostMapping("/importTemplate")
    public void importTemplate(HttpServletResponse response)
    {
        ExcelUtil<AtmExternalUnitAddress> util = new ExcelUtil<AtmExternalUnitAddress>(AtmExternalUnitAddress.class);
        util.importTemplateExcel(response, "ATM地址表");
    }
    
    /**
     * 查询离行ATM及外联单位地址列表
     */
    @PreAuthorize("@ss.hasPermi('system:atmaddress:list')")
    @GetMapping("/list")
    public TableDataInfo list(AtmExternalUnitAddress atmExternalUnitAddress)
    {
        startPage();
        List<AtmExternalUnitAddress> list = atmExternalUnitAddressService.selectAtmExternalUnitAddressList(atmExternalUnitAddress);
        return getDataTable(list);
    }

    /**
     * 导出离行ATM及外联单位地址列表
     */
    @PreAuthorize("@ss.hasPermi('system:atmaddress:export')")
    @Log(title = "离行ATM及外联单位地址", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AtmExternalUnitAddress atmExternalUnitAddress)
    {
        List<AtmExternalUnitAddress> list = atmExternalUnitAddressService.selectAtmExternalUnitAddressList(atmExternalUnitAddress);
        ExcelUtil<AtmExternalUnitAddress> util = new ExcelUtil<AtmExternalUnitAddress>(AtmExternalUnitAddress.class);
        util.exportExcel(response, list, "离行ATM及外联单位地址数据");
    }

    /**
     * 获取离行ATM及外联单位地址详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:atmaddress:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(atmExternalUnitAddressService.selectAtmExternalUnitAddressById(id));
    }

    /**
     * 新增离行ATM及外联单位地址
     */
    @PreAuthorize("@ss.hasPermi('system:atmaddress:add')")
    @Log(title = "离行ATM及外联单位地址", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AtmExternalUnitAddress atmExternalUnitAddress)
    {
        return toAjax(atmExternalUnitAddressService.insertAtmExternalUnitAddress(atmExternalUnitAddress));
    }

    /**
     * 修改离行ATM及外联单位地址
     */
    @PreAuthorize("@ss.hasPermi('system:atmaddress:edit')")
    @Log(title = "离行ATM及外联单位地址", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AtmExternalUnitAddress atmExternalUnitAddress)
    {
        return toAjax(atmExternalUnitAddressService.updateAtmExternalUnitAddress(atmExternalUnitAddress));
    }

    /**
     * 删除离行ATM及外联单位地址
     */
    @PreAuthorize("@ss.hasPermi('system:atmaddress:remove')")
    @Log(title = "离行ATM及外联单位地址", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(atmExternalUnitAddressService.deleteAtmExternalUnitAddressByIds(ids));
    }
}
