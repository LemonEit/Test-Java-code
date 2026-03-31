package com.hoomwork;

public class A2 {
    public static void main(String[] args) {
        float[] arr = new float[]{5.5f, 12.5f, 90.5f, 18.5f, 77.5f, 76.5f, 45.5f};//创建一个数组
        float avgavg=getavg(arr);//调用方法并传参，赋值给变量avg
        System.out.println("平均值是"+avgavg);//输出平均值
    }
    public static float getavg(float[] arr) {//定义方法，参数为数组
        float sum=0;//定义变量sum，用于存储数组元素的和
        float avg=0;//定义变量avg，用于存储平均值
        for (int i = 0; i <=arr.length-1; i++) {//遍历数组
            sum=sum+arr[i];//累加数组元素
        }
        return avg=sum/arr.length;//返回平均值
    }
}
