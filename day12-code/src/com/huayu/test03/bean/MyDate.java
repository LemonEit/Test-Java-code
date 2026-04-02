package com.huayu.test03.bean;

public class MyDate {
    private int year, month, day;//年、月、日

    public MyDate(int year, int month, int day) {//构造方法传入参数
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void showDate() {//显示日期
        System.out.println("日期：" + year + "年" + month + "月" + day + "日");

    }

    public void isLeapYear() {//判断闰年
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("闰年");
        } else {
            System.out.println("平年");
        }

    }
}
