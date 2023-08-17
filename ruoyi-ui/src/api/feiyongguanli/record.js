import request from '@/utils/request'

// 查询门诊卡充值记录表列表
export function listRecord(query) {
  return request({
    url: '/feiyongguanli/record/list',
    method: 'get',
    params: query
  })
}

// 查询门诊卡充值记录表详细
export function getRecord(id) {
  return request({
    url: '/feiyongguanli/record/' + id,
    method: 'get'
  })
}

// 新增门诊卡充值记录表
export function addRecord(data) {
  return request({
    url: '/feiyongguanli/record',
    method: 'post',
    data: data
  })
}

// 修改门诊卡充值记录表
export function updateRecord(data) {
  return request({
    url: '/feiyongguanli/record',
    method: 'put',
    data: data
  })
}

// 删除门诊卡充值记录表
export function delRecord(id) {
  return request({
    url: '/feiyongguanli/record/' + id,
    method: 'delete'
  })
}
