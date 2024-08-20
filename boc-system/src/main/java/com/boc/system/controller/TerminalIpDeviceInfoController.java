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
import com.boc.system.domain.TerminalIpDeviceInfo;
import com.boc.system.service.ITerminalIpDeviceInfoService;
import com.boc.common.utils.poi.ExcelUtil;
import com.boc.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 全辖终端IP_准入设备信息Controller
 * 
 * @author hnboc
 * @date 2024-08-14
 */
@RestController
@RequestMapping("/system/ipaccess")
public class TerminalIpDeviceInfoController extends BaseController
{
    @Autowired
    private ITerminalIpDeviceInfoService terminalIpDeviceInfoService;

    /**
     * 导入全辖终端IP_准入设备信息
     */
    @PreAuthorize("@ss.hasPermi('system:ipaccess:import')")
    @Log(title = "导入终端IP地址", businessType = BusinessType.IMPORT)
    @PostMapping("/importData")
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<TerminalIpDeviceInfo> util = new ExcelUtil<TerminalIpDeviceInfo>(TerminalIpDeviceInfo.class);
        List<TerminalIpDeviceInfo> terminalIpDeviceInfoList = util.importExcel(file.getInputStream());
        String operName = getUsername();
        String message = terminalIpDeviceInfoService.importTerminalIpDeviceInfo(terminalIpDeviceInfoList, updateSupport, operName);
        return AjaxResult.success(message);
    }

    /**
     * 导出全辖终端IP_准入设备信息模板
     */
    @PostMapping("/importTemplate")
    public void importTemplate(HttpServletResponse response)
    {
        ExcelUtil<TerminalIpDeviceInfo> util = new ExcelUtil<TerminalIpDeviceInfo>(TerminalIpDeviceInfo.class);
        util.importTemplateExcel(response, "全辖终端IP_准入设备信息数据");
    }

    /**
     * 查询全辖终端IP_准入设备信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:ipaccess:list')")
    @GetMapping("/list")
    public TableDataInfo list(TerminalIpDeviceInfo terminalIpDeviceInfo)
    {
        startPage();
        List<TerminalIpDeviceInfo> list = terminalIpDeviceInfoService.selectTerminalIpDeviceInfoList(terminalIpDeviceInfo);
        return getDataTable(list);
    }

    /**
     * 导出全辖终端IP_准入设备信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:ipaccess:export')")
    @Log(title = "全辖终端IP_准入设备信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TerminalIpDeviceInfo terminalIpDeviceInfo)
    {
        List<TerminalIpDeviceInfo> list = terminalIpDeviceInfoService.selectTerminalIpDeviceInfoList(terminalIpDeviceInfo);
        ExcelUtil<TerminalIpDeviceInfo> util = new ExcelUtil<TerminalIpDeviceInfo>(TerminalIpDeviceInfo.class);
        util.exportExcel(response, list, "全辖终端IP_准入设备信息数据");
    }

    /**
     * 获取全辖终端IP_准入设备信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:ipaccess:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(terminalIpDeviceInfoService.selectTerminalIpDeviceInfoById(id));
    }

    /**
     * 新增全辖终端IP_准入设备信息
     */
    @PreAuthorize("@ss.hasPermi('system:ipaccess:add')")
    @Log(title = "全辖终端IP_准入设备信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TerminalIpDeviceInfo terminalIpDeviceInfo)
    {
        return toAjax(terminalIpDeviceInfoService.insertTerminalIpDeviceInfo(terminalIpDeviceInfo));
    }

    /**
     * 修改全辖终端IP_准入设备信息
     */
    @PreAuthorize("@ss.hasPermi('system:ipaccess:edit')")
    @Log(title = "全辖终端IP_准入设备信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TerminalIpDeviceInfo terminalIpDeviceInfo)
    {
        return toAjax(terminalIpDeviceInfoService.updateTerminalIpDeviceInfo(terminalIpDeviceInfo));
    }

    /**
     * 删除全辖终端IP_准入设备信息
     */
    @PreAuthorize("@ss.hasPermi('system:ipaccess:remove')")
    @Log(title = "全辖终端IP_准入设备信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(terminalIpDeviceInfoService.deleteTerminalIpDeviceInfoByIds(ids));
    }
}
