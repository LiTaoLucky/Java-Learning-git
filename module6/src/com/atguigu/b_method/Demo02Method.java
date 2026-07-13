package com.atguigu.b_method;

public class Demo02Method {
    public static void main(String[] args) {
        int result = method01();
        System.out.println(result);
    }
    public static int method01(){
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum+=i;
        }
        return sum;
    }
}
/*
* 定义一个方法,打印1-100相加的数字
* */