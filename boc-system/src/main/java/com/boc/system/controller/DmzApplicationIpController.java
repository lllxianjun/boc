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
import com.boc.system.domain.DmzApplicationIp;
import com.boc.system.service.IDmzApplicationIpService;
import com.boc.common.utils.poi.ExcelUtil;
import com.boc.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * DMZ区应用系统IPController
 * 
 * @author hnboc
 * @date 2024-08-13
 */
@RestController
@RequestMapping("/system/dmzapplicationip")
public class DmzApplicationIpController extends BaseController
{
    @Autowired
    private IDmzApplicationIpService dmzApplicationIpService;

    /**
     * 导入DMZ区应用系统IP
     *
     */
    @PreAuthorize("@ss.hasPermi('system:dmzapplicationip:import')")
    @Log(title = "导入DMZ区应用系统IP", businessType = BusinessType.IMPORT)
    @PostMapping("/importData")
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<DmzApplicationIp> util = new ExcelUtil<>(DmzApplicationIp.class);
        List<DmzApplicationIp> dmzApplicationIpList = util.importExcel(file.getInputStream());
        String operName = getUsername();
        String message = dmzApplicationIpService.importDmzApplicationIp(dmzApplicationIpList, updateSupport, operName);
        return AjaxResult.success(message);
    }

    /**
     * 导出模板
     */
    @PostMapping("/importTemplate")
    public void importTemplate(HttpServletResponse response)
    {
        ExcelUtil<DmzApplicationIp> util = new ExcelUtil<>(DmzApplicationIp.class);
        util.importTemplateExcel(response, "DMZ区应用系统IP");
    }

    /**
     * 查询DMZ区应用系统IP列表
     */
    @PreAuthorize("@ss.hasPermi('system:dmzapplicationip:list')")
    @GetMapping("/list")
    public TableDataInfo list(DmzApplicationIp dmzApplicationIp)
    {
        startPage();
        List<DmzApplicationIp> list = dmzApplicationIpService.selectDmzApplicationIpList(dmzApplicationIp);
        return getDataTable(list);
    }


    /**
     * 导出DMZ区应用系统IP列表
     */
    @PreAuthorize("@ss.hasPermi('system:dmzapplicationip:export')")
    @Log(title = "DMZ区应用系统IP", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DmzApplicationIp dmzApplicationIp)
    {
        List<DmzApplicationIp> list = dmzApplicationIpService.selectDmzApplicationIpList(dmzApplicationIp);
        ExcelUtil<DmzApplicationIp> util = new ExcelUtil<>(DmzApplicationIp.class);
        util.exportExcel(response, list, "DMZ区应用系统IP数据");
    }

    /**
     * 获取DMZ区应用系统IP详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:dmzapplicationip:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(dmzApplicationIpService.selectDmzApplicationIpById(id));
    }

    /**
     * 新增DMZ区应用系统IP
     */
    @PreAuthorize("@ss.hasPermi('system:dmzapplicationip:add')")
    @Log(title = "DMZ区应用系统IP", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DmzApplicationIp dmzApplicationIp)
    {
        return toAjax(dmzApplicationIpService.insertDmzApplicationIp(dmzApplicationIp));
    }

    /**
     * 修改DMZ区应用系统IP
     */
    @PreAuthorize("@ss.hasPermi('system:dmzapplicationip:edit')")
    @Log(title = "DMZ区应用系统IP", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DmzApplicationIp dmzApplicationIp)
    {
        return toAjax(dmzApplicationIpService.updateDmzApplicationIp(dmzApplicationIp));
    }

    /**
     * 删除DMZ区应用系统IP
     */
    @PreAuthorize("@ss.hasPermi('system:dmzapplicationip:remove')")
    @Log(title = "DMZ区应用系统IP", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dmzApplicationIpService.deleteDmzApplicationIpByIds(ids));
    }
}
