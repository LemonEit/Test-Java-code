package com.test;

public class Architect  extends Designer{
    public int stock;// 股份

    public Architect(int id, String name, int age, double salary, String Language, int bonus, int stock) {
        super(id, name, age, salary, Language, bonus);
        this.stock = stock;
    }
    @Override
    public void getInfo() {
        System.out.println("编号:" + id + " 姓名:" + name + " 年龄:" + age + " 工资:" + salary + " 语言:" + Language + " 奖金:" + bonus + " 股份:" + stock);


    }
}
