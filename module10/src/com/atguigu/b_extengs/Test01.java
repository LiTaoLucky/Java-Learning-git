package com.atguigu.b_extengs;

public class Test01 {
    public static void main(String[] args) {
        //创建一个父类对象
        Fu fu = new Fu();
        System.out.println(fu.numFu);//父类中的numFu
//        System.out.println(fu.numZi); 不能直接调用子类特有成员
        System.out.println(fu.num);//父类的

        System.out.println("=========================");

        Zi zi = new Zi();
        System.out.println(zi.numZi);
        System.out.println(zi.numFu);//继承了父类,可以使用父类中非私有成员
        System.out.println(zi.num);//子类的

        System.out.println("============================");
        Fu fu1 = new Zi();
        System.out.println(fu1.num);
    }
}
/*
* 总结:看等号左边是谁,先调用谁中的成员
*      如果等号左边是父类类型,只能调用父类中的成员变量,如果等号左边是子类类型,既能调用子类,还能调用父类的继承过来非私有成员
*      如果重名,则就近调用
*      重点(核心):看等号左边是谁,先调用谁中的成员,子类没有,找父类
* */