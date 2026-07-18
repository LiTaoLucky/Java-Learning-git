package com.atguigu.g_objectarray;

public class Demo01ObjectArray {
    public static void main(String[] args) {
        /*
        * Person p = new Person
        *
        * 1.定义一个存储int型数据的数组:int[]
        * 2.定义一个存储double型的数组:double[]
        * 3.定义一个存储String型的数组:String[]
        * 4.定义一个存储Person型的数组:Person[]
        * */
        //定义数组
        Person[] arr = new Person[3];

        //创建三个对象
        Person p1 = new Person("金莲",26);
        Person p2 = new Person("韬哥",18);
        Person p3 = new Person("张三",20);

        //将三个对象保存到数组中
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        /*
        * 遍历
        * 当i = 0 arr[0] 就是p1对象
        * 当i = 1 arr[1] 就是p2对象
        * 当i = 2 arr[2] 就是p3对象
        * */
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName()+"..."+arr[i].getAge());

        }
    }
}
