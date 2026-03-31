package com.test;

public class A3 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {//循环100次
            if (i % 7 == 0||i % 10 == 7 || i / 10 == 7) {//判断是否能被7整除，或者末尾是7，或者中间是7
                System.out.print(i+"\t");//输出
            }

        }
    }
}
