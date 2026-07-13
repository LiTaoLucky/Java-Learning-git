package com.atguigu.h_break_continue;

public class Demo01BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i==3){
                break;
            }
            System.out.println("我爱java" + i);
        }
    }
}
