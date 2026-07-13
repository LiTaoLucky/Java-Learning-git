package com.atguigu.assignment;

public class Demo02Assignment {
    public static void main(String[] args) {
        byte b = 10;

//        b = (byte) (b + 1);

        b += 1;     //b+=1不完全等于b=b+1

//        注意:byte short 遇到复合赋值运算符,jvm会自动转型

        System.out.println(b);
    }
}
