package com.obj3;

public class Dog {
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

    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public Dog() {
    }

    public void eat() {
        System.out.println("正在啃骨头");
    }

    public void lookHome() {
        System.out.print("正在看家");
    }

    public static void main(String[] args) {
        Dog MyDog1 = new Dog("黑色", "藏獒");

        System.out.print(MyDog1.getColor() + "的" + MyDog1.getBreed());
        MyDog1.eat();
        System.out.print(MyDog1.getColor() + "的" + MyDog1.getBreed());
        MyDog1.lookHome();
    }
}
