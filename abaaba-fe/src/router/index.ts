import {createRouter, createWebHistory} from "vue-router"

import Home from "@/views/Home/Home.vue";

const routes = [
    {
        path: "/",
        name: "home",
        component: Home
    }
]

export let router = createRouter({
    history: createWebHistory(import.meta.env.BASE_URL),
    routes
})
