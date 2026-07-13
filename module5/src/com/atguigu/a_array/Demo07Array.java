package com.atguigu.a_array;

public class Demo07Array {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr);
        System.out.println(arr[0]);//默认值0
        System.out.println(arr[1]);//默认值0
        System.out.println(arr[2]);//默认值0

        //存数据
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println("===================");

        String[] arr1 = new String[3];
        System.out.println(arr1);
        System.out.println(arr1[0]);//默认值是null
        System.out.println(arr1[1]);//默认值是null
        System.out.println(arr1[2]);//默认值是null

        arr1[0] = "张无忌";
        arr1[1] = "张三丰";
        arr1[2] = "海绵宝宝";
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);

        //数据量大时,使用遍历将元素一个一个获取出来
        System.out.println("==========遍历arr数组==========");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        /*
        快捷键:
            数组名.fori
        */

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
