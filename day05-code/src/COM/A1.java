package COM;

public class A1 {

    public static void main(String[] args) {
        int jSum = 0;
        int oSum = 0;
        
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                oSum += i;
            } else {
                jSum += i;
            }
        }

        System.out.println("0-100 奇数和：" + jSum);
        System.out.println("0-100 偶数和：" + oSum);
    }
}
