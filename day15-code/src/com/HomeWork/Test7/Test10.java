package com.HomeWork.Test7;

public class Test10 {
    public static void main(String[] args) {
        Person[] p = new Person[5];
        p[0] = new Woman();
        p[1] = new Man();
        p[2] = new Woman();
        p[3] = new Man();
        p[4] = new Woman();

        for (int i = 0; i < p.length; i++) {
            p[i].pee();
        }
    }
}
