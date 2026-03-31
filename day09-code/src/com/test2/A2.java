package com.test2;

/**
 * 素数判断程序
 * 统计并输出 101-200 之间的所有素数
 */
public class A2 {
    /**
     * 主方法 - 程序入口
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        int count = 0;
        
        for (int i = 101; i <= 200; i++) {
            if (ifSushu(i)) {
                count++;
                System.out.println(i);
            }
        }
    }

    /**
     * 判断一个数是否为素数
     * 素数定义：只能被 1 和自身整除的自然数
     * 
     * @param a 待判断的整数
     * @return 如果是素数返回 true，否则返回 false
     */
    public static boolean ifSushu(int a) {
        boolean flag = true;
        
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                flag = false;
            }
        }
        
        return flag;
    }
}
