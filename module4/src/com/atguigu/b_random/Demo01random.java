package com.atguigu.b_random;

import java.util.Random;

public class Demo01random {
    public static void main(String[] args) {

        //创建对象
        Random rd = new Random();

        //在0-0之间随机一个数
        int data1 = rd.nextInt(10);
        System.out.println("data = " + data1);

        System.out.println("======================");

        //在100-999之间随机一个数
        int data2 = rd.nextInt(900) + 100;
        System.out.println("data = " + data2);
    }
}
/*
使用方法与scanner使用方法差不多
 */