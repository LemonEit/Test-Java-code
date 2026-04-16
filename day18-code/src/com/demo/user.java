package com.demo;

import java.util.Scanner;

public class user implements in {


    private int id;//会员ID
    private String name;//会员账号
    private String cardType;//会员卡类型
    private String points;//会员积分
    private String status;//会员卡片状态

    private static final String STATUS_VALID = "合法账户";
    private static final String STATUS_INVALID = "非法账户";

    public user(int id, String name, String cardType, String points, String status) {//构造方法
        this.id = id;
        this.name = name;
        this.cardType = cardType;
        this.points = points;
        this.status = status;
    }

    public user() {
    }//无参构造方法


    static user[] users = new user[1000];//创建会员对象
    private static int count = 0;//静态变量，记录当前已添加的会员数量

    static {//静态代码块,初始化数据
        users[0] = new user(1001, "冯程程", "铂金卡", "2000", STATUS_VALID);
        users[1] = new user(1002, "孙悟空", "钻石卡", "5000", STATUS_INVALID);
        users[2] = new user(1003, "张巧巧", "金卡", "500", STATUS_VALID);
        count = 3;//初始化会员数量
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

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void a() {//输出标题
        System.out.println("用户ID 账号 卡类型  积分  卡片状态");
    }//显示会员信息
    public void show() {
        System.out.println(getId() + " " + getName() + " " + getCardType() + " " + getPoints() + " " + getStatus());
    }

    public void showAll() {
        a();//输出标题
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                users[i].show();
            }

        }
        System.out.println("共" + count + "条记录");

    }



    static Scanner scanner = new Scanner(System.in);//创建Scanner对象

    public void add() {
        //随机生成会员ID1000-9999
        int id = (int) (Math.random() * 9000 + 1000);
        System.out.println("请输入会员账号：");
        String name = scanner.next();
        System.out.println("请输入会员卡类型：");
        String cardType = scanner.next();
        System.out.println("请输入会员积分：");
        String points = scanner.next();
        String status = STATUS_VALID;
       //整体后移
        for (int i = count - 1; i >= 0; i--) {//倒序遍历
            users[i + 1] = users[i];//赋值给下一个位置
            users[i] = null;//清空当前位置
            if (users[i] == null) {//判断是否为空
                break;
            }
        }

        users[0] = new user(id, name, cardType, points, status);
        count++;//计数器加一
        System.out.println("添加成功！");
        System.out.println("当前会员数量为：" + count);    //输出count
    }

    public void delete() {
        System.out.println("请输入要删除的会员ID：");
        int id = scanner.nextInt();

        // 第一步：查找要删除的索引
        int index = -1; // 标识符，-1 表示未找到
        for (int i = 0; i < count; i++) {
            if (users[i].getId() == id) {
                index = i;
                break;
            }
        }

        // 第二步：判断是否找到
        if (index == -1) {
            System.out.println("未找到 ID 为 " + id + " 的用户！");
            return;//退出方法
        }

        // 第三步：确认删除
        System.out.println("确定要删除下列信息吗？(输入 1 确认，其他取消)");
        users[index].show();
        int confirm = scanner.nextInt();
        if (confirm != 1) {
            System.out.println("已取消删除操作。");
            return;
        }

        // 第四步：执行删除
        for (int i = index; i < count - 1; i++) {
            users[i] = users[i + 1];
        }
        users[count - 1] = null;//删除最后一条数据
        count--;//计数器减一
        System.out.println("删除成功！");
        showAll();//显示删除后所有会员信息
    }
}



