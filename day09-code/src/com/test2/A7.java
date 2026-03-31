package com.test2;

public class A7 {
    public static void main(String[] args) {
        //创建奖池
        int[] arr = {2, 588, 888, 1000, 10000};
        int[] newarr = new int[arr.length];
        //调用抽奖方法
        newarr = choujiang(arr);
        for (int i = 0; i < newarr.length; i++) {
            System.out.println(newarr[i] + "元的奖金被抽出");
        }
    }

    public static int[] choujiang(int[] arr) {
        int count = 0;//中奖次数
        int count2 = 0;//总抽奖次数
        int[] newarr = new int[arr.length];//新的数组
        // 抽到的数会被改为-1，当抽到-1时，就重新抽奖，当arr中都为-1时，抽奖结束
        while (true) {
            count2++;//总抽奖次数
            int index = (int) (Math.random() * arr.length);//随机数，代表奖品索引
            if (arr[index] != -1) {//如果奖品不为-1
                newarr[count] = arr[index];
                count++;//中奖次数加1
                arr[index] = -1;//抽中的奖品改为-1
            }
            if (count == arr.length) {//中奖次数等于奖品数量
                System.out.println("抽奖结束");//输出抽奖结束
                break;
            }//中奖次数等于奖品数量抽奖结束
        }
        System.out.println("本次抽奖共抽" + count2 + "次");//输出抽奖次数

        return newarr;
    }
}

