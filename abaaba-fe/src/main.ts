import {createApp} from 'vue'

import App from './App.vue'
import {router} from './router'

import ElementPlus from 'element-plus'
import * as ElementPlusIconsVue from '@element-plus/icons-vue'
import 'element-plus/dist/index.css'

import './main.scss'
import pinia from "@/stores/pinia";

import mavonEditor from 'mavon-editor'
import 'mavon-editor/dist/css/index.css'

const app = createApp(App)

app.use(pinia)
app.use(router)

app.use(ElementPlus)
for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component)
}

app.use(mavonEditor)

app.mount('#app')
