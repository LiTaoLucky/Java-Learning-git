package com.atguigu.d_array;

public class Demo05Array {
    public static void main(String[] args) {
        String[][] arr1 = {{"孙悟空", "唐僧"}, {"刘备", "关羽", "张飞"}, {"宋江"}, {"林黛玉", "贾宝玉"}};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.println(arr1[i][j]);
            }
        }
    }
}