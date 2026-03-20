package te;
public class Test6 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String fruit = sc.next();
        switch (fruit){
            case "苹果":
                System.out.println("苹果6块/斤");
                break;
            case "香蕉":
                System.out.println("香蕉3块/斤");
                break;
            case "榴莲":
                System.out.println("榴莲20块/斤");
                break;
            case "西瓜":
                    System.out.println("西瓜0.8块/斤");
                    break;
            default:
                System.out.println("输入的名称有误");
                break;
        }


    }




    public static void main2(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double score = sc.nextDouble();

        switch ((int)score/10){
            case 10:
            case 9:
                System.out.println("优秀");
                break;
            case 8:
            case 7:
                System.out.println("良好");
                break;
                case 6:
                    System.out.println("及格");
                    break;
            default:
                System.out.println("不及格");
        }
    }





    public static void main1(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
                case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
                default:
                System.out.println("输入的数字有误");
        }
    }
}
