package com.jd;

import java.util.Scanner;

/**
 * 商品类，实现京东商城商品接口
 * 管理商品信息及商品数组的增删查改操作
 */
public class ShangPing implements JdShopJk {
    private int id;
    private String name;
    private double price;//商品价格
    private String color;//商品颜色
    private double size;//商品尺寸
    private int stock;//商品库存
    private static int count = 0;

    static ShangPing[] a = new ShangPing[10];

    static {
        a[0] = new ShangPing(1111, "蜘蛛王皮鞋", 238.0, "黑色", 42, 100000);
        a[1] = new ShangPing(3333, "ThinkPad X240", 5939.0, "黑色", 12, 50);
        a[2] = new ShangPing(2222, "iPhone 7 Plus", 5686.0, "白色", 5, 5000);

    }

    static {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != null) {
                count++;
            }
        }
    }

    /**
     * 构造方法，创建指定属性的商品对象
     *
     * @param id    商品编号
     * @param name  商品名称
     * @param price 商品价格
     * @param color 商品颜色
     * @param size  商品尺寸
     * @param stock 商品库存
     */
    public ShangPing(int id, String name, double price, String color, double size, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.color = color;
        this.size = size;
        this.stock = stock;
    }

    public ShangPing() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * 打印商品列表表头
     */
    public void a() {
        System.out.println("编号\t商品名称\t价格\t颜色\t尺寸\t库存");
    }

    /**
     * 显示当前商品的详细信息
     */
    public void show() {
        a();
        System.out.println(id + "\t" + name + "\t" + price + "\t" + color + "\t" + size + "\t" + stock);
    }

    /**
     * 显示所有已添加的商品信息
     */
    @Override
    public void showAll() {
        a();
        for (int i = 0; i < count; i++) {
            System.out.println(a[i].id + "\t" + a[i].name + "\t" + a[i].price + "\t" + a[i].color + "\t" + a[i].size + "\t" + a[i].stock);
        }
    }

    /**
     * 从控制台接收用户输入，添加新商品到商品数组
     * 价格和库存不能小于0，否则添加失败,可以等于0
     */
    @Override
    public void add() {
        System.out.println("请输入编号：");
        int id = new Scanner(System.in).nextInt();
        System.out.println("请输入名称：");
        String name = new Scanner(System.in).next();
        System.out.println("请输入价格：");
        double price = new Scanner(System.in).nextDouble();
       if(price<0){
           System.out.println("价格不能小于0！");
       }
        System.out.println("请输入颜色：");
        String color = new Scanner(System.in).next();
        System.out.println("请输入尺寸：");
        double size = new Scanner(System.in).nextDouble();
        System.out.println("请输入库存：");
        int stock = new Scanner(System.in).nextInt();
        if(stock<0){
            System.out.println("库存不能小于0！");
            return;
        }
        a[count] = new ShangPing(id, name, price, color, size, stock);
        count++;
    }

    /**
     * 根据用户输入的编号查找并显示对应商品信息
     */
    @Override
    public int showOne() {
        System.out.println("请输入编号：");
        int id = new Scanner(System.in).nextInt();
        for (int i = 0; i < count; i++) {
            if (a[i].id == id) {
                a[i].show();//打印商品信息
                return i;
            }
        }
        System.out.println("没有找到该编号的商品！");
        return -1;
    }
}