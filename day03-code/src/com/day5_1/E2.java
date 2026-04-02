package com.day5_1;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个整数：");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println(n + " 不是质数");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime ? (n + " 是质数") : (n + " 不是质数"));
    }
}