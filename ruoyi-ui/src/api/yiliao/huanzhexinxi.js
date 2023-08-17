import request from '@/utils/request'

// 查询患者信息列表
export function listHuanzhexinxi(query) {
  return request({
    url: '/yiliao/huanzhexinxi/list',
    method: 'get',
    params: query
  })
}

// 查询患者信息详细
export function getHuanzhexinxi(id) {
  return request({
    url: '/yiliao/huanzhexinxi/' + id,
    method: 'get'
  })
}

// 新增患者信息
export function addHuanzhexinxi(data) {
  return request({
    url: '/yiliao/huanzhexinxi',
    method: 'post',
    data: data
  })
}

// 修改患者信息
export function updateHuanzhexinxi(data) {
  return request({
    url: '/yiliao/huanzhexinxi',
    method: 'put',
    data: data
  })
}

// 删除患者信息
export function delHuanzhexinxi(id) {
  return request({
    url: '/yiliao/huanzhexinxi/' + id,
    method: 'delete'
  })
}
