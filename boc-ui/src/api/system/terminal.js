import request from '@/utils/request'

// 查询省行终端服务器资产管理列表
export function listTerminal(query) {
  return request({
    url: '/system/terminal/list',
    method: 'get',
    params: query
  })
}

// 查询省行终端服务器资产管理详细
export function getTerminal(id) {
  return request({
    url: '/system/terminal/' + id,
    method: 'get'
  })
}

// 新增省行终端服务器资产管理
export function addTerminal(data) {
  return request({
    url: '/system/terminal',
    method: 'post',
    data: data
  })
}

// 修改省行终端服务器资产管理
export function updateTerminal(data) {
  return request({
    url: '/system/terminal',
    method: 'put',
    data: data
  })
}

// 删除省行终端服务器资产管理
export function delTerminal(id) {
  return request({
    url: '/system/terminal/' + id,
    method: 'delete'
  })
}
