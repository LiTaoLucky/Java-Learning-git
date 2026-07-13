package com.atguigu.d_if;

import java.util.Scanner;

public class Demo04ifElse {
    public static void main(String[] args) {
//        1.创建一个Scanner对象,调用nextInt键盘录入年份 year
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
//        2. 判断(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//        3.如果条件成立,就输出闰年2月29天,否则输出平年2月28天
            System.out.println("闰年2月29天");
        } else {
            System.out.println("是平年2月28天");
        }
    }
}
