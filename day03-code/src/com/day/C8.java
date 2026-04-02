package com.day;
import java.util.Scanner;
public class C8 {
    public static void main(String[] args) {
     java.util.Scanner scanner = new Scanner(System.in);
        System.out.print("请输入当月利润: ");
        double profit = scanner.nextDouble();
        double bonus = 0;
        if (profit <= 100000) {
            bonus = profit * 0.1;
        } else if (profit <= 200000) {
            bonus = 100000 * 0.1 + (profit - 100000) * 0.075;
        } else if (profit <= 400000) {
            bonus = 100000 * 0.1 + 100000 * 0.075 + (profit - 200000) * 0.05;
        } else if (profit <= 600000) {
            bonus = 100000 * 0.1 + 100000 * 0.075 + 200000 * 0.05 + (profit - 400000) * 0.03;
        } else if (profit <= 1000000) {
            bonus = 100000 * 0.1 + 100000 * 0.075 + 200000 * 0.05 + 200000 * 0.03 + (profit - 600000) * 0.015;
        } else {
            bonus = 100000 * 0.1 + 100000 * 0.075 + 200000 * 0.05 + 200000 * 0.03 + 400000 * 0.015 + (profit - 1000000) * 0.01;
        }

        System.out.println("应发放奖金总数: " + bonus);
    }
}
