<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="药品名称ID" prop="drugsId">
        <el-input
          v-model="queryParams.drugsId"
          placeholder="请输入药品名称ID"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="药品来源" prop="source">
        <el-input
          v-model="queryParams.source"
          placeholder="请输入药品来源"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="产地" prop="address">
        <el-input
          v-model="queryParams.address"
          placeholder="请输入产地"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="批号" prop="batchNumbe">
        <el-input
          v-model="queryParams.batchNumbe"
          placeholder="请输入批号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="生产日期" prop="manufactureTime">
        <el-date-picker clearable
          v-model="queryParams.manufactureTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择生产日期">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="有效日期" prop="termOfValidity">
        <el-date-picker clearable
          v-model="queryParams.termOfValidity"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择有效日期">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="摘要" prop="digest">
        <el-input
          v-model="queryParams.digest"
          placeholder="请输入摘要"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="填制人" prop="FilledBy">
        <el-input
          v-model="queryParams.FilledBy"
          placeholder="请输入填制人"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="核查人" prop="Verifier">
        <el-input
          v-model="queryParams.Verifier"
          placeholder="请输入核查人"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="核查日期" prop="VerificationTime">
        <el-date-picker clearable
          v-model="queryParams.VerificationTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择核查日期">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="审核人" prop="Reviewer">
        <el-input
          v-model="queryParams.Reviewer"
          placeholder="请输入审核人"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="审核日期" prop="AuditTime">
        <el-date-picker clearable
          v-model="queryParams.AuditTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择审核日期">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="数量" prop="no">
        <el-input
          v-model="queryParams.no"
          placeholder="请输入数量"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="操作人" prop="operator">
        <el-input
          v-model="queryParams.operator"
          placeholder="请输入操作人"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
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
          v-hasPermi="['yaofangyaoku:caigouxinxi:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['yaofangyaoku:caigouxinxi:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['yaofangyaoku:caigouxinxi:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['yaofangyaoku:caigouxinxi:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="caigouxinxiList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="随机" align="center" prop="id" />
      <el-table-column label="药品名称ID" align="center" prop="drugsId" />
      <el-table-column label="药品来源" align="center" prop="source" />
      <el-table-column label="产地" align="center" prop="address" />
      <el-table-column label="批号" align="center" prop="batchNumbe" />
      <el-table-column label="生产日期" align="center" prop="manufactureTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.manufactureTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="有效日期" align="center" prop="termOfValidity" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.termOfValidity, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="摘要" align="center" prop="digest" />
      <el-table-column label="填制人" align="center" prop="FilledBy" />
      <el-table-column label="核查人" align="center" prop="Verifier" />
      <el-table-column label="核查日期" align="center" prop="VerificationTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.VerificationTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="审核人" align="center" prop="Reviewer" />
      <el-table-column label="审核日期" align="center" prop="AuditTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.AuditTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="数量" align="center" prop="no" />
      <el-table-column label="操作人" align="center" prop="operator" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['yaofangyaoku:caigouxinxi:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['yaofangyaoku:caigouxinxi:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>

    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改药品采购信息表对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="药品名称ID" prop="drugsId">
          <el-input v-model="form.drugsId" placeholder="请输入药品名称ID" />
        </el-form-item>
        <el-form-item label="药品来源" prop="source">
          <el-input v-model="form.source" placeholder="请输入药品来源" />
        </el-form-item>
        <el-form-item label="产地" prop="address">
          <el-input v-model="form.address" placeholder="请输入产地" />
        </el-form-item>
        <el-form-item label="批号" prop="batchNumbe">
          <el-input v-model="form.batchNumbe" placeholder="请输入批号" />
        </el-form-item>
        <el-form-item label="生产日期" prop="manufactureTime">
          <el-date-picker clearable
            v-model="form.manufactureTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择生产日期">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="有效日期" prop="termOfValidity">
          <el-date-picker clearable
            v-model="form.termOfValidity"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择有效日期">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="摘要" prop="digest">
          <el-input v-model="form.digest" placeholder="请输入摘要" />
        </el-form-item>
        <el-form-item label="数量" prop="no">
          <el-input v-model="form.no" placeholder="请输入数量" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listCaigouxinxi, getCaigouxinxi, delCaigouxinxi, addCaigouxinxi, updateCaigouxinxi } from "@/api/yaofangyaoku/caigouxinxi";

export default {
  name: "Caigouxinxi",
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
      // 药品采购信息表表格数据
      caigouxinxiList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        drugsId: null,
        source: null,
        address: null,
        batchNumbe: null,
        manufactureTime: null,
        termOfValidity: null,
        digest: null,
        FilledBy: null,
        Verifier: null,
        VerificationTime: null,
        Reviewer: null,
        AuditTime: null,
        no: null,
        operator: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
        source: [
          { required: true, message: "药品来源不能为空", trigger: "blur" }
        ],
        address: [
          { required: true, message: "产地不能为空", trigger: "blur" }
        ],
        batchNumbe: [
          { required: true, message: "批号不能为空", trigger: "blur" }
        ],
        manufactureTime: [
          { required: true, message: "生产日期不能为空", trigger: "blur" }
        ],
        termOfValidity: [
          { required: true, message: "有效日期不能为空", trigger: "blur" }
        ],
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询药品采购信息表列表 */
    getList() {
      this.loading = true;
      listCaigouxinxi(this.queryParams).then(response => {
        this.caigouxinxiList = response.rows;
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
        drugsId: null,
        source: null,
        address: null,
        batchNumbe: null,
        manufactureTime: null,
        termOfValidity: null,
        digest: null,
        FilledBy: null,
        Verifier: null,
        VerificationTime: null,
        Reviewer: null,
        AuditTime: null,
        no: null,
        operator: null
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
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加药品采购信息表";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getCaigouxinxi(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改药品采购信息表";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateCaigouxinxi(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addCaigouxinxi(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除药品采购信息表编号为"' + ids + '"的数据项？').then(function() {
        return delCaigouxinxi(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('yaofangyaoku/caigouxinxi/export', {
        ...this.queryParams
      }, `caigouxinxi_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
