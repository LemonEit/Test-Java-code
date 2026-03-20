package com.test;

public class T1 {
    public static void main(String[] args) {
        int a,b; //a=卖二手，b=以旧换新
        a=7988-1500;
        b=(int)(7988*0.8);
        //System.out.println(a+":"+b);
        if (a>b)
            System.out.println("以旧换新更划算");
        else
            System.out.println("买二手再买更划算");
    }
    public static void main1(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("请输入三个数：");//提示信息
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();//获取三个数
        if (a<b&&a<c)
            System.out.println(a+"是最小的数");
        else if (b<a&&b<c)
            System.out.println(b+"是最小的数");
        else
            System.out.println(c+"是最小的数");

    }
    public static void main2(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        double d;      //d=利息
        System.out.println("请输入存钱金额：");
        double c=sc.nextDouble();
        System.out.println("请输入存钱年限：");
        int b=sc.nextInt();
        //须判断金额大于1000&&年限为1、2、3、5
        if (c>=1000&&(b==1||b==2||b==3||b==5)){
            if (b==1)
                d=c*0.0225*1;
            else if (b==2)
                d=c*0.027*2;
            else if (b==3)
                d=c*0.0325*3;
            else
                d=c*0.036*5;
            System.out.println("本息总额为："+(c+d));
        }else System.out.println("金额须大于1000，年份须在1/2/3/5内");


    }
   public static void main3(String[] args) {
       double c;
       java.util.Scanner sc=new java.util.Scanner(System.in);
       System.out.println("请输入购物金额：");
       int a=sc.nextInt();   //a是购物金额
       System.out.println("请输入顾客类别：");
       int b=sc.nextInt();   //b是顾客类别
       if (b==0){      //判断是不是会员
           if (a<100) //不是会员，购物金额小于100不打折，直接将a赋值给c
               c=a;
           else
               c=a*0.9;//购物金额大于100，打9折
       }else{   //进入会员打折多少判断
           if (a<200)//会员购物金额小于200，打8折
               c=a*0.8;
           else//会员购物金额大于200，打7.5折
               c=a*0.75;
       }
       System.out.println("应付金额："+c);//输出应付金额
   }


}
