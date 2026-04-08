package com.test;
/**
 * 这是一个员工类
 *
 * */
public class Employee {
    public int id;// 员工编号
    public String name;// 员工姓名
    public int age;// 员工年龄
    public double salary;// 员工工资

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }
    public void getInfo() {
        System.out.println("编号:" + id + " 姓名:" + name + " 年龄:" + age + " 工资:" + salary);
    }
}
