package com.Flower;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 鲜花订单服务实现类
 */
public class FlowerServiceImpl implements FlowerService {

    private final FlowerMgr[] flower = new FlowerMgr[10];
    private int count = 0;

    public FlowerServiceImpl() {
        // 初始化预设数据
        flower[0] = new FlowerMgr(1001, "金色海岸 - 香槟玫瑰", 10, 318, "2018-12-12", "王二");
        flower[1] = new FlowerMgr(1002, "初心永不变 - 白玫瑰", 99, 538, "2018-2-2", "张星宇");
        flower[2] = new FlowerMgr(1003, "梦里花开紫色桔梗", 40, 123, "2018-12-16", "王二");
        flower[3] = new FlowerMgr(1004, "心花怒放 - 粉色百合", 120, 188, "2016-12-11", "王二");
        flower[4] = new FlowerMgr(1005, "致青春 -·无声的爱", 1000, 219, "2016-12-15", "张星宇");
        count = 5;
    }

    @Override
    public List<FlowerMgr> getAllOrders() {
        List<FlowerMgr> list = new ArrayList<>();
        for (int i = 0; i < flower.length; i++) {
            if (flower[i] != null) {
                list.add(flower[i]);
            }
        }
        return list;
    }

    @Override
    public FlowerMgr getOrderById(int id) {
        for (int i = 0; i < flower.length; i++) {
            if (flower[i] != null && flower[i].getID() == id) {
                return flower[i];
            }
        }
        return null;
    }

    @Override
    public boolean addOrder(FlowerMgr order) {
        if (count >= flower.length) {
            System.out.println("订单已满，无法添加");
            return false;
        }
        flower[count++] = order;
        return true;
    }

    @Override
    public boolean updateOrder(FlowerMgr order) {
        for (int i = 0; i < flower.length; i++) {
            if (flower[i] != null && flower[i].getID() == order.getID()) {
                flower[i] = order;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteOrder(int id) {
        int index = -1;
        for (int i = 0; i < flower.length; i++) {
            if (flower[i] != null && flower[i].getID() == id) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return false;
        }

        flower[index] = null;
        for (int i = index; i < flower.length - 1; i++) {
            flower[i] = flower[i + 1];
        }
        flower[flower.length - 1] = null;
        count--;
        return true;
    }

    // 保留原有的控制台交互方法
    public void searchAllConsole() {
        System.out.println("订单编号\t鲜花名称\t鲜花价格\t销售数量\t订单日期\t销售人员");
        for (FlowerMgr f : getAllOrders()) {
            f.show();
        }
        System.out.println("查询完毕");
    }

    public void addSaleConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入订单编号：");
        int ID = sc.nextInt();
        System.out.println("请输入鲜花名称：");
        String FlowerName = sc.next();
        System.out.println("请输入鲜花价格：");
        int jiage = sc.nextInt();
        System.out.println("请输入鲜花数量：");
        int shuliang = sc.nextInt();
        System.out.println("请输入订单日期：");
        String Date = sc.next();
        System.out.println("请输入销售人员：");
        String yuango = sc.next();

        FlowerMgr order = new FlowerMgr(ID, FlowerName, jiage, shuliang, Date, yuango);
        if (addOrder(order)) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    public void updateSaleConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的订单编号：");
        int num = sc.nextInt();

        FlowerMgr order = getOrderById(num);
        if (order == null) {
            System.out.println("未找到该订单");
            return;
        }

        System.out.println("您要修改的订单详情如下：");
        System.out.println("订单编号\t鲜花名称\t鲜花价格\t销售数量\t订单日期\t销售人员");
        order.show();

        System.out.println("请输入修改后的鲜花名称：");
        String FlowerName = sc.next();
        System.out.println("请输入修改后的鲜花价格：");
        int jiage = sc.nextInt();
        System.out.println("请输入修改后的鲜花数量：");
        int shuliang = sc.nextInt();
        System.out.println("请输入修改后的订单日期：");
        String Date = sc.next();
        System.out.println("请输入修改后的订单销售人员：");
        String yuango = sc.next();

        System.out.println("确认修改？(y/n)");
        String input = sc.next();

        if (input.equals("y")) {
            FlowerMgr newOrder = new FlowerMgr(num, FlowerName, jiage, shuliang, Date, yuango);
            if (updateOrder(newOrder)) {
                System.out.println("修改成功");
            } else {
                System.out.println("修改失败");
            }
        } else {
            System.out.println("已取消修改");
        }
    }

    public void deleteSaleConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的订单编号：");
        int num = sc.nextInt();

        FlowerMgr order = getOrderById(num);
        if (order == null) {
            System.out.println("未找到该订单");
            return;
        }

        System.out.println("您要删除的订单详情如下：");
        System.out.println("订单编号\t鲜花名称\t鲜花价格\t销售数量\t订单日期\t销售人员");
        order.show();

        System.out.println("确认删除？(y/n)");
        String input = sc.next();

        if (input.equals("y")) {
            if (deleteOrder(num)) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        } else {
            System.out.println("已取消删除");
        }
    }
}
