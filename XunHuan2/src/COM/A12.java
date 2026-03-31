package COM;


import java.util.Scanner;

public class A12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入一个十进制整数：");
        int num = scanner.nextInt();

        String binary = "";

        if (num == 0) {
            binary = "0";
        } else {
            while (num > 0) {
                binary = (num % 2) + binary;
                num = num / 2;
            }
        }

        System.out.println("对应的二进制数：" + binary);
    }
}

