import request from '@/utils/request'

// 查询医嘱执行记录表列表
export function listDoctorsorderhandle(query) {
  return request({
    url: '/hushizhan/doctorsorderhandle/list',
    method: 'get',
    params: query
  })
}

// 查询医嘱执行记录表详细
export function getDoctorsorderhandle(id) {
  return request({
    url: '/hushizhan/doctorsorderhandle/' + id,
    method: 'get'
  })
}

// 新增医嘱执行记录表
export function addDoctorsorderhandle(data) {
  return request({
    url: '/hushizhan/doctorsorderhandle',
    method: 'post',
    data: data
  })
}

// 修改医嘱执行记录表
export function updateDoctorsorderhandle(data) {
  return request({
    url: '/hushizhan/doctorsorderhandle',
    method: 'put',
    data: data
  })
}

// 删除医嘱执行记录表
export function delDoctorsorderhandle(id) {
  return request({
    url: '/hushizhan/doctorsorderhandle/' + id,
    method: 'delete'
  })
}
