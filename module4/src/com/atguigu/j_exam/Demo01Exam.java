package com.atguigu.j_exam;

import java.util.Random;
import java.util.Scanner;

public class Demo01Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int rdNumber = random.nextInt(100) + 1;
        System.out.println(rdNumber);
        System.out.println("请您输入一个1-100之间的数");
        while (true) {
            int scNumber = sc.nextInt();
            if (scNumber > 100 || scNumber < 0) {
                System.out.println("请输入正确格式的数字!");
            } else if (scNumber > rdNumber) {
                System.out.println("对不起,您猜大了!");
            } else if (scNumber < rdNumber) {
                System.out.println("对不起,您猜小了!");
            } else if (scNumber == rdNumber) {
                System.out.println("恭喜你猜对了!");
                break;
            }
        }
    }
}
