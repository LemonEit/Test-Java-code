package com.HomeWork.Test4;

public class A implements FightAble {
    /**
     *
     * 战士类
     * */

    @Override
    public void specialFight() {
        System.out.println("武器攻击");
        commonFight();
    }

}
