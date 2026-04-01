package com.obj2;

public class Dog {//定义一个狗 类
    public String name;//具有姓名属性
    public int age;//具有年龄属性
    public String color;//具有年龄属性

    public void eat() {//具有吃方法
        System.out.println("吃吃吃");
    }

    public static void main(String[] args) {
        Dog mydog = new Dog();//创建一个狗对象
        mydog.eat();//我的狗吃吃吃
    }
}
