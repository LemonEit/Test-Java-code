package com.test2;

public class A6 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);//创建Scanner对象
        System.out.println("请输入4位密码");//提示信息
        int pwd = sc.nextInt();//用pwd接收密码
       int []arr ={pwd % 10,pwd/10 % 10,pwd /100 % 10,pwd /1000 % 10};//创建数组
        System.out.println("原始密码：" + pwd);
        System.out.println("加密后的密码："+fanzhuan(arr));
   }
    public static String fanzhuan(int arr[]) {
        int temp; String str = "";//定义变量保存结果
        //加5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]+5;
        }
        //对5取余
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
        //反转
        for (int i = 0, j = arr.length-1; i < arr.length/2; i++, j--) {//i从0开始，j从数组末尾开始，一个自增，一个自减
            temp = arr[i];//临时变量保存i的值
            arr[i] = arr[j];//i的值保存j的值
            arr[j] = temp;//j的值保存i的值（取回保存在temp里的i）
        }
        //转字符串
        for (int i = 0; i < arr.length; i++) {
            str+=arr[i];
        }
       return str;

    }
}
