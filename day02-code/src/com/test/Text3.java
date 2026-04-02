package com.test;

public class Text3 {
    public static void main(String[] args) {
    double a = 10.1,b = 20.2,c = 30.3,min;
    min=a<b?a:b;
    min=min<c?min:c;
        System.out.println(min);
    }
}
