package COM;

public class A5 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            if (i > 3) {
                break;
            }
            sum += i;
        }

        System.out.println("前三个数的和：" + sum);
    }
}

