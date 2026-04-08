package com.HomeWork.Test5;

/**
 * 测试类，演示使用不同过滤器对用户进行批量处理
 */
public class Test5 {
    /**
     * 主方法，创建用户数组并使用三种不同的过滤器分别处理不同范围的用户
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        User []user = new User[15];
        for (int i = 0; i < user.length; i++) {
            user[i]=new User(null, i+1);
        }
        /**
         * 创建三个接待员对象
         * */
        V1Filter filter1 = new V1Filter();
        V2Filter filter2 = new V2Filter();
        AFilter filter3 = new AFilter();

        //1号接待前5个用户,数组索引从0开始,所以5号的索引为4
        for (int i = 0; i <5; i++) {
            filter1.filterUser(user[i]);
        }

        // 2号第6到第10个用户
        for (int i = 5; i <10; i++) {
            filter2.filterUser(user[i]);
        }

        // 3号接待11-15用户
        for (int i = 10; i < 15; i++) {
            filter3.filterUser(user[i]);
        }

        // 输出所有用户信息
        for (int i = 0; i < user.length; i++) {
            System.out.println(user[i]);
        }


    }
}
