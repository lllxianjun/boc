package com.boc.system.controller;

import com.boc.common.core.controller.BaseController;
import com.boc.common.core.domain.AjaxResult;
import com.boc.system.domain.TableCountEcharts;
import com.boc.system.service.ITableCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/system/echart")
public class EchartsController extends BaseController {
    @Autowired
    private ITableCountService tableCountService;

    @GetMapping("/echarts")
    public AjaxResult echart() {
        List<TableCountEcharts> tableCounts = tableCountService.getTableCounts();
        return AjaxResult.success(tableCounts);
    }
}
