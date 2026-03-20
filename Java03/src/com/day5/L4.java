package com.day5;

public class L4 {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        int sum = 0;
        if (n <= 0) {
            System.out.println("输入的数小于等于0");
            return;
        }
        for (int i = 1; i <= n; i++) {
           if (i % 2 == 0){
               sum+=i;
           }else{
               sum-=i;
           }

        }System.out.println(sum);
    }


}
