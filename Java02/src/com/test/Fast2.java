package com.test;
import java.util.Scanner;
public class Fast2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的税前工资：");
            //键盘录入税前工资
            int money = sc.nextInt();
            //扣除10%三险一金
            double before = money - (money*0.1) - 5000;
            //4.定义个税变量
            double shui = 0;
            //定义第一档满税
            double shui1 = 3000*0.03; //第一档满税
            double shui2 = 12000*0.1; //第二档满税
            double shui3 = 25000*0.2; //第三档满税
            double shui4 = 35000*0.25; //第四档满税
            double shui5 = 55000*0.3; //第五档满税
            double shui6 = 80000*0.35;//第六档满税
            //5.按照梯度范围计算个税数值
            if(before > 0 && before <=3000){        //扣完三险一金的金额大于0并且<=3000
                shui = before * 0.03;           //直接乘以3%
            }else if(before > 3000 && before <=12000){
                shui = shui1 + (before-3000) * 0.1;
            }else if(before > 12000 && before <=25000){
                shui = shui1 + 9000*0.1 +  (before-12000)*0.2; //13000*0.2
            }else if(before > 25000 && before <=35000){
                shui = shui1 + 9000*0.1 + 13000*0.2 + (before-25000)*0.25; //10000*0.25
            }else if(before > 35000 && before <=55000){
                shui = shui1 + 9000*0.1 + 13000*0.2 + 10000*0.25 + (before-35000)*0.3; //20000*0.3
            }else if(before > 55000 && before <=80000){
                shui = shui1 + 9000*0.1 + 13000*0.2 + 10000*0.25 + 20000*0.3 + (before-55000)*0.35; //25000*0.35
            }else if(before > 80000){
                shui = shui1 + 9000*0.1 + 13000*0.2 + 10000*0.25 + 20000*0.3 + 25000*0.35 + (before-80000)*0.45; //30000*0.45
            }
            //6.计算税后工资
            double after = money - (money*0.1) - shui;
            //7.打印个税和税后工资
            System.out.println("个人所得税" + shui + "元");
            System.out.println("税后工资" + after + "元");
        }
    }
