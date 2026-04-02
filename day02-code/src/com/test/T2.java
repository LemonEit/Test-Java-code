package com.test;

import java.util.Scanner;
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的税前工资：");
        int money = sc.nextInt();//键盘录入税前工资
        double before = money-5000-(money*0.1);//减去5000的免征额，再减去三险一金，得到应纳税额
        //预定义各档位前置税额
        double shui = 0;//初始化税率为0
        double shui1 = 3000*0.03;//预定义超3000的税额
        double shui2 = shui1 + 9000*0.1;//预定义超9000的税
        double shui3 = shui2 + 13000*0.2;//预定义超13000的税
        double shui4 = shui3 + 10000*0.25;//预定义超10000的税
        double shui5 = shui4 + 20000*0.3;//预定义超20000的税
        double shui6 = shui5+ 25000*0.35;//预定义超25000的税
        /*如果税前工资大于0进入梯度判断*/
        if (before > 0)
        {
            if (before <= 3000) {
                shui = before * 0.03;
            } else if (before <= 12000) {
                shui = shui1 + (before - 3000) * 0.1;
            } else if (before <= 25000) {
                shui = shui2 + (before - 12000) * 0.2;
            } else if (before <= 35000) {
                shui = shui3 + (before - 25000) * 0.25;
            } else if ( before <= 55000) {
                shui = shui4 + (before - 35000) * 0.3;
            } else if (before <= 80000) {
                shui = shui5 + (before - 55000) * 0.35;
            } else  {shui = shui6 + (before - 80000) * 0.45;}
        }
        double after = money-shui- (money*0.1);
        System.out.println("个人所得税" + shui + "元");
        System.out.println("税后工资" + after + "元");
    }
}