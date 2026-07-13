package com.atguigu.c_overload;

public class Demo01OverLoad {
    public static void main(String[] args) {
        sum(10,20);
        sum(10,20,30);
        sum(10,20,30,40);
    }
    //两个整数相加
    public static void sum(int a,int b){
        System.out.println(a+b);
    }
    //三个整数相加
    public static void sum(int a,int b,int c) {
        System.out.println(a+b+c);
    }
    //四个整数相加
    public static void sum(int a,int b,int c,int d) {
        System.out.println(a+b+c+d);
    }
    public static void sum(double a,int b) {
        System.out.println(a+b);
    }
    public static void sum(int a,double b) {
        System.out.println(a+b);
    }
}
/*重载
* 方法名相同,参数列表不同的方法
* */
/*什么叫参数列表不同?
    a.参数个数不同
    b.参数类型不同
    c.参数类型顺序不同
* */