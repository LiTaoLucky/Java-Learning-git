package com.atguigu.d_object;

public class Test01 {
    public static void main(String[] args) {
        Citizen citizen = new Citizen();
        citizen.name = "韬哥";
        citizen.birthday = new MyData();//也可以去citizen类中去初始化birthday
        /*StringBuilder链式调用
          citizen.birthday获取的是MyData对象
          再去点year获取的是MyData对象中的year

          链式调用
        * */
        citizen.birthday.year = 2006;
        citizen.birthday.month = 5;
        citizen.birthday.day = 3;
        citizen.idcard = "1234567890";
        System.out.println(citizen);
        System.out.println(citizen.idcard);
        System.out.println(citizen.name + "," + citizen.birthday.year + "," + citizen.birthday.month + "," + citizen.birthday.day);
        System.out.println(citizen.birthday);
    }
}
