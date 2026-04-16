package Flower;

import java.util.Scanner;

/**
 * 鲜花销售订单管理类
 * 提供订单的增删改查功能，管理鲜花销售数据
 */
public class Flower {
    /**
     * 存储鲜花订单的静态数组，最大容量 10 个订单
     */
    public static final Flower[] flower = new Flower[10];

    /**
     * 订单计数器，记录当前订单数量
     */
    private static int count;

    /* 静态代码块，初始化预设的订单数据 */
    static {
        flower[0] = new Flower(1001, "金色海岸-香槟玫瑰", 10, 318, "2018-12-12", "王二");
        flower[1] = new Flower(1002, "初心永不变-白玫瑰", 99, 538, "2018-2-2", "张星宇");
        flower[2] = new Flower(1003, "梦里花开紫色桔梗", 40, 123, "2018-12-16", "王二");
        flower[3] = new Flower(1004, "心花怒放-粉色百合", 120, 188, "2016-12-11", "王二");
        flower[4] = new Flower(1005, "致青春-无声的爱", 1000, 219, "2016-12-15", "张星宇");
        count = 5;
    }

    /**
     * 订单编号
     */
    private int ID;

    /**
     * 鲜花名称
     */
    private String FlowerName;

    /**
     * 鲜花价格
     */
    private double price;

    /**
     * 销售数量
     */
    private int quantity;

    /**
     * 订单日期
     */
    private String orderDate;

    /**
     * 销售人员
     */
    private String salesperson;

    /**
     * 全参数构造方法
     *
     * @param ID          订单编号
     * @param flowerName  鲜花名称
     * @param price       鲜花价格
     * @param quantity    销售数量
     * @param orderDate   订单日期
     * @param salesperson 销售人员
     */
    public Flower(int ID, String flowerName, int price, int quantity, String orderDate, String salesperson) {
        this.ID = ID;
        FlowerName = flowerName;
        this.price = price;
        this.quantity = quantity;
        this.orderDate = orderDate;
        this.salesperson = salesperson;
    }

    /**
     * 无参数构造方法
     */
    public Flower() {
    }

    /**
     * 获取订单编号
     *
     * @return 订单编号
     */
    public int getID() {
        return ID;
    }

    /**
     * 设置订单编号
     *
     * @param ID 订单编号
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * 获取鲜花名称
     *
     * @return 鲜花名称
     */
    public String getFlowerName() {
        return FlowerName;
    }

    /**
     * 设置鲜花名称
     *
     * @param flowerName 鲜花名称
     */
    public void setFlowerName(String flowerName) {
        FlowerName = flowerName;
    }

    /**
     * 获取鲜花价格
     *
     * @return 鲜花价格
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置鲜花价格
     *
     * @param price 鲜花价格
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取销售数量
     *
     * @return 销售数量
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * 设置销售数量
     *
     * @param quantity 销售数量
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * 获取订单日期
     *
     * @return 订单日期
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * 设置订单日期
     *
     * @param orderDate 订单日期
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * 获取销售人员
     *
     * @return 销售人员
     */
    public String getSalesperson() {
        return salesperson;
    }

    /**
     * 设置销售人员
     *
     * @param salesperson 销售人员
     */
    public void setSalesperson(String salesperson) {
        this.salesperson = salesperson;
    }

    /**
     * 显示订单详细信息
     * 以制表符分隔格式输出订单的所有字段
     */
    public void show() {
        System.out.println(this.ID + "\t" + this.FlowerName + "\t" + this.price + "\t" + this.quantity + "\t" + this.orderDate + "\t" + this.salesperson);
    }

    /**
     * 查询所有销售订单
     * 遍历订单数组并显示所有非空订单信息
     */
    public void showAll() {
        System.out.println("订单编号\t鲜花名称\t鲜花价格\t销售数量\t订单日期\t销售人员");
        for (int i = 0; i < flower.length; i++) {
            if (flower[i] != null) {
                flower[i].show();
            }

        }
        System.out.println("查询完毕");
    }

    /**
     * 修改销售订单
     * 根据订单编号查找并修改订单信息
     */
    public void upda() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的订单编号：");
        int num = sc.nextInt();
        int index = -1;
        for (int i = 0; i < flower.length; i++) {
            if (flower[i].getID() == num) {
                index = i;
                break;
            }
        }
        System.out.println("您要修改的订单详情如下：");
        System.out.println("订单编号\t鲜花名称\t鲜花价格\t销售数量\t订单日期\t销售人员");
        flower[index].show();
        int ID1 = 0;
        String FlowerName1;
        int price1;
        int quantity1;
        String orderDate1;
        String salesperson1;
        System.out.println("请输入修改后的鲜花名称：");
        FlowerName1 = sc.next();
        System.out.println("请输入修改后的鲜花价格：");
        price1 = sc.nextInt();
        System.out.println("请输入修改后的鲜花数量：");
        quantity1 = sc.nextInt();
        System.out.println("请输入修改后的订单日期：");
        orderDate1 = sc.next();
        System.out.println("请输入修改后的订单销售人员：");
        salesperson1 = sc.next();
        System.out.println("确认修改？(y/n)");
        String input = sc.next();
        if (input.equals("y")) {
            flower[index] = new Flower(flower[index].getID(), FlowerName1, price1, quantity1, orderDate1, salesperson1);
            System.out.println("修改成功");
            System.out.println("修改后的订单详情如下：");
            System.out.println("订单编号\t鲜花名称\t鲜花价格\t销售数量\t订单日期\t销售人员");
            flower[index].show();
        } else {
            System.out.println("已取消修改");
        }

    }

    /**
     * 删除销售订单
     * 根据订单编号查找并删除订单，删除后调整数组顺序
     */
    public void del() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的订单编号：");
        int num = sc.nextInt();//订单编号
        int index = -1;
        for (int i = 0; i < flower.length; i++) {//遍历订单数组
            if (flower[i].getID() == num) {//查找订单编号匹配的订单
                index = i;//订单编号匹配的订单索引
                break;
            }
        }
        if (index == -1) {
            System.out.println("未找到该订单");
            return;
        }
        System.out.println("您要删除的订单详情如下：");
        System.out.println("订单编号\t鲜花名称\t鲜花价格\t销售数量\t订单日期\t销售人员");
        flower[index].show();
        System.out.println("确认删除？(y/n)");
        String input = sc.next();
        if (input.equals("y")) {
            flower[index] = null;
            for (int i = index; i < flower.length - 1; i++) {
                flower[i] = flower[i + 1];
                System.out.println("删除成功");
            }
            --count;//订单数量减一
        } else {
            System.out.println("已取消删除");
        }
    }

    /**
     * 添加销售订单
     * 接收用户输入创建新订单并添加到数组中
     */
    public void add() {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入订单编号：");
        int ID = sc.nextInt();

        System.out.println("请输入鲜花名称：");
        String FlowerName = sc.next();

        System.out.println("请输入鲜花价格：");
        int price = sc.nextInt();

        System.out.println("请输入鲜花数量：");
        int quantity = sc.nextInt();

        System.out.println("请输入订单日期：");
        String orderDate = sc.next();

        System.out.println("请输入销售人员：");
        String salesperson = sc.next();

        flower[++count] = new Flower(ID, FlowerName, price, quantity, orderDate, salesperson);
        System.out.println("添加成功");
        System.out.println("添加的订单详情如下：");
        System.out.println("订单编号\t鲜花名称\t鲜花价格\t销售数量\t订单日期\t销售人员");
        flower[count].show();
        System.out.println("添加完毕");
    }
}