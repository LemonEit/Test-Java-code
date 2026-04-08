package com.HomeWork.Test5;

/**
 * 用户类，包含用户的基本信息和操作方法
 */
public class User {
    private String name;//用户类型
    private int id;//用户ID

    /**
     * 构造方法，创建指定名称和ID的用户对象
     *
     * @param name 用户名称
     * @param id 用户ID
     */
    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    /**
     * 无参构造方法
     */
    public User() {
    }

    /**
     * 获取用户名称
     *
     * @return 用户名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户名称
     *
     * @param name 用户名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取用户ID
     *
     * @return 用户ID
     */
    public int getId() {
        return id;
    }

    /**
     * 设置用户ID
     *
     * @param id 用户ID
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 显示用户信息，格式为ID拼接名称
     */
    public void show(){
        System.out.println(id+name);
    }

    /**
     * 重写toString方法，返回用户信息的字符串表示
     *
     * @return 格式为"ID-名称"的字符串
     */
    @Override
    public String toString() {
        return id+"-"+name;
    }
}
