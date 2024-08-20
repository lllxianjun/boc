import request from '@/utils/request'

// 查询全辖终端IP_准入设备信息列表
export function listIpaccess(query) {
  return request({
    url: '/system/ipaccess/list',
    method: 'get',
    params: query
  })
}

// 查询全辖终端IP_准入设备信息详细
export function getIpaccess(id) {
  return request({
    url: '/system/ipaccess/' + id,
    method: 'get'
  })
}

// 新增全辖终端IP_准入设备信息
export function addIpaccess(data) {
  return request({
    url: '/system/ipaccess',
    method: 'post',
    data: data
  })
}

// 修改全辖终端IP_准入设备信息
export function updateIpaccess(data) {
  return request({
    url: '/system/ipaccess',
    method: 'put',
    data: data
  })
}

// 删除全辖终端IP_准入设备信息
export function delIpaccess(id) {
  return request({
    url: '/system/ipaccess/' + id,
    method: 'delete'
  })
}
