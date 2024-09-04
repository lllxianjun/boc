<template>
  <div>
    <el-row :gutter="20">
      <el-col :span="12">
        <el-card shadow="hover">
          <div class="indexpng">
            <el-carousel trigger="click"  height="600px">
              <el-carousel-item v-for="item in images" :key="item">
                <el-image style="width: 100%; height: 100%" :src="item" fit="cover"></el-image>
              </el-carousel-item>
            </el-carousel>
          </div>
        </el-card>
      </el-col>
      <el-col :span="12">
        <el-card shadow="hover">
          <div id="chart" class="chart"></div>
        </el-card>
      </el-col>
    </el-row>
  </div>
</template>

<script>
import * as echarts from 'echarts'
import { getEcahrts } from '@/api/system/echart';

import image1 from '@/assets/images/index1.jpg';
import image2 from '@/assets/images/index2.jpg';
import image3 from '@/assets/images/index3.jpg';
import image4 from '@/assets/images/index4.jpg';
import image5 from '@/assets/images/index5.jpg';


export default {
  name: 'HomePage',
  data() {
    return {
      // 首页走马灯图片
      images: [image1, image2, image3, image4,image5],
      chartData: []
    };
  },
  mounted() {
    this.fetchData();
  },
  methods: {
    fetchData() {
      getEcahrts()
        .then(response => {
          this.chartData = response.data;
          this.renderChart();
        })
        .catch(error => {
          console.error('Failed to fetch data:', error);
        });
    },
    renderChart() {
      const chart = echarts.init(document.getElementById('chart'));
      const data = this.chartData.map(item => ({
        name: item.name,
        value: item.value
      }));
      // const option = {
      //   // 配置图表的标题
      //   title: {
      //     text: '数据分类统计', // 主标题文字
      //     subtext: 'hnboc', // 副标题文字
      //     left: 'right', // 标题居右对齐
      //     top: '2%' // 标题距离顶部的位置
      //   },
      //   // 配置图表的提示框
      //   tooltip: {
      //     trigger: 'item' // 触发类型为'item'，即触发提示框的条件是鼠标悬停在图表的单个数据项上
      //   },
      //   // 配置图例（即图表的说明文字）
      //   legend: {
      //     top: '3%', // 说明文字位置从顶部向下3%
      //     left: 'left', // 图例的位置
      //     orient: 'vertical', // 图例的布局方向为垂直（竖直）
      //     formatter: name => {
      //       // 自定义图例文字的格式
      //       const item = data.find(d => d.name === name);
      //       return `${name}: ${item ? item.value : 0}`; // 返回格式化后的图例文字
      //     }
      //   },
      //   // 配置图表的数据系列
      //   series: [
      //     {
      //       name: '信息分类统计', // 系列的名称
      //       type: 'pie', // 图表类型为饼图
      //       top: '10%', // 饼图的位置从顶部向下10%
      //       radius: '60%', // 饼图的半径，若['m', 'n%'],从m%到n%，表示内环和外环的范围,可表示圆环
      //       avoidLabelOverlap: false, // 是否避免标签重叠，设置为false表示不避免
      //       itemStyle: {
      //         borderRadius: 10, // 设置饼图每个扇区的圆角半径
      //         borderColor: '#fff', // 扇区的边框颜色为白色
      //         borderWidth: 2 // 扇区的边框宽度为2像素
      //       },
      //       label: {
      //         show: true, // 显示标签
      //         position: 'outside' // 标签位置在扇区外部
      //       },
      //       emphasis: {
      //         label: {
      //           show: true, // 在突出显示时显示标签
      //           fontSize: 20, // 突出显示时标签的字体大小为20
      //           fontWeight: 'bold', // 突出显示时标签的字体加粗
      //           overflow: "break"
      //         }
      //       },
      //       labelLine: {
      //         show: true // 显示标签线
      //       },
      //       data: data // 图表的数据，来自 API 获取的数据
      //     }
      //   ]
      // };
      const option = {
        // 配置图表的标题
        title: {
          text: '数据分类统计', // 主标题文字
          subtext: 'hnboc', // 副标题文字
          left: 'right', // 标题居右对齐
          top: '1%', // 标题距离顶部的位置
          textStyle: {
            fontSize: 24 // 标题文字大小
          },
          subtextStyle: {
            fontSize: 16 // 副标题文字大小
          }
        },
        // 配置图表的提示框
        tooltip: {
          trigger: 'item' // 触发类型为'item'，即触发提示框的条件是鼠标悬停在图表的单个数据项上
        },
        // 配置图例（即图表的说明文字）
        legend: {
          top: '3%', // 说明文字位置从顶部向下10%
          left: 'left', // 图例的位置
          orient: 'vertical', // 图例的布局方向为垂直（竖直）
          formatter: name => {
            // 自定义图例文字的格式
            const item = data.find(d => d.name === name);
            return `${name}: ${item ? item.value : 0}`; // 返回格式化后的图例文字
          }
        },
        // 配置图表的数据系列
        series: [
          {
            name: '信息分类统计', // 系列的名称
            type: 'pie', // 图表类型为饼图
            top: '15%', // 图表位置从顶部向下15%
            right: '3%',
            radius: '59%', // 饼图的半径，若['m', 'n%'],从m%到n%，表示内环和外环的范围,可表示圆环
            avoidLabelOverlap: false, // 是否避免标签重叠，设置为false表示不避免
            itemStyle: {
              borderRadius: 10, // 设置饼图每个扇区的圆角半径
              borderColor: '#fff', // 扇区的边框颜色为白色
              borderWidth: 2 // 扇区的边框宽度为2像素
            },
            label: {
              show: true, // 显示标签
              position: 'outside', // 标签位置在扇区外部
            },
            emphasis: {
              label: {
                show: true, // 在突出显示时显示标签
                fontSize: 20, // 突出显示时标签的字体大小为20
                fontWeight: 'bold', // 突出显示时标签的字体加粗
                width: 150,
                overflow: "break"
              }
            },
            labelLine: {
              show: true // 显示标签线
            },
            data: data // 图表的数据，来自 API 获取的数据
          }
        ]
      };

      chart.setOption(option);
      // 添加点击事件监听器
      chart.on('click', params => {
        this.handleChartClick(params);
      });
    },
    handleChartClick(params) {
      // 根据扇区的名称进行页面跳转
      const name = params.name;
      if (name === '省行终端服务器') {
        this.$router.push({ path: "infoManage/terminal" });
      } else if (name === '全辖终端IP') {
        this.$router.push({ path: "infoManage/ipaccess" });
      } else if (name === '离行ATM及外联单位地址') {
        this.$router.push({ path: "infoManage/atmaddress" });
      } else if (name === '智能柜台、本外币兑换机') {
        this.$router.push({ path: "infoManage/foreignexchange" });
      } else if (name === 'DMZ区应用系统') {
        this.$router.push({ path: "infoManage/dmzapplicationip" });
      }

    }
  }
};
</script>

<style scoped>
.chart {
  width: 100%;
  height: 600px;
}

.indexpng {
  width: 100%;
  height: 600px;
}

</style>
