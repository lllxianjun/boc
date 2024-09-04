<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="IP地址" prop="ipAddress">
        <el-input v-model="queryParams.ipAddress" placeholder="请输入IP地址" clearable @keyup.enter.native="handleQuery" />
      </el-form-item>
      <!-- 隐藏不需要的搜索条件 -->
      <!-- <el-form-item label="主机类型" prop="hostType">
        <el-input
          v-model="queryParams.hostType"
          placeholder="请输入主机类型"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="应用类型" prop="applicationType">
        <el-input
          v-model="queryParams.applicationType"
          placeholder="请输入应用类型"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="主机名" prop="hostname">
        <el-input
          v-model="queryParams.hostname"
          placeholder="请输入主机名"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="交换机IP" prop="switchIp">
        <el-input
          v-model="queryParams.switchIp"
          placeholder="请输入交换机IP"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="交换机端口" prop="switchPort">
        <el-input
          v-model="queryParams.switchPort"
          placeholder="请输入交换机端口"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="设备信息点" prop="deviceInfoPoint">
        <el-input
          v-model="queryParams.deviceInfoPoint"
          placeholder="请输入设备信息点"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="位置" prop="location">
        <el-input
          v-model="queryParams.location"
          placeholder="请输入位置"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="管理员" prop="admin">
        <el-input
          v-model="queryParams.admin"
          placeholder="请输入管理员"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="固定资产编号" prop="assetNumber">
        <el-input
          v-model="queryParams.assetNumber"
          placeholder="请输入固定资产编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="日期" prop="recordDate">
        <el-date-picker clearable
          v-model="queryParams.recordDate"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择日期">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="网段" prop="subnet">
        <el-input
          v-model="queryParams.subnet"
          placeholder="请输入网段"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="VLAN" prop="vlan">
        <el-input
          v-model="queryParams.vlan"
          placeholder="请输入VLAN"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="控制列表" prop="controlList">
        <el-input
          v-model="queryParams.controlList"
          placeholder="请输入控制列表"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="用途" prop="usageType">
        <el-input
          v-model="queryParams.usageType"
          placeholder="请输入用途"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="分布" prop="distribution">
        <el-input
          v-model="queryParams.distribution"
          placeholder="请输入分布"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="原服务器IP" prop="originalServerIp">
        <el-input
          v-model="queryParams.originalServerIp"
          placeholder="请输入原服务器IP"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="机柜" prop="rack">
        <el-input
          v-model="queryParams.rack"
          placeholder="请输入机柜"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="使用人" prop="user">
        <el-input
          v-model="queryParams.user"
          placeholder="请输入使用人"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="电话信息点" prop="phoneInfoPoint">
        <el-input
          v-model="queryParams.phoneInfoPoint"
          placeholder="请输入电话信息点"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="是否清空回收" prop="isEmptyRecycled">
        <el-input
          v-model="queryParams.isEmptyRecycled"
          placeholder="请输入是否清空回收"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="资产信息标号" prop="assetInfoNumber">
        <el-input
          v-model="queryParams.assetInfoNumber"
          placeholder="请输入资产信息标号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="投产日期" prop="commissioningDate">
        <el-date-picker clearable
          v-model="queryParams.commissioningDate"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择投产日期">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="NAT1#IP地址" prop="natIpAddress1">
        <el-input
          v-model="queryParams.natIpAddress1"
          placeholder="请输入NAT1#IP地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="版本" prop="version">
        <el-input
          v-model="queryParams.version"
          placeholder="请输入版本"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="年限" prop="lifespan">
        <el-input
          v-model="queryParams.lifespan"
          placeholder="请输入年限"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="MAC地址" prop="macAddress">
        <el-input
          v-model="queryParams.macAddress"
          placeholder="请输入MAC地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="计算机名" prop="computerName">
        <el-input
          v-model="queryParams.computerName"
          placeholder="请输入计算机名"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="网关" prop="gateway">
        <el-input
          v-model="queryParams.gateway"
          placeholder="请输入网关"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="网络划分" prop="networkDivision">
        <el-input
          v-model="queryParams.networkDivision"
          placeholder="请输入网络划分"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item> -->

      <!-- 这里放默认搜索内容 -->
      <el-form-item label-width="82px" label="IP所在区域" prop="ipArea">
        <el-select v-model="queryParams.ipArea" placeholder="请选择IP所在区域" clearable>
          <el-option v-for="dict in dict.type.ip_areas" :key="dict.value" :label="dict.label" :value="dict.value" />
        </el-select>
      </el-form-item>
      <el-form-item label="设备类型" prop="deviceType">
        <el-select v-model="queryParams.deviceType" placeholder="请选择设备类型" clearable>
          <el-option v-for="dict in dict.type.device_type" :key="dict.value" :label="dict.label" :value="dict.value" />
        </el-select>
      </el-form-item>

       <!-- 折叠搜索区域 -->
      <el-collapse v-model="activeCollapse" v-show="showMoreFilters">
        <el-collapse-item name="more">
          <!-- 这里放折叠内容 -->
        </el-collapse-item>
      </el-collapse>

      <!-- <el-form-item label="创建者" prop="createdBy">
        <el-input
          v-model="queryParams.createdBy"
          placeholder="请输入创建者"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="最后更新者" prop="updatedBy">
        <el-input
          v-model="queryParams.updatedBy"
          placeholder="请输入最后更新者"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="记录创建时间" prop="createdAt">
        <el-date-picker clearable
          v-model="queryParams.createdAt"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择记录创建时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="记录最后更新时间" prop="updatedAt">
        <el-date-picker clearable
          v-model="queryParams.updatedAt"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择记录最后更新时间">
        </el-date-picker>
      </el-form-item> -->
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
        <el-button type="text" @click="toggleMoreFilters">
          {{ showMoreFilters ? '收起' : '展开' }}
          <i :class="['el-icon-arrow-' + (showMoreFilters ? 'up' : 'down')]"></i>
        </el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button type="primary" plain icon="el-icon-plus" size="mini" @click="handleAdd"
          v-hasPermi="['system:terminal:add']">新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button type="success" plain icon="el-icon-edit" size="mini" :disabled="single" @click="handleUpdate"
          v-hasPermi="['system:terminal:edit']">修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button type="danger" plain icon="el-icon-delete" size="mini" :disabled="multiple" @click="handleDelete"
          v-hasPermi="['system:terminal:remove']">删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button type="warning" plain icon="el-icon-download" size="mini" @click="handleExport"
          v-hasPermi="['system:terminal:export']">导出</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button type="info" plain icon="el-icon-upload2" size="mini" @click="handleImport"
          v-hasPermi="['system:terminal:import']">导入</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList" :columns="columns"></right-toolbar>
    </el-row>

    <!-- 列表表头 -->
    <el-table v-loading="loading" stripe border size="mini" :header-cell-style="{ background: '#eef1f6', color: '#606266' }"
      :data="terminalList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="序号" type="index" :index="indexMethod" align="center" prop="id"
        v-if="columns[0].visible" />
      <el-table-column label="IP地址" align="center" prop="ipAddress" v-if="columns[1].visible" />
      <el-table-column label="主机类型" show-overflow-tooltip align="center" prop="hostType" v-if="columns[2].visible" />
      <el-table-column label="应用类型" show-overflow-tooltip align="center" prop="applicationType"
        v-if="columns[3].visible" />
      <el-table-column label="主机名" show-overflow-tooltip align="center" prop="hostname" v-if="columns[4].visible" />
      <el-table-column label="交换机IP" show-overflow-tooltip align="center" prop="switchIp" v-if="columns[5].visible" />
      <el-table-column label="交换机端口" show-overflow-tooltip align="center" prop="switchPort" v-if="columns[6].visible" />
      <el-table-column label="设备信息点" show-overflow-tooltip align="center" prop="deviceInfoPoint"
        v-if="columns[7].visible" />
      <el-table-column label="位置" show-overflow-tooltip align="center" prop="location" v-if="columns[8].visible" />
      <el-table-column label="管理员" show-overflow-tooltip align="center" prop="admin" v-if="columns[9].visible" />
      <el-table-column label="固定资产编号" show-overflow-tooltip align="center" prop="assetNumber"
        v-if="columns[10].visible" />
      <el-table-column label="日期" align="center" prop="recordDate" v-if="columns[11].visible" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.recordDate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="网段" show-overflow-tooltip align="center" prop="subnet" v-if="columns[12].visible" />
      <el-table-column label="VLAN" show-overflow-tooltip align="center" prop="vlan" v-if="columns[13].visible" />
      <el-table-column label="控制列表" show-overflow-tooltip align="center" prop="controlList"
        v-if="columns[14].visible" />
      <el-table-column label="用途" show-overflow-tooltip align="center" prop="usageType" v-if="columns[15].visible" />
      <el-table-column label="分布" show-overflow-tooltip align="center" prop="distribution" v-if="columns[16].visible" />
      <el-table-column label="原服务器IP" show-overflow-tooltip align="center" prop="originalServerIp"
        v-if="columns[17].visible" />
      <el-table-column label="机柜" show-overflow-tooltip align="center" prop="rack" v-if="columns[18].visible" />
      <el-table-column label="使用人" show-overflow-tooltip align="center" prop="user" v-if="columns[19].visible" />
      <el-table-column label="电话信息点" show-overflow-tooltip align="center" prop="phoneInfoPoint"
        v-if="columns[20].visible" />
      <el-table-column label="是否清空回收" show-overflow-tooltip align="center" prop="isEmptyRecycled"
        v-if="columns[21].visible" />
      <el-table-column label="资产信息标号" show-overflow-tooltip align="center" prop="assetInfoNumber"
        v-if="columns[22].visible" />
      <el-table-column label="投产日期" align="center" prop="commissioningDate" v-if="columns[23].visible" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.commissioningDate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="NAT1#IP地址" show-overflow-tooltip align="center" v-if="columns[24].visible"
        prop="natIpAddress1" />
      <el-table-column label="版本" show-overflow-tooltip align="center" prop="version" v-if="columns[25].visible" />
      <el-table-column label="年限" show-overflow-tooltip align="center" prop="lifespan" v-if="columns[26].visible" />
      <el-table-column label="MAC地址" show-overflow-tooltip align="center" prop="macAddress"
        v-if="columns[27].visible" />
      <el-table-column label="计算机名" show-overflow-tooltip align="center" prop="computerName"
        v-if="columns[28].visible" />
      <el-table-column label="网关" show-overflow-tooltip align="center" prop="gateway" v-if="columns[29].visible" />
      <el-table-column label="网络划分" show-overflow-tooltip align="center" prop="networkDivision"
        v-if="columns[30].visible" />
      <el-table-column label="IP所在区域" align="center" prop="ipArea" v-if="columns[31].visible">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.ip_areas" :value="scope.row.ipArea" />
        </template>
      </el-table-column>
      <el-table-column label="设备类型" show-overflow-tooltip align="center" prop="deviceType" v-if="columns[32].visible">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.device_type" :value="scope.row.deviceType" />
        </template>
      </el-table-column>
      <el-table-column label="备注" show-overflow-tooltip align="center" prop="remark" v-if="columns[33].visible" />
      <!-- <el-table-column label="创建者" align="center" prop="createdBy" />
      <el-table-column label="最后更新者" align="center" prop="updatedBy" />
      <el-table-column label="记录创建时间" align="center" prop="createdAt" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.createdAt, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="记录最后更新时间" align="center" prop="updatedAt" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.updatedAt, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column> -->
      <el-table-column label="操作" fixed="right" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button size="mini" type="text" icon="el-icon-message" @click="GetTerminalInfo(scope.row)"
            v-hasPermi="['system:terminal:query']">查看详情</el-button>
          <el-button size="mini" type="text" icon="el-icon-edit" @click="handleUpdate(scope.row)"
            v-hasPermi="['system:terminal:edit']">修改</el-button>
          <el-button size="mini" type="text" icon="el-icon-delete" @click="handleDelete(scope.row)"
            v-hasPermi="['system:terminal:remove']">删除</el-button>
        </template>
      </el-table-column>
    </el-table>

    <pagination v-show="total > 0" :total="total" :page.sync="queryParams.pageNum" :limit.sync="queryParams.pageSize"
      @pagination="getList" />

    <!-- 添加或修改省行终端服务器管理对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="1000px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-row :gutter="20">
          <!-- 第一列 -->
          <el-col :span="8">
            <el-form-item label="IP地址" prop="ipAddress">
              <el-input v-model="form.ipAddress" placeholder="请输入IP地址" />
            </el-form-item>
            <el-form-item label="日期" prop="recordDate">
              <el-date-picker clearable v-model="form.recordDate" type="date" value-format="yyyy-MM-dd"
                placeholder="请选择日期">
              </el-date-picker>
            </el-form-item>
            <el-form-item label="是否清空回收" prop="isEmptyRecycled">
              <el-input v-model="form.isEmptyRecycled" placeholder="请输入是否清空回收" />
            </el-form-item>
            <el-form-item label="主机类型" prop="hostType">
              <el-input v-model="form.hostType" placeholder="请输入主机类型" />
            </el-form-item>
            <el-form-item label="应用类型" prop="applicationType">
              <el-input v-model="form.applicationType" placeholder="请输入应用类型" />
            </el-form-item>
            <el-form-item label="主机名" prop="hostname">
              <el-input v-model="form.hostname" placeholder="请输入主机名" />
            </el-form-item>
            <el-form-item label="交换机IP" prop="switchIp">
              <el-input v-model="form.switchIp" placeholder="请输入交换机IP" />
            </el-form-item>
            <el-form-item label="交换机端口" prop="switchPort">
              <el-input v-model="form.switchPort" placeholder="请输入交换机端口" />
            </el-form-item>
            <el-form-item label="设备信息点" prop="deviceInfoPoint">
              <el-input v-model="form.deviceInfoPoint" placeholder="请输入设备信息点" />
            </el-form-item>
            <el-form-item label="位置" prop="location">
              <el-input v-model="form.location" placeholder="请输入位置" />
            </el-form-item>
            <el-form-item label="固定资产编号" prop="assetNumber">
              <el-input v-model="form.assetNumber" placeholder="请输入固定资产编号" />
            </el-form-item>
            <!-- <el-form-item label="创建者" prop="createdBy">
              <el-input v-model="form.createdBy" placeholder="请输入创建者" />
            </el-form-item>
            <el-form-item label="记录最后更新时间" prop="updatedAt">
              <el-date-picker  clearable
                v-model="form.updatedAt"
                type="date"
                value-format="yyyy-MM-dd"
                placeholder="请选择记录最后更新时间">
              </el-date-picker>
            </el-form-item> -->
          </el-col>
          <!-- 第二列 -->
          <el-col :span="8">
            <el-form-item label="设备类型" prop="deviceType">
              <el-select v-model="form.deviceType" placeholder="请选择设备类型">
                <el-option v-for="dict in dict.type.device_type" :key="dict.value" :label="dict.label"
                  :value="dict.value"></el-option>
              </el-select>
            </el-form-item>
            <el-form-item label="网段" prop="subnet">
              <el-input v-model="form.subnet" placeholder="请输入网段" />
            </el-form-item>
            <el-form-item label="VLAN" prop="vlan">
              <el-input v-model="form.vlan" placeholder="请输入VLAN" />
            </el-form-item>
            <el-form-item label="控制列表" prop="controlList">
              <el-input v-model="form.controlList" placeholder="请输入控制列表" />
            </el-form-item>
            <el-form-item label="用途" prop="usageType">
              <el-input v-model="form.usageType" placeholder="请输入用途" />
            </el-form-item>
            <el-form-item label="分布" prop="distribution">
              <el-input v-model="form.distribution" placeholder="请输入分布" />
            </el-form-item>
            <el-form-item label="原服务器IP" prop="originalServerIp">
              <el-input v-model="form.originalServerIp" placeholder="请输入原服务器IP" />
            </el-form-item>
            <el-form-item label="机柜" prop="rack">
              <el-input v-model="form.rack" placeholder="请输入机柜" />
            </el-form-item>
            <el-form-item label="使用人" prop="user">
              <el-input v-model="form.user" placeholder="请输入使用人" />
            </el-form-item>
            <el-form-item label="电话信息点" prop="phoneInfoPoint">
              <el-input v-model="form.phoneInfoPoint" placeholder="请输入电话信息点" />
            </el-form-item>
            <el-form-item label="管理员" prop="admin">
              <el-input v-model="form.admin" placeholder="请输入管理员" />
            </el-form-item>
            <!-- <el-form-item label="最后更新者" prop="updatedBy">
              <el-input v-model="form.updatedBy" placeholder="请输入最后更新者" />
            </el-form-item> -->
          </el-col>
          <!-- 第三列 -->
          <el-col :span="8">
            <el-form-item label="IP所在区域" prop="ipArea">
              <el-select v-model="form.ipArea" placeholder="请选择IP所在区域">
                <el-option v-for="dict in dict.type.ip_areas" :key="dict.value" :label="dict.label"
                  :value="dict.value"></el-option>
              </el-select>
            </el-form-item>
            <el-form-item label="资产信息标号" prop="assetInfoNumber">
              <el-input v-model="form.assetInfoNumber" placeholder="请输入资产信息标号" />
            </el-form-item>
            <el-form-item label="投产日期" prop="commissioningDate">
              <el-date-picker clearable v-model="form.commissioningDate" type="date" value-format="yyyy-MM-dd"
                placeholder="请选择投产日期">
              </el-date-picker>
            </el-form-item>
            <el-form-item label="NAT1#IP地址" prop="natIpAddress1">
              <el-input v-model="form.natIpAddress1" placeholder="请输入NAT1#IP地址" />
            </el-form-item>
            <el-form-item label="版本" prop="version">
              <el-input v-model="form.version" placeholder="请输入版本" />
            </el-form-item>
            <el-form-item label="年限" prop="lifespan">
              <el-input v-model="form.lifespan" placeholder="请输入年限" />
            </el-form-item>
            <el-form-item label="MAC地址" prop="macAddress">
              <el-input v-model="form.macAddress" placeholder="请输入MAC地址" />
            </el-form-item>
            <el-form-item label="计算机名" prop="computerName">
              <el-input v-model="form.computerName" placeholder="请输入计算机名" />
            </el-form-item>
            <el-form-item label="网关" prop="gateway">
              <el-input v-model="form.gateway" placeholder="请输入网关" />
            </el-form-item>
            <el-form-item label="网络划分" prop="networkDivision">
              <el-input v-model="form.networkDivision" placeholder="请输入网络划分" />
            </el-form-item>
            <!-- <el-form-item label="记录创建时间" prop="createdAt">
              <el-date-picker clearable
                v-model="form.createdAt"
                type="date"
                value-format="yyyy-MM-dd"
                placeholder="请选择记录创建时间">
              </el-date-picker>
            </el-form-item> -->
          </el-col>
        </el-row>
        <!-- 单独放置备注 -->
        <el-form-item label="备注" prop="remark">
          <el-input v-model="form.remark" type="textarea" placeholder="请输入内容" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>

    <!-- 查看终端IP详情 -->
    <el-dialog title="终端IP详情" :visible.sync="getterminalInfoOpen" width="1200px" append-to-body>
      <el-form :model="form" label-width="120px" class="dialog-content">
        <el-row :gutter="20">
          <!-- 第一列 -->
          <el-col :span="8">
            <el-form-item label="IP地址" v-show="form.ipAddress">
              <el-input v-model="form.ipAddress" :disabled="true" />
            </el-form-item>
            <el-form-item label="主机类型" v-show="form.hostType">
              <el-input v-model="form.hostType" :disabled="true" />
            </el-form-item>
            <el-form-item label="应用类型" v-show="form.applicationType">
              <el-input v-model="form.applicationType" :disabled="true" />
            </el-form-item>
            <el-form-item label="主机名" v-show="form.hostname">
              <el-input v-model="form.hostname" :disabled="true" />
            </el-form-item>
            <el-form-item label="交换机IP" v-show="form.switchIp">
              <el-input v-model="form.switchIp" :disabled="true" />
            </el-form-item>
            <el-form-item label="交换机端口" v-show="form.switchPort">
              <el-input v-model="form.switchPort" :disabled="true" />
            </el-form-item>
            <el-form-item label="设备信息点" v-show="form.deviceInfoPoint">
              <el-input v-model="form.deviceInfoPoint" :disabled="true" />
            </el-form-item>
            <el-form-item label="位置" v-show="form.location">
              <el-input v-model="form.location" :disabled="true" />
            </el-form-item>
            <el-form-item label="管理员" v-show="form.admin">
              <el-input v-model="form.admin" :disabled="true" />
            </el-form-item>
            <el-form-item label="固定资产编号" v-show="form.assetNumber">
              <el-input v-model="form.assetNumber" :disabled="true" />
            </el-form-item>
            <!-- <el-form-item label="创建者" v-show="form.createdBy">
              <el-input v-model="form.createdBy" :disabled="true" />
            </el-form-item>
            <el-form-item label="记录最后更新时间" :disabled="true">
              <el-date-picker  clearable
                v-model="form.updatedAt"
                type="date"
                value-format="yyyy-MM-dd"
                :disabled="true">
              </el-date-picker>
            </el-form-item> -->
          </el-col>
          <!-- 第二列 -->
          <el-col :span="8">
            <el-form-item label="IP区域" v-show="form.ipArea">
              <el-select v-model="form.ipArea" :disabled="true">
                <el-option v-for="dict in dict.type.ip_areas" :key="dict.value" :label="dict.label"
                  :value="dict.value"></el-option>
              </el-select>
            </el-form-item>
            <el-form-item label="日期" v-show="form.recordDate">
              <el-date-picker clearable v-model="form.recordDate" type="date" value-format="yyyy-MM-dd"
                :disabled="true">
              </el-date-picker>
            </el-form-item>
            <el-form-item label="网段" v-show="form.subnet">
              <el-input v-model="form.subnet" :disabled="true" />
            </el-form-item>
            <el-form-item label="VLAN" v-show="form.vlan">
              <el-input v-model="form.vlan" :disabled="true" />
            </el-form-item>
            <el-form-item label="控制列表" v-show="form.controlList">
              <el-input v-model="form.controlList" :disabled="true" />
            </el-form-item>
            <el-form-item label="用途" v-show="form.usageType">
              <el-input v-model="form.usageType" :disabled="true" />
            </el-form-item>
            <el-form-item label="分布" v-show="form.distribution">
              <el-input v-model="form.distribution" :disabled="true" />
            </el-form-item>
            <el-form-item label="原服务器IP" v-show="form.originalServerIp">
              <el-input v-model="form.originalServerIp" :disabled="true" />
            </el-form-item>
            <el-form-item label="机柜" v-show="form.rack">
              <el-input v-model="form.rack" :disabled="true" />
            </el-form-item>
            <el-form-item label="使用人" v-show="form.user">
              <el-input v-model="form.user" :disabled="true" />
            </el-form-item>
            <el-form-item label="电话信息点" v-show="form.phoneInfoPoint">
              <el-input v-model="form.phoneInfoPoint" :disabled="true" />
            </el-form-item>
            <!-- <el-form-item label="最后更新者" v-show="form.updatedBy">
              <el-input v-model="form.updatedBy" :disabled="true" />
            </el-form-item> -->
          </el-col>
          <!-- 第三列 -->
          <el-col :span="8">
            <el-form-item label="设备类型" v-show="form.deviceType">
              <el-select v-model="form.deviceType" :disabled="true">
                <el-option v-for="dict in dict.type.device_type" :key="dict.value" :label="dict.label"
                  :value="dict.value"></el-option>
              </el-select>
            </el-form-item>
            <el-form-item label="是否清空回收" v-show="form.isEmptyRecycled">
              <el-input v-model="form.isEmptyRecycled" :disabled="true" />
            </el-form-item>
            <el-form-item label="资产信息标号" v-show="form.assetInfoNumber">
              <el-input v-model="form.assetInfoNumber" :disabled="true" />
            </el-form-item>
            <el-form-item label="投产日期" v-show="form.commissioningDate">
              <el-date-picker clearable v-model="form.commissioningDate" type="date" value-format="yyyy-MM-dd"
                :disabled="true">
              </el-date-picker>
            </el-form-item>
            <el-form-item label="NAT1#IP地址" v-show="form.natIpAddress1">
              <el-input v-model="form.natIpAddress1" :disabled="true" />
            </el-form-item>
            <el-form-item label="版本" v-show="form.version">
              <el-input v-model="form.version" :disabled="true" />
            </el-form-item>
            <el-form-item label="年限" v-show="form.lifespan">
              <el-input v-model="form.lifespan" :disabled="true" />
            </el-form-item>
            <el-form-item label="MAC地址" v-show="form.macAddress">
              <el-input v-model="form.macAddress" :disabled="true" />
            </el-form-item>
            <el-form-item label="计算机名" v-show="form.computerName">
              <el-input v-model="form.computerName" :disabled="true" />
            </el-form-item>
            <el-form-item label="网关" v-show="form.gateway">
              <el-input v-model="form.gateway" :disabled="true" />
            </el-form-item>
            <el-form-item label="网络划分" v-show="form.networkDivision">
              <el-input v-model="form.networkDivision" :disabled="true" />
            </el-form-item>
            <!-- <el-form-item label="记录创建时间" v-show="form.createdAt">
              <el-date-picker clearable
                v-model="form.createdAt"
                type="date"
                value-format="yyyy-MM-dd"
                :disabled="true">
              </el-date-picker>
            </el-form-item> -->
          </el-col>
        </el-row>
        <el-form-item label="备注" v-show="form.remark">
          <el-input v-model="form.remark" :disabled="true" type="textarea"
            :autosize="{ minRows: 2, maxRows: 4 }"></el-input>
        </el-form-item>
      </el-form>
    </el-dialog>

    <!-- 终端IP地址导入对话框 -->
    <el-dialog :title="upload.title" :visible.sync="upload.open" width="400px" append-to-body>
      <el-upload ref="upload" :limit="1" accept=".xlsx, .xls" :headers="upload.headers"
        :action="upload.url + '?updateSupport=' + upload.updateSupport" :disabled="upload.isUploading"
        :on-progress="handleFileUploadProgress" :on-success="handleFileSuccess" :auto-upload="false" drag>
        <i class="el-icon-upload"></i>
        <div class="el-upload__text">将文件拖到此处，或<em>点击上传</em></div>
        <div class="el-upload__tip text-center" slot="tip">
          <!-- <div class="el-upload__tip" slot="tip">
            <el-checkbox v-model="upload.updateSupport" /> 是否更新已经存在的省行终端服务器IP数据
          </div> -->
          <span>仅允许导入xls、xlsx格式文件。</span>
          <el-link type="primary" :underline="false" style="font-size:12px;vertical-align: baseline;"
            @click="importTemplate">下载模板</el-link>
        </div>
      </el-upload>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitFileForm">确 定</el-button>
        <el-button @click="upload.open = false">取 消</el-button>
      </div>
    </el-dialog>

  </div>
</template>

<script>
import { listTerminal, getTerminal, delTerminal, addTerminal, updateTerminal } from "@/api/system/terminal";
import { getToken } from "@/utils/auth";

export default {
  name: "Terminal",
  dicts: ['ip_areas', 'device_type'],

  data() {
    return {
      //是否查看详情
      getterminalInfoOpen: false,
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 省行终端服务器管理表格数据
      terminalList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        ipAddress: null,
        hostType: null,
        applicationType: null,
        hostname: null,
        switchIp: null,
        switchPort: null,
        deviceInfoPoint: null,
        location: null,
        admin: null,
        assetNumber: null,
        recordDate: null,
        subnet: null,
        vlan: null,
        controlList: null,
        usageType: null,
        distribution: null,
        originalServerIp: null,
        rack: null,
        user: null,
        phoneInfoPoint: null,
        isEmptyRecycled: null,
        assetInfoNumber: null,
        commissioningDate: null,
        natIpAddress1: null,
        version: null,
        lifespan: null,
        macAddress: null,
        computerName: null,
        gateway: null,
        networkDivision: null,
        ipArea: null,
        deviceType: null,
        createdBy: null,
        updatedBy: null,
        createdAt: null,
        updatedAt: null
      },
      //实现展开与收起
      showMoreFilters: false,
      //折叠菜单
      activeCollapse: ['more'],
      // ATM地址导入参数
      upload: {
        // 是否显示弹出层（用户导入）
        open: false,
        // 弹出层标题（用户导入）
        title: "",
        // 是否禁用上传
        isUploading: false,
        // 是否更新已经存在的用户数据
        updateSupport: 0,
        // 设置上传的请求头部
        headers: { Authorization: "Bearer " + getToken() },
        // 上传的地址
        url: process.env.VUE_APP_BASE_API + "/system/terminal/importData",
      },
      // 表单参数
      form: {},
      // 列信息
      columns: [
        { key: 0, label: `序号`, visible: true },
        { key: 1, label: `IP地址`, visible: true },
        { key: 2, label: `主机类型`, visible: true },
        { key: 3, label: `应用类型`, visible: true },
        { key: 4, label: `主机名`, visible: true },
        { key: 5, label: `交换机IP`, visible: true },
        { key: 6, label: `交换机端口`, visible: true },
        { key: 7, label: `设备信息点`, visible: true },
        { key: 8, label: `位置`, visible: true },
        { key: 9, label: `管理员`, visible: true },
        { key: 10, label: `固定资产编号`, visible: true },
        { key: 11, label: `日期`, visible: true },
        { key: 12, label: `网段`, visible: true },
        { key: 13, label: `VLAN`, visible: true },
        { key: 14, label: `控制列表`, visible: true },
        { key: 15, label: `用途`, visible: true },
        { key: 16, label: `分布`, visible: true },
        { key: 17, label: `原服务器IP`, visible: true },
        { key: 18, label: `机柜`, visible: true },
        { key: 19, label: `使用人`, visible: true },
        { key: 20, label: `电话信息点`, visible: true },
        { key: 21, label: `是否清空回收`, visible: true },
        { key: 22, label: `资产信息标号`, visible: true },
        { key: 23, label: `投产日期`, visible: true },
        { key: 24, label: `NAT1#IP地址`, visible: true },
        { key: 25, label: `版本`, visible: true },
        { key: 26, label: `年限`, visible: true },
        { key: 27, label: `MAC地址`, visible: true },
        { key: 28, label: `计算机名`, visible: true },
        { key: 29, label: `网关`, visible: true },
        { key: 30, label: `网络划分`, visible: true },
        { key: 31, label: `IP所在区域`, visible: true },
        { key: 32, label: `设备类型`, visible: true },
        { key: 33, label: `备注`, visible: true },
      ],
      // 表单校验
      rules: {
      }
    };
  },

  created() {
    this.getList();
  },

  methods: {
    /** 查询省行终端服务器管理列表 */
    getList() {
      this.loading = true;
      listTerminal(this.queryParams).then(response => {
        this.terminalList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    /** 终端IP详情页*/
    GetTerminalInfo(row) {
      this.reset();
      const id = row.id
      getTerminal(id).then((response) => {
        this.form = response.data;
        this.getterminalInfoOpen = true;
      });
    },
    /** 导入按钮操作 */
    handleImport() {
      this.upload.title = "省行终端服务器IP导入";
      this.upload.open = true;
    },
    /** 自定义编号 */
    indexMethod(index) {
      let pageNum = this.queryParams.pageNum - 1;
      if ((pageNum !== -1 && pageNum !== 0)) {
        return (index + 1) + (pageNum * this.queryParams.pageSize);
      } else {
        return (index + 1)
      }
    },

    /** 下载模板操作 */
    importTemplate() {
      this.download(
        "system/terminal/importTemplate",
        {},
        `省行终端服务器_${new Date().getTime()}.xlsx`
      );
      this.$notify({
          title: '成功',
          message: '这是一条成功的提示消息',
          type: 'success'
        });
    },
    // 文件上传中处理
    handleFileUploadProgress(event, file, fileList) {
      this.upload.isUploading = true;
    },
    // 文件上传成功处理
    handleFileSuccess(response, file, fileList) {
      this.upload.open = false;
      this.upload.isUploading = false;
      this.$refs.upload.clearFiles();
      this.$alert("<div style='overflow: auto;overflow-x: hidden;max-height: 70vh;padding: 10px 20px 0;'>" + response.msg + "</div>", "导入结果", { dangerouslyUseHTMLString: true });
      this.getList();
    },
    // 提交上传文件
    submitFileForm() {
      this.$refs.upload.submit();
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        id: null,
        ipAddress: null,
        hostType: null,
        applicationType: null,
        hostname: null,
        switchIp: null,
        switchPort: null,
        deviceInfoPoint: null,
        location: null,
        admin: null,
        assetNumber: null,
        recordDate: null,
        subnet: null,
        vlan: null,
        controlList: null,
        usageType: null,
        distribution: null,
        originalServerIp: null,
        rack: null,
        user: null,
        phoneInfoPoint: null,
        isEmptyRecycled: null,
        assetInfoNumber: null,
        commissioningDate: null,
        natIpAddress1: null,
        version: null,
        lifespan: null,
        macAddress: null,
        computerName: null,
        gateway: null,
        networkDivision: null,
        ipArea: null,
        deviceType: null,
        remark: null,
        createdBy: null,
        updatedBy: null,
        createdAt: null,
        updatedAt: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.id)
      this.single = selection.length !== 1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加省行终端服务器管理";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getTerminal(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改省行终端服务器管理";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateTerminal(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addTerminal(this.form).then(response => {
              this.$modal.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const ids = row.id || this.ids;
      this.$modal.confirm('是否确认删除数据项？').then(function () {
        return delTerminal(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => { });
    },
    // handleDelete(row) {
    //   const ids = row.id || this.ids;
    //   this.$modal.confirm('是否确认删除省行终端服务器管理编号为"' + ids + '"的数据项？').then(function() {
    //     return delTerminal(ids);
    //   }).then(() => {
    //     this.getList();
    //     this.$modal.msgSuccess("删除成功");
    //   }).catch(() => {});
    // },
    // /** 导出按钮操作 */
    // handleExport() {
    //   this.download('system/terminal/export', {
    //     ...this.queryParams
    //   }, `terminal_${new Date().getTime()}.xlsx`)
    // }
    /** 导出按钮操作 */
    handleExport() {
      // 获取当前时间
      const now = new Date();

      // 格式化日期和时间为 YYYYMMDD_HHMMSS
      const year = now.getFullYear();
      const month = String(now.getMonth() + 1).padStart(2, '0');
      const day = String(now.getDate()).padStart(2, '0');
      const hours = String(now.getHours()).padStart(2, '0');
      const minutes = String(now.getMinutes()).padStart(2, '0');
      const seconds = String(now.getSeconds()).padStart(2, '0');

      // 生成格式化的日期时间字符串
      const formattedDate = `${year}${month}${day}_${hours}${minutes}_${seconds}`;

      // 生成文件名
      const fileName = `全辖终端IP_准入信息表_${formattedDate}.xlsx`;

      // 调用下载方法
      this.download('system/terminal/export', {
        ...this.queryParams
      }, fileName);
    },
    toggleMoreFilters() {
      this.showMoreFilters = !this.showMoreFilters
      if (this.showMoreFilters) {
        this.activeCollapse = ['more']
      } else {
        this.activeCollapse = []
      }
    }
  }
};
</script>

<style scoped>
.dialog-footer {
  text-align: right;
  padding: 10px 20px;
  border-top: 1px solid #e4e7ed;
}
.dialog-content{
  max-height: 70vh;
  overflow-y: auto;
}

.el-collapse {
  border: none;
}

.el-collapse-item>>>.el-collapse-item__header {
  display: none;
}

.el-collapse-item>>>.el-collapse-item__wrap {
  border-bottom: none;
}
</style>