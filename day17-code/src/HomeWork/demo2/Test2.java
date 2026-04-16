package HomeWork.demo2;

public class Test2 {
    public static void main(String[] args) {
        Apple apple1 = new Apple(10, "红色");
        Apple apple2 = new Apple(6, "红色");
        CompareAble worker1 = new CompareAble() {//这里使用匿名内部类实现CompareAble接口的默认方法,不需要重写compare方法

        };
        CompareAble worker2 = new CompareAble() {
            @Override
            public void compare(Apple a1, Apple a2) {//传入两个苹果对象,输出红色的那个苹果
                if (a1.getColor().equals("红色") && a2.getColor().equals("红色")) {
                    System.out.println(a1);
                    System.out.println(a2);
                    System.out.println("两个苹果都是红色");
                } else if (a1.getColor().equals("红色")) {
                    System.out.println(a1);
                    System.out.println("第一个苹果是红色");
                } else if (a2.getColor().equals("红色")) {
                    System.out.println(a2);
                    System.out.println("第二个苹果是红色");
                } else {
                    System.out.println("没有红色的苹果");
                }


            }


        };
        worker1.compare(apple1, apple2);
        System.out.println("------------------");
        worker2.compare(apple1, apple2);
    }
}