package com.test2;
//删除数组中的重复元素
public class A4 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 1, 0, 1, 5};//原数组
        int count = 0;//用来确定新数组的长度
        // 标记重复元素为 -1，遇到-1，则跳过
        /*下面的for循环是判断重复元素，把重复的元素改为-1，计数器累加，这样，count就是新数组的长度 * */
        for (int i = 0; i < arr.length; i++) {//遍历每一个元素
            for (int j = i + 1; j < arr.length; j++) {
                //arr[i] 是当前数，会和他后面的全部元素进行比较，被比较的元素，如果相等则改为-1，并计数，当判断到的数值等于-1，则跳过，因为已经被标记为-1
                if (arr[i] == -1) {//判读是不是比较过的元素，判断过的元素跳过
                    continue;
                }
                if (arr[i] == arr[j]) {//判断两个元素是否相等
                    arr[j] = -1;//将重复的元素改为-1
                    count++;//计数
                }
            }
        }
        int []newArr = new int[arr.length-count];//新建一个数组，用于存储去重后的元素,长度减去重复的元素个数
        //循环赋值不是-1的元素
        int flag = 0;//决定新数组中的索引，arr[y]不等于-1，则赋值给newArr[flag]，flag加1，否则跳过
        for (int y = 0; y < arr.length; y++) {
            if (arr[y] != -1) {
                newArr[flag] = arr[y];
                flag++;
            }
        }
        System.out.println("去重后的数组为：");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}


