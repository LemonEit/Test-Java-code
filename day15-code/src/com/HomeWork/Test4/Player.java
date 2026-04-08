package com.HomeWork.Test4;

public class Player {
    /**
     * 玩家类
     *
     * */
    static FightAble select(String s) {
        if (s.equals("A")) return new A();
        else if (s.equals("Mage")) return new Mage();
        else return null; // Added missing return statement for completeness
    }

    public static void main(String[] args) {

        System.out.println("请输入技能类型：");
        String str;
        str = new java.util.Scanner(System.in).nextLine();
        new Player().select(str).specialFight();

    }
}