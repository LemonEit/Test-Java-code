package com;

public class J6 {
    public static void main(String[] args) {
        int []arr=new int[]{95, 92, 75, 56, 98, 71, 80, 58, 91, 91};//创建一个数组
        int max=arr[0], min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) max=arr[i];
            if (arr[i]<min) min=arr[i];

        }
        System.out.println("最大值是"+max+"最小值是"+min);
    }
}
