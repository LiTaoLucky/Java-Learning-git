package com.atguigu.d_if;

public class Demo03ifElse {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = 30;

        //定义一个临时变量,接收前两个数的较大值
        int temp = 0;

        if (i > j) {
            temp = i;
        } else {
            temp = j;
        }

        if (temp > k) {
            System.out.println("最大的数是:" + temp);
        } else {
            System.out.println("最大的数是:" + k);
        }
    }
}
