package A0;

public class V1 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 100); //随机生成一个0-100正整数
        int count = 0;//定义计数器

        while (true) {
            System.out.println("请输入一个数字："); //提示信息
            int a = new java.util.Scanner(System.in).nextInt();//键盘获取数字
            count++;//
            if (a < 0 || a > 100) { //校验输入是否合法
                System.out.println("输入的数字不合法！请重新输入：");
                continue;
            }
            //判断输入内容与随机数是否一致
            if (a == n) {//输入的数字等于随机数
                System.out.println("恭喜你猜对了！");
                System.out.println("你一共猜了" + count + "次");
                break;
            } else if (a > n) {//输入的数字大于随机数
                System.out.println("你输入的数字太大了！");
            } else {//输入的数字小于随机数
                System.out.println("你输入的数字太小了！");
            }
        }
    }
}


