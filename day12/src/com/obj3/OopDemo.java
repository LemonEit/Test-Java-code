package com.obj3;

public class OopDemo {
    private String name;
    private double height;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void wash() {//洗衣服
        System.out.println("洗衣服");
    }

    public void cook() {//做饭
        System.out.println("做饭");
    }

    public void show() {//展示信息
        System.out.println("姓名是" + name + "，身高是" + height + "，体重是" + weight);
    }

    public static void main(String[] args) {
        OopDemo myPerson = new OopDemo();
        myPerson.setName("小王");
        myPerson.setHeight(180.0);
        myPerson.setWeight(80.0);

        myPerson.wash();
        myPerson.show();
    }

}

