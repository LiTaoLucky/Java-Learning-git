package com.atguigu.c_object;

public class Test01 {
    public  static void main(String[] args) {
        Phone phone1 = new Phone();
        System.out.println(phone1);//地址值
        System.out.println(phone1.brand);//null
        System.out.println(phone1.price);//0
        phone1.brand = "xiaomi";
        phone1.price = 2999;
        System.out.println(phone1.brand);
        System.out.println(phone1.price);
        phone1.call();//call方法不在堆中找,而是去通过class地址值去方法区中找class这个类中的phone类的call方法
    }
}
