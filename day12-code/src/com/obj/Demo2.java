package com.obj;

public class Demo2 {
    public static void main(String[] args) {
        //创建女朋友对象
        Girlfriend gf = new Girlfriend("凤姐",155,130);
        //调用展示方法
        gf.show();
        //调用洗衣服方法
        gf.wash();
        //调用做饭方法
        gf.cook();
    }
}