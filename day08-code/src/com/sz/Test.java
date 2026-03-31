package com.sz;

public class Test {
    public static void main(String[] args) {

beishu(5);

    }

    public static void beishu(int a) {
        int sum=0;
       sum=a*1+a*11+a*111+a*1111+a*11111;
        System.out.println(a + "的五位数倍数和是"+ sum);


    }
}
