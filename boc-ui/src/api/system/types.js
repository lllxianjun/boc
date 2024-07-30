import request from '@/utils/request'

// 查询设备类型字典列表
export function listTypes(query) {
  return request({
    url: '/system/types/list',
    method: 'get',
    params: query
  })
}

// 查询设备类型字典详细
export function getTypes(id) {
  return request({
    url: '/system/types/' + id,
    method: 'get'
  })
}

// 新增设备类型字典
export function addTypes(data) {
  return request({
    url: '/system/types',
    method: 'post',
    data: data
  })
}

// 修改设备类型字典
export function updateTypes(data) {
  return request({
    url: '/system/types',
    method: 'put',
    data: data
  })
}

// 删除设备类型字典
export function delTypes(id) {
  return request({
    url: '/system/types/' + id,
    method: 'delete'
  })
}
