package com;

// 1. 接口：规定“必须能打招呼”
interface Hello {
    void sayHello();
}

// 2. 中文实现
class HelloChinese implements Hello {
    @Override
    public void sayHello() {
        System.out.println("你好，世界！");
    }
}

// 3. 英文实现
class HelloEnglish implements Hello {
    @Override
    public void sayHello() {
        System.out.println("Hello, World!");
    }
}

// 4. 日语实现
class HelloJapanese implements Hello {
    @Override
    public void sayHello() {
        System.out.println("こんにちは、世界！");
    }
}

class Main {
    public static void main(String[] args) {

        Hello chinese = new HelloChinese();
        Hello english = new HelloEnglish();
        Hello japanese = new HelloJapanese();
        chinese.equals("HEllo");
        chinese.sayHello();
        english.sayHello();
        japanese.sayHello();
    }
}