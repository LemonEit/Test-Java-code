package shuzu;
public class A4 {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {1, 3, 5, 7, 9};
        //2.定义变量存储最终的整数
        int num = 0;
        //3.对数组进行遍历
        for (int i = 0; i < arr.length; i++) {
            //4.计算，高位乘以10再加上当前位的值
            num = num * 10 + arr[i];
        }
        //5.打印结果
        System.out.println(num);
    }
}
