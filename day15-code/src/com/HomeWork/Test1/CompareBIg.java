package com.HomeWork.Test1;

public class CompareBIg implements CompareAble {

    @Override
    public void compare(Apple a1, Apple a2) {
       if (a1.getSize() > a2.getSize()) {
           System.out.println(a1);
       }
       else if (a2.getSize() > a1.getSize()) {
           System.out.println(a2);
       }

    }
}
