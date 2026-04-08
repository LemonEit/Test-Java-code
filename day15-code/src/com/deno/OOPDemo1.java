package com.deno;

public class OOPDemo1 {
    public static void main(String[] args) {
        // 创建对象
        Person p1 = new Person("mike", 18, 'm');
        Person p2 = new Person("mike", 18, 'm');

   p1.show();
   p2.show();
   System.out.println(p1.equals(p2) );

    }
}
