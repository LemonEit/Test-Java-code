package com.obj2;

public class Calculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        Calculator jisuan = new Calculator();
        jisuan.name = "神威太湖之光";//设置计算器的型号
        jisuan.size = 100;//设置计算器的尺寸
        jisuan.add(a, b);//计算a+b
        jisuan.sub(a, b);//计算a-b
        jisuan.show();//展示计算器信息

    }

    public String name;
    public int size;

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void sub(int a, int b) {
        System.out.println(a - b);
    }

    public void show() {
        System.out.println("型号是" + name + "，大小是" + size);
    }

}
