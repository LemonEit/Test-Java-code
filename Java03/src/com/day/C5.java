package com.day;

public class C5 {
    public static void main(String[] args) {
        double thickness = 0.01; // 纸张初始厚度(米)
        int height = 8848; // 珠穆朗玛峰高度(米)
        int folds = 0;
        
        while (thickness < height) {
            thickness *= 2;
            folds++;
        }
        
        System.out.println("需要折叠 " + folds + " 次");
        System.out.println("最终厚度: " + thickness + " 米");
    }
}
