package com.obj;

public class Cat {//猫类
    private String color;//毛色
    private String breed;//品种

    public Cat() {
    }

    public Cat(String color, String breed) {//设置颜色和品种的方法
        this.color = color;
        this.breed = breed;
    }

    public String getColor() {//获取颜色
        return color;
    }

    public void setColor(String color) {//设置颜色
        this.color = color;
    }

    public String getBreed() {//获取品种
        return breed;
    }

    public void setBreed(String breed) {//设置品种
        this.breed = breed;
    }

    public void eat() {//吃的方法
        System.out.println(color + "的" + breed + "正在吃鱼.....");
    }

    public void catchMouse() {//抓老鼠的方法
        System.out.println(color + "的" + breed + "正在逮老鼠....");
    }
}
