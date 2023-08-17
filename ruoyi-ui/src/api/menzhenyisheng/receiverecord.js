import request from '@/utils/request'

// 查询接诊记录表列表
export function listReceiverecord(query) {
  return request({
    url: '/menzhenyisheng/receiverecord/list',
    method: 'get',
    params: query
  })
}

// 查询接诊记录表详细
export function getReceiverecord(id) {
  return request({
    url: '/menzhenyisheng/receiverecord/' + id,
    method: 'get'
  })
}

// 新增接诊记录表
export function addReceiverecord(data) {
  return request({
    url: '/menzhenyisheng/receiverecord',
    method: 'post',
    data: data
  })
}

// 修改接诊记录表
export function updateReceiverecord(data) {
  return request({
    url: '/menzhenyisheng/receiverecord',
    method: 'put',
    data: data
  })
}

// 删除接诊记录表
export function delReceiverecord(id) {
  return request({
    url: '/menzhenyisheng/receiverecord/' + id,
    method: 'delete'
  })
}

//医生
export function getdoctor() {
  return request({
    url: '/doctor',
    method: 'get',
  })
}


