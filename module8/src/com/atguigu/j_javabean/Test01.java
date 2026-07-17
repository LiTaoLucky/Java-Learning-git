package com.atguigu.j_javabean;

public class Test01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setSid(1);
        s1.setName("韬哥");
        System.out.println(s1.getSid());
        System.out.println(s1.getName());

        System.out.println("========================");

        Student s2 = new Student("金莲",2);
        System.out.println(s2.getSid());
        System.out.println(s2.getName());
    }
}
