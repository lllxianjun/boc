import request from '@/utils/request'

// 查询海南省地图
export function getHainanMap(){
  return request({
    url: '/assets/MapJson/HainanMap.json' ,
    method: 'get'
  })
}
