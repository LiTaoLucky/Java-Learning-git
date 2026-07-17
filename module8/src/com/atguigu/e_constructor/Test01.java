package com.atguigu.e_constructor;

public class Test01 {
    public static void main(String[] args) {
        Person person = new Person();

        Person person1 = new Person("韬哥",18);
        System.out.println(person1.getName()+"..."+person1.getAge());

    }
}
