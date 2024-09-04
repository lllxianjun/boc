package com.boc.system.service.impl;

import com.boc.system.mapper.TableCountMapper;
import com.boc.system.service.ITableCountService;
import com.boc.system.domain.TableCountEcharts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class TableCountServiceImpl implements ITableCountService {

    @Autowired
    private TableCountMapper tableCountMapper;

    @Override
    public List<TableCountEcharts> getTableCounts() {
        List<TableCountEcharts> countsList = new ArrayList<>();

        countsList.add(new TableCountEcharts("离行ATM及外联单位地址", tableCountMapper.countAtmExternalUnitAddress()));
        countsList.add(new TableCountEcharts("智能柜台、本外币兑换机", tableCountMapper.countDeviceSmartcounterForeignexchange()));
        countsList.add(new TableCountEcharts("DMZ区应用系统", tableCountMapper.countDmzApplicationIp()));
        countsList.add(new TableCountEcharts("省行终端服务器", tableCountMapper.countProvinceFloorTerminalNetworkSegment()));
        countsList.add(new TableCountEcharts("全辖终端IP", tableCountMapper.countTerminalIpDeviceInfo()));
        
        return countsList;
    }
}
