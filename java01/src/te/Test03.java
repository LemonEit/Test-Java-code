package te;

public class Test03 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0&& i % 5 == 0) {
                System.out.print(i+(++count % 4 == 0?"\n":" "));
            }
        }
    }
    public static void main3(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("输入的数字有误");
            return;  //判断是负数时，结束程序
            }
        int sum = 0, count = 0; //sum保存偶数和，count保存偶数个数
        for (int i = 1; i <= n; i++){
            if (i % 2 == 0) {
                sum = sum+i;
                count++;
                System.out.println(i);
            }
        }
        System.out.print("="+sum);
        System.out.println("共有"+count+"个偶数");

    }
    public static void main2(String[] args) {
        //输出1到100之间所有既能被3整除又能被5整除的偶数
        int i;
        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0&& i % 5 == 0&& i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void main1(String[] args) {
        int i;
        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        for (i = 100; i >= 1; i--) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
