package com.atguigu.a_array;

public class Demo08ArrayException {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        //数组索引越界异常
        //arr[3] = 300; 索引值超出了arr的索引范围
        //arr[-1] = 300; 索引值超出了arr的索引范围
    }
}
