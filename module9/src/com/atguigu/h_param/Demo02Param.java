package com.atguigu.h_param;

public class Demo02Param {
    public static void main(String[] args) {
        int[] arr = {10, 20};
        method(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }

    public static void method(int[] arr) {
        arr[0] += 10;
        arr[1] += 20;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
/*引用数据类型做方法参数传递时,本质上传递的是地址值*/