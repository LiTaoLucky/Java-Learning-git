package com.atguigu.e_constructor;

public class Person {
    private String name;
    private int age;

    //无参构造
    public Person() {
        System.out.println("我是无参构造");
    }

    //有参构造
    /*public Person(String name) {
        this.name = name;
    }*/
    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
/*JavaBean要求规范
 * 1.类必须是具体的(非抽象abstract)和公共的,public class类名
 * 2.并且具有无参数的构造方法,有参构造
 * 3.成员变量私有化,并提供用来操作成员变量的set和get方法.*/