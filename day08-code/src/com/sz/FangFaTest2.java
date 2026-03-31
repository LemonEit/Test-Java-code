package com.sz;

public class FangFaTest2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        java.util.Scanner sc = new java.util.Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(getScore(arr));

    }
    public static int getScore(int[] arr) {
        int count = 0;
        int avg = 0;
        int sum = 0;
        //求和
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        avg=sum/arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >avg) {
                count++;
            }
        }

        return count;
    }
}
