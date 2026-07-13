package com.atguigu.e_for;

public class Demo04For {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100 ; i++) {
            if (i % 2 == 0) {
                ++count;
            }
        }
        System.out.println("偶数有" + count);
    }
}

