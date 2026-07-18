package com.atguigu.i_other;

public class Demo01Method {
    public static void main(String[] args) {
        //调用一个无返回值方法
        method01();
        //调用一个有参无返回值方法
        method02(10,20);
        //调用一个无参有返回值方法
        int result = method03();
        //调用一个无参有返回值方法
        int result1 = method04(10,20);
    }

    private static int method04(int i, int i1) {
        return 0;
    }

    private static int method03() {
        return 0;
    }

    private static void method02(int i, int i1) {

    }

    private static void method01() {

    }
}
/*使用快捷键 alt + 回车 快速生成方法体,如果不行的话,可以先alt + F7 然后再alt + 回车*/