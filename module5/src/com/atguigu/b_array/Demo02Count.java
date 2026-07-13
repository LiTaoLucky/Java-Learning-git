package com.atguigu.b_array;

import java.util.Random;

public class Demo02Count {
    public static void main(String[] args) {
        //1.创建Randem对象,用于生成随机数
        Random rd = new Random();
        //2.定义一个数组,长度为10
        int[] arr = new int[10];
        //3.定义一个变量count,用于统计符合条件的数据个数
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
        }
        //4.遍历数组,判断元素是否符合制定的条件,如果符合,count++
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0 && arr[i] % 7 != 0) {
                count++;
                System.out.println("符合条件的有: " + arr[i]);
            }
        }
        //5.输出count
        System.out.println("count= " + count);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
