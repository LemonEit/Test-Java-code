package com.deno;

public abstract class OOPDemo2 {//抽象类
    /**
     * 抽象类
     * @param name 姓名
     * @param age  年龄
     * @param sex  性别
     */
    public String name;
    public int age;
    public char sex;
    /**
     * @param show 显示信息
     * */
    public abstract void show();
    /**
     * @param eat 吃饭
     * */
    public abstract void eat();
    /**
     * @param sleep 睡觉
     * */
    public abstract void sleep();
    /**
     * @param work 工作
     * */
    public abstract void work();
    public OOPDemo2(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void showInfo() {
        System.out.println("姓名：" + name + "，年龄：" + age + "，性别：" + sex);
    }
    static {

        System.out.println("抽象类静态代码块");
    }
    {
        System.out.println("抽象类实例代码块");
    }
    public static void Hello() {
        System.out.println("抽象类静态方法");
    }

}



class Student extends OOPDemo2 {//子类

    public Student(String name, int age, char sex) {
        super(name, age, sex);
    }



    @Override
    public void show () {
        System.out.println("姓名{" + name + "，年龄：" + age + "，性别：" + sex+"}");

    }

    @Override
    public void eat() {
        System.out.println("吃吃吃");

    }

    @Override
    public void sleep() {
        System.out.println("睡睡睡");
    }

    @Override
    public void work() {
        System.out.println("工作");
    }



    public static void main(String[] args) {//主方法
        Student s = new Student("张三", 18, '男');//抽象类的实例化
        s.show();
        s.eat();
        s.sleep();
        s.work();
        s.showInfo();//抽象类的静态方法
        Hello();
    }

}
