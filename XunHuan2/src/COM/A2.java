package COM;

public class A2 {

    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
                count++;
                if (count % 3 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
