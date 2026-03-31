package com.hoomwork;

public class A5 {
    public static void main(String[] args) {
    int a=10,b=20,c=30;//定义三个数
    int max2,max3;//定义两个最大值
   max2= max2(a,b);//调用方法，返回两个数的最大值
    max3=max3(a,b,c);//调用方法，返回三个数的最大值
    System.out.println(max2);
    System.out.println(max3);
}

    public static int max2(int a,int b) {//定义方法，返回两个数中的最大值
        if (a>b)//判断两个数大小
            return a;//返回最大值
        else//否则
            return b;//返回最大值

    }
    public static int max3(int a,int b,int c) {//定义方法，返回三个数中的最大值
        if (max2(a,b)>c) {//先调用方法判断前两个数大小
                return max2(a,b);}//返回最大值
            else  return c;//返回最大值

        }


    }
