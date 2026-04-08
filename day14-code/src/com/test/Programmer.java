package com.test;

public class Programmer extends Employee {
    public String Language;// 编程语言

    public Programmer(int id, String name, int age, double salary, String Language) {
        super(id, name, age, salary);
        this.Language = Language;// 设置编程语言
    }
    @Override
    public void getInfo() {
        System.out.println("编号:" + id + " 姓名:" + name + " 年龄:" + age + " 工资:" + salary + " 编程语言:" + Language);

    }


}
