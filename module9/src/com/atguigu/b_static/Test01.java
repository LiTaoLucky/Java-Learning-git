package com.atguigu.b_static;

public class Test01 {
    public static void main(String[] args) {
        //静态成员访问非静态成员。需要new对象调用
        Test01 test01 = new Test01();
        test01.method03();

        Person person = new Person();
        person.eat();

        method01();
        method02();
    }

    public static void method01() {
        System.out.println("我是方法一");
    }

    public static void method02() {
        System.out.println("我是方法二");
    }
    public void method03() {
        System.out.println("我是方法三");
        //同类中非静态成员访问静态成员可以直接调用
        method01();
        Test01.method01();

        //不同类中非静态成员访问静态成员
        //drink();
        Person.drink();
        Person person = new Person();
        person.drink();//虽然是new对象调用,但是底层原理还是类名.调用
        person.eat();
        method04();
    }

    public  void method04() {
        System.out.println("我是方法四");
    }
}
/*1.在静态方法访问非静态成员
     静态成员访问非静态成员。需要new对象调用

  2.在非静态方法中访问静态成员
     a.同类:
        直接调用
        类名调用
     b.不同类:
        类名调用

  3.在静态方法中访问静态成员
     a.同类:
        直接调用
        类名调用
     b.不同类:
        类名调用

  4.在非静态方法中访问非静态成员
    a.同类:
        直接调用
        new对象调用
    b.不同类:
        new对象调用
总结:
1.不管在不在同一个类中,非静态成员都可以new对象调用
2.不管在不在同一个类中,静态成员都可以类名调用
*/
