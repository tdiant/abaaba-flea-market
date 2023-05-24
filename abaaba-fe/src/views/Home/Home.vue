<template>
  <div class="home page">
    <home-hero/>
    <home-user-bar/>
    <home-recommend/>
  </div>
</template>

<style lang="scss" scoped>

</style>

<script>
import HomeHero from "@/views/Home/components/HomeHero.vue";
import HomeRecommend from "@/views/Home/components/HomeRecommend.vue";
import HomeUserBar from "@/views/Home/components/HomeUserBar.vue";

export default {
  components: {
    HomeUserBar,
    HomeRecommend,
    HomeHero
  }
}
</script>
