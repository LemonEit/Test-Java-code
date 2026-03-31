package com.test2;

public class A8<arr> {
    public static void main(String[] args) {
        //1-33*6  1-16*1 7个数随机生成
        int[] arr = chouqu();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static int[] chouqu() {
        int[] arr = new int[7];//创建数组
        while (true) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 33 + 1);
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        i--;//跳出本次循环
                        break;
                    }
                }


            }break;        }
        //随机产生一个在1-16之间的数字，然后放到末尾
        arr[6] = (int) (Math.random() * 16 + 1);
        return arr;
    }
}





