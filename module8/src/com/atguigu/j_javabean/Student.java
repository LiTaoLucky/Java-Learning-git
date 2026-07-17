package com.atguigu.j_javabean;

public class Student {
    private int sid;
    private String name;

    public Student() {
    }

    public Student(String name, int sid) {
        this.name = name;
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
}
/*快捷键快速生成标准javabean:alt+insert键
*  */