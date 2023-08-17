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
      <el-form-item label="患者状态" prop="personTyoe">
        <el-select v-model="queryParams.personTyoe" placeholder="请选择患者状态" clearable>
          <el-option
            v-for="dict in dict.type.person_type"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="单价" prop="partMoney">
        <el-input
          v-model="queryParams.partMoney"
          placeholder="请输入单价"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="状态" prop="type">
        <el-select v-model="queryParams.type" placeholder="请选择状态" clearable>
          <el-option
            v-for="dict in dict.type.type"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="接诊记录id/医嘱记录id" prop="opDoctorReceiveRecordId">
        <el-input
          v-model="queryParams.opDoctorReceiveRecordId"
          placeholder="医生接诊记录id/医嘱记录id"
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
          v-hasPermi="['menzhenyisheng:action:add']"
        >新增
        </el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['menzhenyisheng:action:edit']"
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
          v-hasPermi="['menzhenyisheng:action:remove']"
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
          v-hasPermi="['menzhenyisheng:action:export']"
        >导出
        </el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="actionList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center"/>
      <el-table-column label="医生id+时间戳" align="center" prop="id">
        <template slot-scope="scope">
          <router-link :to="  {path:'result/',query: { plan: scope.row.id ,status: scope.row.status}}" class="link-type">
            <span>{{ scope.row.id }}</span>
          </router-link>
        </template>
      </el-table-column>
      <el-table-column label="消费事项" align="center" prop="partName"/>
      <el-table-column label="事项数量" align="center" prop="partNumber"/>
      <el-table-column label="患者状态" align="center" prop="personTyoe">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.person_type" :value="scope.row.personTyoe"/>
        </template>
      </el-table-column>
      <el-table-column label="单价" align="center" prop="partMoney"/>
      <el-table-column label="状态" align="center" prop="type">
        <template slot-scope="scope">
          <dict-tag :options="dict.type.type" :value="scope.row.type"/>
        </template>
      </el-table-column>
      <el-table-column label="医生接诊记录id/医嘱记录id" align="center" prop="opDoctorReceiveRecordId"/>
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['menzhenyisheng:action:edit']"
          >修改
          </el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['menzhenyisheng:action:remove']"
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

    <!-- 添加或修改医生看病流程表对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="消费事项" prop="partName">
          <el-input v-model="form.partName" placeholder="请输入消费事项"/>
        </el-form-item>
        <el-form-item label="事项数量" prop="partNumber">
          <el-input v-model="form.partNumber" placeholder="请输入事项数量"/>
        </el-form-item>
        <el-form-item label="患者状态" prop="personTyoe">
          <el-select v-model="form.personTyoe" placeholder="请选择患者状态">
            <el-option
              v-for="dict in dict.type.person_type"
              :key="dict.value"
              :label="dict.label"
              :value="parseInt(dict.value)"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="单价" prop="partMoney">
          <el-input v-model="form.partMoney" placeholder="请输入单价"/>
        </el-form-item>
        <el-form-item label="状态" prop="type">
          <el-select v-model="form.type" placeholder="请选择状态">
            <el-option
              v-for="dict in dict.type.type"
              :key="dict.value"
              :label="dict.label"
              :value="parseInt(dict.value)"
            ></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="医生接诊记录id/医嘱记录id" prop="opDoctorReceiveRecordId">
          <el-input v-model="form.opDoctorReceiveRecordId" placeholder="医生接诊记录id/医嘱记录id"/>
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
import {listAction, getAction, delAction, addAction, updateAction} from "@/api/menzhenyisheng/action";
import {getdoctor} from "@/api/menzhenyisheng/receiverecord";

export default {
  name: "Action",
  dicts: ['person_type', 'type'],
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
      // 医生看病流程表表格数据
      actionList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        partName: null,
        partNumber: null,
        personTyoe: null,
        partMoney: null,
        type: null,
        opDoctorReceiveRecordId: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {}
    };
  },
  created() {
    this.getList();
    let plan = this.$route.query.plan;
    let status = this.$route.query.status;
    console.log(plan);
    if (plan != null) {
      this.open = true;
      this.form.opDoctorReceiveRecordId = plan;
      for(var dict in this.dict.type.person_type){
        console.log(dict)
      }
      // this.form.personTyoe = status
    }
  },
  methods: {
    /** 查询医生看病流程表列表 */
    getList() {
      this.loading = true;
      listAction(this.queryParams).then(response => {
        this.actionList = response.rows;
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
        personTyoe: null,
        partMoney: null,
        type: null,
        opDoctorReceiveRecordId: null
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
      this.title = "添加医生看病流程表";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getAction(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改医生看病流程表";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateAction(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addAction(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除医生看病流程表编号为"' + ids + '"的数据项？').then(function () {
        return delAction(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {
      });
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('menzhenyisheng/action/export', {
        ...this.queryParams
      }, `action_${new Date().getTime()}.xlsx`)
    },
  }
};
</script>
