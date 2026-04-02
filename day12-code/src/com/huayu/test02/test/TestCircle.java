package com.huayu.test02.test;

import com.huayu.test02.bean.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle a = new Circle(9);
        System.out.println("半径为" + a.getR() + "圆形");
        a.showPerimeter();
        a.showArea();

    }
}
