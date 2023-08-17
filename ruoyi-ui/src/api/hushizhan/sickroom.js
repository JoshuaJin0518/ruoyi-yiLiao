import request from '@/utils/request'

// 查询病房记录表列表
export function listSickroom(query) {
  return request({
    url: '/hushizhan/sickroom/list',
    method: 'get',
    params: query
  })
}

// 查询病房记录表详细
export function getSickroom(id) {
  return request({
    url: '/hushizhan/sickroom/' + id,
    method: 'get'
  })
}

// 新增病房记录表
export function addSickroom(data) {
  return request({
    url: '/hushizhan/sickroom',
    method: 'post',
    data: data
  })
}

// 修改病房记录表
export function updateSickroom(data) {
  return request({
    url: '/hushizhan/sickroom',
    method: 'put',
    data: data
  })
}

// 删除病房记录表
export function delSickroom(id) {
  return request({
    url: '/hushizhan/sickroom/' + id,
    method: 'delete'
  })
}
