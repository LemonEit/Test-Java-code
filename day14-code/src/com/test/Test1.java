package com.test;

public class Test1 {
    public static void main(String[] args) {
        Employee e1 = new Employee( 1, "Tom", 18, 5000);
        e1.getInfo();
        Programmer p1 = new Programmer( 2, "Jerry", 19, 6000, "Java");
        p1.getInfo();
        Designer d1 = new Designer( 3, "Mike", 20, 7000, "Java", 5000);
        d1.getInfo();
        Architect a1 = new Architect( 4, "Lucy", 21, 8000, "Java", 5000, 10000);
        a1.getInfo();



    }
}
