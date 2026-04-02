package com.obj3;

public class Phone {
    private String brand;
    private double price;
    private String color;

    public String getBrand() {//获取品牌
        return brand;
    }

    public void setBrand(String name) {//设置品牌
        this.brand = name;
    }

    public double getPrice() {//获取价格
        return price;
    }

    public void setPrice(double price) {//设置价格
        this.price = price;
    }

    public String getColor() {//获取颜色
        return color;
    }

    public void setColor(String color) {//设置颜色
        this.color = color;
    }

    public void call() {//打电话
        System.out.println("打电话");
    }

    public void msg() {//发短信
        System.out.println("发短信");
    }


    public static void main(String[] args) {
        Phone MyPhone = new Phone();//创建一个手机对象
        MyPhone.setBrand("华为");//设置手机品牌
        MyPhone.setPrice(5999.99);//设置手机价格
        MyPhone.setColor("黑色");//设置手机颜色
        System.out.println("正在使用价格为" + MyPhone.getPrice() + "元的" + MyPhone.getColor() + MyPhone.getBrand() + "手机");
        MyPhone.call();//打电话

    }
}

