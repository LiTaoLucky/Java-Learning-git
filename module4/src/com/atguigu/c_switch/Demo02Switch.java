package com.atguigu.c_switch;

import java.util.Scanner;

public class Demo02Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        switch (data){
            case  1:
                System.out.println("鹅鹅鹅");
            case  2:
                System.out.println("曲项向天歌");
            case 3:
                System.out.println("白毛浮绿水");
            case 4:
                System.out.println("红掌拨清波");
                break;
            default:
                System.out.println("下面没有了");
                break;
        }
    }
}
/*
case 具有穿透性,如果没有break,就会一直向下穿透执行,
直到遇到break或者switch代码执行完毕
 */