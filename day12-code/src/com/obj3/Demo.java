package com.obj3;

public class Demo {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.setBrand("小米");
        phone1.setPrice(5999999.99);
        phone1.setColor("紫色");
        System.out.println("正在使用价格为" + phone1.getPrice() + "元的" + phone1.getColor() + phone1.getBrand() + "手机");
        phone1.call();
        phone1.msg();


    }

}
