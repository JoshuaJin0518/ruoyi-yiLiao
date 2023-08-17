import request from '@/utils/request'

// 查询医生看病治疗方案列表
export function listResulthandle(query) {
  return request({
    url: '/menzhenyisheng/resulthandle/list',
    method: 'get',
    params: query
  })
}

// 查询医生看病治疗方案详细
export function getResulthandle(id) {
  return request({
    url: '/menzhenyisheng/resulthandle/' + id,
    method: 'get'
  })
}

// 新增医生看病治疗方案
export function addResulthandle(data) {
  return request({
    url: '/menzhenyisheng/resulthandle',
    method: 'post',
    data: data
  })
}

// 修改医生看病治疗方案
export function updateResulthandle(data) {
  return request({
    url: '/menzhenyisheng/resulthandle',
    method: 'put',
    data: data
  })
}

// 删除医生看病治疗方案
export function delResulthandle(id) {
  return request({
    url: '/menzhenyisheng/resulthandle/' + id,
    method: 'delete'
  })
}

export function partNames() {
  return request({
    url: '/menzhenyisheng/resulthandle/partNames' ,
    method: 'get'
  })
}
export function getDrugById(id) {
  return request({
    url: '/menzhenyisheng/resulthandle/partNames/' +id,
    method: 'get'
  })
}
