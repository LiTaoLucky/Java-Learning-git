package com.atguigu.f_array;

public class Demo03Binary {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int index = binary(arr, 6);
        System.out.println("index = " + index);
    }

    public static int binary(int[] arr,int data){
        //定义三个变量,分别代表最大索引,最小索引,中间索引
        int min = 0;
        int max = arr.length-1;
        int mid = 0;
        //查找
        while (min<=max){
            mid = (min+max)/2;
            if(arr[mid]<data){
                min = mid+1;
            }else if (arr[mid]>data){
                max = mid-1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }
}
/*二分查找
* */