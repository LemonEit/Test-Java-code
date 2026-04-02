package com.day5;

public class M3 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int i = 1, sum = 0;
        while (i <= a) {
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
