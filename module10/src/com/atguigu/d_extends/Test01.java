package com.atguigu.d_extends;

public class Test01 {
    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.methodFu();//自己的method方法
        fu.method();//new的是父类中的对象,那么调用的就是父类中的method

        System.out.println("==================");

        Zi zi = new Zi();
        zi.methodZi();
        zi.methodFu();
        zi.method();

    }
}
