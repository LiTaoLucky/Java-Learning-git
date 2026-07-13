package com.atguigu.f_while;

public class Demo05While {
    public static void main(String[] args) {
        int mountain = 8844430;
        double paper = 0.1;
        int count = 0;
        while (paper <= mountain) {
            paper = paper * 2;
            count++;
        }
        System.out.println("次数为 " + count);
    }
}
