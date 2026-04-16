package com.demo1;

public class Demo2 {
    public static void main(String[] args) {
        User[] user1 = new User[15];
        for (int i = 0; i < user1.length; i++) {
            user1[i] = new User(i + 1, null);
        }

        Filer filer1 = new Filer() {
            @Override
            public void filter(User user) {
                user.setType("V1");
            }
        };
        Filer filer2 = new Filer() {
            @Override
            public void filter(User user) {
                user.setType("V2");
            }
        };
        Filer filer3 = new Filer() {
            @Override
            public void filter(User user) {
                user.setType("A");
            }
        };
        for (int i = 0; i < 5; i++) {
            filer1.filter(user1[i]);
        }
        for (int i = 5; i < 10; i++) {
            filer2.filter(user1[i]);

        }
        for (int i = 10; i < 15; i++) {
            filer3.filter(user1[i]);
        }
        for (User user : user1) {
            System.out.println(user);
        }
        /*
          for (int i = 0; i < user.length; i++) {
            if (i < 5) {
                filer1.filter(user1[i]);
            } else if (i < 10) {
                 filer2.filter(user1[i]);
            } else {
                filer3.filter(user1[i]);
            }
            System.out.println(user[i]);
        }
        * */



    }


}
