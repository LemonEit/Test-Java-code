package com.student;

import java.util.Objects;
import java.util.Scanner;

/**
 * 这是一个学生类
 * 属性有id,姓名,班级,总分,学籍状态
 */

public class Student implements StudentA {
    private int id;// 学生id
    private String name;//学生姓名
    private String classname;//学生班级
    private int score;//学生总分
    private String status;//学生学籍状态
    private static int count;//学生数量

    public Student(int id, String name, String classname, int score, String status) {
        this.id = id;
        this.name = name;
        this.classname = classname;
        this.score = score;
        this.status = status;
    }

    public Student() {
    }


    static Student[] students = new Student[1000000];

    static {
        students[0] = new Student(1001, "张三", "高一(1)班", 580, "正常学籍");
        students[1] = new Student(1002, "李四", "高一(1)班", 620, "正常学籍");
        students[2] = new Student(1003, "王五", "高一(1)班", 490, "休学学籍");
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                count++;
            }
        }
       // Student.generateRandomStudents(1000000);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && score == student.score && Objects.equals(name, student.name) && Objects.equals(classname, student.classname) && Objects.equals(status, student.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, classname, score, status);
    }

    @Override
    public String toString() {
        return String.format("%-10d%-10s%-15s%-8d%-10s", id, name, classname, score, status);
    }

    //查询id是否存在的方法
    public static int isExist(int id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public void showAll() {
        System.out.println(String.format("%-10s%-10s%-15s%-8s%-10s", "学号", "姓名", "班级", "总分", "学籍状态"));
        System.out.println("---------------------------------------------------------------------------");
        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);
        }

    }

    @Override
    public void delete() {
        System.out.println("请输入要删除的学号：");
        Scanner scanner = new Scanner(System.in);
        int delId = scanner.nextInt();
        int index = isExist(delId);
        if (index == -1) {
            System.out.println("对不起,您要删除的学号不存在,请核实后再删除");
            return;
        }

        System.out.println("是否确认删除？(y/n)");
        String choice = scanner.next();
        switch (choice) {
            case "y":
                for (int i = index; i < count - 1; i++) {
                    students[i] = students[i + 1];
                }

                students[count - 1] = null;
                count--;
                System.out.println("删除成功");
                showAll();
                break;
            case "n":
                System.out.println("已取消删除!");
                break;

        }
    }

    @Override
    public void add() {
        int id = (int) (Math.random() * 9000 + 1000);
        while (isExist(id) != -1) {
            id = (int) (Math.random() * 9000 + 1000);
        }
        System.out.println("请输入学生姓名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("请输入学生班级：");
        String classname = scanner.next();
        System.out.println("请输入学生总分：");
        int score = scanner.nextInt();
        students[count] = new Student(id, name, classname, score, "正常学籍");
        count++;
        System.out.println("添加成功!");
        showAll();
    }

    public static void generateRandomStudents(int num) {
        String[] firstNames = {"张", "李", "王", "赵", "刘", "陈", "杨", "黄", "周", "吴",
                "徐", "孙", "马", "朱", "胡", "郭", "何", "高", "林", "罗"};
        String[] lastNames = {"伟", "芳", "娜", "敏", "静", "丽", "强", "磊", "洋", "艳",
                "勇", "军", "杰", "娟", "涛", "明", "超", "秀英", "华", "慧"};
        String[] classNames = {"高一(1)班", "高一(2)班", "高一(3)班", "高二(1)班", "高二(2)班",
                "高二(3)班", "高三(1)班", "高三(2)班", "高三(3)班"};
        String[] statuses = {"正常学籍", "正常学籍", "正常学籍", "正常学籍", "休学学籍"};

        for (int i = 0; i < num; i++) {
            if (count >= 100) {
                System.out.println("学生数组已满，无法继续添加！");
                break;
            }

            int id = (int) (Math.random() * 9000 + 1000);
            while (isExist(id) != -1) {
                id = (int) (Math.random() * 9000 + 1000);
            }

            String firstName = firstNames[(int) (Math.random() * firstNames.length)];
            String lastName = lastNames[(int) (Math.random() * lastNames.length)];
            String name = firstName + lastName;

            String classname = classNames[(int) (Math.random() * classNames.length)];

            int score = (int) (Math.random() * 551 + 150);

            String status = statuses[(int) (Math.random() * statuses.length)];

            students[count] = new Student(id, name, classname, score, status);
            count++;
        }
        System.out.println("成功生成 " + num + " 个学生！");
    }
}
