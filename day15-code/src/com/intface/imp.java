package com.intface;

public class imp implements Inter {
    /**
     * 接口的方法实现类
     * 实现了三个接口的三个方法,声明了一个普通方法playGame
     */

    @Override
    public void eat() {//继承的抽象方法
        System.out.println("吃吃吃");

    }

    @Override
    public void show() {//继承的抽象方法
        System.out.println("显示显示显示");
    }

    @Override
    public void play() {//继承的抽象方法
        System.out.println("玩玩玩");
    }
    public void playGame() {//特有方法
        System.out.println("玩英雄联盟");
    }
}
