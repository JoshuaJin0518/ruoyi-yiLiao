import request from '@/utils/request'

// 查询药品列表
export function listYaopin(query) {
  return request({
    url: '/rouyi_yaopin/yaopin/list',
    method: 'get',
    params: query
  })
}

// 查询药品详细
export function getYaopin(id) {
  return request({
    url: '/rouyi_yaopin/yaopin/' + id,
    method: 'get'
  })
}

// 新增药品
export function addYaopin(data) {
  return request({
    url: '/rouyi_yaopin/yaopin',
    method: 'post',
    data: data
  })
}

// 修改药品
export function updateYaopin(data) {
  return request({
    url: '/rouyi_yaopin/yaopin',
    method: 'put',
    data: data
  })
}

// 删除药品
export function delYaopin(id) {
  return request({
    url: '/rouyi_yaopin/yaopin/' + id,
    method: 'delete'
  })
}
