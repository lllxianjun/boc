import request from '@/utils/request'

// 查询IP所在区域字典列表
export function listAreas(query) {
  return request({
    url: '/system/areas/list',
    method: 'get',
    params: query
  })
}

// 查询IP所在区域字典详细
export function getAreas(id) {
  return request({
    url: '/system/areas/' + id,
    method: 'get'
  })
}

// 新增IP所在区域字典
export function addAreas(data) {
  return request({
    url: '/system/areas',
    method: 'post',
    data: data
  })
}

// 修改IP所在区域字典
export function updateAreas(data) {
  return request({
    url: '/system/areas',
    method: 'put',
    data: data
  })
}

// 删除IP所在区域字典
export function delAreas(id) {
  return request({
    url: '/system/areas/' + id,
    method: 'delete'
  })
}
