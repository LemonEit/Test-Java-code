package com.deno;

public class Person {
    public String name;
    public int age;
    public char sex;

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void show() {
       System.out.println("姓名：" + name + "，年龄：" + age + "，性别：" + sex);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Person)obj).name) && this.age == ((Person)obj).age && this.sex == ((Person)obj).sex;
    }

    @Override
    public String toString() {
        return "人员{" + name + "，年龄：" + age + "，性别：" + sex+"}";
    }
}