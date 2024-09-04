<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <!-- 这里放默认搜索内容 -->
      <el-form-item label="源IP" prop="sourceIp">
        <el-input v-model="queryParams.sourceIp" placeholder="请输入源IP" clearable @keyup.enter.native="handleQuery" />
      </el-form-item>
      <el-form-item label="MAC地址" label-width="75px" prop="macAddress">
        <el-input
          v-model="queryParams.macAddress"
          placeholder="请输入MAC地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="部门名称" prop="departmentName">
        <el-input
          v-model="queryParams.departmentName"
          placeholder="请输入部门名称"
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
      <!-- 
      <el-form-item label="用户姓名" prop="userName">
        <el-input
          v-model="queryParams.userName"
          placeholder="请输入用户姓名"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="网络设备" prop="networkDevice">
        <el-input
          v-model="queryParams.networkDevice"
          placeholder="请输入网络设备"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="网络设备IP" prop="networkDeviceIp">
        <el-input
          v-model="queryParams.networkDeviceIp"
          placeholder="请输入网络设备IP"
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
      <el-form-item label="操作系统" prop="operatingSystem">
        <el-input
          v-model="queryParams.operatingSystem"
          placeholder="请输入操作系统"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="电子邮箱" prop="email">
        <el-input
          v-model="queryParams.email"
          placeholder="请输入电子邮箱"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="电话号码" prop="phoneNumber">
        <el-input
          v-model="queryParams.phoneNumber"
          placeholder="请输入电话号码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="管辖行" prop="branchName">
        <el-input
          v-model="queryParams.branchName"
          placeholder="请输入管辖行"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="行名" prop="subBranchName">
        <el-input
          v-model="queryParams.subBranchName"
          placeholder="请输入行名"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="设备" prop="device">
        <el-input
          v-model="queryParams.device"
          placeholder="请输入设备"
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
      <el-form-item label="固定资产编号" prop="assetNumber">
        <el-input
          v-model="queryParams.assetNumber"
          placeholder="请输入固定资产编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="设备年限" prop="deviceAge">
        <el-input
          v-model="queryParams.deviceAge"
          placeholder="请输入设备年限"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="老旧设备更换" prop="oldDeviceReplacement">
        <el-input
          v-model="queryParams.oldDeviceReplacement"
          placeholder="请输入老旧设备更换"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="局域网地址范围" prop="localNetworkIpRange">
        <el-input
          v-model="queryParams.localNetworkIpRange"
          placeholder="请输入局域网地址范围"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="Ethernet IP" prop="ethernetIp">
        <el-input
          v-model="queryParams.ethernetIp"
          placeholder="请输入Ethernet IP"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="网关" prop="gatewayIp">
        <el-input
          v-model="queryParams.gatewayIp"
          placeholder="请输入网关"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="PC地址段" prop="pcIpRange">
        <el-input
          v-model="queryParams.pcIpRange"
          placeholder="请输入PC地址段"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="ATM地址段" prop="atmIpRange">
        <el-input
          v-model="queryParams.atmIpRange"
          placeholder="请输入ATM地址段"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="监控地址段" prop="monitorIpRange">
        <el-input
          v-model="queryParams.monitorIpRange"
          placeholder="请输入监控地址段"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="WLAN地址段" prop="wlanIpRange">
        <el-input
          v-model="queryParams.wlanIpRange"
          placeholder="请输入WLAN地址段"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="冠字号机具" prop="currencyMachineIpRange">
        <el-input
          v-model="queryParams.currencyMachineIpRange"
          placeholder="请输入冠字号机具"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="新loopback/32" prop="loopbackIp">
        <el-input
          v-model="queryParams.loopbackIp"
          placeholder="请输入新loopback/32"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="同城电信/30" prop="telecomCircuitIp">
        <el-input
          v-model="queryParams.telecomCircuitIp"
          placeholder="请输入同城电信/30"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="同城移动/30" prop="mobileCircuitIp">
        <el-input
          v-model="queryParams.mobileCircuitIp"
          placeholder="请输入同城移动/30"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="同城联通/30" prop="unicomCircuitIp">
        <el-input
          v-model="queryParams.unicomCircuitIp"
          placeholder="请输入同城联通/30"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="同城有线电视/30" prop="cableTvCircuitIp">
        <el-input
          v-model="queryParams.cableTvCircuitIp"
          placeholder="请输入同城有线电视/30"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="电信mstp vlan" prop="telecomMstpVlan">
        <el-input
          v-model="queryParams.telecomMstpVlan"
          placeholder="请输入电信mstp vlan"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="移动mstp vlan" prop="mobileMstpVlan">
        <el-input
          v-model="queryParams.mobileMstpVlan"
          placeholder="请输入移动mstp vlan"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="联通mstp vlan" prop="unicomMstpVlan">
        <el-input
          v-model="queryParams.unicomMstpVlan"
          placeholder="请输入联通mstp vlan"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="有线电视mstp vlan" prop="cableTvMstpVlan">
        <el-input
          v-model="queryParams.cableTvMstpVlan"
          placeholder="请输入有线电视mstp vlan"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="主机名" prop="hostName">
        <el-input
          v-model="queryParams.hostName"
          placeholder="请输入主机名"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="创建人" prop="createdBy">
        <el-input
          v-model="queryParams.createdBy"
          placeholder="请输入创建人"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="最后更新人" prop="updatedBy">
        <el-input
          v-model="queryParams.updatedBy"
          placeholder="请输入最后更新人"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="创建时间" prop="createdAt">
        <el-date-picker clearable
          v-model="queryParams.createdAt"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择创建时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="更新时间" prop="updatedAt">
        <el-date-picker clearable
          v-model="queryParams.updatedAt"
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
          v-hasPermi="['system:ipaccess:add']">新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button type="success" plain icon="el-icon-edit" size="mini" :disabled="single" @click="handleUpdate"
          v-hasPermi="['system:ipaccess:edit']">修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button type="danger" plain icon="el-icon-delete" size="mini" :disabled="multiple" @click="handleDelete"
          v-hasPermi="['system:ipaccess:remove']">删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button type="warning" plain icon="el-icon-download" size="mini" @click="handleExport"
          v-hasPermi="['system:ipaccess:export']">导出</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button type="info" plain icon="el-icon-upload2" size="mini" @click="handleImport"
          v-hasPermi="['system:ipaccess:import']">导入</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList" :columns="columns"></right-toolbar>
    </el-row>

    <!-- 列表表头详情 -->
    <el-table v-loading="loading" stripe border size="mini"
      :header-cell-style="{ background: '#eef1f6', color: '#606266' }" :data="ipaccessList"
      @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="序号" type="index" :index="indexMethod" align="center" prop="id"
        v-if="columns[0].visible" />
      <el-table-column label="源IP" align="center" prop="sourceIp" v-if="columns[1].visible" />
      <el-table-column label="MAC地址" show-overflow-tooltip align="center" prop="macAddress" v-if="columns[2].visible" />
      <el-table-column label="部门名称" align="center" prop="departmentName" v-if="columns[3].visible" />
      <el-table-column label="用户姓名" align="center" prop="userName" v-if="columns[4].visible" />
      <el-table-column label="网络设备"  show-overflow-tooltip align="center" prop="networkDevice" v-if="columns[5].visible" />
      <el-table-column label="网络设备IP" show-overflow-tooltip align="center" prop="networkDeviceIp" v-if="columns[6].visible" />
      <el-table-column label="端口" show-overflow-tooltip align="center" prop="port" v-if="columns[7].visible" />
      <el-table-column label="操作系统" show-overflow-tooltip align="center" prop="operatingSystem" v-if="columns[8].visible" />
      <el-table-column label="电子邮箱" show-overflow-tooltip align="center" prop="email" v-if="columns[9].visible" />
      <el-table-column label="电话号码" show-overflow-tooltip align="center" prop="phoneNumber" v-if="columns[10].visible" />
      <el-table-column label="管辖行" show-overflow-tooltip align="center" prop="branchName" v-if="columns[11].visible" />
      <el-table-column label="行名" show-overflow-tooltip align="center" prop="subBranchName" v-if="columns[12].visible" />
      <el-table-column label="设备" show-overflow-tooltip align="center" prop="device" v-if="columns[13].visible" />
      <el-table-column label="设备名称" show-overflow-tooltip align="center" prop="deviceName" v-if="columns[14].visible" />
      <el-table-column label="设备型号" show-overflow-tooltip align="center" prop="deviceType" v-if="columns[15].visible" />
      <el-table-column label="固定资产编号" show-overflow-tooltip align="center" prop="assetNumber" v-if="columns[16].visible" />
      <el-table-column label="设备年限" show-overflow-tooltip align="center" prop="deviceAge" v-if="columns[17].visible" />
      <el-table-column label="老旧设备更换" show-overflow-tooltip align="center" prop="oldDeviceReplacement" v-if="columns[18].visible" />
      <el-table-column label="局域网地址范围" show-overflow-tooltip align="center" prop="localNetworkIpRange" v-if="columns[19].visible" />
      <el-table-column label="Ethernet IP" show-overflow-tooltip align="center" prop="ethernetIp" v-if="columns[20].visible" />
      <el-table-column label="网关" show-overflow-tooltip align="center" prop="gatewayIp" v-if="columns[21].visible" />
      <el-table-column label="PC地址段" show-overflow-tooltip align="center" prop="pcIpRange" v-if="columns[22].visible" />
      <el-table-column label="ATM地址段" show-overflow-tooltip align="center" prop="atmIpRange" v-if="columns[23].visible" />
      <el-table-column label="监控地址段" show-overflow-tooltip align="center" prop="monitorIpRange" v-if="columns[24].visible" />
      <el-table-column label="WLAN地址段" show-overflow-tooltip align="center" prop="wlanIpRange" v-if="columns[25].visible" />
      <el-table-column label="冠字号机具" show-overflow-tooltip align="center" prop="currencyMachineIpRange" v-if="columns[26].visible" />
      <el-table-column label="新loopback/32" show-overflow-tooltip align="center" prop="loopbackIp" v-if="columns[27].visible" />
      <el-table-column label="同城电信/30" show-overflow-tooltip align="center" prop="telecomCircuitIp" v-if="columns[28].visible" />
      <el-table-column label="同城移动/30" show-overflow-tooltip align="center" prop="mobileCircuitIp" v-if="columns[29].visible" />
      <el-table-column label="同城联通/30" show-overflow-tooltip align="center" prop="unicomCircuitIp" v-if="columns[30].visible" />
      <el-table-column label="同城有线电视/30" show-overflow-tooltip align="center" prop="cableTvCircuitIp" v-if="columns[31].visible" />
      <el-table-column label="电信mstp vlan" show-overflow-tooltip align="center" prop="telecomMstpVlan" v-if="columns[32].visible" />
      <el-table-column label="移动mstp vlan" show-overflow-tooltip align="center" prop="mobileMstpVlan" v-if="columns[33].visible" />
      <el-table-column label="联通mstp vlan" show-overflow-tooltip align="center" prop="unicomMstpVlan" v-if="columns[34].visible" />
      <el-table-column label="有线电视mstp vlan" show-overflow-tooltip align="center" prop="cableTvMstpVlan" v-if="columns[35].visible" />
      <el-table-column label="主机名" show-overflow-tooltip align="center" prop="hostName" v-if="columns[36].visible" />
      <el-table-column label="备注" show-overflow-tooltip align="center" prop="remark" v-if="columns[37].visible" />
      <!-- <el-table-column label="创建人" align="center" prop="createdBy" />
      <el-table-column label="最后更新人" align="center" prop="updatedBy" />
      <el-table-column label="创建时间" align="center" prop="createdAt" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.createdAt, '{y}-{m}-{d}') }}</span>
        </template>
</el-table-column>
<el-table-column label="更新时间" align="center" prop="updatedAt" width="180">
  <template slot-scope="scope">
          <span>{{ parseTime(scope.row.updatedAt, '{y}-{m}-{d}') }}</span>
        </template>
</el-table-column> -->
      <el-table-column label="操作" fixed="right" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button size="mini" type="text" icon="el-icon-message" @click="GetIpaccessInfo(scope.row)"
            v-hasPermi="['system:ipaccess:query']">查看详情</el-button>
          <el-button size="mini" type="text" icon="el-icon-edit" @click="handleUpdate(scope.row)"
            v-hasPermi="['system:ipaccess:edit']">修改</el-button>
          <el-button size="mini" type="text" icon="el-icon-delete" @click="handleDelete(scope.row)"
            v-hasPermi="['system:ipaccess:remove']">删除</el-button>
        </template>
      </el-table-column>
    </el-table>

    <pagination v-show="total > 0" :total="total" :page.sync="queryParams.pageNum" :limit.sync="queryParams.pageSize"
      @pagination="getList" />

    <!-- 查看全辖终端IP_准入设备信息详情 -->
    <el-dialog title="DMZ区应用系统IP详情" :visible.sync="getIpaccessInfoOpen" width="1000px" append-to-body>
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
    

    <!-- 添加或修改全辖终端IP_准入设备信息对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="1000px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="120px" class="dialog-content">
        <el-row :gutter="20">
          <el-col :span="8" v-for="(column, colIndex) in displayColumns" :key="colIndex">
            <template v-for="field in column">
              <el-form-item :label="field.label" :prop="field.prop" >
                <el-input v-model="form[field.prop]" :placeholder="'请输入' + field.label" />
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


    <!-- 全辖终端IP_准入设备信息导入对话框 -->
    <el-dialog :title="upload.title" :visible.sync="upload.open" width="400px" append-to-body>
      <el-upload ref="upload" :limit="1" accept=".xlsx, .xls" :headers="upload.headers"
        :action="upload.url + '?updateSupport=' + upload.updateSupport" :disabled="upload.isUploading"
        :on-progress="handleFileUploadProgress" :on-success="handleFileSuccess" :auto-upload="false" drag>
        <i class="el-icon-upload"></i>
        <div class="el-upload__text">将文件拖到此处，或<em>点击上传</em></div>
        <div class="el-upload__tip text-center" slot="tip">
          <!-- <div class="el-upload__tip" slot="tip">
            <el-checkbox v-model="upload.updateSupport" /> 是否更新已经存在的全辖终端IP_准入设备信息数据
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
import { listIpaccess, getIpaccess, delIpaccess, addIpaccess, updateIpaccess } from "@/api/system/ipaccess";
import { getToken } from "@/utils/auth";

export default {
  name: "Ipaccess",
  data() {
    return {
      //是否查看详情
      getIpaccessInfoOpen: false,
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
      // 全辖终端IP_准入设备信息表格数据
      ipaccessList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        sourceIp: null,
        macAddress: null,
        departmentName: null,
        userName: null,
        networkDevice: null,
        networkDeviceIp: null,
        port: null,
        operatingSystem: null,
        email: null,
        phoneNumber: null,
        branchName: null,
        subBranchName: null,
        device: null,
        deviceName: null,
        deviceType: null,
        assetNumber: null,
        deviceAge: null,
        oldDeviceReplacement: null,
        localNetworkIpRange: null,
        ethernetIp: null,
        gatewayIp: null,
        pcIpRange: null,
        atmIpRange: null,
        monitorIpRange: null,
        wlanIpRange: null,
        currencyMachineIpRange: null,
        loopbackIp: null,
        telecomCircuitIp: null,
        mobileCircuitIp: null,
        unicomCircuitIp: null,
        cableTvCircuitIp: null,
        telecomMstpVlan: null,
        mobileMstpVlan: null,
        unicomMstpVlan: null,
        cableTvMstpVlan: null,
        hostName: null,
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
        url: process.env.VUE_APP_BASE_API + "/system/ipaccess/importData",
      },
      // 表单参数
      form: {},
      // 列信息
      columns: [
        { key: 0, label: '序号', prop: 'index', visible: true },
        { key: 1, label: '源IP', prop: 'sourceIp', visible: true },
        { key: 2, label: 'MAC地址', prop: 'macAddress', visible: true },
        { key: 3, label: '部门名称', prop: 'departmentName', visible: true },
        { key: 4, label: '用户姓名', prop: 'userName', visible: true },
        { key: 5, label: '网络设备', prop: 'networkDevice', visible: true },
        { key: 6, label: '网络设备IP', prop: 'networkDeviceIp', visible: true },
        { key: 7, label: '端口', prop: 'port', visible: true },
        { key: 8, label: '操作系统', prop: 'operatingSystem', visible: true },
        { key: 9, label: '电子邮箱', prop: 'email', visible: true },
        { key: 10, label: '电话号码', prop: 'phoneNumber', visible: true },
        { key: 11, label: '管辖行', prop: 'branchName', visible: true },
        { key: 12, label: '行名', prop: 'subBranchName', visible: true },
        { key: 13, label: '设备', prop: 'device', visible: true },
        { key: 14, label: '设备名称', prop: 'deviceName', visible: true },
        { key: 15, label: '设备型号', prop: 'deviceType', visible: true },
        { key: 16, label: '固定资产编号', prop: 'assetNumber', visible: true },
        { key: 17, label: '设备年限', prop: 'deviceAge', visible: true },
        { key: 18, label: '老旧设备更换', prop: 'oldDeviceReplacement', visible: true },
        { key: 19, label: '局域网地址范围', prop: 'localNetworkIpRange', visible: true },
        { key: 20, label: 'Ethernet IP', prop: 'ethernetIp', visible: true },
        { key: 21, label: '网关', prop: 'gatewayIp', visible: true },
        { key: 22, label: 'PC地址段', prop: 'pcIpRange', visible: true },
        { key: 23, label: 'ATM地址段', prop: 'atmIpRange', visible: true },
        { key: 24, label: '监控地址段', prop: 'monitorIpRange', visible: true },
        { key: 25, label: 'WLAN地址段', prop: 'wlanIpRange', visible: true },
        { key: 26, label: '冠字号机具', prop: 'currencyMachineIpRange', visible: true },
        { key: 27, label: '新loopback/32', prop: 'loopbackIp', visible: true },
        { key: 28, label: '同城电信/30', prop: 'telecomCircuitIp', visible: true },
        { key: 29, label: '同城移动/30', prop: 'mobileCircuitIp', visible: true },
        { key: 30, label: '同城联通/30', prop: 'unicomCircuitIp', visible: true },
        { key: 31, label: '同城有线电视/30', prop: 'cableTvCircuitIp', visible: true },
        { key: 32, label: '电信mstp vlan', prop: 'telecomMstpVlan', visible: true },
        { key: 33, label: '移动mstp vlan', prop: 'mobileMstpVlan', visible: true },
        { key: 34, label: '联通mstp vlan', prop: 'unicomMstpVlan', visible: true },
        { key: 35, label: '有线电视mstp vlan', prop: 'cableTvMstpVlan', visible: true },
        { key: 36, label: '主机名', prop: 'hostName', visible: true },
        { key: 37, label: '备注', prop: 'remark', visible: true }
      ],
      // 表单校验
      rules: {
      }
    };
  },
  computed: {
    displayColumns() {
      const visibleColumns = this.columns.filter(col => col.visible && col.key !== 0 && col.prop !== "remark");
      const total = visibleColumns.length;
      const numPerCol = Math.ceil(total / 3); // 每列元素的数量
      
      const columns = [[], [], []];
      
      // 按照每列的数量将元素分配到对应的列
      for (let i = 0; i < total; i++) {
        columns[Math.floor(i / numPerCol)].push(visibleColumns[i]);
      }
      
      return columns;
    }
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询全辖终端IP_准入设备信息列表 */
    getList() {
      this.loading = true;
      listIpaccess(this.queryParams).then(response => {
        this.ipaccessList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    loadIpAccessInfo(data) {
      this.form = { ...data };
      this.getIpaccessInfoOpen = true;
    },
    /** 全辖终端IP准入设备信息详情页*/
    GetIpaccessInfo(row) {
      this.reset();
      const id = row.id
      getIpaccess(id).then((response) => {
        this.form = response.data;
        this.getIpaccessInfoOpen = true;
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
      this.upload.title = "全辖终端IP准入设备信息导入";
      this.upload.open = true;
    },
    /** 下载模板操作 */
    importTemplate() {
      this.download(
        "system/ipaccess/importTemplate",
        {},
        `全辖终端IP准入设备信息_${new Date().getTime()}.xlsx`
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
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        id: null,
        sourceIp: null,
        macAddress: null,
        departmentName: null,
        userName: null,
        networkDevice: null,
        networkDeviceIp: null,
        port: null,
        operatingSystem: null,
        email: null,
        phoneNumber: null,
        branchName: null,
        subBranchName: null,
        device: null,
        deviceName: null,
        deviceType: null,
        assetNumber: null,
        deviceAge: null,
        oldDeviceReplacement: null,
        localNetworkIpRange: null,
        ethernetIp: null,
        gatewayIp: null,
        pcIpRange: null,
        atmIpRange: null,
        monitorIpRange: null,
        wlanIpRange: null,
        currencyMachineIpRange: null,
        loopbackIp: null,
        telecomCircuitIp: null,
        mobileCircuitIp: null,
        unicomCircuitIp: null,
        cableTvCircuitIp: null,
        telecomMstpVlan: null,
        mobileMstpVlan: null,
        unicomMstpVlan: null,
        cableTvMstpVlan: null,
        hostName: null,
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
      this.title = "添加全辖终端IP_准入设备信息";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getIpaccess(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改全辖终端IP_准入设备信息";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateIpaccess(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addIpaccess(this.form).then(response => {
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
        return delIpaccess(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => { });
    },
    // handleDelete(row) {
    //   const ids = row.id || this.ids;
    //   this.$modal.confirm('是否确认删除全辖终端IP_准入设备信息编号为"' + ids + '"的数据项？').then(function() {
    //     return delIpaccess(ids);
    //   }).then(() => {
    //     this.getList();
    //     this.$modal.msgSuccess("删除成功");
    //   }).catch(() => {});
    // },
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
      const fileName = `省行终端服务器_${formattedDate}.xlsx`;

      // 调用下载方法
      this.download('system/ipaccess/export', {
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