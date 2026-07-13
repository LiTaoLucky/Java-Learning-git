package com.atguigu.b_method;

public class Demo05Method {
    public static void main(String[] args) {
        int[] arr2 = method();
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);

        }

    }
    public static int[] method(){
        int a=10;
        int b=20;
        int sum = a+b;

        int sub = a-b;

        int[] arr1 = {sum,sub};
        return arr1;
    }
}
//当返回值为引用数据类型时,返回的也为地址值