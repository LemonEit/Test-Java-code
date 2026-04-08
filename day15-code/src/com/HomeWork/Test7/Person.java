package com.HomeWork.Test7;

public abstract class Person  {
    public abstract void pee();
}
class Woman extends Person{
    @Override
    public void pee() {
        System.out.println("坐着尿");
    }
}
class Man extends Person{
    @Override
    public void pee() {
        System.out.println("站着尿");
    }
}