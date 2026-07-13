package com.atguigu.a_method;

public class Demo03Method {
    public static void main(String[] args) {
        //打印调用 ->不推荐
        //还要使用sum方法的结果,还需要重新调用
        System.out.println(sum());

        //赋值调用 ->极力推荐
        int result = sum();
        System.out.println("result = "+result);

    }
    public static int sum() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        return sum;
    }
}
