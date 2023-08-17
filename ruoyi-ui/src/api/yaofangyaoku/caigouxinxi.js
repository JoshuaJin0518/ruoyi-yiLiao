import request from '@/utils/request'

// 查询药品采购信息表列表
export function listCaigouxinxi(query) {
  return request({
    url: '/yaofangyaoku/caigouxinxi/list',
    method: 'get',
    params: query
  })
}

// 查询药品采购信息表详细
export function getCaigouxinxi(id) {
  return request({
    url: '/yaofangyaoku/caigouxinxi/' + id,
    method: 'get'
  })
}

// 新增药品采购信息表
export function addCaigouxinxi(data) {
  return request({
    url: '/yaofangyaoku/caigouxinxi',
    method: 'post',
    data: data
  })
}

// 修改药品采购信息表
export function updateCaigouxinxi(data) {
  return request({
    url: '/yaofangyaoku/caigouxinxi',
    method: 'put',
    data: data
  })
}

// 删除药品采购信息表
export function delCaigouxinxi(id) {
  return request({
    url: '/yaofangyaoku/caigouxinxi/' + id,
    method: 'delete'
  })
}
