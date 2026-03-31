package com.test2;

public class A5 {
    public static void main(String[] args) {
        int avgscore = 0;//定义变量保存平均分
        int[] arr = new int[6];//定义数组保存6个评委打分
        java.util.Scanner sc = new java.util.Scanner(System.in);//创建Scanner对象
        for (int i = 0; i < 6; i++) {//遍历数组，录入数据
            System.out.println("请输入第" + (i + 1) + "个评委打分");//提示信息
            arr[i] = sc.nextInt();//录入数据

        }
        avgscore = avgscore(arr);//调用方法
        System.out.println("平均分是：" + avgscore);//输出平均分

    }

    public static int avgscore(int[] arr) {//定义方法
        int sum = 0, avgscore = 0, max = arr[0], min = arr[0];//定义变量保存和，最大值，最小值
        for (int i = 0; i < arr.length; i++) {//遍历数组，求和并找出最大值和最小值

            if (arr[i]>max) {//判断最大值
                max = arr[i];
            }
            if (arr[i]< min) {//判断最小值
                min = arr[i];
            }
            sum = sum + arr[i];//累加和
        }
        avgscore = (sum - max - min) / (arr.length-2);//减去最大值和最小值，求平均分


        return avgscore;//返回平均分
    }
}
