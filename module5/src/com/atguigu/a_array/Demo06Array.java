package com.atguigu.a_array;

public class Demo06Array {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //字符的初始值为'\u0000'
        //整数的初始值为0
        //小数的初始值为0.0
        //布尔的初始值为false
        //引用的初始值为null
    }
}
/*
直接打印数组,会输出数组的地址值
地址值:数组在内存中的一个身份证号码,唯一标识,我们可以通过这个
唯一标识到内存中找到这个数组,从而操作这个数组的数据.

打印数组的值需要遍历打印数组的索引
*/