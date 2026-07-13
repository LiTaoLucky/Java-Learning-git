package com.atguigu.a_method;

import java.util.Scanner;

/*
 *需求:定义一个方法,比较两个整数的大小,如果第一个比第二个大,返回true,否则返回false
 */
public class Demo06Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int j = sc.nextInt();
        //传递的是i和j,但我们真正传递的是i和j代表的数据,不是变量本身
        boolean result = compare(i, j);
        System.out.println("第一个大于第二个为" + result);
    }

    public static boolean compare(int a, int b) {
        return a > b ? true : false;
    }
}
