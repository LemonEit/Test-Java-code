package com.huayu.test03.test;

import com.huayu.test03.bean.MyDate;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate a = new MyDate(2019, 9, 10);//创建一个日期对象
        a.showDate();//显示日期
        a.isLeapYear();//判断闰年

    }
}
