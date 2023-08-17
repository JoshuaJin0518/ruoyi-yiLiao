import request from '@/utils/request'

// 查询药房库存表列表
export function listPharmacy(query) {
  return request({
    url: '/yaofangyaoku/pharmacy/list',
    method: 'get',
    params: query
  })
}

// 查询药房库存表详细
export function getPharmacy(id) {
  return request({
    url: '/yaofangyaoku/pharmacy/' + id,
    method: 'get'
  })
}

// 新增药房库存表
export function addPharmacy(data) {
  return request({
    url: '/yaofangyaoku/pharmacy',
    method: 'post',
    data: data
  })
}

// 修改药房库存表
export function updatePharmacy(data) {
  return request({
    url: '/yaofangyaoku/pharmacy',
    method: 'put',
    data: data
  })
}

// 删除药房库存表
export function delPharmacy(id) {
  return request({
    url: '/yaofangyaoku/pharmacy/' + id,
    method: 'delete'
  })
}
