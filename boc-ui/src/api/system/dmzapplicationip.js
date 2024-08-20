import request from '@/utils/request'

// 查询DMZ区应用系统IP列表
export function listDmzapplicationip(query) {
  return request({
    url: '/system/dmzapplicationip/list',
    method: 'get',
    params: query
  })
}

// 查询DMZ区应用系统IP详细
export function getDmzapplicationip(id) {
  return request({
    url: '/system/dmzapplicationip/' + id,
    method: 'get'
  })
}

// 新增DMZ区应用系统IP
export function addDmzapplicationip(data) {
  return request({
    url: '/system/dmzapplicationip',
    method: 'post',
    data: data
  })
}

// 修改DMZ区应用系统IP
export function updateDmzapplicationip(data) {
  return request({
    url: '/system/dmzapplicationip',
    method: 'put',
    data: data
  })
}

// 删除DMZ区应用系统IP
export function delDmzapplicationip(id) {
  return request({
    url: '/system/dmzapplicationip/' + id,
    method: 'delete'
  })
}
