package com.student;


/**
 * 学生成绩管理系统主程序
 * 提供用户交互界面，实现查询、删除、新增学生信息等功能的菜单驱动
 */
public class demo {
    /**
     * 程序入口方法
     * 启动学生成绩管理系统，显示主菜单并处理用户选择
     *
     * @param args 命令行参数（未使用）
     */
    public static void main(String[] args) {
        StudentA Student = new Student();//创建对象
        // 主循环：持续接收用户输入直到选择退出
        while (true) {
            System.out.println("**********欢迎使用学生成绩管理系统***********");
            System.out.println("1.查询学生成绩信息");
            System.out.println("2.删除学生");
            System.out.println("3.新增学生成绩信息");
            System.out.println("4.退出");
            System.out.println("*****************************************");
            System.out.println("请输入你的选择：");
            int choice = new java.util.Scanner(System.in).nextInt();
            // 根据用户选择执行相应操作
            switch (choice)
                {
                    case 1:
                        Student.showAll();//调用查询方法
                        break;
                    case 2:
                        Student.delete();//调用删除方法
                        break;
                    case 3:
                        Student.add();//调用添加方法
                        break;
                    case 4:
                        // 退出系统
                        System.out.println("系统退出,谢谢您的使用");
                        System.exit(0);
                        break;

                }
        }
    }

}
