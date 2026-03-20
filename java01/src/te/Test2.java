package te;

public class Test2 {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
    int age = sc.nextInt();
        if(age>=18){
            System.out.println("已成年");
        }
        if(age<18){
            System.out.println("未成年");
        }
}
}
