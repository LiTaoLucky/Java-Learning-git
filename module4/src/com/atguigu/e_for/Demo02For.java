package com.atguigu.e_for;

public class Demo02For {
    public static void main(String[] args) {
        //定义一个变量,用来接收两个数的和 sum
        int sum = 0;
        //2.利用for循环讲1-3;表示出来
        for (int i = 0; i <= 3 ; i++) {
        //在循环过程中,两两相加,将结果赋值给sum
            sum = sum + i;
        }
        //4.输出sum
        System.out.println("sum = " + sum);
    }
}

