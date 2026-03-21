package com.day;

public class C4 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10, shi = i / 10 % 10, bai = i / 100 % 10;
            if (i == ge * ge * ge + shi * shi * shi + bai * bai * bai) {
                System.out.println(i + "是水仙花数");
            }
            Math.pow(ge, 3);
        }
    }

}
