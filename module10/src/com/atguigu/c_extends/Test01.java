package com.atguigu.c_extends;

public class Test01 {
    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.methodFu();
//        fu.methodZi();    不能调用子类特有的方法
        fu.method();

        System.out.println("========================");
        Zi zi = new Zi();
        zi.methodZi();
        zi.methodFu();//继承父类后,能调用父类非私有成员
        zi.method();

        System.out.println("===========================");

        Fu fu1 = new Zi();
        fu1.method();//调用的是子类中的方法
    }
}
/*
* 继承中,成员变量访问特点:看等号左边是谁,先调用谁中的变量
*       成员方法访问特点:看等号左边new的是谁,先调用谁中的方法
* */