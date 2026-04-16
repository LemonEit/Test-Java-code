package com.ruandi.test15;
/*
* 这是一个圆形类
* */

public class Circle implements Graphic{
private double r;

    public Circle(double r) {
        this.r = r;
    }

    public Circle() {
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return 3.14 * r * r;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * r;
    }

    @Override
    public void getInfo() {
        System.out.println("圆形的面积是：" + getArea() + "，周长是：" + getPerimeter());
    }
}
