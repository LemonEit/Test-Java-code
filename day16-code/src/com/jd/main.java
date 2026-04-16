package com.jd;

import java.util.Scanner;

public class main {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        try {
            while (true) {
                shouMain();//显示主菜单
                menu();//菜单功能
            }
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }

    /*显示主菜单*/
    private static void shouMain() {
        System.out.println("********欢迎进入京东商城*******");
        System.out.println("1.添加商品");
        System.out.println("2.查看所有商品");
        System.out.println("3.查看指定编号商品");
        System.out.println("4.添加到购物车");
        System.out.println("5.显示购物车");
        System.out.println("6.退出");
        System.out.println("****************************");
        System.out.println("请选择菜单:");
    }

    public static void menu() {//菜单功能
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                new ShangPing().add();//添加商品
                break;
            case 2:
                new ShangPing().showAll();//查看所有商品
                break;
            case 3:
                new ShangPing().showOne();//查看指定编号商品
                break;
            case 4:
                new Cart().addToCart();//添加到购物车
                break;

            case 5:
                new Cart().showCart();//显示购物车
                break;
            case 6:
                System.exit(0);
                break;
        }

    }

}
