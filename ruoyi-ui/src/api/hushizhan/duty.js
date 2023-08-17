import request from '@/utils/request'

// 查询病房值班记录表列表
export function listDuty(query) {
  return request({
    url: '/hushizhan/duty/list',
    method: 'get',
    params: query
  })
}

// 查询病房值班记录表详细
export function getDuty(id) {
  return request({
    url: '/hushizhan/duty/' + id,
    method: 'get'
  })
}

// 新增病房值班记录表
export function addDuty(data) {
  return request({
    url: '/hushizhan/duty',
    method: 'post',
    data: data
  })
}

// 修改病房值班记录表
export function updateDuty(data) {
  return request({
    url: '/hushizhan/duty',
    method: 'put',
    data: data
  })
}

// 删除病房值班记录表
export function delDuty(id) {
  return request({
    url: '/hushizhan/duty/' + id,
    method: 'delete'
  })
}
