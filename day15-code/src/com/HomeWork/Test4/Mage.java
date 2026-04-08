package com.HomeWork.Test4;

public class Mage implements FightAble{
/**
 * 法师类*/
    @Override
    public void specialFight() {
        System.out.println("法术攻击");
        commonFight();
    }

}
