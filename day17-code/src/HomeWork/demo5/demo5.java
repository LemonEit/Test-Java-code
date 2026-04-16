package HomeWork.demo5;

public class demo5 {
    public static void main(String[] args) {


        while (true) {
            showMain();
            System.out.println("请选择操作：");
            int input = new java.util.Scanner(System.in).nextInt();
            switch (input) {
                case 1:
                    new user().showall();
                    break;
                case 2:
                    new user().addMember();
                    break;
                case 3:
                    new user().deleteMember();
                    break;
                case 4:
                    System.out.println("感谢使用,再见!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入错误");
                    break;



            }
        }
    }

    private static void showMain () {
        System.out.println("***************超市会员管理系统*************************");
        System.out.println("1. 查看会员列表");
        System.out.println("2. 添加会员");
        System.out.println("3. 删除会员");
        System.out.println("4. 退出");
        System.out.println("******************************************************");
    }

}
