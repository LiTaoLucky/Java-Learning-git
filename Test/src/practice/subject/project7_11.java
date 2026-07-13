package practice.subject;

import java.util.Random;
import java.util.Scanner;

public class project7_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int number = rd.nextInt(100);
        System.out.println(number);
        System.out.println("==========================");

        while (true) {
            int customer = sc.nextInt();
            if (customer > 100 || customer < 0) {
                System.out.println("请输入正确格式的数字!");
            } else if (customer > number) {
                System.out.println("对不起,您猜大了!");
            } else if (customer < number) {
                System.out.println("对不起,您猜小了!");
            } else if (customer == number) {
                System.out.println("恭喜你猜对了!");
                break;
            }
        }
    }
}
