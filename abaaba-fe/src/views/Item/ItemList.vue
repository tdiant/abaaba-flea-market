<template>
  <div class="item-list">
    <div class="page-title">
      <h1>物品列表</h1>
    </div>
    <el-row>
      <el-col :span="4">
        <el-menu>

        </el-menu>
      </el-col>
      <el-col :span="20">
        right
      </el-col>
    </el-row>
  </div>
</template>

<style lang="scss" scoped>
.item-list {
  .page-title {
    text-align: center;
    padding: 28px;
    margin-top: 32px;

    h1 {
      padding: 0;
      margin: 0;
    }
  }
}
</style>

<script>
export default {
  data() {
    return {}
  }
}
</script>
