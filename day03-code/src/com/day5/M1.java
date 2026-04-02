package com.day5;

public class M1 {
    public static void main(String[] args) {
        int i = 0;
        while (i<=100){
            System.out.print(i+"\t");

            if (i%5==0) System.out.println();i++;
        }
        int a = 100;
        while (a>=0){
            System.out.print(a+"\t");
            a--;
            if (a%5==0)
                System.out.print("\n");
        }
    }
}
