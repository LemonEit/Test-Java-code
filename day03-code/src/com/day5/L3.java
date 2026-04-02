package com.day5;

public class L3 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        if (a <= 0) {
            System.out.println("输入的数小于等于0");
            return;
        }
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
