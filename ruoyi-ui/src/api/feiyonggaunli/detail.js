import request from '@/utils/request'

// 查询患者费用明细表列表
export function listDetail(query) {
  return request({
    url: '/feiyonggaunli/detail/list',
    method: 'get',
    params: query
  })
}

// 查询患者费用明细表详细
export function getDetail(id) {
  return request({
    url: '/feiyonggaunli/detail/' + id,
    method: 'get'
  })
}

// 新增患者费用明细表
export function addDetail(data) {
  return request({
    url: '/feiyonggaunli/detail',
    method: 'post',
    data: data
  })
}

// 修改患者费用明细表
export function updateDetail(data) {
  return request({
    url: '/feiyonggaunli/detail',
    method: 'put',
    data: data
  })
}

// 删除患者费用明细表
export function delDetail(id) {
  return request({
    url: '/feiyonggaunli/detail/' + id,
    method: 'delete'
  })
}
