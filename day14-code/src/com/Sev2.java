package com;

import java.util.Scanner;

public class Sev2 {


    /**
     * 会员服务内部类，提供会员管理功能
     * 包括会员信息的增删查改等操作
     */
    public class spearSev {
        static Scanner scanner = new Scanner(System.in);
        static com.spearSev[] spearSevs = new com.spearSev[1000];
        private static int count = 0;//静态变量，记录当前已添加的会员数量

        /**
         * 静态初始化块，初始化预设的会员数据
         * 创建 3 个初始会员记录并设置计数器
         */
        static {
            spearSevs[0] = new com.spearSev(1001, "冯程程", "铂金卡", "2000", "合法账户");
            spearSevs[1] = new com.spearSev(1002, "孙悟空", "钻石卡", "5000", "非法账户");
            spearSevs[2] = new com.spearSev(1003, "张巧巧", "金卡", "500", "合法账户");
            count = 3;
        }


        private int id;//会员 ID
        private String name;//会员账号
        private String leixing;//会员卡类型
        private String jifen;//会员积分
        private String zhuangtai;//会员卡片状态

        /**
         * 构造函数，创建新的会员对象
         * @param id 会员 ID
         * @param name 会员账号
         * @param leixing 会员卡类型
         * @param jifen 会员积分
         * @param zhuangtai 会员卡片状态
         */
        public spearSev(int id, String name, String leixing, String jifen, String zhuangtai) {
            this.id = id;
            this.name = name;
            this.leixing = leixing;
            this.jifen = jifen;
            this.zhuangtai = zhuangtai;
        }

        public spearSev() {
        }

        /**
         * 获取会员 ID
         * @return 会员 ID
         */
        public int getId() {
            return id;
        }

        /**
         * 设置会员 ID
         * @param id 会员 ID
         */
        public void setId(int id) {
            this.id = id;
        }

        /**
         * 获取会员账号
         * @return 会员账号
         */
        public String getName() {
            return name;
        }

        /**
         * 设置会员账号
         * @param name 会员账号
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * 获取会员卡类型
         * @return 会员卡类型
         */
        public String getLeixing() {
            return leixing;
        }

        /**
         * 设置会员卡类型
         * @param leixing 会员卡类型
         */
        public void setLeixing(String leixing) {
            this.leixing = leixing;
        }

        /**
         * 获取会员积分
         * @return 会员积分
         */
        public String getJifen() {
            return jifen;
        }

        /**
         * 设置会员积分
         * @param jifen 会员积分
         */
        public void setJifen(String jifen) {
            this.jifen = jifen;
        }

        /**
         * 获取会员卡片状态
         * @return 会员卡片状态
         */
        public String getZhuangtai() {
            return zhuangtai;
        }

        /**
         * 设置会员卡片状态
         * @param zhuangtai 会员卡片状态
         */
        public void setZhuangtai(String zhuangtai) {
            this.zhuangtai = zhuangtai;
        }

        /**
         * 输出表格标题行
         * 显示各列字段的名称
         */
        public void a() {
            System.out.println("用户 ID 账号 卡类型  积分  卡片状态");
        }

        /**
         * 生成新的会员 ID
         * 基于当前会员数量计算，避免 ID 重复
         * @return 新的会员 ID（从 1001 开始递增）
         */
        public int getNewId() {
            return count + 1001;
        }

        /**
         * 显示当前会员的详细信息
         * 输出会员的所有属性
         */
        public void show() {
            System.out.println(getId() + " " + getName() + " " + getLeixing() + " " + getJifen() + " " + getZhuangtai());
        }

        /**
         * 显示所有会员的完整信息
         * 遍历会员数组，输出所有已存在的会员记录
         * 最后显示总记录数
         */
        public void showAll() {
            a();
            for (int i = 0; i < spearSevs.length; i++) {
                if (spearSevs[i] != null) {
                    spearSevs[i].show();
                }

            }
            System.out.println("共" + count + "条记录");

        }

        /**
         * 添加新会员
         * 通过控制台输入获取会员信息，自动生成 ID 并添加到数组
         */
        public void add() {
            System.out.println("请输入会员账号：");
            String name = scanner.next();
            System.out.println("请输入会员卡类型：");
            String leixing = scanner.next();
            System.out.println("请输入会员积分：");
            String jifen = scanner.next();
            System.out.println("请输入会员卡片状态：");
            String zhuangtai = scanner.next();

            id = getNewId();
            spearSevs[++count] = new com.spearSev(id, name, leixing, jifen, zhuangtai);
            System.out.println("当前会员数量为：" + count);
        }

        /**
         * 删除指定会员
         * 根据 ID 查找会员，确认后从数组中移除并调整后续元素位置
         */
        public void delete() {
            System.out.println("请输入要删除的会员 ID：");
            int id = scanner.nextInt();

            // 第一步：查找要删除的索引
            int index = -1;
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
            showAll();
        }
    }


}
