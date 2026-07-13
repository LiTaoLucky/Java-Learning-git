package com.atguigu.a_method;

import java.lang.reflect.Array;

public class Demo07Method {
    public static void main(String[] args) {
        method01();
    }
    public static int method01(){
        //return 仅仅代表结束方法,不代表有返回值
        return 1;
    }
    public static void method02(){
        return;
    }
    public static int method03(){
        return 1;
//        return 2;
    }
}
