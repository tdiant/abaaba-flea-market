<template>
  <div class="home-user-bar">
    <div class="user-data">
      <p class="welcome">欢迎你，Username！</p>
      <p class="company-day-cnt">阿巴阿巴已经陪伴你114514天</p>
    </div>
    <div class="quick-buttons">
      <div class="button">
        <i class="icon fa fa-pencil"/>
        <p class="title">发布闲置</p>
      </div>
      <div class="button">
        <i class="icon fa fa-shopping-cart"/>
        <p class="title">购物车</p>
      </div>
      <div class="button">
        <i class="icon fa fa-book"/>
        <p class="title">购买记录</p>
      </div>
      <div class="button">
        <i class="icon fa fa-user"/>
        <p class="title">个人信息</p>
      </div>
    </div>
  </div>
</template>

<style lang="scss" scoped>
.home-user-bar {
  margin-top: 20px;
  border: 1px solid #e9e9e9;
  border-radius: 6px;
  box-shadow: var(--el-box-shadow-lighter);
  padding: 20px;

  display: flex;
  justify-content: center;
  justify-items: center;

  .user-data {
    width: 50%;

    display: flex;
    flex-direction: column;
    justify-content: center;
    padding-left: 10px;

    p {
      margin: 0;
      padding: 0;
    }

    .welcome {
      font-size: 1.4rem;
    }

    .company-day-cnt {
      font-size: 1rem;
      margin-top: 3px;
    }
  }

  .quick-buttons {
    width: 100%;

    display: flex;
    justify-content: right;
    align-items: center;

    .button {
      text-align: center;
      margin-left: 32px;
      padding: 8px 6px 0 6px;

      cursor: pointer;

      &:hover {
        background: #e9e9e9;
        border-radius: 8px;
        box-shadow: var(--el-box-shadow-lighter);
        color: #337ecc;

        transition-property: color, background-color;
        transition-duration: 0.18s, 0.18s;

        .icon {
          border: 2px solid #337ecc;
        }

        .title {
          color: #337ecc;
          font-weight: bold;
          transition-property: color, font-weight;
          transition-duration: 0.18s, 0.2s;
        }
      }

      .icon {
        font-size: 1.6rem;
        padding: 14px;
        border-radius: 50%;
        width: 32px;
        height: 32px;
        line-height: 32px;
        border: 2px solid #969696;
      }

      .title {
        font-size: 0.88rem;
        margin: 6px;
        padding: 0;
        color: #575757;
      }
    }
  }
}
</style>

<script>
export default {
  name: "HomeUserBar"
}
</script>
