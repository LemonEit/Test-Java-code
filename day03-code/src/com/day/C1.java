package com.day;

public class C1 {
    public static void main(String[] args) {
        int num = 2, count = 0;
        System.out.println("100以内质数：");
        
        while (num <= 100) {
            int i = 2;
            int factors = 0;
            
            while (i <= num) {
                if (num % i == 0) {
                    factors++;
                }
                i++;
            }
            
            if (factors == 1) {
                System.out.print(num + " ");
                count++;
            }
            
            num++;
        }
        System.out.println("\n质数个数：" + count);
    }
}
