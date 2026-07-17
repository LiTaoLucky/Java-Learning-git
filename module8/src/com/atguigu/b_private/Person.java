package com.atguigu.b_private;

public class Person {
    private String name;
    private int age;

    //为name提供get/set方法
    public void setName(String xingming) {
        name = xingming;
    }

    public String getName() {
        return name;
    }

    //为age提供get/set方法
    public void setAge(int nianling) {
        if (nianling < 0 || nianling > 150) {
            System.out.println("你脑子是不是秀逗了!岁数不合理啊");
        } else {
            age = nianling;
        }
    }

    public int getAge() {
        return age;
    }
}
