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
      <!-- 默认可见区域 -->
      <el-form-item label="IP地址" prop="ip">
        <el-input v-model="queryParams.ip" placeholder="请输入IP地址" clearable @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item label="外部地址段" label-width="82px" prop="externalAddressSegment">
        <el-input v-model="queryParams.externalAddressSegment" placeholder="请输入外部地址段" clearable
          @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item label="内部地址段" label-width="82px" prop="internalAddressSegment">
        <el-input v-model="queryParams.internalAddressSegment" placeholder="请输入内部地址段" clearable
          @keyup.enter.native="handleQuery" />
      </el-form-item>
      <!-- 折叠搜索区域 -->
      <el-collapse v-model="activeCollapse" v-show="showMoreFilters">
        <el-collapse-item name="more">
          <el-form-item label="IP所在区域" prop="ipArea">
            <el-select v-model="queryParams.ipArea" placeholder="请选择IP所在区域" clearable>
              <el-option v-for="dict in dict.type.ip_dmz_areas" :key="dict.value" :label="dict.label"
                :value="dict.value" />
            </el-select>
          </el-form-item>
          <el-form-item label="设备类型" prop="deviceType">
            <el-select v-model="queryParams.deviceType" placeholder="请选择设备类型" clearable>
              <el-option v-for="dict in dict.type.dmz_device_type" :key="dict.value" :label="dict.label"
                :value="dict.value" />
            </el-select>
          </el-form-item>
        </el-collapse-item>
      </el-collapse>
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
        <el-button type="text" @click="toggleMoreFilters">
          {{ showMoreFilters ? '收起' : '展开' }}
          <i :class="['el-icon-arrow-' + (showMoreFilters ? 'up' : 'down')]"></i>
        </el-button>
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
        <el-table-column label="IP所在区域" align="center" prop="ipArea" v-if="columns[41].visible">
          <template slot-scope="scope">
            <dict-tag :options="dict.type.ip_dmz_areas" :value="scope.row.ipArea" />
          </template>
        </el-table-column>
        <el-table-column label="设备类型" show-overflow-tooltip align="center" prop="deviceType" v-if="columns[42].visible">
          <template slot-scope="scope">
            <dict-tag :options="dict.type.dmz_device_type" :value="scope.row.deviceType" />
          </template>
        </el-table-column>
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
          <!-- <div class="el-upload__tip" slot="tip">
            <el-checkbox v-model="upload.updateSupport" /> 是否更新已经存在的DMZ区IP数据
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

    <!-- 添加或修改DMZ区应用系统IP对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="1000px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="120px" class="dialog-content">
        <el-row :gutter="20">
          <el-col :span="8" v-for="(column, colIndex) in displayColumns" :key="colIndex">
            <template v-for="field in column">
              <el-form-item :label="field.label" :prop="field.prop">
                <!-- 使用v-if来判断显示 -->
                <template v-if="field.prop === 'applicationDate'">
                  <el-date-picker 
                    clearable 
                    v-model="form.applicationDate" 
                    type="date" 
                    value-format="yyyy-MM-dd"
                    placeholder="请选择应用日期">
                  </el-date-picker>
                </template>
                <template v-else-if="field.prop === 'deviceType'">
                  <el-select v-model="form.deviceType" placeholder="请选择设备类型">
                    <el-option v-for="dict in dict.type.dmz_device_type" :key="dict.value" :label="dict.label"
                      :value="dict.value"></el-option>
                  </el-select>
                </template>
                  <template v-else-if="field.prop === 'ipArea'">
                    <el-select v-model="form.ipArea" placeholder="请选择IP所在区域">
                      <el-option v-for="dict in dict.type.ip_dmz_areas" :key="dict.value" :label="dict.label"
                        :value="dict.value"></el-option>
                    </el-select>
                  </template>
                <template v-else>
                  <el-input v-model="form[field.prop]" :placeholder="'请输入' + field.label" />
                </template>
              </el-form-item>
            </template>
          </el-col>
        </el-row>
        <el-form-item label="备注" prop="remark">
          <el-input v-model="form.remark" type="textarea" placeholder="请输入内容" />
        </el-form-item>
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
          <el-col :span="8" v-for="(column, colIndex) in displayColumns" :key="colIndex">
            <template v-for="field in column">
              <el-form-item :label="field.label" :key="field.key" v-if="form[field.prop]">
                <el-input v-model="form[field.prop]" :disabled="true" />
              </el-form-item>
            </template>
          </el-col>
        </el-row>
        <el-form-item label="备注" v-if="form.remark">
          <el-input v-model="form.remark" :disabled="true" type="textarea"
            :autosize="{ minRows: 2, maxRows: 4 }"></el-input>
        </el-form-item>
      </el-form>
    </el-dialog>

  </div>
</template>

<script>
import { listDmzapplicationip, getDmzapplicationip, delDmzapplicationip, addDmzapplicationip, updateDmzapplicationip } from "@/api/system/dmzapplicationip";
import { getToken } from "@/utils/auth";
export default {
  name: "Dmzapplicationip",
  dicts: ['ip_dmz_areas', 'dmz_device_type'],
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
        url: process.env.VUE_APP_BASE_API + "/system/dmzapplicationip/importData",
      },
      // 表单参数
      form: {},
      // 列信息
      columns: [
  { key: 0, label: '序号', prop: 'id', visible: true },
  { key: 1, label: '外联地址映射成VPN', prop: 'externalAddressMappingVpn', visible: true },
  { key: 2, label: '外联地址', prop: 'externalAddress', visible: true },
  { key: 3, label: '应用类型', prop: 'applicationType', visible: true },
  { key: 4, label: '应用日期', prop: 'applicationDate', visible: true },
  { key: 5, label: '外联访问地址', prop: 'externalAccessAddress', visible: true },
  { key: 6, label: 'WAN', prop: 'wan', visible: true },
  { key: 7, label: '外联路由器地址、端口', prop: 'externalRouterAddressPort', visible: true },
  { key: 8, label: '所属分类', prop: 'category', visible: true },
  { key: 9, label: '使用人', prop: 'user', visible: true },
  { key: 10, label: '外联地址映射成内部地址', prop: 'externalAddressMappingInternal', visible: true },
  { key: 11, label: '我行内部访问源地址', prop: 'internalAccessSourceAddress', visible: true },
  { key: 12, label: '应用名称', prop: 'applicationName', visible: true },
  { key: 13, label: '访问目标的端口', prop: 'targetAccessPort', visible: true },
  { key: 14, label: '接入路由器的名称', prop: 'accessRouterName', visible: true },
  { key: 15, label: '专线名称', prop: 'dedicatedLineName', visible: true },
  { key: 16, label: '内部地址映射成外部地址', prop: 'internalAddressMappingExternal', visible: true },
  { key: 17, label: '内部地址', prop: 'internalAddress', visible: true },
  { key: 18, label: '外联访问源地址', prop: 'externalAccessSourceAddress', visible: true },
  { key: 19, label: '端口用途描述', prop: 'portUsageDescription', visible: true },
  { key: 20, label: '是否为必要端口', prop: 'isNecessaryPort', visible: true },
  { key: 21, label: 'dmz区IP地址', prop: 'dmzIpAddress', visible: true },
  { key: 22, label: '内部或外部地址', prop: 'internalOrExternalAddress', visible: true },
  { key: 23, label: '访问端口', prop: 'accessPort', visible: true },
  { key: 24, label: '关联访问地址', prop: 'associatedAccessAddress', visible: true },
  { key: 25, label: '端口用途', prop: 'portUsage', visible: true },
  { key: 26, label: '内部应用服务器', prop: 'internalApplicationServer', visible: true },
  { key: 27, label: '外联代办柜台', prop: 'externalProxyCounter', visible: true },
  { key: 28, label: '线路类型', prop: 'lineType', visible: true },
  { key: 29, label: '开放端口', prop: 'openPort', visible: true },
  { key: 30, label: '发起方', prop: 'initiator', visible: true },
  { key: 31, label: 'ip', prop: 'ip', visible: true },
  { key: 32, label: '用途', prop: 'purpose', visible: true },
  { key: 33, label: '外部地址段', prop: 'externalAddressSegment', visible: true },
  { key: 34, label: '内部地址段', prop: 'internalAddressSegment', visible: true },
  { key: 35, label: '应用', prop: 'application', visible: true },
  { key: 36, label: '访问源', prop: 'accessSource', visible: true },
  { key: 37, label: '路由器', prop: 'router', visible: true },
  { key: 38, label: '内部地址映射成dmz地址', prop: 'internalAddressMappingDmz', visible: true },
  { key: 39, label: '端口', prop: 'port', visible: true },
  { key: 40, label: '备注', prop: 'remark', visible: true },
  { key: 41, label: 'IP所在区域', prop: 'ipArea', visible: true },
  { key: 42, label: '设备类型', prop: 'deviceType', visible: true }
],

      // 表单校验
      rules: {
      }
    };
  },
  created() {
    this.getList();
  },
  computed: {
    displayColumns() {
      const visibleColumns = this.columns.filter(col => col.visible && col.key !== 0 && col.prop !== "remark");
      const total = visibleColumns.length;
      const columns = [[], [], []];

      // 计算每列应该放置的元素数量
      for (let i = 0; i < total; i++) {
        columns[i % 3].push(visibleColumns[i]);
      }

      return columns;
    }
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
        `DMZ区IP模板${new Date().getTime()}.xlsx`
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
      const fileName = `DMZ区应用系统IP_${formattedDate}.xlsx`;

      // 调用下载方法
      this.download('system/dmzapplicationip/export', {
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