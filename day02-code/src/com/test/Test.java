package com.test;

public class Test {
    public static void main(String[] args) {
        // 片段1
        int a = 10;
        {
            a = 20;
            System.out.println(a);
        }

// 片段2
        {
            int b = 20;
            System.out.println(b);
        }
      /*  b = 30;
        System.out.println(b);
        因为第14行定义的b在{}内，属于局部变量，所以此处会出现变量b未定义错误，
        修改方案1：// 片段2
   {
     int b = 20;
     System.out.println(b);
        }
           int b = 30;
                System.out.println(b);
                方案2
                // 片段2
{
    int b = 20;
    System.out.println(b);
}
int b = 30;
System.out.println(b);
        */
    }
}
