package com.atguigu.d_array;

public class Demo01Array {
    public static void main(String[] args) {
        int [][] arr1 = new int[2][2];
        int [][] arr2 = new int[2][];

        System.out.println("============================");

        String[][] arr3 = {{"孙悟空,唐僧"},{"刘备","关羽","张飞"},{"宋江"},{"林黛玉","贾宝玉"}};
        System.out.println(arr3[1][1]);
    }
}
/*
*二维数组中一维数组那里如果空着的话,就是没有创建一维数组,为null
*  */