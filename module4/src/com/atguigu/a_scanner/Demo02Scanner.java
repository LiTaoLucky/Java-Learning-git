package com.atguigu.a_scanner;

import java.util.Scanner;//该工作无需我们自己干,idea自己会帮我干

public class Demo02Scanner {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);
        //录入int型整数
        int old1 = sc.nextInt();
        int old2 = sc.nextInt();
        int old3 = sc.nextInt();

        int temp = old1 > old2 ? old1 : old2;
        int max = temp > old3 ? temp : old3;
        System.out.println("年龄最大的是" + max);
    }
}
/*
    scanner使用三步骤
    1.导包
    import java.util.Scanner//该工作无需我们自己干,idea自己会帮我干
    2.创建对象
    Scanner 变量名 = new Scanner(System.in);
    3.调用方法,实现键盘录入
    变量名.nextInt()输入整数int型的
    变量名.next()输入字符串 string型的
 */