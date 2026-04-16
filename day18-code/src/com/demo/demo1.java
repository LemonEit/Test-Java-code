package com.demo;

import java.util.Scanner;

public class demo1 {

    public static void main(String[] args) {
        user user = new user();//创建会员对象
        Scanner scanner = new Scanner(System.in);//创建Scanner对象
        while (true) {
            System.out.println("====================欢迎使用超市会员管理系统==========================");
            System.out.println("1.查询会员信息");
            System.out.println("2.删除会员");
            System.out.println("3.新增会员信息");
            System.out.println("4.退出");
            System.out.println("=================================================================");
            System.out.println("请输入您的选择：");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> user.showAll();//显示所有会员信息
                case 2 -> user.delete();
                case 3 -> user.add();
                case 4 -> {
                    System.out.println("谢谢使用");
                    return;
                }
                default -> System.out.println("输入错误，请重新输入");
            }

        }
    }
}

