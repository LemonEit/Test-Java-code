package te;

public class Demojsq {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        int c = sc.nextInt();
        switch (b) {
            case "+":
                System.out.println(a+"+"+c+"="+(a+c));
                break;
            case "-":
                System.out.println(a+"-"+c+"="+(a-c));
                break;
            case "*":
                System.out.println(a+"*"+c+"="+(a*c));
                break;
            case "/":
                System.out.println(a+"/"+c+"="+(a/c));
                break;
            default:
                System.out.println("输入的运算符有误");
        }


    }
}
