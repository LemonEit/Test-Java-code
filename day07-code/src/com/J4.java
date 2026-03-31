package com;

public class J4 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};//创建一个数组
        int index = 6;//定义索引位置
        int [] newArr = new int[arr.length - 1];//创建一个新数组长度为原数组减1
        for (int i = 0; i < arr.length; i++) {                             //遍历原数组
            if (i < index) {//如果当前索引小于目标索引
                newArr[i] = arr[i];//原数组元素直接赋给新数组不做处理
            } else {//如果当前索引大于目标索引
                newArr[i - 1] = arr[i];//原数组元素，赋给新数组的索引减1的位置
            }
        }//最终效果：索引6的元素被删除，整体向前平移一位，最后索引位置的元素被删除
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }


    }
}
