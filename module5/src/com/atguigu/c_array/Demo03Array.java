package com.atguigu.c_array;

public class Demo03Array {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        System.out.println(arr1);//地址值
        arr1[1] = 100;

        int[] arr2 =arr1;
        System.out.println(arr2);
        arr2[1] = 200;

        System.out.println(arr1[1]);
        System.out.println(arr2[1]);

    }
}
/*
* arr1和arr2共用一个地址,所以索引改变时两个数组中的值都改变
* arr2不是new出来的,是arr1直接赋值给了arr2,那么arr1和arr2的地址值一样,此时arr1和arr2
* 指向了堆内存中同一片空间(同一个地址值,代表的同一个数组),此时改变一个数组中的元素会影响到另一个数组*/