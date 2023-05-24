<template>
  <div class="about page">
    <div class="hero-txt">
      <h1>阿巴阿巴校园二手交易网</h1>
      <p class="slogan1">年轻人的第一次割韭菜</p>
      <p class="slogan2">吊打阿里巴巴，拳打京东苏宁拼多多，碾压美团</p>
    </div>
    <div class="fucking-description">
      <div class="made-by-love">
        Made by
        <a href="https://github.com/tdiant">tdiant</a>
        with ❤️
      </div>
      <div class="no-sleep-mmp">
        2023年5月25日 通宵一晚亲手开发
      </div>
    </div>
  </div>
</template>

<style lang="scss" scoped>
.about {
  .hero-txt {
    margin-top: 120px;
    text-align: center;
    border: 1px solid #dbdbdb;
    border-radius: 8px;
    box-shadow: var(--el-box-shadow);

    padding: 64px;

    h1 {
      font-size: 1.88rem;
      margin: 10px;
      color: #343434;
    }

    .slogan1 {
      margin: 0;
      padding: 0;
      font-size: 1.4rem;
      color: #343434;
    }

    .slogan2 {
      font-size: 1.11rem;
      margin: 10px;
      padding: 0;
      color: #5f5f5f;
    }
  }

  .fucking-description {
    margin-top: 32px;
    margin-bottom: 512px;

    .made-by-love {
      text-align: center;
      font-size: 1.2rem;

      a {
        text-decoration: none;
        color: #337ecc;
      }
    }

    .no-sleep-mmp {
      text-align: center;
      color: #2a2a2a;
    }
  }
}
</style>
<script setup lang="ts">
</script>