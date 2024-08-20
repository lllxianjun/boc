package com.boc.system.service;

import com.boc.system.domain.TableCountEcharts;

import java.util.List;

public interface ITableCountService {
    List<TableCountEcharts> getTableCounts();
}
