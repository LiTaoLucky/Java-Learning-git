package logic;

public class Demo02Logic {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
//        boolean result01 = (++a > 100) & (++b > 10);
        boolean result01 = (++a > 100) && (++b > 10);
        System.out.println("result01 = " + result01);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        /*
        & 运算当前面为false时依旧执行后面的语句
        && 有短路效果运算当前面为false时就不执行后面的语句了

        | 和 || 同理可得

        | 和 & 前后都是数字则看作位运算符
         */
    }
}
