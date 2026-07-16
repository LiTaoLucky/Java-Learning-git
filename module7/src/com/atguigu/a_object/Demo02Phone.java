package com.atguigu.a_object;

public class Demo02Phone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "小米";
        phone.color = "白色";
        phone.price = 2999;

        System.out.println("手机的牌子为 " + phone.brand);
        System.out.println("手机的颜色为 " + phone.color);
        System.out.println("手机的价格为 " + phone.price);

        phone.call("敛棠");
        String mess =phone.massage();
        System.out.println(mess);
    }
}
