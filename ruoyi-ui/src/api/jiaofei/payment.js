import request from '@/utils/request'

// 查询缴费列表
export function listPayment(query) {
  return request({
    url: '/jiaofei/payment/list',
    method: 'get',
    params: query
  })
}

// 查询缴费详细
export function getPayment(id) {
  return request({
    url: '/jiaofei/payment/' + id,
    method: 'get'
  })
}

// 新增缴费
export function addPayment(data) {
  return request({
    url: '/jiaofei/payment',
    method: 'post',
    data: data
  })
}

// 修改缴费
export function updatePayment(data) {
  return request({
    url: '/jiaofei/payment',
    method: 'put',
    data: data
  })
}

// 删除缴费
export function delPayment(id) {
  return request({
    url: '/jiaofei/payment/' + id,
    method: 'delete'
  })
}
