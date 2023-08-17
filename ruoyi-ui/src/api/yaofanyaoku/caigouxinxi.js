import request from '@/utils/request'

// 查询药品采购信息表列表
export function listCaigouxinxi(query) {
  return request({
    url: '/yaofanyaoku/caigouxinxi/list',
    method: 'get',
    params: query
  })
}

// 查询药品采购信息表详细
export function getCaigouxinxi(id) {
  return request({
    url: '/yaofanyaoku/caigouxinxi/' + id,
    method: 'get'
  })
}

// 新增药品采购信息表
export function addCaigouxinxi(data) {
  return request({
    url: '/yaofanyaoku/caigouxinxi',
    method: 'post',
    data: data
  })
}

// 修改药品采购信息表
export function updateCaigouxinxi(data) {
  return request({
    url: '/yaofanyaoku/caigouxinxi',
    method: 'put',
    data: data
  })
}

// 删除药品采购信息表
export function delCaigouxinxi(id) {
  return request({
    url: '/yaofanyaoku/caigouxinxi/' + id,
    method: 'delete'
  })
}
