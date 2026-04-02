package com;

import java.util.Scanner;

public class spear {

    public static void main(String[] args) {
        spearSev spearSev = new spearSev();
        Scanner scanner = new Scanner(System.in);

        menu(spearSev, scanner);
    }

    private static void menu(spearSev spearSev, Scanner scanner) {
        while (true) {
            System.out.println("====================欢迎使用超市会员管理系统==========================");
            System.out.println("1.查询会员信息");
            System.out.println("2.删除会员");
            System.out.println("3.新增会员信息");
            System.out.println("4.退出");
            System.out.println("=================================================================");
            System.out.print("请输入您的选择：");
            switch (scanner.nextInt()) {
                case 1 -> spearSev.showAll();//显示所有会员信息
                case 2 -> spearSev.delete();
                case 3 -> spearSev.add();
                case 4 -> {
                    System.out.println("谢谢使用");
                    return;
                }
                default -> System.out.println("输入错误，请重新输入");
            }

        }
    }
}

