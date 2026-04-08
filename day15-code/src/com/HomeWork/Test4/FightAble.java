package com.HomeWork.Test4;

public interface FightAble {
    /**
     * 攻击接口
     * */
    void specialFight();// 技能攻击,抽象方法
    default  void commonFight() {//默认方法,普通攻击
        System.out.println("普通打击");
    }

}
