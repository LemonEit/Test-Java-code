package te;

public class T2 {
    public static void main(String[] args) {
        int month;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入月份：");
        month = sc.nextInt();

            if (month >= 3 && month <= 5) {
                System.out.println(month+"月是"+"春季");
            } else if (month >= 6 && month <= 8) {
                System.out.println(month+"月是"+"夏季");
            } else if (month >= 9 && month <= 11) {
                System.out.println(month+"月是"+"秋季");
            } else if (month == 12 || month == 1 || month == 2) {
                System.out.println(month+"月是"+"冬季");
            } else {
                System.out.println(month+"月是"+"输入的月份有误");
            }
        }









    public static void main6(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 70 && score < 90) {
            System.out.println("良好");
        } else if (score >= 60 && score < 70) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }
}
