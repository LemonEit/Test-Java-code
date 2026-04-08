package com.test;

public class Designer extends Programmer{
    public int bonus;// 奖金

    public Designer(int id, String name, int age, double salary, String Language, int bonus) {
        super(id, name, age, salary, Language);
        this.bonus = bonus;
    }
    @Override
    public void getInfo() {
        System.out.println("编号:" + id + " 姓名:" + name + " 年龄:" + age + " 工资:" + salary + " 语言:" + Language + " 奖金:" + bonus );
    }
}
