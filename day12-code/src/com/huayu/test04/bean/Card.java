package com.huayu.test04.bean;

public class Card {
    private String huase, num; // huase:花色, num:数字

    public Card(String huase, String num) {
        this.huase = huase;
        this.num = num;
    }

    public String showCard() {
        return huase + num;
    }

}
