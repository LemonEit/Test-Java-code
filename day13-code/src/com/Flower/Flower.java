package com.Flower;

import java.util.Scanner;

/**
 * 七彩鲜花销售管理系统主类
 * 提供系统菜单展示和功能调度入口
 */
public class Flower {
    /**
     * 程序主入口方法
     * 实现用户菜单展示和功能选择调度
     *
     * @param args 命令行参数，本程序未使用
     */
    public static void main(String[] args) {
        FlowerService flowerService = new FlowerServiceImpl();

        /* 无限循环显示主菜单，直到用户选择退出 */
        while (true) {
            System.out.println("=========================欢迎光临\"七彩鲜花\"销售管理系统===================================");
            System.out.println("1.查询销售订单");
            System.out.println("2.修改销售订单");
            System.out.println("3.删除销售订单");
            System.out.println("4.添加销售订单");
            System.out.println("5.退出系统");
            System.out.println("==================================================================================");

            Scanner sc = new Scanner(System.in);
            String input = sc.next();

            switch (input) {
                case "1" -> ((FlowerServiceImpl) flowerService).searchAllConsole();
                case "2" -> ((FlowerServiceImpl) flowerService).updateSaleConsole();
                case "3" -> ((FlowerServiceImpl) flowerService).deleteSaleConsole();
                case "4" -> ((FlowerServiceImpl) flowerService).addSaleConsole();
                case "5" -> {
                    System.out.println("系统退出感谢使用");
                    return;
                }
                default -> System.out.println("输入错误请重新输入");
            }
        }
    }
}
