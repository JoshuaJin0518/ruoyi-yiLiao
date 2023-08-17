import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listStu(query) {
  return request({
    url: '/system/stu/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getStu(id) {
  return request({
    url: '/system/stu/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addStu(data) {
  return request({
    url: '/system/stu',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateStu(data) {
  return request({
    url: '/system/stu',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delStu(id) {
  return request({
    url: '/system/stu/' + id,
    method: 'delete'
  })
}
