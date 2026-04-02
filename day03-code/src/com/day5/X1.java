package com.day5;

public class X1 {
    public static void main(String[] args) {
        int i=1000;
        do{
            int ab = i / 100;
            int cd = i % 100;
            if(((ab+cd)*(ab+cd))==i){
                System.out.println(i);
            }
            i++;
        }while (i<=9999);
    }
    public static void main1(String[] args) {
        int i = 1, count = 0;
        do {
            if (i%5==0&&i%3==0) System.out.print(i+(++count % 4 == 0?"\n":" "));
            i++;
        }while (i<=1000);
    }
}
