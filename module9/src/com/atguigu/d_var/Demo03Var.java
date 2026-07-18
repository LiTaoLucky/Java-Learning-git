package com.atguigu.d_var;

public class Demo03Var {
    public static void main(String[] args) {
        String concat = concat("-", "张三丰", "张翠山", "张无忌");
        System.out.println("concat = " + concat);
    }

    public static String concat(String regax, String... s) {
        String str = "";
        for (int i = 0; i < s.length; i++) {
            if (i == s.length - 1) {
                str += s[i];
            } else {
                str += s[i] + regax;
            }
        }

        return str;
    }
}
