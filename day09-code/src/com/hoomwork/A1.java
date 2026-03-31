package com.hoomwork;

public class A1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入商品总价");
        int a = sc.nextInt();//键盘输入商品总价
        if (a <= 0) {//判断商品总价是否小于等于0
            System.out.println("错误");
            System.exit(0);//退出程序
        }
        //调用方法计算打折后金额
        getPrice(a);
    }
    public static void getPrice(int a) {//定义一个无返回值的方法
        if (a < 100) {//判断商品总价是否小于100
            System.out.println("100元一下不打折" + "应付"+a+"元");
        } else//商品总价大于100
        if (a < 199) {//判断商品总价是否小于199
                System.out.println("100以上，199以下，打9.5折" + a*0.95+"元");
        } else//商品总价大于199
            System.out.println("200以上打8.5折"+ a*0.85+"元");
        }
    }
