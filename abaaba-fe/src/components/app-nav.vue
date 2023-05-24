<template>
  <el-menu class="app-nav-main"
           :default-active="$router.currentRoute.value.fullPath"
           mode="horizontal"
           :ellipsis="false"
           router>
    <el-menu-item class="logo">
      <span>阿巴阿巴二手网</span>
    </el-menu-item>
    <el-menu-item :class="nowActive===tab?'is-active':''"
                  :index="tab.path"
                  v-for="tab in navTabs">
      <i :class="['btn-icon', 'fa', 'fa-'+tab.icon]"/>
      {{ tab.name }}
    </el-menu-item>
    <div class="flex-grow" style="flex-grow: 1"/>
    <el-sub-menu index="/user">
      <template #title>
        <i class="user-icon fa fa-user-circle-o"/>
        Username
      </template>
      <el-menu-item index="2-1">用户资料</el-menu-item>
      <el-menu-item index="2-2">用户设置</el-menu-item>
      <el-menu-item index="2-3">退出登录</el-menu-item>
    </el-sub-menu>
  </el-menu>
</template>

<style lang="scss" scoped>
.app-nav-main {
  width: 100%;
}

.logo {
  font-size: 20px;
  display: flex;
  justify-content: center;
  align-items: center;
  align-content: center;
  padding-left: 18px;
  padding-right: 18px;
  cursor: pointer;
}

.el-menu {
  border-right: none !important;
}

.el-menu-item {
  &.is-active {
    background: #d9ecff;
    color: #337ecc;
    font-weight: 800;
  }

  &.is-active:hover {
    background: #e7f2ff;
  }

  &:hover {
    background: #e9e9eb;
  }
}

.user-icon {
  margin-right: 8px;
}
</style>

<script>
export default {
  data() {
    return {
      navTabs: [
        {index: 0, name: '首页', path: '/', icon: 'home'},
        {index: 1, name: '物品合集', path: '/items', icon: 'archive'},
        {index: 2, name: '购物车', path: '/cart', icon: 'shopping-cart'},
        {index: 3, name: '记录', path: '/record', icon: 'book'},
        {index: 3, name: '我的商品', path: '/my-own', icon: 'bullseye'},
        {index: 3, name: '帮助&关于', path: '/about', icon: 'question-circle'},
      ]
    }
  },
  computed: {
    nowActive() {
      let result = this.navTabs[0]
      let routePath = this.$route.path

      for (let i = 0; i < this.navTabs.length; i++) {
        let u = this.navTabs[i]
        let url = u.path
        if (routePath.startsWith(url)) {
          result = u
        }
      }
      return result
    }
  }
}
</script>
