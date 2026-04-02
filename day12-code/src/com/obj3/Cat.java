package com.obj3;

public class Cat {
    private String color;
    private String breed;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Cat() {
    }

    public Cat(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public void eat() {
        System.out.println("正在吃鱼");
    }

    public void catchMouse() {
        System.out.print("正在抓老鼠");
    }

    public static void main(String[] args) {
        Cat Mycat1 = new Cat("花色", "波斯猫");

        System.out.print(Mycat1.color + "的" + Mycat1.getBreed());
        Mycat1.eat();
        System.out.print(Mycat1.color + "的" + Mycat1.getBreed());
        Mycat1.catchMouse();

    }

}
