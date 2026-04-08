package com.HomeWork.Test1;

public class Test {
    public static void main(String[] args) {
        Apple apple1 = new Apple(5, "green");
        Apple apple2 = new Apple(10, "red");

        Worker worker1 = new Worker();
        Worker worker2 = new Worker();


        worker1.pickApple(new CompareBIg(), apple1, apple2);
        worker2.pickApple(new CompareColor(), apple1, apple2);
    }
}
