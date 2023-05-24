<template>
  <div class="common-layout">
    <el-container>
      <el-header class="app-header">
        <app-nav id="nav"/>
      </el-header>
      <el-main>
        <div class="app-content">
          <router-view/>
        </div>
      </el-main>
      <el-footer class="app-footer">
        <app-footer/>
      </el-footer>
    </el-container>
  </div>
</template>

<style lang="scss" scoped>

.app-header {
  position: fixed;
  width: 100%;
  padding-left: 0;
  padding-right: 0;

  #nav {
    width: 100%;
  }
}

.app-content {
  padding: 3vh;
  height: 100%;
}

.app-footer {
  width: 100%;
  padding-left: 0;
  padding-right: 0;
}
</style>

<script>
import AppNav from "@/components/app-nav.vue";
import AppFooter from "@/components/app-footer.vue";

export default {
  components: {
    AppFooter,
    AppNav
  }
}
</script>