package com.hoomwork;
public class A4{
    public static void main(String[] args) {
        // 定义数组
        int[] arr = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};

        System.out.println("调整前的数组：");
        printArray(arr);

        // 调用方法调整数组顺序
        reorderOddEven(arr);

        System.out.println("\n调整后的数组（奇数在前，偶数在后）：");
        printArray(arr);
    }

    /**
     * 调整数组顺序使得奇数位于偶数之前
     * 使用双指针法：左指针找偶数，右指针找奇数，找到后交换
     *
     * @param arr 待调整的整型数组
     */
    public static void reorderOddEven(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int left = 0;              // 左指针，从前往后找偶数
        int right = arr.length - 1; // 右指针，从后往前找奇数

        while (left < right) {
            // 左指针向右移动，直到找到偶数
            while (left < right && arr[left] % 2 != 0) {
                left++;
            }

            // 右指针向左移动，直到找到奇数
            while (left < right && arr[right] % 2 == 0) {
                right--;
            }

            // 交换左右指针指向的元素
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }

    /**
     * 打印数组元素
     *
     * @param arr 要打印的数组
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

