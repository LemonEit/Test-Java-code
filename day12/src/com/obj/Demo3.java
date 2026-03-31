package com.obj;

public class Demo3 {public static void main(String[] args) {
    //创建经理对象
    Manager m = new Manager("老王",123,15000,6000);
    //调用工作方法
    m.work();
    //创建程序员对象
    Coder c = new Coder("小王",135,10000);
    //调用工作方法
    c.work();
}
}
