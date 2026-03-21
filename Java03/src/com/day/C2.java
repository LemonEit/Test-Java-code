package com.day;

import java.util.Random;
import java.util.Scanner;

public class C2 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = 100 + random.nextInt(101); // 100-200之间的随机数
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("生成的随机数x: " + x);
        System.out.print("请输入一个10以内的整数y: ");
        int y = scanner.nextInt();
        
        if (y >= 1 && y <= 10) {
            if (x % y == 0) {
                System.out.println(x + "是" + y + "的倍数");
            } else {
                System.out.println(x + "不是" + y + "的倍数");
            }
        } else {
            System.out.println("请输入1-10之间的整数！");
        }
    }
}
