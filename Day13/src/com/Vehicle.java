package com;

import java.util.Scanner;

/**
 * 1.请定义一个交通工具(Vehicle)的类其中有:
 * 属性： 速度(speed)、 体积(size)等，
 * 方法：移动(move())、设置速度(setSpeed(int speed))、加速 speedUp()、减速 speedDown()等。
 * 最后在测试类 Vehicle 中的 main()中实例化一个交通工具对象并通过方法给它初始化 speed,size 的值并且通过打印出来。
 * 另外调用加速、减速的方法对速度进行改变。
 */
public class Vehicle {
    private int speed;//速度
    private int size;//体积

    public void move() {
        System.out.println("正在移动");
        System.out.println("当前速度为：" + speed);
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("当前速度为：" + speed);
    }

    public void speedUp() {
        speed += 10;
        System.out.println("加速后的速度为：" + speed);
    }

    public void speedDown() {
        speed -= 10;
        System.out.println("减速后的速度为：" + speed);
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 车辆控制系统 ===");
        System.out.println("按 w 键：开始移动/加速");
        System.out.println("按 s 键：减速");
        System.out.println("按 a 键：加速");
        System.out.println("按 q 键：退出程序");
        System.out.println();

        boolean isMoving = false;

        while (true) {
            System.out.print("请输入指令：");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("q")) {
                System.out.println("程序已退出");
                break;
            }

            switch (input) {
                case "w":
                    if (!isMoving) {
                        isMoving = true;
                        car.setSpeed(10);
                        car.move();
                    } else {
                        car.speedUp();
                        car.move();
                    }
                    break;
                case "s":
                    if (isMoving) {
                        car.speedDown();
                        if (car.speed <= 0) {
                            car.speed = 0;
                            isMoving = false;
                            System.out.println("速度已降为 0，停止移动");
                        }
                        car.move();
                    } else {
                        System.out.println("车辆未启动，请先按 w 键");
                    }
                    break;
                case "a":
                    if (isMoving) {
                        car.speedUp();
                        car.move();
                    } else {
                        System.out.println("车辆未启动，请先按 w 键");
                    }
                    break;
                default:
                    System.out.println("无效指令，请按 w、s、a 或 q 键");
            }
        }

        scanner.close();
    }
}
