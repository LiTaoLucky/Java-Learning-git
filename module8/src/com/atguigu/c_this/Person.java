package com.atguigu.c_this;

public class Person {
     String name;

//    哪个对象调用的this所在的方法,this就代表哪个对象

     public void speak(String name){
         System.out.println(this+"..........");
         System.out.println(this.name+"您好,我是"+name);
     }
}
/*this代表的是当前对象
作用:this可以区分重名的成员变量和局部变量
    this点出来的一定是成员的变量

this代表当前对象,那么到底代表哪个对象呢?

* */