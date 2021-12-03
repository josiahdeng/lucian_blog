import axios, { AxiosInstance } from "axios";
import { ElMessage } from "element-plus";
import {stroage} from "/@/stroage"
const instance: AxiosInstance = axios.create();

// instance.defaults.headers.common['Authorization'] = stroage.getters.getToken;

// 请求拦截器
instance.interceptors.request.use(config => {
    if (stroage.getters.getToken && config.headers && config.headers.common)
    config.headers.common['Authorization'] = stroage.getters.getToken;
    return config;
})
// 响应拦截器
instance.interceptors.response.use(response => {
    if (response.data.code !== 200) {
        ElMessage.error({message: response.data.message});
        return;
    }

    if (response.data.message){
        ElMessage.success({message: response.data.message});
    }
    return response.data;
}, error => {
    ElMessage.error({message: '请求错误！'});
});

export const postRequest = (url: string, params?: object) => {
    return instance.post(url, params);
}

export const getRequest = (url: string, params?:object) => {
    return instance.get(url, {params: params});
}

export const deleteRequest = (url: string) => {
    return instance.delete(url)
}
