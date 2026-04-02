package com.sort;

import java.util.Arrays;

public class paiXu {
    public static void main(String[] args) {
        int[] arr = {5, 12, 90, 18, 77, 76, 45, 28, 59, 72};//将要排序的数组
        for (int i = 0; i < arr.length; i++) {//循环次数
            int min = arr[i];//定义最小值
            int index = i;//定义最小值索引
            for (int j = i + 1; j < arr.length; j++) {//这个循环用来找到最小值，和最小值索引
                if (arr[j] < min) {
                    min = arr[j];
                    index = j; }

            }
            //找到最小值后，将最小值和i交换位置，第一轮i是0，第二轮i是1，第三轮i是2，。。。。。每次找到最小值就与a[i]交换位置
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
