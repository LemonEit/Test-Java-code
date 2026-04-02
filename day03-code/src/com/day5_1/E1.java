package com.day5_1;

public class E1 {
    public static void main(String[] args) {
        System.out.println("请输入一个正整数：");
        int n = new java.util.Scanner(System.in).nextInt();
        if (n < 0) {
            System.err.println("输入的数字不是正数");
            return;
        }
        String s = "";
        int sum = 0;
        while (true) {
            sum = n % 2;
            s = sum + s;
            n = n / 2;
            if (n == 0) {
                break;
            }

        }
        System.out.println(s);
    }
}
