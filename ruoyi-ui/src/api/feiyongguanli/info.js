import request from '@/utils/request'

// 查询门诊卡信息表列表
export function listInfo(query) {
  return request({
    url: '/feiyongguanli/info/list',
    method: 'get',
    params: query
  })
}

// 查询门诊卡信息表详细
export function getInfo(id) {
  return request({
    url: '/feiyongguanli/info/' + id,
    method: 'get'
  })
}

// 新增门诊卡信息表
export function addInfo(data) {
  return request({
    url: '/feiyongguanli/info',
    method: 'post',
    data: data
  })
}

// 修改门诊卡信息表
export function updateInfo(id) {
  return request({
    url: '/feiyongguanli/record/'+id,
    method: 'get',
    data: data
  })
}

// 删除门诊卡信息表
export function delInfo(id) {
  return request({
    url: '/feiyongguanli/info/' + id,
    method: 'delete'
  })
}
//跳转
export function router(id) {
  return request({
    url: '/feiyongguanli/info/' + id,
    method: 'get'
  })
}
