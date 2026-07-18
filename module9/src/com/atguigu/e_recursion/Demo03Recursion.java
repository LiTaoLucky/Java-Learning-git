package com.atguigu.e_recursion;

public class Demo03Recursion {
    public static void main(String[] args) {
        int result = method(6);
        System.out.println(result);
    }

    public static int method(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * method(n - 1);
        }
    }
}


