import request from '@/utils/request'

// 查询医院烂账记录表列表
export function listDead_bill(query) {
  return request({
    url: '/feiyongguanli/dead_bill/list',
    method: 'get',
    params: query
  })
}

// 查询医院烂账记录表详细
export function getDead_bill(id) {
  return request({
    url: '/feiyongguanli/dead_bill/' + id,
    method: 'get'
  })
}

// 新增医院烂账记录表
export function addDead_bill(data) {
  return request({
    url: '/feiyongguanli/dead_bill',
    method: 'post',
    data: data
  })
}

// 修改医院烂账记录表
export function updateDead_bill(data) {
  return request({
    url: '/feiyongguanli/dead_bill',
    method: 'put',
    data: data
  })
}

// 删除医院烂账记录表
export function delDead_bill(id) {
  return request({
    url: '/feiyongguanli/dead_bill/' + id,
    method: 'delete'
  })
}
