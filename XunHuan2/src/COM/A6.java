package COM;

public class A6  {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                continue;
            }
            sum += i;
        }

        System.out.println("和：" + sum);
    }
}
