package com.atguigu.f_array;

public class Demo02Dubble {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {5, 4, 3, 2, 1};

        //外层循环代表比较了几圈
        //n-1圈
        for (int j = 0; j < arr.length - 1; j++) {
            //内层循环代表每一圈比较的次数,每一圈都少比较一次
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
/*//第一圈
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        //第二圈
        for (int i = 0; i < arr.length-1-1; i++) {
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        //第三圈
        for (int i = 0; i < arr.length-1-2; i++) {
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        //第四圈
        for (int i = 0; i < arr.length-1-3; i++) {
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
*/