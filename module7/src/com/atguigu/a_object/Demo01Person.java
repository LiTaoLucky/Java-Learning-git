package com.atguigu.a_object;

public class Demo01Person {
    public  static void main(String[] args) {
        Person person = new Person();
        person.name = "金莲";//可以把.看为的,译为person的name为金莲
        person.age =26;
        System.out.println(person.name);
        System.out.println(person.age);

        person.eat();
        person.drink();

    }
}
