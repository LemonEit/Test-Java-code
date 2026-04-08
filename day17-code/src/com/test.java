package com;

import java.util.Scanner;

public class test {
    static Scanner sc = new Scanner(System.in);// 创建一个扫描器对象

    public static void main(String[] args) {
        //int Hp = 100;
        int Hp1 = 100;

        System.out.println("请输入角色：[apc]/[adc]");
        String str = sc.next();// 获取用户输入角色
        FightAble player1 = Player.Set(str);
        if (player1 instanceof ADC) {
            ADC Player1 = (ADC) player1;
        } else if (player1 instanceof APC) {
            APC Player1 = (APC) player1;
        }
        while (true) {
            System.out.println("请输入技能：[0]普通攻击/[1]技能1/[2]技能2/[3]技能3");
            int num = sc.nextInt();
            switch (num) {
                case 0:
                    player1.A();
                    Hp1 -= 10;
                    System.out.println("敌方当前血量"+Hp1);

                    break;
                case 1:
                    player1.fight1();
                    Hp1 -= 20;
                    System.out.println("敌方当前血量"+Hp1);
                    break;
                case 2:
                    player1.fight2();
                    Hp1 -= 30;
                    System.out.println("敌方当前血量"+Hp1);
                    break;
                case 3:
                    player1.fight3();
                    Hp1 -= 60;
                    System.out.println("敌方当前血量"+Hp1);
                    break;
                default:
                    System.out.println("输入错误！");
                    break;
            }
            if (Hp1 <= 0) {//击败
                System.out.println("你击败了一名敌人 ！");
                break;
            }

        }
    }
}
