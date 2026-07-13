package com.atguigu.a_array;

import java.util.Random;

public class Demo05Array {
    public static void main(String[] args) {
        //定义数组,长度为3
        int[] arr = new int[8];
        //创建Random对象
        Random rd = new Random();
        //在1-9之间随机一个整数,存储到数组中
        /*arr[0] = rd.nextInt(10);
        arr[1] = rd.nextInt(10);
        arr[2] = rd.nextInt(10);*/

        //数组长度是多少,我们就循环多少次
        for(int i=0;i<arr.length;i++){
            arr[i] = rd.nextInt(10);
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
