<template>
    <el-menu class="app-nav-main"
             :default-active="$router.currentRoute.value.fullPath"
             mode="horizontal"
             router>
        <div class="logo">
            <span>阿巴阿巴二手网</span>
        </div>
        <el-menu-item :class="nowActive===tab?'is-active':''"
                      :index="tab.path"
                      v-for="tab in navTabs">
            <i :class="['btn-icon', 'fa', 'fa-'+tab.icon]"/>
            {{ tab.name }}
        </el-menu-item>
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
</style>

<script>
export default {
    data() {
        return {
            navTabs: [
                {index: 0, name: '首页', path: '/', icon: 'home'}
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
