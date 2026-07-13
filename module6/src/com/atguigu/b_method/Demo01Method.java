package com.atguigu.b_method;

import java.util.Scanner;

public class Demo01Method {
    public static void main(String[] args) {
        //添加用户输入变量
        Scanner sc = new Scanner(System.in);
        //定义一个变量接收输入的值
        int num = sc.nextInt();
        //引入方法来判断输入的值是否为偶数
        String result = method(num);
        //打印结果
        System.out.println(result);
    }

    public static String method(int a) {
        //判断输入的a是否为偶数,是偶数则返回true奇数则返回false
        return a % 2 == 0 ? "偶数" : "奇数";
    }
}
/*
* 输入一个数字,数字为偶数时,输出偶数,为奇数时输出奇数
* */