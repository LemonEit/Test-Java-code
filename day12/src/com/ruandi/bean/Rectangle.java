package com.ruandi.bean;

/**
 * 矩形类，用于表示和操作长方形几何图形
 * 包含矩形的宽度和高度属性，以及计算面积和周长的方法
 */
public class Rectangle {
    private double width;
    private double height;

    /**
     * 获取矩形的宽度
     *
     * @return 矩形的宽度值
     */
    public double getWidth() {
        return width;
    }

    /**
     * 设置矩形的宽度
     *
     * @param width 要设置的宽度值
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * 获取矩形的高度
     *
     * @return 矩形的高度值
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置矩形的高度
     *
     * @param height 要设置的高度值
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * 计算矩形的面积
     *
     * @return 矩形的面积值（宽度 × 高度）
     */
    public double getArea() {
        return width * height;
    }

    /**
     * 计算矩形的周长
     *
     * @return 矩形的周长值（(宽度 + 高度) × 2）
     */
    public double getPerimeter() {
        return (width + height) * 2;
    }

    /**
     * 带参数的构造函数，初始化矩形的宽度和高度
     *
     * @param width  矩形的初始宽度值
     * @param height 矩形的初始高度值
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * 无参构造函数，创建默认的空矩形对象
     */
    public Rectangle() {
        //this(1.0, 3.0);
    }

    /**
     * 打印矩形的详细信息，包括宽度、高度、面积和周长
     * 在控制台输出矩形的所有基本属性信息
     */
    public void getInfo() {
        System.out.println("长方形的宽是" + width + "，长方形的高是" + height);
        // 调用 getArea 打印面积，调用 getPerimeter 打印周长
        System.out.println("长方形的面积是" + getArea());
        System.out.println("长方形的周长是" + getPerimeter());
    }
}
