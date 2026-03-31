package com.sz;

public class ShuZuTest1 {
    public static void main(String[] args) {
        int[] arr = new int[]{5,12,90,18,77,76,45,28,59,99};
        int[] newArr = getNewArr(arr);
        System.out.println("和："+newArr[0]);
        System.out.println("平均："+newArr[1]);
        System.out.println("最大"+newArr[2]);
        System.out.println("最小"+newArr[3]);


    }

    public static int[] getNewArr(int []arr) {
        //int[] arr = new int[]{5,12,90,18,77,76,45,28,59,72};  //创建一个数组
        int sum=arr[0],avg=arr[0],max=arr[0],min=arr[0];
        int[] newArr = new int[4];          //定义新数组
        for (int i = 0; i < arr.length; i++) { //遍历数组，在循环中累加和，并找出最大值和最小值
            sum=sum+arr[i];

            if(arr[i]>max) max=arr[i];
            if(arr[i]<min) min=arr[i];

        }
        avg=sum/arr.length;//计算平均值
        newArr[0]=sum;//赋值给新数组
        newArr[1]=avg;
        newArr[2]=max;
        newArr[3]=min;
                return newArr;
    }






}
