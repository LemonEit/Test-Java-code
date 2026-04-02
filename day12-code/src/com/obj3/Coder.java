package com.obj3;

public class Coder {
    private String name;//姓名
    private int id;//工号

    public String getName() {//获取姓名
        return name;
    }

    public void setName(String name) {//设置姓名
        this.name = name;
    }

    public int getId() {//获取工号
        return id;
    }

    public void setId(int id) {//设置工号
        this.id = id;
    }

    public double getSalary() {//获取工资
        return salary;
    }

    public void setSalary(double salary) {//设置工资
        this.salary = salary;
    }

    private double salary;//工资

    public void work() {
        System.out.println("程序员" + name + "正在工作");

    }

    public Coder(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}
