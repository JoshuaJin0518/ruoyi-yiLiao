import request from '@/utils/request'

// 查询医生看病流程表列表
export function listAction(query) {
  return request({
    url: '/menzhenyisheng/action/list',
    method: 'get',
    params: query
  })
}

// 查询医生看病流程表详细
export function getAction(id) {
  return request({
    url: '/menzhenyisheng/action/' + id,
    method: 'get'
  })
}

// 新增医生看病流程表
export function addAction(data) {
  return request({
    url: '/menzhenyisheng/action',
    method: 'post',
    data: data
  })
}

// 修改医生看病流程表
export function updateAction(data) {
  return request({
    url: '/menzhenyisheng/action',
    method: 'put',
    data: data
  })
}

// 删除医生看病流程表
export function delAction(id) {
  return request({
    url: '/menzhenyisheng/action/' + id,
    method: 'delete'
  })
}
/*医生*/
export function getdoctor() {
  return request({
    url: '/doctor',
    method: 'get',
  })
}
