package com;

public class J2 {
    
    public static void main(String[] args) {
        int []arr2=new int[]{5, 12, 90, 18, 77, 76, 45, 28, 59, 72};
        int temp=0 ;
        // 反转数组：交换对称位置的元素
        for (int i = 0, j = arr2.length - 1; i<=j; i++, j--) {
            temp = arr2[i];
            arr2[i] = arr2[j];
            arr2[j] = temp;
        }
        // 打印反转后的数组
        for(int yuanSu:arr2) {
        System.out.print(yuanSu + " ");
        }

    } 
    public static void main7(String[] args) {
        int []arr=new int[]{5, 12, 90, 18, 77, 76, 45, 28, 59, 72};
        
        // 反转数组：交换对称位置的元素
        for (int i = 0; i < arr.length / 2; i++) { //i<数组长度/2  数组长度=10 /2=5 两两交换只用交换五次a[0]=5 arr[5]=72
            // 定义变量 temp 存储 arr[i]  temp=a[0] a[0]=a[10] a[10]=a[0]

            // 交换 arr[i] 和 arr[arr.length - 1 - i]
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];               //?   [arr.length - 1 - i]
            arr[arr.length - 1 - i] = temp;
        }

        // 打印反转后的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
