package com.obj3;

public class Manager {
    private String name;// 姓名
    private int id;// 编号
    private double salary;// 工资
    private double bonus;// 奖金

    public String getName() {// 获取姓名
        return name;
    }

    public void setName(String name) {// 设置姓名
        this.name = name;
    }

    public int getId() {// 获取编号
        return id;
    }

    public void setId(int id) {// 设置编号
        this.id = id;
    }

    public double getSalary() {// 获取工资
        return salary;
    }

    public void setSalary(double salary) {// 设置工资
        this.salary = salary;
    }

    public double getBonus() {// 获取奖金
        return bonus;
    }

    public void setBonus(double bonus) {// 设置奖金
        this.bonus = bonus;
    }

    public void work() {
        System.out.println("经理" + name + "正在工作");


    }

}
