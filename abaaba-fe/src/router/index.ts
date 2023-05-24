import {createRouter, createWebHistory} from "vue-router"

import Home from "@/views/Home/Home.vue";
import ItemList from "@/views/Item/ItemList.vue";
import ShoppingCart from "@/views/Record/ShoppingCart.vue";
import About from "@/views/About/About.vue";
import ItemDetails from "@/views/Item/ItemDetails.vue";
import OwnItems from "@/views/Record/OwnItems.vue";
import OrderList from "@/views/Order/OrderList.vue";

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
    },
    {
        path: "/item/:id",
        name: "ItemDetails",
        component: ItemDetails
    },
    {
        path: "/cart",
        name: "ShoppingCart",
        component: ShoppingCart
    },
    {
        path: "/own",
        name: "OwnItems",
        component: OwnItems
    },
    {
        path: "/orders",
        name: "OrderList",
        component: OrderList
    },
    {
        path: "/about",
        name: "About",
        component: About
    }
]

export let router = createRouter({
    history: createWebHistory(import.meta.env.BASE_URL),
    routes
})
