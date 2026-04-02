package COM;

import java.util.Scanner;

public class A10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入一个小于 10 的整数：");
        int n = scanner.nextInt();
        
        long factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }
        
        System.out.println(n + "的阶乘是：" + factorial);
    }
}
