package com;
/*玩家选择*/
public class Player {
    public static FightAble Set(String str) {//静态方法,根据传入的字符串返回对应的对象
        switch (str) {
            case "adc":
                return new ADC();

            case "apc":
                return new APC();
            default:
                return null;
        }
    }
}
