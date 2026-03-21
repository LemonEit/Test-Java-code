package com.day;
public class C7 {
    public static void main(String[] args) {
        long numerator = 2, denominator = 1; // 分子、分母
        long nextNumerator = 3;
        double sum = 0;
        int count = 0;

        while (count < 20) {
            sum += (double) numerator / denominator;
            long temp = numerator;
            numerator = nextNumerator;
            nextNumerator = temp + nextNumerator;
            denominator = temp;

            count++;
        }

        System.out.println("前20项之和: " + sum);
    }
}
