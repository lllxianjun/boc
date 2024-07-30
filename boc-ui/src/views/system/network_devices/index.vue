<template>
  <div class="app-container">
    <el-form
      :model="queryParams"
      ref="queryForm"
      size="small"
      :inline="true"
      v-show="showSearch"
      label-width="68px"
    >
      <el-form-item label="IP地址" prop="ipAddress">
        <el-input
          v-model="queryParams.ipAddress"
          placeholder="请输入设备的IP地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <!-- <el-form-item label="MAC地址" prop="macAddress">
        <el-input
          v-model="queryParams.macAddress"
          placeholder="请输入设备的MAC地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="接入设备名称" prop="accessDeviceName">
        <el-input
          v-model="queryParams.accessDeviceName"
          placeholder="请输入接入设备名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="接入设备IP" prop="accessDeviceIp">
        <el-input
          v-model="queryParams.accessDeviceIp"
          placeholder="请输入接入设备IP"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="端口号" prop="portNumber">
        <el-input
          v-model="queryParams.portNumber"
          placeholder="请输入设备连接的端口号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item> -->
      <el-form-item label-width="86px" label="IP所在区域" prop="ipAreaId">
        <el-select
          v-model="queryParams.ipAreaId"
          placeholder="请选择IP所在区域"
          clearable
        >
          <el-option
            v-for="dict in dict.type.ip_areas"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <!-- <el-form-item label="归属机构" prop="organization">
        <el-input
          v-model="queryParams.organization"
          placeholder="请输入归属机构"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="负责人" prop="personInCharge">
        <el-input
          v-model="queryParams.personInCharge"
          placeholder="请输入负责人"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item> -->
      <el-form-item label="设备类型" prop="deviceTypeId">
        <el-select
          v-model="queryParams.deviceTypeId"
          placeholder="请选择设备类型"
          clearable
        >
          <el-option
            v-for="dict in dict.type.device_type"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <!-- <el-form-item label="终端用途" prop="devicePurpose">
        <el-input
          v-model="queryParams.devicePurpose"
          placeholder="请输入设备的终端用途"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item> -->
      <el-form-item>
        <el-button
          type="primary"
          icon="el-icon-search"
          size="mini"
          @click="handleQuery"
          >搜索</el-button
        >
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery"
          >重置</el-button
        >
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['system:network_devices:add']"
          >新增</el-button
        >
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['system:network_devices:edit']"
          >修改</el-button
        >
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['system:network_devices:remove']"
          >删除</el-button
        >
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:network_devices:export']"
          >导出</el-button
        >
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="info"
          plain
          icon="el-icon-upload2"
          size="mini"
          @click="handleImport"
          v-hasPermi="['system:network_devices:import']"
          >导入</el-button
        >
      </el-col>
      <right-toolbar
        :showSearch.sync="showSearch"
        @queryTable="getList"
      ></right-toolbar>
    </el-row>

    <el-table
      v-loading="loading"
      :data="network_devicesList"
      @selection-change="handleSelectionChange"
    >
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="序号" type="index" align="center" prop="id" />
      <el-table-column label="IP地址" align="center" prop="ipAddress" />
      <el-table-column label="MAC地址" align="center" prop="macAddress" />
      <el-table-column
        label="接入设备名称"
        align="center"
        prop="accessDeviceName"
      />
      <el-table-column
        label="接入设备IP"
        align="center"
        prop="accessDeviceIp"
      />
      <el-table-column label="端口号" align="center" prop="portNumber" />
      <el-table-column label="IP所在区域" align="center" prop="ipAreaId">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.ip_areas" :value="scope.row.ipAreaId" />
        </template>
      </el-table-column>
      <el-table-column label="归属机构" align="center" prop="organization" />
      <el-table-column label="负责人" align="center" prop="personInCharge" />
      <el-table-column label="设备类型" align="center" prop="deviceTypeId">
        <template slot-scope="scope">
          <dict-tag
            :options="dict.type.device_type"
            :value="scope.row.deviceTypeId"
          />
        </template>
      </el-table-column>
      <el-table-column label="终端用途" align="center" prop="devicePurpose" />
      <el-table-column label="备注" align="center" prop="remark" />
      <el-table-column
        label="操作"
        align="center"
        class-name="small-padding fixed-width"
      >
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:network_devices:edit']"
            >修改</el-button
          >
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:network_devices:remove']"
            >删除</el-button
          >
        </template>
      </el-table-column>
    </el-table>

    <pagination
      v-show="total > 0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改VLAN管理对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="IP地址" prop="ipAddress">
          <el-input v-model="form.ipAddress" placeholder="请输入设备的IP地址" />
        </el-form-item>
        <el-form-item label="MAC地址" prop="macAddress">
          <el-input
            v-model="form.macAddress"
            placeholder="请输入设备的MAC地址"
          />
        </el-form-item>
        <el-form-item label="设备名称" prop="accessDeviceName">
          <el-input
            v-model="form.accessDeviceName"
            placeholder="请输入接入设备名称"
          />
        </el-form-item>
        <el-form-item label="设备IP" prop="accessDeviceIp">
          <el-input
            v-model="form.accessDeviceIp"
            placeholder="请输入接入设备IP"
          />
        </el-form-item>
        <el-form-item label="端口号" prop="portNumber">
          <el-input
            v-model="form.portNumber"
            placeholder="请输入设备连接的端口号"
          />
        </el-form-item>
        <el-form-item label="IP所在区域" prop="ipAreaId">
          <el-select v-model="form.ipAreaId" placeholder="请选择IP所在区域">
            <el-option
              v-for="dict in dict.type.ip_areas"
              :key="dict.value"
              :label="dict.label"
              :value="parseInt(dict.value)"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="归属机构" prop="organization">
          <el-input v-model="form.organization" placeholder="请输入归属机构" />
        </el-form-item>
        <el-form-item label="负责人" prop="personInCharge">
          <el-input v-model="form.personInCharge" placeholder="请输入负责人" />
        </el-form-item>
        <el-form-item label="设备类型" prop="deviceTypeId">
          <el-select v-model="form.deviceTypeId" placeholder="请选择设备类型">
            <el-option
              v-for="dict in dict.type.device_type"
              :key="dict.value"
              :label="dict.label"
              :value="parseInt(dict.value)"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="终端用途" prop="devicePurpose">
          <el-input
            v-model="form.devicePurpose"
            placeholder="请输入设备的终端用途"
          />
        </el-form-item>
        <el-form-item label="备注" prop="remark">
          <el-input
            v-model="form.remark"
            type="textarea"
            placeholder="请输入内容"
          />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
    <!-- 用户导入对话框 -->
    <el-dialog :title="upload.title" :visible.sync="upload.open" width="400px" append-to-body>
      <el-upload
        ref="upload"
        :limit="1"
        accept=".xlsx, .xls"
        :headers="upload.headers"
        :action="upload.url + '?updateSupport=' + upload.updateSupport"
        :disabled="upload.isUploading"
        :on-progress="handleFileUploadProgress"
        :on-success="handleFileSuccess"
        :auto-upload="false"
        drag
      >
        <i class="el-icon-upload"></i>
        <div class="el-upload__text">将文件拖到此处，或<em>点击上传</em></div>
        <div class="el-upload__tip text-center" slot="tip">
          <div class="el-upload__tip" slot="tip">
            <el-checkbox v-model="upload.updateSupport" /> 是否更新已经存在的用户数据
          </div>
          <span>仅允许导入xls、xlsx格式文件。</span>
          <el-link type="primary" :underline="false" style="font-size:12px;vertical-align: baseline;" @click="importTemplate">下载模板</el-link>
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
import {
  listNetwork_devices,
  getNetwork_devices,
  delNetwork_devices,
  addNetwork_devices,
  updateNetwork_devices,
} from "@/api/system/network_devices";
import { getToken } from "@/utils/auth";

export default {
  name: "Network_devices",
  dicts: ["ip_areas", "device_type"],
  data() {
    return {
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
      // VLAN管理表格数据
      network_devicesList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        ipAddress: null,
        macAddress: null,
        accessDeviceName: null,
        accessDeviceIp: null,
        portNumber: null,
        ipAreaId: null,
        organization: null,
        personInCharge: null,
        deviceTypeId: null,
        devicePurpose: null,
        remark: null,
      },
      // 用户导入参数
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
        url: process.env.VUE_APP_BASE_API + "/system/network_devices/importData",
      },

      // 表单参数
      form: {},
      // 表单校验
      rules: {},
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询VLAN管理列表 */
    getList() {
      this.loading = true;
      listNetwork_devices(this.queryParams).then((response) => {
        debugger
        this.network_devicesList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
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
        macAddress: null,
        accessDeviceName: null,
        accessDeviceIp: null,
        portNumber: null,
        ipAreaId: null,
        organization: null,
        personInCharge: null,
        deviceTypeId: null,
        devicePurpose: null,
        createBy: null,
        createTime: null,
        updateBy: null,
        updateTime: null,
        remark: null,
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
      this.ids = selection.map((item) => item.id);
      this.single = selection.length !== 1;
      this.multiple = !selection.length;
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加VLAN管理";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids;
      getNetwork_devices(id).then((response) => {
        this.form = response.data;
        this.open = true;
        this.title = "修改VLAN管理";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate((valid) => {
        if (valid) {
          if (this.form.id != null) {
            updateNetwork_devices(this.form).then((response) => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addNetwork_devices(this.form).then((response) => {
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
      this.$modal
        .confirm('是否确认删除此数据项？')
        .then(function () {
          return delNetwork_devices(ids);
        })
        .then(() => {
          this.getList();
          this.$modal.msgSuccess("删除成功");
        })
        .catch(() => {});
    },
    /** 导入按钮操作 */
    handleImport() {
      this.upload.title = "用户导入";
      this.upload.open = true;
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download(
        "system/network_devices/export",
        {
          ...this.queryParams,
        },
        `network_devices_${new Date().getTime()}.xlsx`
      );
    },
    /** 导入按钮操作 */
    handleImport() {
      this.upload.title = "用户导入";
      this.upload.open = true;
    },
    /** 下载模板操作 */
    importTemplate() {
      this.download(
        "system/network_devices/importTemplate",
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
  },
};
</script>
