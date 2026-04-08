package com.ruandi.test15;

public class Woman extends Person {
    //重写上面的方法，增加化妆
    @Override
    public void eat() {//打印吃饭
        System.out.println("吃饭");
    }

    public void makeup() {//打印化妆
        System.out.println("化妆");


    }

}




