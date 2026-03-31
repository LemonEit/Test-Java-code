package com.obj;

public class Deno1 {
    public static void main(String[] args) {
        //创建手机对象
        Phone p = new Phone();
        //调用set方法赋值
        p.setBrand("小米");
        p.setPrice(3998);
        p.setColor("黑色");
        //调用打电话功能
        p.call();
        //调用发短信功能
        p.sendMessage();
    }
}
