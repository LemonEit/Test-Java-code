package com.hoomwork;

import java.util.Scanner;

public class A6 {

    // 接收三个整数，并在方法内部从大到小依次打印
    public static void printDesc(int a, int b, int c) {
        int[] arr = { a, b, c };

        // 冒泡排序（从大到小）
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        System.out.print("从大到小的顺序是: ");
        System.out.print(arr[0] + " " + arr[1] + " " + arr[2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 按题目要求从键盘输入三个整数
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();
        printDesc(a, b, c);
    }
}
