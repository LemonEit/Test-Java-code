package com.day5_1;

public class M1 {
    public static void main(String[] args) {
        int a=5;
        float g= 1.0F;
        short o=5;
        o= (short) (o+5);
        System.out.println(o);
        System.out.println("5" + 2+2);
        String s= "";
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                if(j <= a-i)System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
