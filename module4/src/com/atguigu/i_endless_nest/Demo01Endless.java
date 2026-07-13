package com.atguigu.i_endless_nest;

public class Demo01Endless {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 10;i++ ) {
            count ++;
            System.out.println("我爱java"+count);
        }
//        while(true){
//            count ++;
//            System.out.println("我爱java"+count);
//        }
    }
}
//死循环中,该循环会一直运行,常见有for(int i = 1;i<10; )
//还有while(true)