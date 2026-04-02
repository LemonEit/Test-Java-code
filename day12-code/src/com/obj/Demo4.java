package com.obj;

public class Demo4 {
    public static void main(String[] args) {
        //创建猫对象
        Cat c = new Cat("花色","波斯猫");
        //调用猫的方法
        c.eat();
        c.catchMouse();
        //创建狗对象
        Dog d = new Dog("黑色","藏獒");
        d.eat();
        d.lookhome();
    }
}
