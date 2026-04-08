package com.ruandi.test15;

public class Test15 {
   /* （1）public static void meeting(Person...  ps)   // Person...  ps    --->  Person[]  ps

    在该方法中，每一个人先吃饭，然后上洗手间，然后如果是男人，随后抽根烟，如果是女人，随后化个妆

	（2）public static void main(String[] args)

    在主方法中，创建多个男人和女人对象，并调用meeting()方法进行测试*/
    public static void meeting(Person p[]) {//参数类型Person[]
        for (Person p1 : p) {//使用增强for遍历数组p,把数组中的元素赋给p1
            p1.eat();//打印吃饭
            p1.toilet();//打印上洗手间
            if (p1 instanceof Man) {//判断对象类型是不是男人
                ((Man)p1).smoke();//向下转型调用Man类打印抽烟
                System.out.println("*******************************");//打印分割线
            } else if (p1 instanceof Woman) {//判断对象类型是不是女人
                ((Woman)p1).makeup();//打印化妆
                System.out.println("*******************************");//打印分割线
            } else {
                System.out.println("*******************************");//打印分割线
            }
        }
    }
    public static void main(String[] args) {
        Person[] p = new Person[4];//创建对象数组p,类型是Person
        p[0] = new Woman();
        p[1] = new Man();
        p[2] = new Woman();
        p[3] = new Man();
        meeting(p);//传p数组调meeting()方法
    }

}
