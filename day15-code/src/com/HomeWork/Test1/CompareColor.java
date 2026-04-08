package com.HomeWork.Test1;

public class CompareColor implements CompareAble {


    @Override
    public void compare(Apple a1, Apple a2) {
        if ("red".equals(a1.getColor()) ){
            System.out.println(a1);
        }
        else if ("red".equals(a2.getColor())){
            System.out.println(a2);
        }
    }
}
