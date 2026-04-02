package com.sort;


public class demo1 {
    public static void main(String[] args) {
        int[] arr = {5, 12, 90, 18, 77, 76, 45, 28, 59, 72};//将要排序的数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {//升序排序
                    //System.out.println("i:" + arr[i] + "j:" + arr[j]);
                    int temp = arr[i];//临时变量
                    arr[i] = arr[j];//赋值给i
                    arr[j] = temp;//赋值给j
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+"\t");
    }
}}



