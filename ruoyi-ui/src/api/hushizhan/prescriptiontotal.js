import request from '@/utils/request'

// 查询住院治疗处方总表列表
export function listPrescriptiontotal(query) {
  return request({
    url: '/hushizhan/prescriptiontotal/list',
    method: 'get',
    params: query
  })
}

// 查询住院治疗处方总表详细
export function getPrescriptiontotal(id) {
  return request({
    url: '/hushizhan/prescriptiontotal/' + id,
    method: 'get'
  })
}

// 新增住院治疗处方总表
export function addPrescriptiontotal(data) {
  return request({
    url: '/hushizhan/prescriptiontotal',
    method: 'post',
    data: data
  })
}

// 修改住院治疗处方总表
export function updatePrescriptiontotal(data) {
  return request({
    url: '/hushizhan/prescriptiontotal',
    method: 'put',
    data: data
  })
}

// 删除住院治疗处方总表
export function delPrescriptiontotal(id) {
  return request({
    url: '/hushizhan/prescriptiontotal/' + id,
    method: 'delete'
  })
}
