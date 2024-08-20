import request from '@/utils/request'

// 查询离行ATM及外联单位地址列表
export function listAtmaddress(query) {
  return request({
    url: '/system/atmaddress/list',
    method: 'get',
    params: query
  })
}

// 查询离行ATM及外联单位地址详细
export function getAtmaddress(id) {
  return request({
    url: '/system/atmaddress/' + id,
    method: 'get'
  })
}

// 新增离行ATM及外联单位地址
export function addAtmaddress(data) {
  return request({
    url: '/system/atmaddress',
    method: 'post',
    data: data
  })
}

// 修改离行ATM及外联单位地址
export function updateAtmaddress(data) {
  return request({
    url: '/system/atmaddress',
    method: 'put',
    data: data
  })
}

// 删除离行ATM及外联单位地址
export function delAtmaddress(id) {
  return request({
    url: '/system/atmaddress/' + id,
    method: 'delete'
  })
}
