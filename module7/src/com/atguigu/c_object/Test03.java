package com.atguigu.c_object;

public class Test03 {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        System.out.println(phone1);
        phone1.brand = "xiaomi";
        phone1.price = 2999;
        System.out.println(phone1.brand);
        System.out.println(phone1.price);

        System.out.println();
        System.out.println("===================================");

        Phone phone2 = phone1;
        System.out.println(phone2);
        System.out.println(phone2.brand);
        System.out.println(phone2.price);

    }
}
