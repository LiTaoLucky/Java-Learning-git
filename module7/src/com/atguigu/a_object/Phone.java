package com.atguigu.a_object;

public class Phone {
    String color;
    String brand;
    int price;


    public void call(String name){
        System.out.println("给"+name+"打电话");

    }

    public String massage(){
        return "给金莲发信息";
    }
}
