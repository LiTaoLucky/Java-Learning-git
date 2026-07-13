package com.atguigu.a_array;

import java.util.Scanner;

public class Demo03Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //定义一个数组
        int[] arr = new int[3];
        arr[0] = 100;//将100存到了这个数组的0索引上
        arr[1] = 200;
        arr[2] = 300;

        System.out.println("=====================");

        String[] arr2 = new String[3];
        arr2[0] = "张三";
        arr2[1] = "李四";
        arr2[2] = "王五";
    }
}
