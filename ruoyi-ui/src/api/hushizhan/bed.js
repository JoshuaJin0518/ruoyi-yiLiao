import request from '@/utils/request'

// 查询床位记录表列表
export function listBed(query) {
  return request({
    url: '/hushizhan/bed/list',
    method: 'get',
    params: query
  })
}

// 查询床位记录表详细
export function getBed(id) {
  return request({
    url: '/hushizhan/bed/' + id,
    method: 'get'
  })
}

// 新增床位记录表
export function addBed(data) {
  return request({
    url: '/hushizhan/bed',
    method: 'post',
    data: data
  })
}

// 修改床位记录表
export function updateBed(data) {
  return request({
    url: '/hushizhan/bed',
    method: 'put',
    data: data
  })
}

// 删除床位记录表
export function delBed(id) {
  return request({
    url: '/hushizhan/bed/' + id,
    method: 'delete'
  })
}
