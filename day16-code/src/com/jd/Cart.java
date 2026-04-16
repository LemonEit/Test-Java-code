package com.jd;

import java.util.Scanner;

/**
 * 购物车项类，实现购物车接口
 * 用于封装购物车中单个商品的详细信息及小计金额
 */
public class Cart implements JdCartJk {

    private int id;//商品编号
    private String name;//商品名称
    private double price;//商品价格
    private int count;//购买数量
    private double total;//商品总价

    static Cart[] cart = new Cart[10];
    static int cartCount = 0;//购物车项数量

    static {

        cart[0] = new Cart(1111, "蜘蛛王皮鞋", 238.0, 10, 2380.0);
        cart[1] = new Cart(2222, "iPhone 7 Plus", 5686.0, 20, 113720.0);
    }

    static {
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] != null) {
                cartCount++;
            }
        }
    }

    /**
     * 构造方法，创建指定属性的购物车项对象
     *
     * @param id    商品编号
     * @param name  商品名称
     * @param price 商品价格
     * @param count 购买数量
     * @param total 商品总价
     */
    public Cart(int id, String name, double price, int count, double total) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
        this.total = total;
    }

    public Cart() {
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * 将商品添加到购物车中
     * 有基本的数量判断，不能大于库存数量，且不能为负数
     */
    @Override
    public void addToCart() {
        int index = new ShangPing().showOne();//显示指定编号商品信息
        if (index != -1) {//显示指定编号商品信息索引
            System.out.println("请输入购买数量：");
            int count = new Scanner(System.in).nextInt();
            //购买数量不能大于库存数量，且不能为负数
            if (count > ShangPing.a[index].getStock() || count < 0) {
                System.out.println("库存不足或数量输入错误！");
                return;
            }
            ShangPing product = ShangPing.a[index];//获取指定编号商品信息
            double total = count * product.getPrice();

            cart[cartCount] = new Cart(product.getId(), product.getName(), product.getPrice(), count, total);
            cartCount++;
            System.out.println("添加成功！");
        } else {
            System.out.println("没有找到该编号商品！");
        }
    }

    /**
     * 显示当前购物车中的所有商品信息
     */
    @Override
    public void showCart() {
        int sum = 0;
        System.out.println("编号\t商品名称\t单价\t数量\t小计");
        for (int i = 0; i < cartCount; i++) {
            System.out.println(cart[i].id + "\t" + cart[i].name + "\t" + cart[i].price + "\t" + cart[i].count + "\t" + cart[i].total);
            sum += cart[i].total;
        }
        System.out.println("购物车中共有" + cartCount + "个商品，总价为" + sum);
    }
}