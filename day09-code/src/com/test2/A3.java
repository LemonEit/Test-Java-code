package com.test2;

public class A3 {
    public static void main(String[] args) {
        int a = 10;//定义验证码长度
        System.out.println(getCode(a));//输出验证码
    }

    public static String getCode(int a) {

        String code = "";// 定义变量保存验证码
        //生成随机数,通过ascii码表生成字符
        for (int i = 0; i < a; i++) {
            //生成随机数来判断字母和数字
            switch ((int) (Math.random() * 3)) {//通过随机数判断该生成的字符是字母还是数字
                case 0:
                    code = code + (char) (Math.random() * 26 + 'a');//0-26随机数+'a'再转为char保存在code中
                    break;
                case 1:
                    code = code + (char) (Math.random() * 26 + 'A');//0-26随机数+'A'再转为char保存在code中
                    break;
                case 2:
                    code = code + (char) (Math.random() * 9 + '0');//0-9随机数+'0'再转为char保存在code中
                    break;
            }
        }
        return code;
    }
}
