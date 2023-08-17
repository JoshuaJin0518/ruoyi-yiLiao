import request from '@/utils/request'

// 查询住院治疗处方表列表
export function listPrescription(query) {
  return request({
    url: '/hushizhan/prescription/list',
    method: 'get',
    params: query
  })
}

// 查询住院治疗处方表详细
export function getPrescription(id) {
  return request({
    url: '/hushizhan/prescription/' + id,
    method: 'get'
  })
}

// 新增住院治疗处方表
export function addPrescription(data) {
  return request({
    url: '/hushizhan/prescription',
    method: 'post',
    data: data
  })
}

// 修改住院治疗处方表
export function updatePrescription(data) {
  return request({
    url: '/hushizhan/prescription',
    method: 'put',
    data: data
  })
}

// 删除住院治疗处方表
export function delPrescription(id) {
  return request({
    url: '/hushizhan/prescription/' + id,
    method: 'delete'
  })
}
