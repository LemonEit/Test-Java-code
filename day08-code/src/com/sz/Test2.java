package com.sz;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int flag;
        yidon(arr, 7);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
    public static void yidon(int[] arr, int flag) {
        for (int i = 0; i < arr.length; i++) {//遍历数组
            if (arr[i] == flag ) {
                arr[i]=222;
            }
            }

        }
    }

