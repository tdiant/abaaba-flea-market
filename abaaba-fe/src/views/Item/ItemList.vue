<template>
  <div class="item-list page">
    <div class="page-title">
      <h1>物品列表</h1>
    </div>
    <el-row :gutter="40">
      <el-col :span="4">
        <div class="left-catalog">
          <p class="left-title">类别</p>
          <el-menu>
            <el-menu-item>测试</el-menu-item>
            <el-menu-item>测试</el-menu-item>
            <el-menu-item>测试</el-menu-item>
            <el-menu-item>测试</el-menu-item>
            <el-menu-item>测试</el-menu-item>
          </el-menu>
        </div>
      </el-col>
      <el-col :span="20" class="right-list">
        <div class="right-list">
          <div class="item-list">
            <div class="recommend-item">
              <recommend-item class="inner-item" :display-to-right="true"/>
            </div>
            <div class="recommend-item">
              <recommend-item class="inner-item" :display-to-right="true"/>
            </div>
            <div class="recommend-item">
              <recommend-item class="inner-item" :display-to-right="false"/>
            </div>
            <div class="recommend-item">
              <recommend-item class="inner-item" :display-to-right="true"/>
            </div>
            <div class="recommend-item">
              <recommend-item class="inner-item" :display-to-right="true"/>
            </div>
            <div class="recommend-item">
              <recommend-item class="inner-item" :display-to-right="false"/>
            </div>
          </div>
          <div class="bottom-pagination">
            <div class="wrapper">
              <el-pagination
                class="inner-pagination"
                :page-size="20"
                :pager-count="11"
                layout="prev, pager, next"
                :total="1000"
              />
            </div>
          </div>
        </div>
      </el-col>
    </el-row>
  </div>
</template>

<style lang="scss" scoped>
.item-list {
  .page-title {
    text-align: center;
    margin-top: 32px;
    padding: 28px;

    h1 {
      padding: 0;
      margin: 0;
    }
  }

  .left-catalog {
    border-right: 1px solid #bcbcbc;
    padding: 16px 0 16px 0;
    height: 100%;

    .left-title {
      text-align: center;
      margin: 0;
      padding: 8px 0 16px 0;
      color: #555555;
      font-size: 0.96rem;
    }

    .el-menu {
      border-right: none;

      .el-menu-item {
        border-top-left-radius: 8px;
        border-bottom-left-radius: 8px;
      }
    }
  }

  .right-list {
    .item-list {
      .recommend-item {
        display: inline-block;
        width: 28%;
        margin-right: 2%;
        margin-left: 2%;

        .inner-item {
          margin: 0 auto;
          height: 300px;
        }
      }
    }

    .bottom-pagination {
      display: flex;

      .wrapper {
        margin: 0 auto;
        width: auto;
      }

      .inner-pagination {
        margin: 0 auto;
      }
    }
  }
}
</style>

<script>
import RecommendItem from "@/components/RecommendItem.vue";

export default {
  components: {RecommendItem},
  data() {
    return {}
  }
}
</script>
