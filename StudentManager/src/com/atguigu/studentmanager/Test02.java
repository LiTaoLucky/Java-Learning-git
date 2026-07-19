package com.atguigu.studentmanager;

public class Test02 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = new int[arr1.length];

        /*
         * 工具类:System
         * 静态方法:arrayCopy
         *       参数1:原数组 -> 从哪个数组开始复制
         *       参数2:从原数组的哪个索引开始赋值
         *       参数3:从目标数组哪个个索引开始粘贴
         *       参数4:从目标的哪个索引开始粘贴
         *       参数5:复制多少个
         */

        System.arraycopy(arr1,0,arr2,0,3);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}