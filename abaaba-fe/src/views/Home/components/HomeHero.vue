<template>
  <div class="home-hero">
    <div class="txt">
      <h1 class="hero-h1">欢迎访问阿巴阿巴校园二手网</h1>
      <p class="hero-h2">欢迎在此发布与交易校内闲置物品信息</p>
      <p class="hero-h3">吊打阿里巴巴争做世界第一，反正这个作业老师估计也不看，我爱说啥说啥</p>
    </div>
  </div>
</template>

<style lang="scss" scoped>
.home-hero {
  margin-top: 40px;
  background: #eeeeee;
  height: 200px;
  border-radius: 6px;
  padding: 20px;
  border: 1px solid #dfdfdf;
  box-shadow: var(--el-box-shadow-light);

  text-align: center;

  display: flex;
  flex-direction: column;
  justify-content: center;

  h1, p {
    padding: 0;
    margin: 0;
  }

  .hero-h1 {
    margin: 6px;
    font-size: 1.8rem;
    color: #303030;
  }

  .hero-h2 {
    margin: 3px;
    font-size: 1.2rem;
    color: #404040;
  }

  .hero-h3 {
    margin: 2px;
    font-size: 1rem;
    color: #616161;
  }
}
</style>

<script>
export default {
  name: "HomeHero",
  data() {
    return {}
  }
}
</script>
