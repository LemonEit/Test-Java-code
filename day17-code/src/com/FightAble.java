package com;

/**
 * 战斗接口
 */

public interface FightAble {
    void fight1();//技能1
    void fight2();//技能2
    void fight3();//技能3

    default void A() {//普通攻击
        System.out.println("普通攻击");
    }
}
