import request from '@/utils/request'

// 查询智能柜台及本外币兑换机IP地址列表
export function listForeignexchange(query) {
  return request({
    url: '/system/foreignexchange/list',
    method: 'get',
    params: query
  })
}

// 查询智能柜台及本外币兑换机IP地址详细
export function getForeignexchange(deviceId) {
  return request({
    url: '/system/foreignexchange/' + deviceId,
    method: 'get'
  })
}

// 新增智能柜台及本外币兑换机IP地址
export function addForeignexchange(data) {
  return request({
    url: '/system/foreignexchange',
    method: 'post',
    data: data
  })
}

// 修改智能柜台及本外币兑换机IP地址
export function updateForeignexchange(data) {
  return request({
    url: '/system/foreignexchange',
    method: 'put',
    data: data
  })
}

// 删除智能柜台及本外币兑换机IP地址
export function delForeignexchange(deviceId) {
  return request({
    url: '/system/foreignexchange/' + deviceId,
    method: 'delete'
  })
}
