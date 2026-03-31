package com.test;
public class A1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入星期");//提示信息
        String week = sc.next();//键盘录入星期
        if(week.equals("星期一")){System.out.println("今天是星期一应该跑步");//判断星期一
            if(week.equals("星期二")){//判断星期二
                System.out.println("今天是星期二应该打篮球");//判断星期二
                if(week.equals("星期三")){
                    System.out.println("今天是星期三应该看慢走");//判断星期三
                    if(week.equals("星期四")){
                        System.out.println("今天是星期四应该骑山地自行车");//判断星期四
                        if(week.equals("星期五")){
                            System.out.println("今天是星期五应该游泳");//判断星期五
                            if(week.equals("星期六")){
                                System.out.println("今天是星期六应该爬山");//判断星期六
                                if(week.equals("星期日")){
                                    System.out.println("今天是星期日胡吃海喝一顿");//判断星期日
                                }else System.out.println("输入的星期有误");//输入的星期有误
                            }
                        }
                    }
                }
            }
        }
    }

}
