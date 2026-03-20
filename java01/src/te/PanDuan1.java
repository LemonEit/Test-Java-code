package te;

public class PanDuan1 {
    public static void main(String[] args) {
        int a;
        for (a = 0; a<100; ++a) {
            System.out.println(a + "是" + (a % 2 != 0 ? "奇数" : "偶数"));
        }

    }

}
