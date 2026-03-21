package com.day;

public class C6 {
    public static void main(String[] args) {
        long sum = 0;
        long factorial = 1;

        for (int i = 1; i <= 20; i++) {
            factorial *= i;
            sum += factorial;
        }

        System.out.println("1!+2!+3!+...+20!的和: " + sum);
    }
}
