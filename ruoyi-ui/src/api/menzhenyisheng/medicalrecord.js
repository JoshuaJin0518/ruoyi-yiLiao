import request from '@/utils/request'

// 查询门诊病历表列表
export function listMedicalrecord(query) {
  return request({
    url: '/menzhenyisheng/medicalrecord/list',
    method: 'get',
    params: query
  })
}

// 查询门诊病历表详细
export function getMedicalrecord(id) {
  return request({
    url: '/menzhenyisheng/medicalrecord/' + id,
    method: 'get'
  })
}

// 新增门诊病历表
export function addMedicalrecord(data) {
  return request({
    url: '/menzhenyisheng/medicalrecord',
    method: 'post',
    data: data
  })
}

// 修改门诊病历表
export function updateMedicalrecord(data) {
  return request({
    url: '/menzhenyisheng/medicalrecord',
    method: 'put',
    data: data
  })
}

// 删除门诊病历表
export function delMedicalrecord(id) {
  return request({
    url: '/menzhenyisheng/medicalrecord/' + id,
    method: 'delete'
  })
}
