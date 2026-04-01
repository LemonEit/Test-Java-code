package com;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println("姓名：" + name + "，年龄：" + age);
    }

    public static void main(String[] args) {
        Person a = new Person("张三", 18);
        Person b = new Person("李四", 19);
        a.display();
        b.display();
    }
}
