package com.test;

public class A2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        //键盘录入星期
        System.out.println("请输入星期");
        String week = sc.next();
        switch (week) {
            case "星期一":
                System.out.println("今天是星期一应该跑步");
                break;
            case "星期二":
                System.out.println("今天是星期二应该打篮球");
                break;
            case "星期三":
                System.out.println("今天是星期三应该看慢走");
                break;
            case "星期四":
                System.out.println("今天是星期四应该骑山地自行车");
                break;
            case "星期五":
                System.out.println("今天是星期五应该游泳");
                break;
                case "星期六":
                    System.out.println("今天是星期六应该爬山");
                    break;
                    case "星期日":
                        System.out.println("今天是星期日胡吃海喝一顿");
                        break;
                        default:
                            System.out.println("输入的星期有误");
                            break;
        }

            }
        }
