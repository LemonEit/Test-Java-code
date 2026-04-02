package com.huayu.test04.Test;

import com.huayu.test04.bean.Card;

public class TestCard {
    public static void main(String[] args) {
        Card a = new Card("黑桃", "A");
        System.out.println(a.showCard());
    }
}
