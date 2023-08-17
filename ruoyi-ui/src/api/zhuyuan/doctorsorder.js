import request from '@/utils/request'

// 查询医嘱记录表列表
export function listDoctorsorder(query) {
  return request({
    url: '/zhuyuan/doctorsorder/list',
    method: 'get',
    params: query
  })
}

// 查询医嘱记录表详细
export function getDoctorsorder(id) {
  return request({
    url: '/zhuyuan/doctorsorder/' + id,
    method: 'get'
  })
}

// 新增医嘱记录表
export function addDoctorsorder(data) {
  return request({
    url: '/zhuyuan/doctorsorder',
    method: 'post',
    data: data
  })
}

// 修改医嘱记录表
export function updateDoctorsorder(data) {
  return request({
    url: '/zhuyuan/doctorsorder',
    method: 'put',
    data: data
  })
}

// 删除医嘱记录表
export function delDoctorsorder(id) {
  return request({
    url: '/zhuyuan/doctorsorder/' + id,
    method: 'delete'
  })
}
