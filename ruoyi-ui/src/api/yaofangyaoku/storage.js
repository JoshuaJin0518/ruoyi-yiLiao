import request from '@/utils/request'

// 查询药库库存表列表
export function listStorage(query) {
  return request({
    url: '/yaofangyaoku/storage/list',
    method: 'get',
    params: query
  })
}

// 查询药库库存表详细
export function getStorage(id) {
  return request({
    url: '/yaofangyaoku/storage/' + id,
    method: 'get'
  })
}

// 新增药库库存表
export function addStorage(data) {
  return request({
    url: '/yaofangyaoku/storage',
    method: 'post',
    data: data
  })
}

// 修改药库库存表
export function updateStorage(data) {
  return request({
    url: '/yaofangyaoku/storage',
    method: 'put',
    data: data
  })
}

// 删除药库库存表
export function delStorage(id) {
  return request({
    url: '/yaofangyaoku/storage/' + id,
    method: 'delete'
  })
}
