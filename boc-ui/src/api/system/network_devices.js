import request from '@/utils/request'

// 查询VLAN管理列表
export function listNetwork_devices(query) {
  return request({
    url: '/system/network_devices/list',
    method: 'get',
    params: query
  })
}

// 查询VLAN管理详细
export function getNetwork_devices(id) {
  return request({
    url: '/system/network_devices/' + id,
    method: 'get'
  })
}

// 新增VLAN管理
export function addNetwork_devices(data) {
  return request({
    url: '/system/network_devices',
    method: 'post',
    data: data
  })
}

// 修改VLAN管理
export function updateNetwork_devices(data) {
  return request({
    url: '/system/network_devices',
    method: 'put',
    data: data
  })
}

// 删除VLAN管理
export function delNetwork_devices(id) {
  return request({
    url: '/system/network_devices/' + id,
    method: 'delete'
  })
}
