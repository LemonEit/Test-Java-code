package com.test2;

/**
 * 机票价格计算系统
 * 根据月份和舱位类型计算机票折扣价格
 */
public class A1 {
    /**
     * 主方法 - 程序入口
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.println("请输入机票原价");
        double price = sc.nextDouble();
        
        System.out.println("请输入月份");
        int month = sc.nextInt();
        
        System.out.println("请输入舱位，经济舱/头等舱");
        String c = sc.next();
        
        if((price <= 0 || month < 1) || (month > 12 || month < 1)) {
            System.out.println("输入有误");
            System.exit(0);
        }
        
        getPrice(price, month, c);
    }

    /**
     * 根据月份和舱位计算折扣后的机票价格
     * 旺季（5-10 月）：经济舱 8.5 折，头等舱 9 折
     * 淡季（1-4 月、11-12 月）：经济舱 7 折，头等舱 6 折
     * 
     * @param price 机票原价
     * @param month 月份（1-12）
     * @param c 舱位类型（"经济舱" 或 "头等舱"）
     */
    public static void getPrice(double price, int month, String c) {
        // 判断是否是旺季（5-10 月）
        if(month >= 5 && month <= 10) { 
            if(c.equals("经济舱")){
                price = price * 0.85;
                System.out.println("旺季经济舱 8.5 折" + price);
            } else if(c.equals("头等舱")){
                price = price * 0.9;
                System.out.println("旺季头等舱 9 折" + price);
            } else {
                System.out.println("输入的舱位有误");
            }
        }
        // 进入淡季判断（1-4 月、11-12 月）
        else if(month < 5 || month > 10) { 
            if(c.equals("经济舱")){
                price = price * 0.7;
                System.out.println("淡季经济舱 7 折" + price);
            } else if(c.equals("头等舱")){
                price = price * 0.6;
                System.out.println("淡季头等舱 6 折" + price);
            } else {
                System.out.println("输入的舱位有误");
                System.out.println("请重新输入舱位");
            }
        }
    }
}
