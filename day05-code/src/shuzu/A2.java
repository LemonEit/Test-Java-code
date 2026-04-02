package shuzu;

public class A2 {
    public static void main(String[] args) {
    //1.定义数组
    double[] arr = {12.9,53.54,75.0,99.1,3.14};
    //2.定义变量代表最小值
    double min = arr[0];
    //3.对数组遍历
    for (int i = 1; i < arr.length; i++) {
        //4.判断
        if(arr[i] < min){
            min = arr[i];
        }
    }
    //4.打印最小值
    System.out.println("最小值是" + min);
}
}
