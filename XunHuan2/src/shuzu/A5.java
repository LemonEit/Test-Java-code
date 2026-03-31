package shuzu;

public class A5 {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {72,89,65,87,91,82,71,93,76,68};
        //2.定义变量存储累加和
        double sum = 0;
        //3.遍历数组
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        //4.通过和求出平均数
        double avg = sum / arr.length;
        //5.打印平均数
        System.out.println("平均值是" + avg);
    }
}
