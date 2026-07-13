package com.atguigu.a_scanner;

import java.util.Scanner;//该工作无需我们自己干,idea自己会帮我干

public class Demo03Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data1 = sc.next();
        String data2 = sc.nextLine();
        System.out.println("data1 = " + data1);
        System.out.println("data2 = " + data2);
    }
}
/*
next 和 nextLine不能同时使用
因为next在输入时会有 数字和回车键\n,输出时只输出数字,留下换行符\n还留在缓冲区,不会吸收\n
并且next在读取空格 回车 制表符都会停止
而nextLine读取时,会吸收\n,而一碰到\n则直接返回空
 */