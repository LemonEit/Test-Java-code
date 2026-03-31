package com.sz;

public class A1 {
    public static void main(String[] args) {
        int sum = 0;

//        int [][] arr = new int[][]{{35,56,78}, {66,59,70,58}, {75,81,76,90,56}};
        int [][] arr = new int[3][];//定义三个班级
        arr[0] = new int[3];//定义第一个班级人数为3
        arr[1] = new int[4];//定义第二个班级人数为4
        arr[2] = new int[5];//定义第三个班级人数为5
        //录入数据
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               java.util.Scanner sc = new java.util.Scanner(System.in);
                  //请输入 第一个班级第j个学生的分数：
                   System.out.println("请输入 第" + (i + 1) + "个班级第" + (j + 1) + "个学生的分数：");
               arr[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
                sum += arr[i][j];
            }
            System.out.println();
        }
    }

}
