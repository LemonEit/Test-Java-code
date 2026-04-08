package com.HomeWork.Test2;

public interface A {
    void showA();// 抽象方法
    default void showB(){// 默认方法
        System.out.println("BBBB");
    };
}
