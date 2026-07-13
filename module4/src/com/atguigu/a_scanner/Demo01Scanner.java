package com.atguigu.a_scanner;

import java.util.Scanner;//该工作无需我们自己干,idea自己会帮我干

public class Demo01Scanner {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);
        //录入int型整数
        int data1 = sc.nextInt();
        System.out.println("datal = " + data1);

        //录入String字符串
        String data2 = sc.next();
        System.out.println("data2 = " + data2);
    }
}
/*
    scanner是java自带的一个类,直接导入即可使用

    scanner使用三步骤
    1.导包
    import java.util.Scanner//该工作无需我们自己干,idea自己会帮我干
    2.创建对象
    Scanner 变量名 = new Scanner(System.in);
    3.调用方法,实现键盘录入
    变量名.nextInt()输入整数int型的
    变量名.next()输入字符串 string型的
 */