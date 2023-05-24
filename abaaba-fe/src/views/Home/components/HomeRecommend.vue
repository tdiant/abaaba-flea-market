<template>
  <div class="home-recommend">
    <div class="block-title">
      <h2>为你推荐</h2>
    </div>
    <div class="recommend-list">
      <div class="recommend-item">
        <home-recommend-item
          class="inner-item"
          style="width: 280px;height:300px;"
          :display-to-right="true"/>
      </div>
      <div class="recommend-item">
        <home-recommend-item
          class="inner-item"
          style="width: 280px;height:300px;"
          :display-to-right="true"/>
      </div>
      <div class="recommend-item">
        <home-recommend-item
          class="inner-item"
          style="width: 280px;height:300px;"
          :display-to-right="false"/>
      </div>
      <div class="recommend-item">
        <home-recommend-item
          class="inner-item"
          style="width: 280px;height:300px;"
          :display-to-right="false"/>
      </div>
      <div class="recommend-item">
        <home-recommend-item
          class="inner-item"
          style="width: 280px;height:300px;"
          :display-to-right="true"/>
      </div>
      <div class="recommend-item">
        <home-recommend-item
          class="inner-item"
          style="width: 280px;height:300px;"
          :display-to-right="true"/>
      </div>
      <div class="recommend-item">
        <home-recommend-item
          class="inner-item"
          style="width: 280px;height:300px;"
          :display-to-right="false"/>
      </div>
      <div class="recommend-item">
        <home-recommend-item
          class="inner-item"
          style="width: 280px;height:300px;"
          :display-to-right="false"/>
      </div>
    </div>
  </div>
</template>

<style lang="scss" scoped>
.home-recommend {
  margin-top: 40px;

  .block-title {
    h2 {
      text-align: center;
      font-size: 1.8rem;
    }
  }

  .recommend-list {
    .recommend-item {
      display: inline-block;
      width: 25%;

      .inner-item {
        margin: 0 auto;
      }
    }
  }
}
</style>

<script>
import HomeRecommendItem from "@/views/Home/components/HomeRecommendItem.vue";

export default {
  name: "HomeRecommend",
  components: {HomeRecommendItem}
}
</script>
