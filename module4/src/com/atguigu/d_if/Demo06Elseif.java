package com.atguigu.d_if;

import java.util.Scanner;

public class Demo06Elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data1 = sc.nextInt();
        int data2 =  sc.nextInt();
        if (data1 > data2) {
            System.out.println("data1 大于 data2");
        }else if (data1 < data2){
            System.out.println("data1 小于 data2");
        }
        else {
            System.out.println("data1 等于 data2");
        }
    }
}
