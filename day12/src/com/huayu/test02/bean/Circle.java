package com.huayu.test02.bean;

public class Circle {
    private double r;

    public double getR() {
        return r;
    }

    public Circle() {
    }//无参构造方法

    public Circle(double r) {
        this.r = r;
    }

    public void showPerimeter() {//计算周长
        System.out.println("周长是" + 2 * 3.14 * r);
    }

    public void showArea() {//计算面积
        System.out.println("面积是" + 3.14 * r * r);

    }
}

