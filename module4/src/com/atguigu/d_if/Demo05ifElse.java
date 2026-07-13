package com.atguigu.d_if;

public class Demo05ifElse {
    public static void main(String[] args) {
        boolean num1 = false;
        boolean num2 = true;

        int i = 1;
        /*
        num1 = false;
        num2 = true;
        num1 = num2 ->相当于将num2赋值给了bum1
        所以if后面为true,故可以运行
         */

        if (num1 = num2) {
            i++;
            System.out.println(i);
        }
        else if (false) {
            --i;
            System.out.println(i);
        }
    }
}
