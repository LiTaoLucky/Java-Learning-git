package com.atguigu.b_method;

import java.util.Scanner;

public class Demo03Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        method(n);
    }
    public static void method(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println("我是一个经验丰富的java工程师");
        }
    }
}
/*
* 用户输入一个数字,就打印几行这句话
* */