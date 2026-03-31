package COM;

import java.util.Random;
import java.util.Scanner;

public class A9 {
    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("猜一个 1-100 的数字：");
            int guess = scanner.nextInt();
            
            if (guess == target) {
                System.out.println("恭喜你猜对了！");
                break;
            } else if (guess > target) {
                System.out.println("太大了！");
            } else {
                System.out.println("太小了！");
            }
        }
    }
}
