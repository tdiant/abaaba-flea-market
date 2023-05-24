import {createRouter, createWebHistory} from "vue-router"

import Home from "@/views/Home/Home.vue";
import ItemList from "@/views/Item/ItemList.vue";

const routes = [
    {
        path: "/",
        name: "Home",
        component: Home
    },
    {
        path: "/items",
        name: "ItemList",
        component: ItemList
    }
]

export let router = createRouter({
    history: createWebHistory(import.meta.env.BASE_URL),
    routes
})
