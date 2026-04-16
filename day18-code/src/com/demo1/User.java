package com.demo1;

public class User {
    private int id;
    private String type;

    public User(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return id + "-" + type;
    }

}
