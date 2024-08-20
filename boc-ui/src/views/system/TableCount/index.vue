<template>
  <div>
    <el-card>
      <div id="chart" style="width: 600px; height: 400px;"></div>
    </el-card>
  </div>
</template>

<script>
import * as echarts from 'echarts'
import { getEcahrts } from '@/api/system/echart';

export default {
  name: 'TableCountChart',
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
      // axios.get('/system/echart/echarts')
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
        title: {
          text: 'Table Data Count Distribution',
          subtext: 'Data from different tables',
          left: 'center'
        },
        tooltip: {
          trigger: 'item'
        },
        legend: {
          orient: 'vertical',
          left: 'left'
        },
        series: [
          {
            name: 'Table Count',
            type: 'pie',
            radius: '50%',
            data: data,
            emphasis: {
              itemStyle: {
                shadowBlur: 10,
                shadowOffsetX: 0,
                shadowColor: 'rgba(0, 0, 0, 0.5)'
              }
            }
          }
        ]
      };
      chart.setOption(option);
    }
  }
};
</script>

<style scoped>
#chart {
  width: 600px;
  height: 400px;
}
</style>
