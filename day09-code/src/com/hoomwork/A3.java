package com.hoomwork;

public class A3 {
    public static void main(String[] args) {
        mianji(5);//只传一个参数,自动匹配参数到园的面积
        mianji(5, 10);//传两个参数，自动匹配参数到矩形的面积

    }

    public static void mianji(double a) {//圆形没有长和宽，只有半径r，所以输入一个参数，返回面积
        System.out.print("半径为" + a + "的圆形面积为" + Math.PI * a * a);//圆面积=π*r*r
    }

    public static void mianji(double a, double b) {//矩形有长和宽，所以输入2个参数，返回面积
        System.out.print("长为" + a + "宽为" + b + "的矩形的面积为" + a * b);//矩形面积=长*宽

    }

}
