<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <!-- <el-form-item label="外联地址映射成VPN地址" prop="externalAddressMappingVpn">
        <el-input
          v-model="queryParams.externalAddressMappingVpn"
          placeholder="请输入外联地址映射成VPN地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item> -->
      <!-- <el-form-item label="外联地址" prop="externalAddress">
        <el-input v-model="queryParams.externalAddress" placeholder="请输入外联地址" clearable
          @keyup.enter.native="handleQuery" />
      </el-form-item> -->
      <!-- <el-form-item label="应用日期" prop="applicationDate">
        <el-date-picker clearable
          v-model="queryParams.applicationDate"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择应用日期">
        </el-date-picker>
      </el-form-item> -->
      <!-- <el-form-item label="外联访问地址" prop="externalAccessAddress">
        <el-input v-model="queryParams.externalAccessAddress" placeholder="请输入外联访问地址" clearable
          @keyup.enter.native="handleQuery" />
      </el-form-item> -->
      <!-- <el-form-item label="WAN" prop="wan">
        <el-input
          v-model="queryParams.wan"
          placeholder="请输入WAN"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="外联路由器地址、端口" prop="externalRouterAddressPort">
        <el-input
          v-model="queryParams.externalRouterAddressPort"
          placeholder="请输入外联路由器地址、端口"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="所属分类" prop="category">
        <el-input
          v-model="queryParams.category"
          placeholder="请输入所属分类"
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
      <el-form-item label="外联地址映射成内部地址" prop="externalAddressMappingInternal">
        <el-input
          v-model="queryParams.externalAddressMappingInternal"
          placeholder="请输入外联地址映射成内部地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="我行内部访问源地址" prop="internalAccessSourceAddress">
        <el-input
          v-model="queryParams.internalAccessSourceAddress"
          placeholder="请输入我行内部访问源地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="应用名称" prop="applicationName">
        <el-input
          v-model="queryParams.applicationName"
          placeholder="请输入应用名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="访问目标的端口" prop="targetAccessPort">
        <el-input
          v-model="queryParams.targetAccessPort"
          placeholder="请输入访问目标的端口"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="接入路由器名称" prop="accessRouterName">
        <el-input
          v-model="queryParams.accessRouterName"
          placeholder="请输入接入路由器名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="专线名称" prop="dedicatedLineName">
        <el-input
          v-model="queryParams.dedicatedLineName"
          placeholder="请输入专线名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="内部地址映射成外部地址" prop="internalAddressMappingExternal">
        <el-input
          v-model="queryParams.internalAddressMappingExternal"
          placeholder="请输入内部地址映射成外部地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="内部地址" prop="internalAddress">
        <el-input
          v-model="queryParams.internalAddress"
          placeholder="请输入内部地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="外联访问源地址" prop="externalAccessSourceAddress">
        <el-input
          v-model="queryParams.externalAccessSourceAddress"
          placeholder="请输入外联访问源地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="是否为必要端口" prop="isNecessaryPort">
        <el-input
          v-model="queryParams.isNecessaryPort"
          placeholder="请输入是否为必要端口"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="dmz区IP地址" prop="dmzIpAddress">
        <el-input
          v-model="queryParams.dmzIpAddress"
          placeholder="请输入dmz区IP地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="内部或外部地址" prop="internalOrExternalAddress">
        <el-input
          v-model="queryParams.internalOrExternalAddress"
          placeholder="请输入内部或外部地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="访问端口" prop="accessPort">
        <el-input
          v-model="queryParams.accessPort"
          placeholder="请输入访问端口"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="关联访问地址" prop="associatedAccessAddress">
        <el-input
          v-model="queryParams.associatedAccessAddress"
          placeholder="请输入关联访问地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="端口用途" prop="portUsage">
        <el-input
          v-model="queryParams.portUsage"
          placeholder="请输入端口用途"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="内部应用服务器" prop="internalApplicationServer">
        <el-input
          v-model="queryParams.internalApplicationServer"
          placeholder="请输入内部应用服务器"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="外联代办柜台" prop="externalProxyCounter">
        <el-input
          v-model="queryParams.externalProxyCounter"
          placeholder="请输入外联代办柜台"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="线路类型、端口、ip" prop="lineTypePortIp">
        <el-input
          v-model="queryParams.lineTypePortIp"
          placeholder="请输入线路类型、端口、ip"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="开放端口" prop="openPort">
        <el-input
          v-model="queryParams.openPort"
          placeholder="请输入开放端口"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="发起方" prop="initiator">
        <el-input
          v-model="queryParams.initiator"
          placeholder="请输入发起方"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item> -->
      <el-form-item label="ip" prop="ip">
        <el-input v-model="queryParams.ip" placeholder="请输入ip" clearable @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item label="外部地址段" label-width="82px" prop="externalAddressSegment">
        <el-input
          v-model="queryParams.externalAddressSegment"
          placeholder="请输入外部地址段"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="内部地址段" label-width="82px" prop="internalAddressSegment">
        <el-input
          v-model="queryParams.internalAddressSegment"
          placeholder="请输入内部地址段"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <!-- <el-form-item label="用途" prop="purpose">
        <el-input
          v-model="queryParams.purpose"
          placeholder="请输入用途"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="应用" prop="application">
        <el-input
          v-model="queryParams.application"
          placeholder="请输入应用"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="访问源" prop="accessSource">
        <el-input
          v-model="queryParams.accessSource"
          placeholder="请输入访问源"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="路由器" prop="router">
        <el-input
          v-model="queryParams.router"
          placeholder="请输入路由器"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="内部地址映射成dmz地址" prop="internalAddressMappingDmz">
        <el-input
          v-model="queryParams.internalAddressMappingDmz"
          placeholder="请输入内部地址映射成dmz地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="端口" prop="port">
        <el-input
          v-model="queryParams.port"
          placeholder="请输入端口"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="创建者" prop="createdBy">
        <el-input
          v-model="queryParams.createdBy"
          placeholder="请输入创建者"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="创建时间" prop="createdTime">
        <el-date-picker clearable
          v-model="queryParams.createdTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择创建时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="最后更新者" prop="updatedBy">
        <el-input
          v-model="queryParams.updatedBy"
          placeholder="请输入最后更新者"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="最后更新时间" prop="updatedTime">
        <el-date-picker clearable
          v-model="queryParams.updatedTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择最后更新时间">
        </el-date-picker>
      </el-form-item> -->
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button type="primary" plain icon="el-icon-plus" size="mini" @click="handleAdd"
          v-hasPermi="['system:dmzapplicationip:add']">新增</el-button>
      </el-col>

      <el-col :span="1.5">
        <el-button type="success" plain icon="el-icon-edit" size="mini" :disabled="single" @click="handleUpdate"
          v-hasPermi="['system:dmzapplicationip:edit']">修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button type="danger" plain icon="el-icon-delete" size="mini" :disabled="multiple" @click="handleDelete"
          v-hasPermi="['system:dmzapplicationip:remove']">删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button type="warning" plain icon="el-icon-download" size="mini" @click="handleExport"
          v-hasPermi="['system:dmzapplicationip:export']">导出</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button type="info" plain icon="el-icon-upload2" size="mini" @click="handleImport"
          v-hasPermi="['system:dmzapplicationip:import']">导入</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList" :columns="columns"></right-toolbar>
    </el-row>

    <!-- 表头汇总 -->
    <el-table v-loading="loading" stripe border size="mini"
      :header-cell-style="{ background: '#eef1f6', color: '#606266' }" :data="dmzapplicationipList"
      @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="序号" type="index" :index="indexMethod" align="center" prop="id"
        v-if="columns[0].visible" />
      <el-table-column label="外联地址映射成VPN地址" show-overflow-tooltip align="center" prop="externalAddressMappingVpn"
        v-if="columns[1].visible" />
      <el-table-column label="外联地址" show-overflow-tooltip align="center" prop="externalAddress"
        v-if="columns[2].visible" />
      <el-table-column label="应用类型" show-overflow-tooltip align="center" prop="applicationType"
        v-if="columns[3].visible" />
      <el-table-column label="应用日期" align="center" prop="applicationDate" v-if="columns[4].visible" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.applicationDate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="外联访问地址" show-overflow-tooltip align="center" prop="externalAccessAddress"
        v-if="columns[5].visible" />
      <el-table-column label="WAN" show-overflow-tooltip align="center" prop="wan" v-if="columns[6].visible" />
      <el-table-column label="外联路由器地址、端口" show-overflow-tooltip align="center" prop="externalRouterAddressPort"
        v-if="columns[7].visible" />
      <el-table-column label="所属分类" show-overflow-tooltip align="center" prop="category" v-if="columns[8].visible" />
      <el-table-column label="使用人" show-overflow-tooltip align="center" prop="user" v-if="columns[9].visible" />
      <el-table-column label="外联地址映射成内部地址" show-overflow-tooltip align="center" prop="externalAddressMappingInternal"
        v-if="columns[10].visible" />
      <el-table-column label="我行内部访问源地址" show-overflow-tooltip align="center" prop="internalAccessSourceAddress"
        v-if="columns[11].visible" />
      <el-table-column label="应用名称" show-overflow-tooltip align="center" prop="applicationName"
        v-if="columns[12].visible" />
      <el-table-column label="访问目标的端口" show-overflow-tooltip align="center" prop="targetAccessPort"
        v-if="columns[13].visible" />
      <el-table-column label="接入路由器名称" show-overflow-tooltip align="center" prop="accessRouterName"
        v-if="columns[14].visible" />
      <el-table-column label="专线名称" show-overflow-tooltip align="center" prop="dedicatedLineName"
        v-if="columns[15].visible" />
      <el-table-column label="内部地址映射成外部地址" show-overflow-tooltip align="center" prop="internalAddressMappingExternal"
        v-if="columns[16].visible" />
      <el-table-column label="内部地址" show-overflow-tooltip align="center" prop="internalAddress"
        v-if="columns[17].visible" />
      <el-table-column label="外联访问源地址" show-overflow-tooltip align="center" prop="externalAccessSourceAddress"
        v-if="columns[18].visible" />
      <el-table-column label="端口用途描述" show-overflow-tooltip align="center" prop="portUsageDescription"
        v-if="columns[19].visible" />
      <el-table-column label="是否为必要端口" align="center" prop="isNecessaryPort" v-if="columns[20].visible" />
      <el-table-column label="dmz区IP地址" show-overflow-tooltip align="center" prop="dmzIpAddress"
        v-if="columns[21].visible" />
      <el-table-column label="内部或外部地址" show-overflow-tooltip align="center" prop="internalOrExternalAddress"
        v-if="columns[22].visible" />
      <el-table-column label="访问端口" show-overflow-tooltip align="center" prop="accessPort" v-if="columns[23].visible" />
      <el-table-column label="关联访问地址" show-overflow-tooltip align="center" prop="associatedAccessAddress"
        v-if="columns[24].visible" />
      <el-table-column label="端口用途" show-overflow-tooltip align="center" prop="portUsage" v-if="columns[25].visible" />
      <el-table-column label="内部应用服务器" show-overflow-tooltip align="center" prop="internalApplicationServer"
        v-if="columns[26].visible" />
      <el-table-column label="外联代办柜台" show-overflow-tooltip align="center" prop="externalProxyCounter"
        v-if="columns[27].visible" />
      <el-table-column label="线路类型、端口、ip" show-overflow-tooltip align="center" prop="lineTypePortIp"
        v-if="columns[28].visible" />
      <el-table-column label="开放端口" show-overflow-tooltip align="center" prop="openPort" v-if="columns[29].visible" />
      <el-table-column label="发起方" show-overflow-tooltip align="center" prop="initiator" v-if="columns[30].visible" />
      <el-table-column label="ip" show-overflow-tooltip align="center" prop="ip" v-if="columns[31].visible" />
      <el-table-column label="用途" show-overflow-tooltip align="center" prop="purpose" v-if="columns[32].visible" />
      <el-table-column label="外部地址段" show-overflow-tooltip align="center" prop="externalAddressSegment"
        v-if="columns[33].visible" />
      <el-table-column label="内部地址段" show-overflow-tooltip align="center" prop="internalAddressSegment"
        v-if="columns[34].visible" />
      <el-table-column label="应用" show-overflow-tooltip align="center" prop="application" v-if="columns[35].visible" />
      <el-table-column label="访问源" show-overflow-tooltip align="center" prop="accessSource"
        v-if="columns[36].visible" />
      <el-table-column label="路由器" show-overflow-tooltip align="center" prop="router" v-if="columns[37].visible" />
      <el-table-column label="内部地址映射成dmz地址" show-overflow-tooltip align="center" prop="internalAddressMappingDmz"
        v-if="columns[38].visible" />
      <el-table-column label="端口" show-overflow-tooltip align="center" prop="port" v-if="columns[39].visible" />
      <el-table-column label="备注" show-overflow-tooltip align="center" prop="remark" v-if="columns[40].visible" />
      <!-- <el-table-column label="创建者" align="center" prop="createdBy" />
      <el-table-column label="创建时间" align="center" prop="createdTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.createdTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="最后更新者" align="center" prop="updatedBy" />
      <el-table-column label="最后更新时间" align="center" prop="updatedTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.updatedTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column> -->
      <el-table-column label="操作" fixed="right" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button size="mini" type="text" icon="el-icon-message" @click="GetDmzApplicationIpInfo(scope.row)"
            v-hasPermi="['system:atmaddress:query']">查看详情</el-button>
          <el-button size="mini" type="text" icon="el-icon-edit" @click="handleUpdate(scope.row)"
            v-hasPermi="['system:dmzapplicationip:edit']">修改</el-button>
          <el-button size="mini" type="text" icon="el-icon-delete" @click="handleDelete(scope.row)"
            v-hasPermi="['system:dmzapplicationip:remove']">删除</el-button>
        </template>
      </el-table-column>
    </el-table>

    <pagination v-show="total > 0" :total="total" :page.sync="queryParams.pageNum" :limit.sync="queryParams.pageSize"
      @pagination="getList" />

    <!-- DMZ区IP地址导入对话框 -->
    <el-dialog :title="upload.title" :visible.sync="upload.open" width="400px" append-to-body>
      <el-upload ref="upload" :limit="1" accept=".xlsx, .xls" :headers="upload.headers"
        :action="upload.url + '?updateSupport=' + upload.updateSupport" :disabled="upload.isUploading"
        :on-progress="handleFileUploadProgress" :on-success="handleFileSuccess" :auto-upload="false" drag>
        <i class="el-icon-upload"></i>
        <div class="el-upload__text">将文件拖到此处，或<em>点击上传</em></div>
        <div class="el-upload__tip text-center" slot="tip">
          <div class="el-upload__tip" slot="tip">
            <el-checkbox v-model="upload.updateSupport" /> 是否更新已经存在的用户数据
          </div>
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

    <!-- 添加或修改DMZ区应用系统IP对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="1000px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-row :gutter="20">
          <!-- 第一列 -->
          <el-col :span="8">
            <el-form-item label="外联地址映射成VPN地址" prop="externalAddressMappingVpn">
              <el-input v-model="form.externalAddressMappingVpn" placeholder="请输入外联地址映射成VPN地址" />
            </el-form-item>
            <el-form-item label="外联地址" prop="externalAddress">
              <el-input v-model="form.externalAddress" placeholder="请输入外联地址" />
            </el-form-item>
            <el-form-item label="应用日期" prop="applicationDate">
              <el-date-picker clearable v-model="form.applicationDate" type="date" value-format="yyyy-MM-dd"
                placeholder="请选择应用日期">
              </el-date-picker>
            </el-form-item>
            <el-form-item label="外联访问地址" prop="externalAccessAddress">
              <el-input v-model="form.externalAccessAddress" placeholder="请输入外联访问地址" />
            </el-form-item>
            <el-form-item label="WAN" prop="wan">
              <el-input v-model="form.wan" placeholder="请输入WAN" />
            </el-form-item>
            <el-form-item label="外联路由器地址、端口" prop="externalRouterAddressPort">
              <el-input v-model="form.externalRouterAddressPort" placeholder="请输入外联路由器地址、端口" />
            </el-form-item>
            <el-form-item label="所属分类" prop="category">
              <el-input v-model="form.category" placeholder="请输入所属分类" />
            </el-form-item>
            <el-form-item label="使用人" prop="user">
              <el-input v-model="form.user" placeholder="请输入使用人" />
            </el-form-item>
            <el-form-item label="外联地址映射成内部地址" prop="externalAddressMappingInternal">
              <el-input v-model="form.externalAddressMappingInternal" placeholder="请输入外联地址映射成内部地址" />
            </el-form-item>
            <el-form-item label="我行内部访问源地址" prop="internalAccessSourceAddress">
              <el-input v-model="form.internalAccessSourceAddress" placeholder="请输入我行内部访问源地址" />
            </el-form-item>
            <el-form-item label="访问目标的端口" prop="targetAccessPort">
              <el-input v-model="form.targetAccessPort" placeholder="请输入访问目标的端口" />
            </el-form-item>
            <el-form-item label="路由器" prop="router">
              <el-input v-model="form.router" placeholder="请输入路由器" />
            </el-form-item>
          </el-col>

          <!-- 第二列 -->
          <el-col :span="8">
            <el-form-item label="接入路由器名称" prop="accessRouterName">
              <el-input v-model="form.accessRouterName" placeholder="请输入接入路由器名称" />
            </el-form-item>
            <el-form-item label="专线名称" prop="dedicatedLineName">
              <el-input v-model="form.dedicatedLineName" placeholder="请输入专线名称" />
            </el-form-item>
            <el-form-item label="内部地址映射成外部地址" prop="internalAddressMappingExternal">
              <el-input v-model="form.internalAddressMappingExternal" placeholder="请输入内部地址映射成外部地址" />
            </el-form-item>
            <el-form-item label="内部地址" prop="internalAddress">
              <el-input v-model="form.internalAddress" placeholder="请输入内部地址" />
            </el-form-item>
            <el-form-item label="外联访问源地址" prop="externalAccessSourceAddress">
              <el-input v-model="form.externalAccessSourceAddress" placeholder="请输入外联访问源地址" />
            </el-form-item>
            <el-form-item label="端口用途描述" prop="portUsageDescription">
              <el-input v-model="form.portUsageDescription" placeholder="请输入内容" />
            </el-form-item>
            <el-form-item label="是否为必要端口" prop="isNecessaryPort">
              <el-input v-model="form.isNecessaryPort" placeholder="请输入是否为必要端口" />
            </el-form-item>
            <el-form-item label="dmz区IP地址" prop="dmzIpAddress">
              <el-input v-model="form.dmzIpAddress" placeholder="请输入dmz区IP地址" />
            </el-form-item>
            <el-form-item label="内部或外部地址" prop="internalOrExternalAddress">
              <el-input v-model="form.internalOrExternalAddress" placeholder="请输入内部或外部地址" />
            </el-form-item>
            <el-form-item label="访问端口" prop="accessPort">
              <el-input v-model="form.accessPort" placeholder="请输入访问端口" />
            </el-form-item>
            <el-form-item label="应用类型" prop="applicationType">
              <el-input v-model="form.applicationType" placeholder="请输入应用类型" />
            </el-form-item>
            <el-form-item label="访问源" prop="accessSource">
              <el-input v-model="form.accessSource" placeholder="请输入访问源" />
            </el-form-item>
            <el-form-item label="端口" prop="port">
              <el-input v-model="form.port" placeholder="请输入端口" />
            </el-form-item>
          </el-col>

          <!-- 第三列 -->
          <el-col :span="8">
            <el-form-item label="关联访问地址" prop="associatedAccessAddress">
              <el-input v-model="form.associatedAccessAddress" placeholder="请输入关联访问地址" />
            </el-form-item>
            <el-form-item label="端口用途" prop="portUsage">
              <el-input v-model="form.portUsage" placeholder="请输入端口用途" />
            </el-form-item>
            <el-form-item label="内部应用服务器" prop="internalApplicationServer">
              <el-input v-model="form.internalApplicationServer" placeholder="请输入内部应用服务器" />
            </el-form-item>
            <el-form-item label="外联代办柜台" prop="externalProxyCounter">
              <el-input v-model="form.externalProxyCounter" placeholder="请输入外联代办柜台" />
            </el-form-item>
            <el-form-item label="线路类型、端口、ip" prop="lineTypePortIp">
              <el-input v-model="form.lineTypePortIp" placeholder="请输入线路类型、端口、ip" />
            </el-form-item>
            <el-form-item label="开放端口" prop="openPort">
              <el-input v-model="form.openPort" placeholder="请输入开放端口" />
            </el-form-item>
            <el-form-item label="发起方" prop="initiator">
              <el-input v-model="form.initiator" placeholder="请输入发起方" />
            </el-form-item>
            <el-form-item label="ip" prop="ip">
              <el-input v-model="form.ip" placeholder="请输入ip" />
            </el-form-item>
            <el-form-item label="用途" prop="purpose">
              <el-input v-model="form.purpose" placeholder="请输入用途" />
            </el-form-item>
            <el-form-item label="外部地址段" prop="externalAddressSegment">
              <el-input v-model="form.externalAddressSegment" placeholder="请输入外部地址段" />
            </el-form-item>
            <el-form-item label="应用名称" prop="applicationName">
              <el-input v-model="form.applicationName" placeholder="请输入应用名称" />
            </el-form-item>
            <el-form-item label="应用" prop="application">
              <el-input v-model="form.application" placeholder="请输入应用" />
            </el-form-item>
            <el-form-item label="内部地址映射成dmz地址" prop="internalAddressMappingDmz">
              <el-input v-model="form.internalAddressMappingDmz" placeholder="内部地址映射成dmz地址" />
            </el-form-item>
            <el-form-item label="内部地址段" prop="internalAddressSegment">
              <el-input v-model="form.internalAddressSegment" placeholder="请输入内部地址段" />
            </el-form-item>
          </el-col>
        </el-row>

        <!-- 单独放置备注 -->
        <el-form-item label="备注" prop="remark">
          <el-input v-model="form.remark" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <!-- <el-form-item label="创建者" prop="createdBy">
          <el-input v-model="form.createdBy" placeholder="请输入创建者" />
        </el-form-item>
        <el-form-item label="创建时间" prop="createdTime">
          <el-date-picker clearable
            v-model="form.createdTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择创建时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="最后更新者" prop="updatedBy">
          <el-input v-model="form.updatedBy" placeholder="请输入最后更新者" />
        </el-form-item>
        <el-form-item label="最后更新时间" prop="updatedTime">
          <el-date-picker clearable
            v-model="form.updatedTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择最后更新时间">
          </el-date-picker>
        </el-form-item> -->
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>

    <!-- 查看DMZ区应用系统IP详情 -->
    <el-dialog title="DMZ区应用系统IP详情" :visible.sync="getDmzapplicationipInfoOpen" width="1000px" append-to-body>
      <el-form :model="form" label-width="120px" class="dialog-content">
        <el-row :gutter="20">
          <!-- 第一列 -->
          <el-col :span="8">
            <el-form-item label="外联地址映射成VPN地址" v-show="form.externalAddressMappingVpn">
              <el-input v-model="form.externalAddressMappingVpn" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="外联地址" v-show="form.externalAddress">
              <el-input v-model="form.externalAddress" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="应用日期" v-show="form.applicationDate">
              <el-date-picker v-model="form.applicationDate" type="date" value-format="yyyy-MM-dd" :disabled="true"
                clearable placeholder="请选择应用日期"></el-date-picker>
            </el-form-item>
            <el-form-item label="外联访问地址" v-show="form.externalAccessAddress">
              <el-input v-model="form.externalAccessAddress" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="WAN" v-show="form.wan">
              <el-input v-model="form.wan" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="外联路由器地址、端口" v-show="form.externalRouterAddressPort">
              <el-input v-model="form.externalRouterAddressPort" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="所属分类" v-show="form.category">
              <el-input v-model="form.category" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="使用人" v-show="form.user">
              <el-input v-model="form.user" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="外联地址映射成内部地址" v-show="form.externalAddressMappingInternal">
              <el-input v-model="form.externalAddressMappingInternal" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="我行内部访问源地址" v-show="form.internalAccessSourceAddress">
              <el-input v-model="form.internalAccessSourceAddress" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="访问源" v-show="form.accessSource">
              <el-input v-model="form.accessSource" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="访问端口" v-show="form.accessPort">
              <el-input v-model="form.accessPort" :disabled="true"></el-input>
            </el-form-item>
          </el-col>

          <!-- 第二列 -->
          <el-col :span="8">
            <el-form-item label="接入路由器名称" v-show="form.accessRouterName">
              <el-input v-model="form.accessRouterName" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="专线名称" v-show="form.dedicatedLineName">
              <el-input v-model="form.dedicatedLineName" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="内部地址映射成外部地址" v-show="form.internalAddressMappingExternal">
              <el-input v-model="form.internalAddressMappingExternal" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="内部地址" v-show="form.internalAddress">
              <el-input v-model="form.internalAddress" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="外联访问源地址" v-show="form.externalAccessSourceAddress">
              <el-input v-model="form.externalAccessSourceAddress" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="端口用途描述" v-show="form.portUsageDescription">
              <el-input v-model="form.portUsageDescription" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="是否为必要端口" v-show="form.isNecessaryPort">
              <el-input v-model="form.isNecessaryPort" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="dmz区IP地址" v-show="form.dmzIpAddress">
              <el-input v-model="form.dmzIpAddress" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="内部或外部地址" v-show="form.internalOrExternalAddress">
              <el-input v-model="form.internalOrExternalAddress" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="访问端口" v-show="form.accessPort">
              <el-input v-model="form.accessPort" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="访问目标的端口" v-show="form.targetAccessPort">
              <el-input v-model="form.targetAccessPort" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="端口" v-show="form.port">
              <el-input v-model="form.port" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="路由器" v-show="form.router">
              <el-input v-model="form.router" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="应用类型" v-show="form.applicationType">
              <el-input v-model="form.applicationType" :disabled="true"></el-input>
            </el-form-item>
          </el-col>

          <!-- 第三列 -->
          <el-col :span="8">
            <el-form-item label="关联访问地址" v-show="form.associatedAccessAddress">
              <el-input v-model="form.associatedAccessAddress" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="端口用途" v-show="form.portUsage">
              <el-input v-model="form.portUsage" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="内部应用服务器" v-show="form.internalApplicationServer">
              <el-input v-model="form.internalApplicationServer" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="外联代办柜台" v-show="form.externalProxyCounter">
              <el-input v-model="form.externalProxyCounter" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="线路类型、端口、ip" v-show="form.lineTypePortIp">
              <el-input v-model="form.lineTypePortIp" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="开放端口" v-show="form.openPort">
              <el-input v-model="form.openPort" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="发起方" v-show="form.initiator">
              <el-input v-model="form.initiator" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="ip" v-show="form.ip">
              <el-input v-model="form.ip" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="用途" v-show="form.purpose">
              <el-input v-model="form.purpose" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="应用名称" v-show="form.applicationName">
              <el-input v-model="form.applicationName" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="外部地址段" v-show="form.externalAddressSegment">
              <el-input v-model="form.externalAddressSegment" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="内部地址段" v-show="form.internalAddressSegmen">
              <el-input v-model="form.internalAddressSegmen" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="应用" v-show="form.application">
              <el-input v-model="form.application" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="内部地址映射成dmz地址" v-show="form.internalAddressMappingDmz">
              <el-input v-model="form.internalAddressMappingDmz" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="内部地址段" v-show="form.internalAddressSegment">
              <el-input v-model="form.internalAddressSegment" :disabled="true"></el-input>
            </el-form-item>
          </el-col>
        </el-row>

        <!-- 单独放置备注 -->
        <el-form-item label="备注" v-show="form.remark">
          <el-input v-model="form.remark" type="textarea" :disabled="true" placeholder="请输入内容" />
        </el-form-item>

        <!-- <el-form-item label="创建者" v-show="form.createdBy">
      <el-input v-model="form.createdBy" :disabled="true"></el-input>
    </el-form-item>
    <el-form-item label="创建时间" v-show="form.createdTime">
      <el-date-picker v-model="form.createdTime" type="date" value-format="yyyy-MM-dd" :disabled="true" clearable placeholder="请选择创建时间"></el-date-picker>
    </el-form-item>
    <el-form-item label="最后更新者" v-show="form.updatedBy">
      <el-input v-model="form.updatedBy" :disabled="true"></el-input>
    </el-form-item>
    <el-form-item label="最后更新时间" v-show="form.updatedTime">
      <el-date-picker v-model="form.updatedTime" type="date" value-format="yyyy-MM-dd" :disabled="true" clearable placeholder="请选择最后更新时间"></el-date-picker>
    </el-form-item> -->
      </el-form>
    </el-dialog>


  </div>
</template>

<script>
import { listDmzapplicationip, getDmzapplicationip, delDmzapplicationip, addDmzapplicationip, updateDmzapplicationip } from "@/api/system/dmzapplicationip";
import { getToken } from "@/utils/auth";
export default {
  name: "Dmzapplicationip",
  data() {
    return {
      // 表格高度
      tableHeight: 1000,
      //是否查看详情
      getDmzapplicationipInfoOpen: false,
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
      // DMZ区应用系统IP表格数据
      dmzapplicationipList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        externalAddressMappingVpn: null,
        externalAddress: null,
        applicationType: null,
        applicationDate: null,
        externalAccessAddress: null,
        wan: null,
        externalRouterAddressPort: null,
        category: null,
        user: null,
        externalAddressMappingInternal: null,
        internalAccessSourceAddress: null,
        applicationName: null,
        targetAccessPort: null,
        accessRouterName: null,
        dedicatedLineName: null,
        internalAddressMappingExternal: null,
        internalAddress: null,
        externalAccessSourceAddress: null,
        portUsageDescription: null,
        isNecessaryPort: null,
        dmzIpAddress: null,
        internalOrExternalAddress: null,
        accessPort: null,
        associatedAccessAddress: null,
        portUsage: null,
        internalApplicationServer: null,
        externalProxyCounter: null,
        lineTypePortIp: null,
        openPort: null,
        initiator: null,
        ip: null,
        purpose: null,
        externalAddressSegment: null,
        internalAddressSegment: null,
        application: null,
        accessSource: null,
        router: null,
        internalAddressMappingDmz: null,
        port: null,
        createdBy: null,
        createdTime: null,
        updatedBy: null,
        updatedTime: null
      },
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
        url: process.env.VUE_APP_BASE_API + "/system/dmzapplicationip/importData",
      },
      // 表单参数
      form: {},
      // 列信息
      columns: [
        { key: 0, label: `序号`, visible: true },
        { key: 1, label: `外联地址映射成VPN`, visible: true },
        { key: 2, label: `外联地址`, visible: true },
        { key: 3, label: `应用类型`, visible: true },
        { key: 4, label: `应用日期`, visible: true },
        { key: 5, label: `外联访问地址`, visible: true },
        { key: 6, label: `WAN`, visible: true },
        { key: 7, label: `外联路由器地址、端口`, visible: true },
        { key: 8, label: `所属分类`, visible: true },
        { key: 9, label: `使用人`, visible: true },
        { key: 10, label: `外联地址映射成内部地址`, visible: true },
        { key: 11, label: `我行内部访问源地址`, visible: true },
        { key: 12, label: `应用名称`, visible: true },
        { key: 13, label: `访问目标的端口`, visible: true },
        { key: 14, label: `接入路由器的名称`, visible: true },
        { key: 15, label: `专线名称`, visible: true },
        { key: 16, label: `内部地址映射成外部地址`, visible: true },
        { key: 17, label: `内部地址`, visible: true },
        { key: 18, label: `外联访问源地址`, visible: true },
        { key: 19, label: `端口用途描述`, visible: true },
        { key: 20, label: `是否为必要端口`, visible: true },
        { key: 21, label: `dmz区IP地址`, visible: true },
        { key: 22, label: `内部或外部地址`, visible: true },
        { key: 23, label: `访问端口`, visible: true },
        { key: 24, label: `关联访问地址`, visible: true },
        { key: 25, label: `端口用途`, visible: true },
        { key: 26, label: `内部应用服务器`, visible: true },
        { key: 27, label: `外联代办柜台`, visible: true },
        { key: 28, label: `线路类型`, visible: true },
        { key: 29, label: `开放端口`, visible: true },
        { key: 30, label: `发起方`, visible: true },
        { key: 31, label: `ip`, visible: true },
        { key: 32, label: `用途`, visible: true },
        { key: 33, label: `外部地址段`, visible: true },
        { key: 34, label: `内部地址段`, visible: true },
        { key: 35, label: `应用`, visible: true },
        { key: 36, label: `访问源`, visible: true },
        { key: 37, label: `路由器`, visible: true },
        { key: 38, label: `内部地址映射成dmz地址`, visible: true },
        { key: 39, label: `端口`, visible: true },
        { key: 40, label: `备注`, visible: true }

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
    /** 查询DMZ区应用系统IP列表 */
    getList() {
      this.loading = true;
      listDmzapplicationip(this.queryParams).then(response => {
        this.dmzapplicationipList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    /** DMZ区IP详情页*/
    GetDmzApplicationIpInfo(row) {
      this.reset();
      const id = row.id
      getDmzapplicationip(id).then((response) => {
        this.form = response.data;
        this.getDmzapplicationipInfoOpen = true;
      });
    },
    /** 导入按钮操作 */
    handleImport() {
      this.upload.title = "DMZ区IP导入";
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
        "system/dmzapplicationip/importTemplate",
        {},
        `dmzapplicationip_template_${new Date().getTime()}.xlsx`
      );
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
    // 表单重置
    reset() {
      this.form = {
        id: null,
        externalAddressMappingVpn: null,
        externalAddress: null,
        applicationType: null,
        applicationDate: null,
        externalAccessAddress: null,
        wan: null,
        externalRouterAddressPort: null,
        category: null,
        user: null,
        externalAddressMappingInternal: null,
        internalAccessSourceAddress: null,
        applicationName: null,
        targetAccessPort: null,
        accessRouterName: null,
        dedicatedLineName: null,
        internalAddressMappingExternal: null,
        internalAddress: null,
        externalAccessSourceAddress: null,
        portUsageDescription: null,
        isNecessaryPort: null,
        dmzIpAddress: null,
        internalOrExternalAddress: null,
        accessPort: null,
        associatedAccessAddress: null,
        portUsage: null,
        internalApplicationServer: null,
        externalProxyCounter: null,
        lineTypePortIp: null,
        openPort: null,
        initiator: null,
        ip: null,
        purpose: null,
        externalAddressSegment: null,
        internalAddressSegment: null,
        application: null,
        accessSource: null,
        router: null,
        internalAddressMappingDmz: null,
        port: null,
        remark: null,
        createdBy: null,
        createdTime: null,
        updatedBy: null,
        updatedTime: null
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
      this.title = "添加DMZ区应用系统IP";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getDmzapplicationip(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改DMZ区应用系统IP";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateDmzapplicationip(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addDmzapplicationip(this.form).then(response => {
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
        return delDmzapplicationip(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => { });
    },
    // handleDelete(row) {
    //   const ids = row.id || this.ids;
    //   this.$modal.confirm('是否确认删除DMZ区应用系统IP编号为"' + ids + '"的数据项？').then(function() {
    //     return delDmzapplicationip(ids);
    //   }).then(() => {
    //     this.getList();
    //     this.$modal.msgSuccess("删除成功");
    //   }).catch(() => {});
    // },
    /** 导出按钮操作 */
    // handleExport() {
    //   this.download('system/dmzapplicationip/export', {
    //     ...this.queryParams
    //   }, `dmzapplicationip_${new Date().getTime()}.xlsx`)
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
      const fileName = `dmzapplicationip_${formattedDate}.xlsx`;

      // 调用下载方法
      this.download('system/dmzapplicationip/export', {
        ...this.queryParams
      }, fileName);
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
</style>