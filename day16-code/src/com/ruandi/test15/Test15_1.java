package com.ruandi.test15;

/*比较两个图像大小*/
public class Test15_1 {
    public static boolean m(Graphic a, Graphic b) {
        return (a.getArea() == b.getArea());//判断两个图像大小是否相等,返回布尔值

    }

    public static Graphic max(Graphic a, Graphic b) {
        return a.getArea() > b.getArea()? a : b;//返回大的图形的引用
    }


    public static void main(String[] args) {
        Graphic[] a = {new Circle(5), new Rectangle(5, 5), new Triangle(5, 5, 5)};//创建数组
      a [0].getInfo();//输出第一个图形的信息
      a[1].getInfo();//输出第二个图形的信息
      max(a[0], a[1]).getInfo();//输出较大的图形的信息
        System.out.println( m(a[0], a[1])? "两个图形面积相等":"两个图形面积不相等");

    }
}
