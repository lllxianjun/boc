import request from '@/utils/request'

// 查询表格数据条数
export function getEcahrts(){
  return request({
    url: '/system/echart/echarts' ,
    method: 'get'
  })
}

