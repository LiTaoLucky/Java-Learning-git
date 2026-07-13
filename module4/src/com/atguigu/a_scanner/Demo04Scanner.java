package com.atguigu.a_scanner;

import java.util.Scanner;//该工作无需我们自己干,idea自己会帮我干

public class Demo04Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        System.out.println("data = " + data);

    }
}