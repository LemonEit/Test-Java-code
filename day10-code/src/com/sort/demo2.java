package com.sort;

import java.util.Arrays;

public class demo2 {
    public static void main(String[] args) {
        int[] arr = {5, 12, 90, 18, 77, 76, 45, 28, 59, 72};
       for (int i = 1; i < arr.length; i++) {
            for(int j= 0; j< arr.length-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
