package com.atguigu.ternary;

public class Demo02Ternary {
    /*
    俩老人年龄比大小练习
     */
    public static void main(String[] args) {
        int old01 = 70;
        int old02 = 80;

        int max = old01 > old02 ? old01 : old02;
        System.out.println("max = " + max);
    }
}
