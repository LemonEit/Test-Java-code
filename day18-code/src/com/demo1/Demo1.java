package com.demo1;

import com.sun.source.doctree.UsesTree;

public class Demo1 {
    public static void main(String[] args) {
        User[] user = new User[15];
        for (int i = 0; i < user.length; i++) {
            if (i < 5) {
                user[i] = new User(i + 1, "V1");
            } else if (i < 10) {
                user[i] = new User(i + 1, "V2");
            } else {
                user[i] = new User(i + 1, "A");
            }
            System.out.println(user[i]);
        }

    }
}
