package com.ruandi.test;

import com.ruandi.bean.Rectangle;

/**
 * 测试类，用于测试 Rectangle 矩形类的功能
 * 演示矩形的创建、属性设置、面积和周长计算等操作
 */
public class Test07 {
    /**
     * 主方法，程序入口点
     * 测试 Rectangle 类的各项功能，包括创建对象、设置尺寸、计算面积和周长等
     *
     * @param args 命令行参数数组
     */
    public static void main(String[] args) {
        // 创建 Rectangle 对象
        Rectangle rect = new Rectangle();

        // 设置矩形的宽为 5，高为 10
        rect.setWidth(5);
        rect.setHeight(10);

        // 获取并打印长方形的面积和周长
        System.out.println("长方形的面积是" + rect.getArea() + "，长方形的周长是" + rect.getPerimeter());

        // 将矩形的宽和高都扩大为原来的 2 倍
        rect.setWidth(rect.getWidth() * 2);
        rect.setHeight(rect.getHeight() * 2);

        // 打印扩大后的矩形详细信息
        rect.getInfo();
    }
}
