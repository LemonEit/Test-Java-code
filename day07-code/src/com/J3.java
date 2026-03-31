package com;

public class J3 {
    public static void main(String[] args) {

        int [] arr = {5, 12, 90, 18, 77, 76, 45, 28, 59, 72};//定义一个名为 arr 的数组
        int index = 2;//指定删除的索引位置
        // 从索引 2 开始，将后面的元素整体向前平移一位
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        
        // 数组末尾补 0
        if (index < arr.length) arr[arr.length - 1] = 0; // 数组末尾补 0
        
        for(int yuanSu : arr){
            System.out.print(yuanSu + " ");
        }
    }
}
