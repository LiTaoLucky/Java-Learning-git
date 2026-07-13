package com.atguigu.f_while;

public class Demo02While {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i <= 3) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
