package te;

public class PanDuanQuJian {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        if (a>=5 && a<=10){
            System.out.println("这个数在[5,10]之间");
        }
        if (a<5 || a>10){
            System.out.println("这个数不在[5,10]之间");
        }
    }
}
