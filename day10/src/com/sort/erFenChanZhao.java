package com.sort;

public class erFenChanZhao {
    public static void main(String[] args) {
      int []arr={12,4,54,5,454,54,545,45,4};
        排序(arr);
        int end = arr.length - 1, start = 0, mid;
        int index = 454;
        while (true) {
            mid = (start + end) / 2;//计算中间索引
            if (arr[mid]<index) {//大于中间索引说明，这个数在左半边
                start = mid + 1;

            } else if (arr[mid]>index ) {//小于中间索引说明，这个数在右半边

                end = mid - 1;
            } else {
                System.out.println("找到索引为：" + mid);
                break;
            }
            if (start > end) {
                System.out.println("没有找到");
                break;
            }
        }
    }

    public static void 排序(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

}
