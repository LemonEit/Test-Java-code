package com;

import java.util.Scanner;

public class spearSev {
    static Scanner scanner = new Scanner(System.in);
    static spearSev[] spearSevs = new spearSev[1000];
    private static int count = 0;//静态变量，记录当前已添加的会员数量

    static {
        spearSevs[0] = new spearSev(1001, "冯程程", "铂金卡", "2000", "合法账户");
        spearSevs[1] = new spearSev(1002, "孙悟空", "钻石卡", "5000", "非法账户");
        spearSevs[2] = new spearSev(1003, "张巧巧", "金卡", "500", "合法账户");
        count = 3;
    }


    private int id;//会员ID
    private String name;//会员账号
    private String leixing;//会员卡类型
    private String jifen;//会员积分
    private String zhuangtai;//会员卡片状态

    public spearSev(int id, String name, String leixing, String jifen, String zhuangtai) {
        this.id = id;
        this.name = name;
        this.leixing = leixing;
        this.jifen = jifen;
        this.zhuangtai = zhuangtai;
    }

    public spearSev() {
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

    public String getLeixing() {
        return leixing;
    }

    public void setLeixing(String leixing) {
        this.leixing = leixing;
    }

    public String getJifen() {
        return jifen;
    }

    public void setJifen(String jifen) {
        this.jifen = jifen;
    }

    public String getZhuangtai() {
        return zhuangtai;
    }

    public void setZhuangtai(String zhuangtai) {
        this.zhuangtai = zhuangtai;
    }

    public void a() {//输出标题
        System.out.println("用户ID 账号 卡类型  积分  卡片状态");
    }

    public void showAll() {
        a();//输出标题
        for (int i = 0; i < spearSevs.length; i++) {
            if (spearSevs[i] != null) {
                spearSevs[i].show();
            }

        }
        System.out.println("共" + count + "条记录");

    }

    public void show() {
        System.out.println(getId() + " " + getName() + " " + getLeixing() + " " + getJifen() + " " + getZhuangtai());
        System.out.println("你好" + spearSevs[0].getId());
    }

    public int getNewId() {//获取新的会员ID
        return count + 1001;//1001为起始ID
    }

    public void add() {
        System.out.println("请输入会员账号：");
        String name = scanner.next();
        System.out.println("请输入会员卡类型：");
        String leixing = scanner.next();
        System.out.println("请输入会员积分：");
        String jifen = scanner.next();
        System.out.println("请输入会员卡片状态：");
        String zhuangtai = scanner.next();

        id = getNewId();//获取新的会员ID，避免重复ID
        //输出count
        spearSevs[++count] = new spearSev(id, name, leixing, jifen, zhuangtai);
        System.out.println("当前会员数量为：" + count);
    }

    public void delete() {
        System.out.println("请输入要删除的会员ID：");
        int id = scanner.nextInt();

        // 第一步：查找要删除的索引
        int index = -1; // 标识符，-1 表示未找到
        for (int i = 0; i < count; i++) {
            if (spearSevs[i].getId() == id) {
                index = i;
                break;
            }
        }

        // 第二步：判断是否找到
        if (index == -1) {
            System.out.println("未找到 ID 为 " + id + " 的用户！");
            return;
        }

        // 第三步：确认删除
        System.out.println("确定要删除下列信息吗？(输入 1 确认，其他取消)");
        spearSevs[index].show();
        int confirm = scanner.nextInt();
        if (confirm != 1) {
            System.out.println("已取消删除操作。");
            return;
        }

        // 第四步：执行删除
        for (int i = index; i < count - 1; i++) {
            spearSevs[i] = spearSevs[i + 1];
        }
        spearSevs[count - 1] = null;
        count--;
        System.out.println("删除成功！");
        showAll();//显示删除后所有会员信息
    }
}



