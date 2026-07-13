package com.atguigu.ternary;

public class Demo03Ternary {
    /*
    仨老人年龄比大小练习
     */
    public static void main(String[] args) {
        int old01 = 70;
        int old02 = 80;
        int old03 = 60;

        int temp = old01 > old02 ? old01 : old02;

        int max = temp > old03 ? temp : old03;
        System.out.println("max = " + max);

    }
}
