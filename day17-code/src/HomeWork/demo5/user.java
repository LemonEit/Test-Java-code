package HomeWork.demo5;

import java.util.Scanner;

public class user implements userCrut {
    private int id;//会员ID
    private String name;//会员姓名
    private String level;//会员等级
    private int score;//会员积分
    private String status;//会员状态
    static int count = 0;//会员数量
    private static final user users[] = new user[10];

    static {

        users[0] = new user(1001, "张三", "金卡", 1000, "正常");
        users[1] = new user(1002, "孙悟空", "银卡", 200, "封禁");
        users[2] = new user(1003, "王五", "铜卡", 300, "正常");
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                count++;//会员数量
            }
        }
    }

    public user(int id, String name, String level, int score, String status) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.score = score;
        this.status = status;
    }

    public user() {
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "用户id"+id+"会员姓名"+name+"会员等级"+level+"会员积分"+score+"会员状态"+status;
    }
    public static void showall() {
        System.out.println("用户id"+"会员姓名"+"会员等级"+"会员积分"+"会员状态");
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                System.out.println(users[i]);
            }
        }
    }

    @Override
    public void addMember() {
        //随机生成四位数作为id
        int id = (int) (Math.random() * 10000);
        System.out.println("请输入会员姓名：");
        String name = new Scanner(System.in).next();
        System.out.println("请输入会员等级：");
        String level = new Scanner(System.in).next();
        System.out.println("请输入会员积分：");
        int score = new Scanner(System.in).nextInt();
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = new user(id, name, level, score, "正常");
                System.out.println("添加成功！");
                break;
            }
        }
    }

    @Override
    public void deleteMember() {
        System.out.println("请输入会员ID：");
        int id = new Scanner(System.in).nextInt();
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getId() == id) {
                users[i] = null;
                System.out.println("删除成功！");
                break;
            }
        }
        System.out.println("删除失败！");
    }
}
