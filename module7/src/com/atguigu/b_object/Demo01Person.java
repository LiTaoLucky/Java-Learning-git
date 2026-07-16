package com.atguigu.b_object;

public class Demo01Person {
    public static void main(String[] args) {
        //原始方式
        Person p = new Person();
        p.name = "金莲";
        System.out.println(p.name);
        p.eat();

        System.out.println("===============================");

        //匿名对象
        new Person().eat();


        /*注意
        * a.如果我们只想单纯的调用一个方法,让方法执行,我们可以考虑使用匿名对象
        * b.但是如果涉及到赋值,千万不要用匿名对象
        * */
    }
}
