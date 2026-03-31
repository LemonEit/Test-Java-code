package A0;

public class C {
    public static void main(String[] args) {
        //键盘输入数字，正数计数，负数计数，0结束
        int count=0,count1=0;//定义变量，用于记录正数个数，负数个数
        //键盘获取数，0结束
        System.out.println("请输入数字：");
        while (true) {
            int n = new java.util.Scanner(System.in).nextInt();
            if (n > 0) {
                count++;
            } else if (n < 0) {
                count1++;
            }
            if (n == 0) {break;}
        }
        System.out.println("正数个数是"+count);
        System.out.println("负数个数是"+count1);

    }
}
