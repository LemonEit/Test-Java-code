package shuzu;

import java.io.IOException;
import java.util.Random;

public class A3 {
    public static void main(String[] args) throws IOException {
        //1.创建随机数对象
        Random r = new Random();
        //2.定义长度为6的数组
        int[] arr = new int[6];
        //3.循环给数组赋值
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(100);
            arr[i] = num;
        }
        //4.定义求和变量
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        //5.打印结果
        System.out.println("和是" + sum);
    }
}
