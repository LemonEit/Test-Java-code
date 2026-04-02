package te;
/*3.	根据月份，输出对应的季节，并输出至少两个描述该季节的成语和活动*/

public class Test02 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("冬季 冰天雪地 鹅毛大雪 堆雪人 滑冰");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季 春意盎然 春暖花开 植树 踏青");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季 夏日炎炎 挥汗如雨 吃雪糕 喝冷饮 ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季 秋高气爽 五谷丰登  ");
                break;

        }
    }
    public static void main2(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int score = sc.nextInt();
        if (score>=90 && score<=100) {
            System.out.println("A级");
        } else if (score>=80 && score<90) {
            System.out.println("B级");
        } else if (score>=70 && score<80) {
            System.out.println("C级");
        } else if (score>=60 && score<70) {
            System.out.println("D级");
        } else if (score>=0 && score<60) {
            System.out.println("E级");
        } else {
            System.out.println("输入的分数有误");
        }

    }




    public static void main0(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);
       double a = sc.nextDouble();
       if (a%2==0) {
           System.out.println("偶数");
       } else {
           System.out.println("奇数");
       }
    }
}
