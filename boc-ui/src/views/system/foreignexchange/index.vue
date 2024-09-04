<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <!-- 
      <el-form-item label="3G号" prop="threeGNumber">
        <el-input
          v-model="queryParams.threeGNumber"
          placeholder="请输入3G号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="IMSI码" prop="imsiCode">
        <el-input
          v-model="queryParams.imsiCode"
          placeholder="请输入IMSI码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="ICCID" prop="iccid">
        <el-input
          v-model="queryParams.iccid"
          placeholder="请输入ICCID"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item> -->

      <!-- 默认可见区域 -->
      <el-form-item label="IP地址" prop="ipAddress">
        <el-input v-model="queryParams.ipAddress" placeholder="请输入IP地址" clearable @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item label="使用单位" prop="usageUnit">
        <el-input
          v-model="queryParams.usageUnit"
          placeholder="请输入使用单位"
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
      <!-- <el-form-item label="路由器地址" prop="routerAddress">
        <el-input
          v-model="queryParams.routerAddress"
          placeholder="请输入路由器地址"
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
      <el-form-item label="PC地址" prop="pcAddress">
        <el-input
          v-model="queryParams.pcAddress"
          placeholder="请输入PC地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="用户/密码" prop="userPassword">
        <el-input
          v-model="queryParams.userPassword"
          placeholder="请输入用户/密码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="禁用时间" prop="disableTime">
        <el-date-picker clearable
          v-model="queryParams.disableTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择禁用时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="投产日期" prop="productionDate">
        <el-date-picker clearable
          v-model="queryParams.productionDate"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择投产日期">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="开通期限" prop="activationPeriod">
        <el-date-picker clearable
          v-model="queryParams.activationPeriod"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择开通期限">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="终端号" prop="terminalNumber">
        <el-input
          v-model="queryParams.terminalNumber"
          placeholder="请输入终端号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="物联网卡号" prop="iotCardNumber">
        <el-input
          v-model="queryParams.iotCardNumber"
          placeholder="请输入物联网卡号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="SIM卡号" prop="simCardNumber">
        <el-input
          v-model="queryParams.simCardNumber"
          placeholder="请输入SIM卡号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="路由器序列号" prop="routerSerialNumber">
        <el-input
          v-model="queryParams.routerSerialNumber"
          placeholder="请输入路由器序列号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="路由器MAC" prop="routerMac">
        <el-input
          v-model="queryParams.routerMac"
          placeholder="请输入路由器MAC"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="路由器SN" prop="routerSn">
        <el-input
          v-model="queryParams.routerSn"
          placeholder="请输入路由器SN"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="路由器编号" prop="routerNumber">
        <el-input
          v-model="queryParams.routerNumber"
          placeholder="请输入路由器编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="路由器物联网卡号" prop="routerIotCardNumber">
        <el-input
          v-model="queryParams.routerIotCardNumber"
          placeholder="请输入路由器物联网卡号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="路由器SIM卡号" prop="routerSimCardNumber">
        <el-input
          v-model="queryParams.routerSimCardNumber"
          placeholder="请输入路由器SIM卡号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="归属单位" prop="owningUnit">
        <el-input
          v-model="queryParams.owningUnit"
          placeholder="请输入归属单位"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item> -->
      <!-- <el-form-item label="IP区域" prop="ipArea">
        <el-select v-model="queryParams.ipArea" placeholder="请选择IP区域" clearable>
          <el-option
            v-for="dict in dict.type.ip_areas"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="设备类型" prop="deviceType">
        <el-select v-model="queryParams.deviceType" placeholder="请选择设备类型" clearable>
          <el-option
            v-for="dict in dict.type.device_type"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
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
          v-hasPermi="['system:foreignexchange:add']">新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button type="success" plain icon="el-icon-edit" size="mini" :disabled="single" @click="handleUpdate"
          v-hasPermi="['system:foreignexchange:edit']">修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button type="danger" plain icon="el-icon-delete" size="mini" :disabled="multiple" @click="handleDelete"
          v-hasPermi="['system:foreignexchange:remove']">删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button type="warning" plain icon="el-icon-download" size="mini" @click="handleExport"
          v-hasPermi="['system:foreignexchange:export']">导出</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button type="info" plain icon="el-icon-upload2" size="mini" @click="handleImport"
          v-hasPermi="['system:foreignexchange:import']">导入</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList" :columns="columns"></right-toolbar>
    </el-row>

    <!-- 表头详情 -->
    <el-table v-loading="loading" stripe border size="mini"
      :header-cell-style="{ background: '#eef1f6', color: '#606266' }" :data="foreignexchangeList"
      @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <!-- <el-table-column label="设备ID" align="center" prop="deviceId" /> -->
      <el-table-column label="序号" type="index" :index="indexMethod" align="center" prop="deviceId"
        v-if="columns[0].visible" />
      <el-table-column label="IP地址" align="center" prop="ipAddress" v-if="columns[1].visible" />
      <el-table-column label="使用单位" align="center" prop="usageUnit" v-if="columns[2].visible" />
      <el-table-column label="3G号" show-overflow-tooltip align="center" prop="threeGNumber" v-if="columns[3].visible" />
      <el-table-column label="IMSI码" show-overflow-tooltip align="center" prop="imsiCode" v-if="columns[4].visible" />
      <el-table-column label="ICCID" show-overflow-tooltip align="center" prop="iccid" v-if="columns[5].visible" />
      <el-table-column label="路由器地址" align="center" prop="routerAddress" v-if="columns[6].visible" />
      <el-table-column label="掩码" align="center" prop="subnetMask" v-if="columns[7].visible" />
      <el-table-column label="PC地址" align="center" prop="pcAddress" v-if="columns[8].visible" />
      <el-table-column label="用户/密码" show-overflow-tooltip align="center" prop="userPassword"
        v-if="columns[9].visible" />
      <el-table-column label="备注" show-overflow-tooltip align="center" prop="remark" v-if="columns[10].visible" />
      <el-table-column label="禁用时间" align="center" v-if="columns[11].visible" prop="disableTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.disableTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="投产日期" v-if="columns[12].visible" align="center" prop="productionDate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.productionDate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="开通期限" align="center" prop="activationPeriod" v-if="columns[13].visible" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.activationPeriod, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="终端号" align="center" prop="terminalNumber" v-if="columns[14].visible" />
      <el-table-column label="物联网卡号" show-overflow-tooltip align="center" prop="iotCardNumber"
        v-if="columns[15].visible" />
      <el-table-column label="SIM卡号" show-overflow-tooltip align="center" prop="simCardNumber"
        v-if="columns[16].visible" />
      <el-table-column label="路由器序列号" show-overflow-tooltip align="center" prop="routerSerialNumber"
        v-if="columns[17].visible" />
      <el-table-column label="路由器MAC" show-overflow-tooltip align="center" prop="routerMac"
        v-if="columns[18].visible" />
      <el-table-column label="路由器SN" show-overflow-tooltip align="center" prop="routerSn" v-if="columns[19].visible" />
      <el-table-column label="路由器编号" show-overflow-tooltip align="center" prop="routerNumber"
        v-if="columns[20].visible" />
      <el-table-column label="路由器物联网卡号" show-overflow-tooltip align="center" prop="routerIotCardNumber"
        v-if="columns[21].visible" />
      <el-table-column label="路由器SIM卡号" show-overflow-tooltip align="center" prop="routerSimCardNumber"
        v-if="columns[22].visible" />
      <el-table-column label="归属单位" align="center" prop="owningUnit" v-if="columns[23].visible" />
      <!-- <el-table-column label="IP区域" align="center" prop="ipArea" v-if="columns[24].visible">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.ip_areas" :value="scope.row.ipArea"/>
        </template>
      </el-table-column>
      <el-table-column label="设备类型" align="center" prop="deviceType" v-if="columns[25].visible">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.device_type" :value="scope.row.deviceType"/>
        </template>
      </el-table-column> -->
      <el-table-column label="操作" fixed="right" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button size="mini" type="text" icon="el-icon-message" @click="foreignexchange_devicesInfo(scope.row)"
            v-hasPermi="['system:foreignexchange:query']">查看详情</el-button>
          <el-button size="mini" type="text" icon="el-icon-edit" @click="handleUpdate(scope.row)"
            v-hasPermi="['system:foreignexchange:edit']">修改</el-button>
          <el-button size="mini" type="text" icon="el-icon-delete" @click="handleDelete(scope.row)"
            v-hasPermi="['system:foreignexchange:remove']">删除</el-button>
        </template>
      </el-table-column>
    </el-table>

    <pagination v-show="total > 0" :total="total" :page.sync="queryParams.pageNum" :limit.sync="queryParams.pageSize"
      @pagination="getList" />

    <!-- 添加或修改智能柜台及本外币兑换机IP地址对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="1000px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-row :gutter="20">
          <!-- 第一列 -->
          <el-col :span="8">
            <el-form-item label="IP地址" prop="ipAddress">
              <el-input v-model="form.ipAddress" placeholder="请输入IP地址" />
            </el-form-item>
            <el-form-item label="使用单位" prop="usageUnit">
              <el-input v-model="form.usageUnit" placeholder="请输入使用单位" />
            </el-form-item>
            <el-form-item label="3G号" prop="threeGNumber">
              <el-input v-model="form.threeGNumber" placeholder="请输入3G号" />
            </el-form-item>
            <el-form-item label="IMSI码" prop="imsiCode">
              <el-input v-model="form.imsiCode" placeholder="请输入IMSI码" />
            </el-form-item>
            <el-form-item label="ICCID" prop="iccid">
              <el-input v-model="form.iccid" placeholder="请输入ICCID" />
            </el-form-item>
            <el-form-item label="终端号" prop="terminalNumber">
              <el-input v-model="form.terminalNumber" placeholder="请输入终端号" />
            </el-form-item>
            <el-form-item label="物联网卡号" prop="iotCardNumber">
              <el-input v-model="form.iotCardNumber" placeholder="请输入物联网卡号" />
            </el-form-item>
            <el-form-item label="SIM卡号" prop="simCardNumber">
              <el-input v-model="form.simCardNumber" placeholder="请输入SIM卡号" />
            </el-form-item>
            <el-form-item label="投产日期" prop="productionDate">
              <el-date-picker clearable v-model="form.productionDate" type="date" value-format="yyyy-MM-dd"
                placeholder="请选择投产日期">
              </el-date-picker>
            </el-form-item>
          </el-col>
          <!-- 第二列 -->
          <el-col :span="8">
            <!-- <el-form-item label="IP区域" prop="ipArea">
              <el-select v-model="form.ipArea" placeholder="请选择IP区域">
                <el-option
                  v-for="dict in dict.type.ip_areas"
                  :key="dict.value"
                  :label="dict.label"
                  :value="dict.value"
                ></el-option>
              </el-select>
            </el-form-item> -->
            <el-form-item label="归属单位" prop="owningUnit">
              <el-input v-model="form.owningUnit" placeholder="请输入归属单位" />
            </el-form-item>
            <el-form-item label="PC地址" prop="pcAddress">
              <el-input v-model="form.pcAddress" placeholder="请输入PC地址" />
            </el-form-item>
            <el-form-item label="用户/密码" prop="userPassword">
              <el-input v-model="form.userPassword" placeholder="请输入用户/密码" />
            </el-form-item>
            <el-form-item label="路由器序列号" prop="routerSerialNumber">
              <el-input v-model="form.routerSerialNumber" placeholder="请输入路由器序列号" />
            </el-form-item>
            <el-form-item label="路由器MAC" prop="routerMac">
              <el-input v-model="form.routerMac" placeholder="请输入路由器MAC" />
            </el-form-item>
            <el-form-item label="路由器SN" prop="routerSn">
              <el-input v-model="form.routerSn" placeholder="请输入路由器SN" />
            </el-form-item>
            <el-form-item label="开通期限" prop="activationPeriod">
              <el-date-picker clearable v-model="form.activationPeriod" type="date" value-format="yyyy-MM-dd"
                placeholder="请选择开通期限">
              </el-date-picker>
            </el-form-item>
          </el-col>
          <!-- 第三列 -->
          <el-col :span="8">
            <!-- <el-form-item label="设备类型" prop="deviceType">
              <el-select v-model="form.deviceType" placeholder="请选择设备类型">
                <el-option
                  v-for="dict in dict.type.device_type"
                  :key="dict.value"
                  :label="dict.label"
                  :value="dict.value"
                ></el-option>
              </el-select>
            </el-form-item> -->
            <el-form-item label="路由器物联网卡号" prop="routerIotCardNumber">
              <el-input v-model="form.routerIotCardNumber" placeholder="请输入路由器物联网卡号" />
            </el-form-item>
            <el-form-item label="路由器SIM卡号" prop="routerSimCardNumber">
              <el-input v-model="form.routerSimCardNumber" placeholder="请输入路由器SIM卡号" />
            </el-form-item>
            <el-form-item label="掩码" prop="subnetMask">
              <el-input v-model="form.subnetMask" placeholder="请输入掩码" />
            </el-form-item>
            <el-form-item label="路由器地址" prop="routerAddress">
              <el-input v-model="form.routerAddress" placeholder="请输入路由器地址" />
            </el-form-item>
            <el-form-item label="路由器编号" prop="routerNumber">
              <el-input v-model="form.routerNumber" placeholder="请输入路由器编号" />
            </el-form-item>
            <el-form-item label="禁用时间" prop="disableTime">
              <el-date-picker clearable v-model="form.disableTime" type="date" value-format="yyyy-MM-dd"
                placeholder="请选择禁用时间">
              </el-date-picker>
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

    <!-- 设备导入对话框 -->
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

    <!-- 查看设备详情  -->
    <el-dialog title="设备详情" :visible.sync="getForeignexchangeInfoOpen" width="1000px" append-to-body>
      <el-form :model="form" label-width="120px" class="dialog-content">
        <!-- 第一列 -->
        <el-row :gutter="20">
          <el-col :span="8">
            <el-form-item label="IP地址" v-show="form.ipAddress">
              <el-input v-model="form.ipAddress" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="3G号" v-show="form.threeGNumber">
              <el-input v-model="form.threeGNumber" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="ICCID" v-show="form.iccid">
              <el-input v-model="form.iccid" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="使用单位" v-show="form.usageUnit">
              <el-input v-model="form.usageUnit" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="用户/密码" v-show="form.userPassword">
              <el-input v-model="form.userPassword" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="路由器编号" v-show="form.routerNumber">
              <el-input v-model="form.routerNumber" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="路由器序列号" v-show="form.routerSerialNumber">
              <el-input v-model="form.routerSerialNumber" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="开通期限" v-show="form.activationPeriod">
              <el-input v-model="form.activationPeriod" :disabled="true"></el-input>
            </el-form-item>
          </el-col>
          <!-- 第二列 -->
          <el-col :span="8">
            <!-- <el-form-item label="IP区域" v-show="form.ipArea">
              <el-select v-model="form.ipArea" :disabled="true">
                <el-option
                  v-for="dict in dict.type.ip_areas"
                  :key="dict.value"
                  :label="dict.label"
                  :value="dict.value"
                ></el-option>
              </el-select>
            </el-form-item> -->
            <el-form-item label="IMSI码" v-show="form.imsiCode">
              <el-input v-model="form.imsiCode" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="终端号" v-show="form.terminalNumber">
              <el-input v-model="form.terminalNumber" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="路由器SIM卡号" v-show="form.routerSimCardNumber">
              <el-input v-model="form.routerSimCardNumber" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="路由器MAC地址" v-show="form.routerMac">
              <el-input v-model="form.routerMac" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="路由器SN" v-show="form.routerSn">
              <el-input v-model="form.routerSn" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="路由器地址" v-show="form.routerAddress">
              <el-input v-model="form.routerAddress" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="禁用时间" v-show="form.disableTime">
              <el-input v-model="form.disableTime" :disabled="true"></el-input>
            </el-form-item>
          </el-col>
          <!-- 第三列 -->
          <el-col :span="8">
            <!-- <el-form-item label="设备类型" v-show="form.deviceType">
              <el-select v-model="form.deviceType" :disabled="true">
                <el-option
                  v-for="dict in dict.type.device_type"
                  :key="dict.value"
                  :label="dict.label"
                  :value="dict.value"
                ></el-option>
              </el-select>
            </el-form-item> -->
            <el-form-item label="掩码" v-show="form.subnetMask">
              <el-input v-model="form.subnetMask" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="PC地址" v-show="form.pcAddress">
              <el-input v-model="form.pcAddress" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="SIM卡号" v-show="form.simCardNumber">
              <el-input v-model="form.simCardNumber" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="归属单位" v-show="form.owningUnit">
              <el-input v-model="form.owningUnit" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="物联网卡号" v-show="form.iotCardNumber">
              <el-input v-model="form.iotCardNumber" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="路由器物联网卡号" v-show="form.routerIotCardNumber">
              <el-input v-model="form.routerIotCardNumber" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="路由器地址" v-show="form.routerMacAddress">
              <el-input v-model="form.routerAddress" :disabled="true"></el-input>
            </el-form-item>
            <el-form-item label="投产日期" v-show="form.productionDate">
              <el-input v-model="form.productionDate" :disabled="true"></el-input>
            </el-form-item>
          </el-col>
        </el-row>
        <el-form-item label="备注" v-show="form.remark">
          <el-input v-model="form.remark" :disabled="true" type="textarea"
            :autosize="{ minRows: 2, maxRows: 4 }"></el-input>
        </el-form-item>
      </el-form>
    </el-dialog>

  </div>
</template>

<script>
import { listForeignexchange, getForeignexchange, delForeignexchange, addForeignexchange, updateForeignexchange } from "@/api/system/foreignexchange";
import { getToken } from "@/utils/auth";


export default {
  name: "Foreignexchange",
  dicts: ['ip_areas', 'device_type'],
  data() {
    return {
      //是否查看详情
      getForeignexchangeInfoOpen: false,
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
      // 智能柜台及本外币兑换机IP地址表格数据
      foreignexchangeList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        usageUnit: null,
        threeGNumber: null,
        imsiCode: null,
        iccid: null,
        ipAddress: null,
        routerAddress: null,
        subnetMask: null,
        pcAddress: null,
        userPassword: null,
        disableTime: null,
        productionDate: null,
        activationPeriod: null,
        terminalNumber: null,
        iotCardNumber: null,
        simCardNumber: null,
        routerSerialNumber: null,
        routerMac: null,
        routerSn: null,
        routerNumber: null,
        routerIotCardNumber: null,
        routerSimCardNumber: null,
        owningUnit: null,
        ipArea: null,
        deviceType: null,
      },
      //实现展开与收起
      showMoreFilters: false,
      //折叠菜单
      activeCollapse: ['more'],
      // 设备导入参数
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
        url: process.env.VUE_APP_BASE_API + "/system/foreignexchange/importData",
      },
      // 表单参数
      form: {},
      // 列信息
      columns: [
        { key: 0, label: `序号`, visible: true },
        { key: 1, label: `IP地址`, visible: true },
        { key: 2, label: `使用单位`, visible: true },
        { key: 3, label: `3G号`, visible: true },
        { key: 4, label: `IMSI码`, visible: true },
        { key: 5, label: `ICCID`, visible: true },
        { key: 6, label: `路由器地址`, visible: true },
        { key: 7, label: `掩码`, visible: true },
        { key: 8, label: `PC地址`, visible: true },
        { key: 9, label: `用户/密码`, visible: true },
        { key: 10, label: `备注`, visible: true },
        { key: 11, label: `禁用时间`, visible: true },

        { key: 12, label: `投产日期`, visible: true },
        { key: 13, label: `开通期限`, visible: true },
        { key: 14, label: `终端号`, visible: true },
        { key: 15, label: `物联网卡号`, visible: true },
        { key: 16, label: `SIM卡号`, visible: true },
        { key: 17, label: `路由器序列号`, visible: true },
        { key: 18, label: `路由器MAC`, visible: true },
        { key: 19, label: `路由器SN`, visible: true },
        { key: 20, label: `路由器编号`, visible: true },
        { key: 21, label: `路由器物联网卡号`, visible: true },
        { key: 22, label: `路由器SIM卡号`, visible: true },
        { key: 23, label: `归属单位`, visible: true },
        // { key: 24, label: `IP区域`, visible: true },
        // { key: 25, label: `设备类型`, visible: true },
      ],
      // 表单校验
      rules: {
        // ipAddress: [
        //   { required: true, message: "IP地址不能为空", trigger: "blur" },
        //   { min: 7, max: 15, message: 'IP地址长度必须介于 7 和 15 之间', trigger: 'blur' }
        // ],
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询智能柜台及本外币兑换机IP地址列表 */
    getList() {
      this.loading = true;
      listForeignexchange(this.queryParams).then(response => {
        this.foreignexchangeList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },

    /** 导入按钮操作 */
    handleImport() {
      this.upload.title = "设备导入";
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
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        deviceId: null,
        usageUnit: null,
        threeGNumber: null,
        imsiCode: null,
        iccid: null,
        ipAddress: null,
        routerAddress: null,
        subnetMask: null,
        pcAddress: null,
        userPassword: null,
        remark: null,
        disableTime: null,
        productionDate: null,
        activationPeriod: null,
        terminalNumber: null,
        iotCardNumber: null,
        simCardNumber: null,
        routerSerialNumber: null,
        routerMac: null,
        routerSn: null,
        routerNumber: null,
        routerIotCardNumber: null,
        routerSimCardNumber: null,
        owningUnit: null,
        ipArea: null,
        deviceType: null,
        createBy: null,
        createTime: null,
        updateBy: null,
        updateTime: null
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
      this.ids = selection.map(item => item.deviceId)
      this.single = selection.length !== 1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加智能柜台及本外币兑换机IP地址";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const deviceId = row.deviceId || this.ids
      getForeignexchange(deviceId).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改智能柜台及本外币兑换机IP地址";
      });
    },
    /** 智能柜台及本外币兑换机IP地址详情页*/
    foreignexchange_devicesInfo(row) {
      this.reset();
      const id = row.deviceId
      getForeignexchange(id).then((response) => {
        this.form = response.data;
        this.getForeignexchangeInfoOpen = true;
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.deviceId != null) {
            updateForeignexchange(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addForeignexchange(this.form).then(response => {
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
      const deviceIds = row.deviceId || this.ids;
      this.$modal.confirm('是否确认删除数据项？').then(function () {
        return delForeignexchange(deviceIds);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => { });
      // this.$modal.confirm('是否确认删除智能柜台及本外币兑换机IP地址编号为"' + deviceIds + '"的数据项？').then(function() {
      //   return delForeignexchange(deviceIds);
      // }).then(() => {
      //   this.getList();
      //   this.$modal.msgSuccess("删除成功");
      // }).catch(() => {});
    },
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
      const fileName = `智能柜台及本外币兑换机IP地址_${formattedDate}.xlsx`;

      // 调用下载方法
      this.download('system/foreignexchange/export', {
        ...this.queryParams
      }, fileName);
    },
    /** 下载模板操作 */
    importTemplate() {
      this.download(
        "system/foreignexchange/importTemplate",
        {},
        `user_template_${new Date().getTime()}.xlsx`
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