package com.atguigu.i_other;

public class Demo02Method {
    public static void main(String[] args) {
        int[] arr = {4,3,5,6,7};
        int max = getMax(arr);
        System.out.println(max);
    }

    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
/*
快速将一段代码抽取到方法中:
    a.选中要抽取的方法
    b.按ctrl + alt + 吗
*/