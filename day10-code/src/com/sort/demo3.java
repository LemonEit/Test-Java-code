package com.sort;

import java.util.Arrays;

public class demo3 {
    public static void main(String[] args) {
        int[] arr = {5, 12, 90, 18, 77, 76, 45, 28, 59, 72};//将要排序的数组
        for (int i = 0; i < arr.length - 1; i++) {//循环次数
            int min = arr[i];
            int index = i;
            //i从0开始，所以每次开始比较的范围都会减少
            for (int j = i + 1; j < arr.length; j++) {//找到最小的数和索引，每找到一次j的索引，i就加1
                if (arr[j] < min) {//升序排序
                    min = arr[j];
                    index = j;//索引
                }

            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}

