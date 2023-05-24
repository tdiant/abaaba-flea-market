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
</style>

<script>
import AppNav from "@/components/app-nav.vue";

export default {
    components: {
        AppNav
    }
}
</script>