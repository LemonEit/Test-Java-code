package com;

import java.util.Scanner;

public class Calculaion {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Calculaion c = new Calculaion();

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();
        System.out.println(a + "+" + b + " = " + c.add(a, b));
        System.out.println(a + "-" + b + " = " + c.sub(a, b));
        System.out.println(a + "*" + b + " = " + c.times(a, b));
        System.out.println(a + "/" + b + " = " + c.div(a, b));
    }
}