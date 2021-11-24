import { router } from "..";
import { DEFAULT_LAYOUT } from "../constant";
import { AppRouteModule, AppRouteRecordRaw } from "/@/router/types";

export const LoginRoute: AppRouteRecordRaw = {
  name: "Login",
  path: "/login",
  component: () => import("/@/views/login/Login.vue"),
  meta: { title: "Lucian Blog后台管理系统登陆界面", hiddenMenu: true },
};

export const AdminRoutes: AppRouteModule[] = [
  {
    name: "AdminPost",
    path: "/",
    component: DEFAULT_LAYOUT,
    redirect: '/posts',
    meta: {
      title: "文章",
      hiddenMenu: false,
      collection: 'mdi',
      icon: 'account-box'
    },
    children: [
      {
        name: "AdminPostIndex",
        path: "posts",
        component: () => import("/@/views/admin/post/Post.vue"),
        meta: {
          title: "文章一览",
          hiddenMenu: false,
        },
      },
    ],
  },
];
export const basicRoutes = [LoginRoute, ...AdminRoutes];
