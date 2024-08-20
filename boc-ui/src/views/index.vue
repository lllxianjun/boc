<template>
  <div>
    <el-row :gutter="20">
      <el-col :span="12">
        <el-card shadow="hover">
          <div id="chart" class="chart"></div>
        </el-card>
      </el-col>
      <el-col :span="12">
        <el-card shadow="hover">
          <div class="placeholder">暂时想不到画什么图表</div>
        </el-card>
      </el-col>
    </el-row>
  </div>
</template>

<script>
import * as echarts from 'echarts'
import { getEcahrts } from '@/api/system/echart';

export default {
  name: 'HomePage',
  data() {
    return {
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
      const option = {
        // 配置图表的标题
        title: {
          text: '数据分类统计', // 主标题文字
          subtext: 'hnboc', // 副标题文字
          left: 'right', // 标题居右对齐
          top: '2%' // 标题距离顶部的位置
        },
        // 配置图表的提示框
        tooltip: {
          trigger: 'item' // 触发类型为'item'，即触发提示框的条件是鼠标悬停在图表的单个数据项上
        },
        // 配置图例（即图表的说明文字）
        legend: {
          top: '3%', // 说明文字位置从顶部向下3%
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
            radius: '60%', // 饼图的半径，若['m', 'n%'],从m%到n%，表示内环和外环的范围,可表示圆环
            avoidLabelOverlap: false, // 是否避免标签重叠，设置为false表示不避免
            itemStyle: {
              borderRadius: 10, // 设置饼图每个扇区的圆角半径
              borderColor: '#fff', // 扇区的边框颜色为白色
              borderWidth: 2 // 扇区的边框宽度为2像素
            },
            label: {
              show: true, // 显示标签
              position: 'outside' // 标签位置在扇区外部
            },
            emphasis: {
              label: {
                show: true, // 在突出显示时显示标签
                fontSize: 20, // 突出显示时标签的字体大小为20
                fontWeight: 'bold' // 突出显示时标签的字体加粗
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
      if (name === '省行楼层终端') {
        this.$router.push({ path: "infoManage/terminal" }); 
      } else if (name === '全辖终端') {
        this.$router.push({ path: "infoManage/ipaccess" }); 
      }else if (name === '离行ATM及外联单位地址') {
        this.$router.push({ path: "infoManage/atmaddress" }); 
      }else if (name === '智能柜台、本外币兑换机') {
        this.$router.push({ path: "infoManage/foreignexchange" }); 
      }else if (name === 'DMZ区应用系统') {
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
  /* 增大图表的高度 */
}

.placeholder {
  width: 100%;
  height: 600px;
  /* 增大占位区域的高度 */
  display: flex;
  align-items: center;
  justify-content: center;
  background-color: #f5f5f5;
  color: #999;
  font-size: 16px;
}
</style>
