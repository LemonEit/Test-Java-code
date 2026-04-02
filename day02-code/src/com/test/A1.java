package com.test;

public class A1 {
    public static void main(String[] args) {
        double dadHight = 1.7, momHight = 1.6;
        System.out.println("儿子身高等于" + (dadHight + momHight) * 1.08 / 2);
        System.out.println("女儿身高等于" + (dadHight * 0.923 + momHight) / 2);
        System.out.println("-------------------------------");

        int a = 21, b = 24;
        int a1 = a * 2 + 3, b1 = b * 2;
        if (a1==b1)
            System.out.println("红茶和绿茶现在的钱一样多");
        else
            if (a1>b1)
            System.out.println("红茶比绿茶多");
        else System.out.println("绿茶比红茶多");
        System.out.println("-------------------------------");
        double x=24+8+3,y=16+8+3;
        x =  x >= 30 ? x=x*0.8 : x;
                //System.out.println("第一种花费"+x+"元" + "，第二种花费" + y+"元");
                System.out.println(x>b?"第二种购买方式划算须"+y+"元":"第一种购买方式划算须"+x+"元");
        System.out.println("-------------------------------");
        int sl = 100;
        double jg = 55.55;
        long year=4600000000L;
        boolean isMale = (5/2==0);
                System.out.println("班级人数"+sl);
                System.out.println("商品价格"+jg);
                System.out.println("地球年龄"+year);
                System.out.println("5是偶数"+isMale);



    }
}
