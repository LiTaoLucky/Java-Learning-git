package com.atguigu.a_method;

public class Demo05Method {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        method(a, b);//a代表的10和b代表的20已经传过去了

        System.out.println("==========================");
        int Result = sum(10,20);
        System.out.println("result = " + Result);
    }
    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void method(int j, int k) {
        System.out.println("a=" + j + " b=" + k);
    }
}
