package shuzu;

public class A7 {
    public static void main(String[] args) {
        //1.定义数组
        double[] arr = {10.4,-3,-6.2,1.2,-6.1,-19,-3.8,0.9,-4.5,5.5};
        //2.定义统计赚钱个数的变量
        int count1 = 0;
        //3.定义统计赔钱个数的变量
        int count2 = 0;
        //4.遍历数组
        for (int i = 0; i < arr.length; i++) {
            //4.1判断股票是赔钱还是赚钱
            if(arr[i] > 0){
                count1++;
            }else{
                count2++;
            }
        }
        //5.打印结果
        System.out.println("赚钱的股票共：" + count1 + "只");
        System.out.println("赔钱的股票共：" + count2 + "只");
    }
}
