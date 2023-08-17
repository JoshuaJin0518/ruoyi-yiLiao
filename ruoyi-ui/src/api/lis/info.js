import request from '@/utils/request'

// 查询pacs影像信息表列表
export function listInfo(query) {
  return request({
    url: '/lis/info/list',
    method: 'get',
    params: query
  })
}

// 查询pacs影像信息表详细
export function getInfo(id) {
  return request({
    url: '/lis/info/' + id,
    method: 'get'
  })
}

// 新增pacs影像信息表
export function addInfo(data) {
  return request({
    url: '/lis/info',
    method: 'post',
    data: data
  })
}

// 修改pacs影像信息表
export function updateInfo(data) {
  return request({
    url: '/lis/info',
    method: 'put',
    data: data
  })
}

// 删除pacs影像信息表
export function delInfo(id) {
  return request({
    url: '/lis/info/' + id,
    method: 'delete'
  })

}
//医生
export function getdoctor() {
  return request({
    url: '/doctor',
    method: 'get',
  })
}//医生
export function getReceiveRecordIds() {
  return request({
    url: '/recordIds',
    method: 'get',
  })
}
