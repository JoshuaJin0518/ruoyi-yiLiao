import request from '@/utils/request'

// 查询分床记录表列表
export function listSplitbed(query) {
  return request({
    url: '/hushizhan/splitbed/list',
    method: 'get',
    params: query
  })
}

// 查询分床记录表详细
export function getSplitbed(id) {
  return request({
    url: '/hushizhan/splitbed/' + id,
    method: 'get'
  })
}

// 新增分床记录表
export function addSplitbed(data) {
  return request({
    url: '/hushizhan/splitbed',
    method: 'post',
    data: data
  })
}

// 修改分床记录表
export function updateSplitbed(data) {
  return request({
    url: '/hushizhan/splitbed',
    method: 'put',
    data: data
  })
}

// 删除分床记录表
export function delSplitbed(id) {
  return request({
    url: '/hushizhan/splitbed/' + id,
    method: 'delete'
  })
}
