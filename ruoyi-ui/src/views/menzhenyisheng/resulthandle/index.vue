<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="消费事项" prop="partName">
        <el-input
          v-model="queryParams.partName"
          placeholder="请输入消费事项"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="事项数量" prop="partNumber">
        <el-input
          v-model="queryParams.partNumber"
          placeholder="请输入事项数量"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="单价" prop="partMoney">
        <el-input
          v-model="queryParams.partMoney"
          placeholder="请输入单价"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="医生治疗结果id" prop="opDoctorResultId">
        <el-input
          v-model="queryParams.opDoctorResultId"
          placeholder="请输入医生治疗结果id"
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
          disabled
          @click="handleAdd"
          v-hasPermi="['menzhenyisheng:resulthandle:add']"
        >新增
        </el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          disabled
          @click="handleUpdate"
          v-hasPermi="['menzhenyisheng:resulthandle:edit']"
        >修改
        </el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['menzhenyisheng:resulthandle:remove']"
        >删除
        </el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['menzhenyisheng:resulthandle:export']"
        >导出
        </el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="resulthandleList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center"/>
      <el-table-column label="id" align="center" prop="id"/>
      <el-table-column label="消费事项" align="center" prop="partName"/>
      <el-table-column label="事项数量" align="center" prop="partNumber"/>
      <el-table-column label="单价" align="center" prop="partMoney"/>
      <el-table-column label="医生治疗结果id" align="center" prop="opDoctorResultId"/>
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['menzhenyisheng:resulthandle:remove']"
          >删除
          </el-button>
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

    <!-- 添加或修改医生看病治疗方案对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <!--下拉多选-->
        <el-form-item label="消费事项">
          <el-select @change="test123" v-model="form.partName" filterable placeholder="请选择药品">
            <el-option
              v-for="item in partNames"
              :key="item.id"
              :label="item.name"
              :value="item.id"

            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="事项数量" prop="partNumber">
          <el-input v-model="form.partNumber" placeholder="请输入事项数量"/>
        </el-form-item>
        <el-form-item label="单价" prop="partMoney">
          <el-input v-model="form.partMoney" placeholder="请输入事项数量"/>
        </el-form-item>
        <el-form-item label="医生治疗结果id" prop="opDoctorResultId">
          <el-input v-model="form.opDoctorResultId" placeholder="请输入医生治疗结果id"/>
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
import {
  listResulthandle,
  getResulthandle,
  delResulthandle,
  addResulthandle,
  updateResulthandle,
  partNames,
  getDrugById
} from "@/api/menzhenyisheng/resulthandle";

export default {
  name: "Resulthandle",
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
      // 医生看病治疗方案表格数据
      resulthandleList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      //药品
      partNames: [],
      //价格
      pr:"",
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        partName: null,
        partNumber: null,
        partMoney: null,
        opDoctorResultId: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
        partMoney: [
          {required: true, message: "单价不能为空", trigger: "blur"}
        ],
      }
    };
  },
  created() {
    this.getList();
    this.getpartNames();
    let id = this.$route.query.plan;
    if (id != null) {
      this.open = true;
      this.form.opDoctorResultId = id;
    }
  },
  methods: {
    /** 查询医生看病治疗方案列表 */
    getList() {
      this.loading = true;
      listResulthandle(this.queryParams).then(response => {
        this.resulthandleList = response.rows;
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
        partName: null,
        partNumber: null,
        partMoney: null,
        opDoctorResultId: null
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
      this.title = "添加医生看病治疗方案";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getResulthandle(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改医生看病治疗方案";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateResulthandle(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addResulthandle(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除医生看病治疗方案编号为"' + ids + '"的数据项？').then(function () {
        return delResulthandle(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {
      });
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('menzhenyisheng/resulthandle/export', {
        ...this.queryParams
      }, `resulthandle_${new Date().getTime()}.xlsx`)
    },
    getpartNames() {
      partNames().then(response => {
        console.log(response)
        this.partNames = response.data;

      })
    },
    test123(value) {
     //进行药品价格的查询
      getDrugById(value).then(response=>{
       // this.form.partMoney = response.data[0].buyUnitPrice;
       this.$set(this.form,"partMoney",response.data[0].buyUnitPrice);
      })
    }
  }
};
</script>
