package com.atguigu.d_array;

public class Demo02Array {
    public static void main(String[] args) {
        String[][] arr1 = {{"孙悟空","唐僧"}, {"刘备", "关羽", "张飞"}, {"宋江"}, {"林黛玉", "贾宝玉"}};
        System.out.println("二维数组的长度为" + arr1.length);

        System.out.println("==============================");

        //获取每个一维数组的长度
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i].length + " ");
        }
    }
}