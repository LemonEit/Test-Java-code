package com.day;

public class C9 {
    public static void main(String[] args) {
        int number = 12321;
        int wan = number / 10000;
        int qian = (number / 1000) % 10;
        int shi = (number / 10) % 10;
        int ge = number % 10;
        if (ge == wan && shi == qian) {
            System.out.println(number + " 是回文数");
        } else {
            System.out.println(number + " 不是回文数");
        }
    }
}
