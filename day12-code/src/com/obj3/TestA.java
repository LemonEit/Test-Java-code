package com.obj3;

public class TestA {
    public static void main(String[] args) {
        Manager myManager = new Manager(); // 创建Manager类的实例对象myManager
        myManager.work(); // 调用myManager对象的work方法
        myManager.setName("小王");
        myManager.setSalary(5000);
        myManager.setBonus(500);
        System.out.println("经理" + myManager.getName() + "的工资是" + myManager.getSalary() + "，奖金是" + myManager.getBonus()
        );

    }
}
