package com;

public class Student {
    /*sNO  表示学号； sName 表示姓名； sSex 表示性别； sAge 表示年龄；sJava：表示 Java 课程成绩。*/
    private String sNO;
    private String sName;
    private String sSex;
    private int sAge;
    private double sJava;

    public Student() {
    }

    public Student(String sNO, String sName, String sSex, int sAge, double sJava) {
        this.sNO = sNO;
        this.sName = sName;
        this.sSex = sSex;
        this.sAge = sAge;
        this.sJava = sJava;
    }

    public String getsNO() {
        return sNO;
    }

    public String getsName() {
        return sName;
    }

    public String getsSex() {
        return sSex;
    }

    public int getsAge() {
        return sAge;
    }

    public double getsJava() {
        return sJava;
    }

    public static void main(String[] args) {
        Student Stu1 = new Student("2019001", "张三", "男", 18, 90);
        Student Stu2 = new Student("2019002", "张三", "男", 18, 90);
        Student Stu3 = new Student("2019003", "张三", "男", 18, 90);
        Student Stu4 = new Student("2019004", "张三", "男", 18, 90);
        Student Stu5 = new Student("2019005", "张三", "男", 18, 90);
        double avgage = (Stu1.getsJava() + Stu2.getsJava() + Stu3.getsJava() + Stu4.getsJava() + Stu5.getsJava()) / 5;
        System.out.println("平均分是：" + avgage);

        double max = Stu1.getsJava();

        System.out.println("最高分是：" + max);
        double min = 1.1;
        System.out.println("最低分是：" + min);


    }
}
