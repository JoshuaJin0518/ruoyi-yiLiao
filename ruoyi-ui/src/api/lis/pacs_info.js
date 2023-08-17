import request from '@/utils/request'

// 查询pacs影像信息表列表
export function listPacs_info(query) {
  return request({
    url: '/lis/pacs_info/list',
    method: 'get',
    params: query
  })
}

// 查询pacs影像信息表详细
export function getPacs_info(id) {
  return request({
    url: '/lis/pacs_info/' + id,
    method: 'get'
  })
}

// 新增pacs影像信息表
export function addPacs_info(data) {
  return request({
    url: '/lis/pacs_info',
    method: 'post',
    data: data
  })
}

// 修改pacs影像信息表
export function updatePacs_info(data) {
  return request({
    url: '/lis/pacs_info',
    method: 'put',
    data: data
  })
}

// 删除pacs影像信息表
export function delPacs_info(id) {
  return request({
    url: '/lis/pacs_info/' + id,
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
