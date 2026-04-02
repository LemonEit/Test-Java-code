package com.day;
public class C7 {
    public static void main(String[] args) {
        long numerator = 2, denominator = 1; // 初始化第一项的分子(2)和分母(1)，即2/1
        long nextNumerator = 3; // 下一项的分子，初始为3
        double sum = 0; // 累计前20项的和
        int count = 0; // 计数器，控制循环执行20次

        while (count < 20) {
            //System.out.println(numerator + "/" + denominator); // 输出当前分数项
            sum += (double) numerator / denominator; // 将当前分数值累加到总和中
            long temp = numerator; // 临时保存当前分子
            numerator = nextNumerator; // 当前分子更新为下一项的分子
            nextNumerator = temp + nextNumerator; // 计算新的下一项分子（斐波那契规律）
            denominator = temp; // 分母更新为原来的分子值

            count++; // 计数器递增
        }

        System.out.println("前20项之和: " + sum); // 输出最终的累加结果
    }
}
