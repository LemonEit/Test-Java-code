package te;

public class Col {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double a = sc.nextDouble();

        if (a%1!=0) {
            System.out.println("输入的数字是小数");
            return;
        }
        if (a%2==0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }
}
