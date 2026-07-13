package com.atguigu.f_while;

public class Demo01While {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5){
            System.out.println("我爱java,我更爱我");
            i++;
        }
    }
}
/*
格式:
初始化变量;
while(比较){
    循环语句;
    步进表达式
}
执行流程:
    a.初始化变量
    b.比较,如果是true,就走循环语句,走步进表达式
    c.再比较,如果还是true,继续走循环语句,继续走步进表达式
    d.再比较,直到比较为false,循环结束
 */
