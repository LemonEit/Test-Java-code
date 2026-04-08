package com.HomeWork.Test1;

public class Apple {
    private int size;
    private String color;

    /*满参构造*/
    public Apple(int size, String color) {
        this.size = size;
        this.color = color;
    }

    /*无参构造*/
    public Apple() {
    }

    /*获取苹果尺寸*/
    public int getSize() {
        return size;
    }

    /*设置苹果尺寸*/
    public void setSize(int size) {
        this.size = size;
    }

    /*获取苹果颜色*/
    public String getColor() {
        return color;
    }

    /*设置苹果颜色*/
    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "苹果尺寸：" + size + " 苹果颜色：" + color;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
