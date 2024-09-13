<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <!-- 这里放默认搜索内容 -->
      <el-form-item label="MSTP VLAN" label-width="93px" prop="mstpVlan">
        <el-input
          v-model="queryParams.mstpVlan"
          placeholder="请输入MSTP VLAN"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="运营商" prop="carrier">
        <el-input
          v-model="queryParams.carrier"
          placeholder="请输入运营商"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <!-- 折叠搜索区域 -->
      <el-collapse v-model="activeCollapse" v-show="showMoreFilters">
        <el-collapse-item name="more">
          <!-- 这里放折叠内容 -->
        </el-collapse-item>
      </el-collapse>
      <el-form-item label="ATM位置" label-width="70px" prop="atmLocation">
        <el-input
          v-model="queryParams.atmLocation"
          placeholder="请输入ATM位置"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <!-- 
      <el-form-item label="设备型号" prop="deviceModel">
        <el-input
          v-model="queryParams.deviceModel"
          placeholder="请输入设备型号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="设备名称" prop="deviceName">
        <el-input
          v-model="queryParams.deviceName"
          placeholder="请输入设备名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="路由器LOOPBACK" prop="routerLoopback">
        <el-input
          v-model="queryParams.routerLoopback"
          placeholder="请输入路由器LOOPBACK"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="上端路由器" prop="upstreamRouter">
        <el-input
          v-model="queryParams.upstreamRouter"
          placeholder="请输入上端路由器"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item> -->
      <!-- <el-form-item label="省行WAN IP" prop="provincialWanIp">
        <el-input v-model="queryParams.provincialWanIp" placeholder="请输入省行WAN IP" clearable
          @keyup.enter.native="handleQuery" />
      </el-form-item> -->
      <!-- <el-form-item label="路由器WAN" prop="routerWan">
        <el-input
          v-model="queryParams.routerWan"
          placeholder="请输入路由器WAN"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="ATM地址段" prop="atmAddressSegment">
        <el-input
          v-model="queryParams.atmAddressSegment"
          placeholder="请输入ATM地址段"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="监控地址段" prop="monitoringAddressSegment">
        <el-input
          v-model="queryParams.monitoringAddressSegment"
          placeholder="请输入监控地址段"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="交换机地址" prop="switchAddress">
        <el-input
          v-model="queryParams.switchAddress"
          placeholder="请输入交换机地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item> -->
      <!-- <el-form-item label="新路由器IP" prop="newRouterIp">
        <el-input v-model="queryParams.newRouterIp" placeholder="请输入新路由器IP" clearable
          @keyup.enter.native="handleQuery" />
      </el-form-item> -->
      <!-- <el-form-item label="线路调试日期" prop="lineDebugDate">
        <el-date-picker clearable
          v-model="queryParams.lineDebugDate"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择线路调试日期">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="端口" prop="port">
        <el-input
          v-model="queryParams.port"
          placeholder="请输入端口"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="对端地址段" prop="oppositeAddressSegment">
        <el-input
          v-model="queryParams.oppositeAddressSegment"
          placeholder="请输入对端地址段"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="对端前置机IP" prop="oppositeFrontIp">
        <el-input
          v-model="queryParams.oppositeFrontIp"
          placeholder="请输入对端前置机IP"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item> -->
      <!-- <el-form-item label="ATM实际地址" prop="actualAtmAddress">
        <el-input v-model="queryParams.actualAtmAddress" placeholder="请输入ATM实际地址" clearable
          @keyup.enter.native="handleQuery" />
      </el-form-item> -->
      <!-- <el-form-item label="行内ATM地址" prop="intraAtmIp">
        <el-input
          v-model="queryParams.intraAtmIp"
          placeholder="请输入行内ATM地址"
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
      <el-form-item label="PC地址" prop="pcAddress">
        <el-input
          v-model="queryParams.pcAddress"
          placeholder="请输入PC地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="掩码" prop="subnetMask">
        <el-input
          v-model="queryParams.subnetMask"
          placeholder="请输入掩码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="行名" prop="bankName">
        <el-input
          v-model="queryParams.bankName"
          placeholder="请输入行名"
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
      <el-form-item label="最后修改者" prop="updatedBy">
        <el-input
          v-model="queryParams.updatedBy"
          placeholder="请输入最后修改者"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="更新时间" prop="updatedTime">
        <el-date-picker clearable
          v-model="queryParams.updatedTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择更新时间">
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
          v-hasPermi="['system:atmaddress:add']">新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button type="success" plain icon="el-icon-edit" size="mini" :disabled="single" @click="handleUpdate"
          v-hasPermi="['system:atmaddress:edit']">修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button type="danger" plain icon="el-icon-delete" size="mini" :disabled="multiple" @click="handleDelete"
          v-hasPermi="['system:atmaddress:remove']">删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button type="warning" plain icon="el-icon-download" size="mini" @click="handleExport"
          v-hasPermi="['system:atmaddress:export']">导出</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button type="info" plain icon="el-icon-upload2" size="mini" @click="handleImport"
          v-hasPermi="['system:atmaddress:import']">导入</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList" :columns="columns"></right-toolbar>
    </el-row>
    <!-- 表头详情 -->
    <el-table v-loading="loading" stripe border size="mini"
      :header-cell-style="{ background: '#eef1f6', color: '#606266' }" :data="atmaddressList"
      @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="序号" type="index" :index="indexMethod" align="center" prop="id"
        v-if="columns[0].visible" />
      <el-table-column label="ATM位置" show-overflow-tooltip align="center" prop="atmLocation"
        v-if="columns[1].visible" />
      <el-table-column label="设备型号" show-overflow-tooltip align="center" prop="deviceModel" v-if="columns[2].visible" />
      <el-table-column label="设备名称" show-overflow-tooltip align="center" prop="deviceName" v-if="columns[3].visible" />
      <el-table-column label="路由器LOOPBACK" show-overflow-tooltip align="center" prop="routerLoopback"
        v-if="columns[4].visible" />
      <el-table-column label="上端路由器" show-overflow-tooltip align="center" prop="upstreamRouter"
        v-if="columns[5].visible" />
      <el-table-column label="省行WAN IP" show-overflow-tooltip align="center" prop="provincialWanIp"
        v-if="columns[6].visible" />
      <el-table-column label="路由器WAN" show-overflow-tooltip align="center" prop="routerWan" v-if="columns[7].visible" />
      <el-table-column label="MSTP VLAN" show-overflow-tooltip align="center" prop="mstpVlan"
        v-if="columns[8].visible" />
      <el-table-column label="ATM地址段" show-overflow-tooltip align="center" prop="atmAddressSegment"
        v-if="columns[9].visible" />
      <el-table-column label="监控地址段" show-overflow-tooltip align="center" prop="monitoringAddressSegment"
        v-if="columns[10].visible" />
      <el-table-column label="交换机地址" show-overflow-tooltip align="center" prop="switchAddress"
        v-if="columns[11].visible" />
      <el-table-column label="新路由器IP" show-overflow-tooltip align="center" prop="newRouterIp"
        v-if="columns[12].visible" />
      <el-table-column label="线路调试日期" show-overflow-tooltip align="center" prop="lineDebugDate"
        v-if="columns[13].visible" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.lineDebugDate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="运营商" show-overflow-tooltip align="center" prop="carrier" v-if="columns[14].visible" />
      <el-table-column label="端口" show-overflow-tooltip align="center" prop="port" v-if="columns[15].visible" />
      <el-table-column label="对端地址段" show-overflow-tooltip align="center" prop="oppositeAddressSegment"
        v-if="columns[16].visible" />
      <el-table-column label="对端前置机IP" show-overflow-tooltip align="center" prop="oppositeFrontIp"
        v-if="columns[17].visible" />
      <el-table-column label="ATM实际地址" show-overflow-tooltip align="center" prop="actualAtmAddress"
        v-if="columns[18].visible" />
      <el-table-column label="行内ATM地址" show-overflow-tooltip align="center" prop="intraAtmIp"
        v-if="columns[19].visible" />
      <el-table-column label="网关" show-overflow-tooltip align="center" prop="gateway" v-if="columns[20].visible" />
      <el-table-column label="PC地址" show-overflow-tooltip align="center" prop="pcAddress" v-if="columns[21].visible" />
      <el-table-column label="掩码" show-overflow-tooltip align="center" prop="subnetMask" v-if="columns[22].visible" />
      <el-table-column label="行名" show-overflow-tooltip align="center" prop="bankName" v-if="columns[23].visible" />
      <el-table-column label="备注" show-overflow-tooltip align="center" prop="remark" v-if="columns[24].visible" />
      <!-- <el-table-column label="创建者" align="center" prop="createdBy" />
      <el-table-column label="创建时间" align="center" prop="createdTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.createdTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="最后修改者" align="center" prop="updatedBy" />
      <el-table-column label="更新时间" align="center" prop="updatedTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.updatedTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column> -->
      <el-table-column label="操作" fixed="right" align="center" class-name="small-padding fixed-width">

        <template slot-scope="scope">
          <el-button size="mini" type="text" icon="el-icon-view" @click="GetAtmExternalUnitAddressInfo(scope.row)"
            v-hasPermi="['system:atmaddress:query']">查看详情</el-button>
          <el-button size="mini" type="text" icon="el-icon-edit" @click="handleUpdate(scope.row)"
            v-hasPermi="['system:atmaddress:edit']">修改</el-button>
          <el-button size="mini" type="text" icon="el-icon-delete" @click="handleDelete(scope.row)"
            v-hasPermi="['system:atmaddress:remove']">删除</el-button>
        </template>
      </el-table-column>
    </el-table>

    <pagination v-show="total > 0" :total="total" :page.sync="queryParams.pageNum" :limit.sync="queryParams.pageSize"
      @pagination="getList" />

    <!-- 设备导入对话框 -->
    <el-dialog :title="upload.title" :visible.sync="upload.open" width="400px" append-to-body>
      <el-upload ref="upload" :limit="1" accept=".xlsx, .xls" :headers="upload.headers"
        :action="upload.url + '?updateSupport=' + upload.updateSupport" :disabled="upload.isUploading"
        :on-progress="handleFileUploadProgress" :on-success="handleFileSuccess" :auto-upload="false" drag>
        <i class="el-icon-upload"></i>
        <div class="el-upload__text">将文件拖到此处，或<em>点击上传</em></div>
        <div class="el-upload__tip text-center" slot="tip">
          <!-- <div class="el-upload__tip" slot="tip">
            <el-checkbox v-model="upload.updateSupport" /> 是否更新已经存在的离行ATM及外联单位地址数据
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


    <!-- 添加或修改离行ATM及外联单位地址对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="1000px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-row :gutter="20">
          <!-- 第一列 -->
          <el-col :span="8">
            <el-form-item label="ATM位置" prop="atmLocation">
              <el-input v-model="form.atmLocation" placeholder="请输入ATM位置" />
            </el-form-item>
            <el-form-item label="设备型号" prop="deviceModel">
              <el-input v-model="form.deviceModel" placeholder="请输入设备型号" />
            </el-form-item>
            <el-form-item label="设备名称" prop="deviceName">
              <el-input v-model="form.deviceName" placeholder="请输入设备名称" />
            </el-form-item>
            <el-form-item label="路由器LOOPBACK" prop="routerLoopback">
              <el-input v-model="form.routerLoopback" placeholder="请输入路由器LOOPBACK" />
            </el-form-item>
            <el-form-item label="上端路由器" prop="upstreamRouter">
              <el-input v-model="form.upstreamRouter" placeholder="请输入上端路由器" />
            </el-form-item>
            <el-form-item label="省行WAN IP" prop="provincialWanIp">
              <el-input v-model="form.provincialWanIp" placeholder="请输入省行WAN IP" />
            </el-form-item>
            <el-form-item label="路由器WAN" prop="routerWan">
              <el-input v-model="form.routerWan" placeholder="请输入路由器WAN" />
            </el-form-item>
            <el-form-item label="MSTP VLAN" prop="mstpVlan">
              <el-input v-model="form.mstpVlan" placeholder="请输入MSTP VLAN" />
            </el-form-item>
          </el-col>

          <!-- 第二列 -->
          <el-col :span="8">
            <el-form-item label="ATM地址段" prop="atmAddressSegment">
              <el-input v-model="form.atmAddressSegment" placeholder="请输入ATM地址段" />
            </el-form-item>
            <el-form-item label="监控地址段" prop="monitoringAddressSegment">
              <el-input v-model="form.monitoringAddressSegment" placeholder="请输入监控地址段" />
            </el-form-item>
            <el-form-item label="交换机地址" prop="switchAddress">
              <el-input v-model="form.switchAddress" placeholder="请输入交换机地址" />
            </el-form-item>
            <el-form-item label="新路由器IP" prop="newRouterIp">
              <el-input v-model="form.newRouterIp" placeholder="请输入新路由器IP" />
            </el-form-item>
            <el-form-item label="线路调试日期" prop="lineDebugDate">
              <el-date-picker clearable v-model="form.lineDebugDate" type="date" value-format="yyyy-MM-dd"
                placeholder="请选择线路调试日期">
              </el-date-picker>
            </el-form-item>
            <el-form-item label="运营商" prop="carrier">
              <el-input v-model="form.carrier" placeholder="请输入运营商" />
            </el-form-item>
            <el-form-item label="端口" prop="port">
              <el-input v-model="form.port" placeholder="请输入端口" />
            </el-form-item>
          </el-col>

          <!-- 第三列 -->
          <el-col :span="8">
            <el-form-item label="ATM实际地址" prop="actualAtmAddress">
              <el-input v-model="form.actualAtmAddress" placeholder="请输入ATM实际地址" />
            </el-form-item>
            <el-form-item label="行内ATM地址" prop="intraAtmIp">
              <el-input v-model="form.intraAtmIp" placeholder="请输入行内ATM地址" />
            </el-form-item>
            <el-form-item label="网关" prop="gateway">
              <el-input v-model="form.gateway" placeholder="请输入网关" />
            </el-form-item>
            <el-form-item label="PC地址" prop="pcAddress">
              <el-input v-model="form.pcAddress" placeholder="请输入PC地址" />
            </el-form-item>
            <el-form-item label="掩码" prop="subnetMask">
              <el-input v-model="form.subnetMask" placeholder="请输入掩码" />
            </el-form-item>
            <el-form-item label="行名" prop="bankName">
              <el-input v-model="form.bankName" placeholder="请输入行名" />
            </el-form-item>
            <el-form-item label="对端地址段" prop="oppositeAddressSegment">
              <el-input v-model="form.oppositeAddressSegment" placeholder="请输入对端地址段" />
            </el-form-item>
            <el-form-item label="对端前置机IP" prop="oppositeFrontIp">
              <el-input v-model="form.oppositeFrontIp" placeholder="请输入对端前置机IP" />
            </el-form-item>
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

    <!-- 查看ATM地址详情  -->
    <el-dialog title="ATM地址详情" :visible.sync="getAtmaddressInfoOpen" width="1000px" append-to-body>
      <el-form :model="form" label-width="120px" class="dialog-content">
        <el-row :gutter="20">
          <!-- 第一列 -->
          <el-col :span="8">
            <el-form-item label="ATM位置" v-show="form.atmLocation">
              <el-input v-model="form.atmLocation" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="设备型号" v-show="form.deviceModel">
              <el-input v-model="form.deviceModel" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="设备名称" v-show="form.deviceName">
              <el-input v-model="form.deviceName" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="路由器LOOPBACK" v-show="form.routerLoopback">
              <el-input v-model="form.routerLoopback" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="上端路由器" v-show="form.upstreamRouter">
              <el-input v-model="form.upstreamRouter" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="省行WAN IP" v-show="form.provincialWanIp">
              <el-input v-model="form.provincialWanIp" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="路由器WAN" v-show="form.routerWan">
              <el-input v-model="form.routerWan" :disabled="true"></el-input>
            </el-form-item>
          </el-col>

          <!-- 第二列 -->
          <el-col :span="8">
            <el-form-item label="ATM地址段" v-show="form.atmAddressSegment">
              <el-input v-model="form.atmAddressSegment" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="监控地址段" v-show="form.monitoringAddressSegment">
              <el-input v-model="form.monitoringAddressSegment" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="交换机地址" v-show="form.switchAddress">
              <el-input v-model="form.switchAddress" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="新路由器IP" v-show="form.newRouterIp">
              <el-input v-model="form.newRouterIp" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="线路调试日期" v-show="form.lineDebugDate">
              <el-date-picker v-model="form.lineDebugDate" type="date" value-format="yyyy-MM-dd" :disabled="true"
                clearable placeholder="请选择线路调试日期"></el-date-picker>
            </el-form-item>
            <el-form-item label="运营商" v-show="form.carrier">
              <el-input v-model="form.carrier" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="端口" v-show="form.port">
              <el-input v-model="form.port" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="MSTP VLAN" v-show="form.mstpVlan">
              <el-input v-model="form.mstpVlan" :disabled="true"></el-input>
            </el-form-item>
          </el-col>

          <!-- 第三列 -->
          <el-col :span="8">
            <el-form-item label="ATM实际地址" v-show="form.actualAtmAddress">
              <el-input v-model="form.actualAtmAddress" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="行内ATM地址" v-show="form.intraAtmIp">
              <el-input v-model="form.intraAtmIp" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="网关" v-show="form.gateway">
              <el-input v-model="form.gateway" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="PC地址" v-show="form.pcAddress">
              <el-input v-model="form.pcAddress" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="掩码" v-show="form.subnetMask">
              <el-input v-model="form.subnetMask" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="行名" v-show="form.bankName">
              <el-input v-model="form.bankName" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="对端地址段" v-show="form.oppositeAddressSegment">
              <el-input v-model="form.oppositeAddressSegment" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="对端前置机IP" v-show="form.oppositeFrontIp">
              <el-input v-model="form.oppositeFrontIp" :disabled="true"></el-input>
            </el-form-item>
          </el-col>
        </el-row>

        <!-- 单独放置备注 -->
        <el-form-item label="备注" v-show="form.remark">
          <el-input v-model="form.remark" type="textarea" :disabled="true" placeholder="请输入内容" />
        </el-form-item>
      </el-form>

    </el-dialog>


  </div>
</template>

<script>
import { listAtmaddress, getAtmaddress, delAtmaddress, addAtmaddress, updateAtmaddress } from "@/api/system/atmaddress";
import { getToken } from "@/utils/auth";

export default {
  name: "Atmaddress",
  data() {
    return {
      // 是否查看详情
      getAtmaddressInfoOpen: false,
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
      // 离行ATM及外联单位地址表格数据
      atmaddressList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        atmLocation: null,
        deviceModel: null,
        deviceName: null,
        routerLoopback: null,
        upstreamRouter: null,
        provincialWanIp: null,
        routerWan: null,
        mstpVlan: null,
        atmAddressSegment: null,
        monitoringAddressSegment: null,
        switchAddress: null,
        newRouterIp: null,
        lineDebugDate: null,
        carrier: null,
        port: null,
        oppositeAddressSegment: null,
        oppositeFrontIp: null,
        actualAtmAddress: null,
        intraAtmIp: null,
        gateway: null,
        pcAddress: null,
        subnetMask: null,
        bankName: null,
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
        url: process.env.VUE_APP_BASE_API + "/system/atmaddress/importData",
      },
      // 表单参数
      form: {},
      //列信息
      columns: [
        { key: 0, label: `序号`, visible: true },
        { key: 1, label: 'ATM位置', visible: true },
        { key: 2, label: '设备型号', visible: true },
        { key: 3, label: '设备名称', visible: true },
        { key: 4, label: '路由器LOOPBACK', visible: true },
        { key: 5, label: '上端路由器', visible: true },
        { key: 6, label: '省行WAN', visible: true },
        { key: 7, label: '路由器WAN', visible: true },
        { key: 8, label: 'MSTP VLAN', visible: true },
        { key: 9, label: 'ATM地址段', visible: true },
        { key: 10, label: '监控地址段', visible: true },
        { key: 11, label: '交换机地址', visible: true },
        { key: 12, label: '新路由器IP', visible: true },
        { key: 13, label: '线路调试日期', visible: true },
        { key: 14, label: '运营商', visible: true },
        { key: 15, label: '端口', visible: true },
        { key: 16, label: '对端地址段', visible: true },
        { key: 17, label: '对端前置机IP', visible: true },
        { key: 18, label: 'ATM实际地址', visible: true },
        { key: 19, label: '行内ATM地址', visible: true },
        { key: 20, label: '网关', visible: true },
        { key: 21, label: 'PC地址', visible: true },
        { key: 22, label: '掩码', visible: true },
        { key: 23, label: '行名', visible: true },
        { key: 24, label: '备注', visible: true },
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
    /** 查询离行ATM及外联单位地址列表 */
    getList() {
      this.loading = true;
      listAtmaddress(this.queryParams).then(response => {
        this.atmaddressList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    /** 离行ATM地址详情页*/
    GetAtmExternalUnitAddressInfo(row) {
      this.reset();
      const id = row.id
      getAtmaddress(id).then((response) => {
        this.form = response.data;
        this.getAtmaddressInfoOpen = true;
      });
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
    /** 导入按钮操作 */
    handleImport() {
      this.upload.title = "ATM地址导入";
      this.upload.open = true;
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    /** 下载模板操作 */
    importTemplate() {
      this.download(
        "system/atmaddress/importTemplate",
        {},
        `离行ATM及外联单位地址模板${new Date().getTime()}.xlsx`
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
        atmLocation: null,
        deviceModel: null,
        deviceName: null,
        routerLoopback: null,
        upstreamRouter: null,
        provincialWanIp: null,
        routerWan: null,
        mstpVlan: null,
        atmAddressSegment: null,
        monitoringAddressSegment: null,
        switchAddress: null,
        newRouterIp: null,
        lineDebugDate: null,
        carrier: null,
        port: null,
        oppositeAddressSegment: null,
        oppositeFrontIp: null,
        actualAtmAddress: null,
        intraAtmIp: null,
        gateway: null,
        pcAddress: null,
        subnetMask: null,
        bankName: null,
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
      this.title = "添加离行ATM及外联单位地址";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getAtmaddress(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改离行ATM及外联单位地址";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateAtmaddress(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addAtmaddress(this.form).then(response => {
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
        return delAtmaddress(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => { });
    },
    // handleDelete(row) {
    //   const ids = row.id || this.ids;
    //   this.$modal.confirm('是否确认删除离行ATM及外联单位地址编号为"' + ids + '"的数据项？').then(function() {
    //     return delAtmaddress(ids);
    //   }).then(() => {
    //     this.getList();
    //     this.$modal.msgSuccess("删除成功");
    //   }).catch(() => {});
    // },
    // /** 导出按钮操作 */
    // handleExport() {
    //   this.download('system/atmaddress/export', {
    //     ...this.queryParams
    //   }, `atmaddress_${new Date().getTime()}.xlsx`)
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
      const fileName = `离行ATM及外联单位地址_${formattedDate}.xlsx`;

      // 调用下载方法
      this.download('system/atmaddress/export', {
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