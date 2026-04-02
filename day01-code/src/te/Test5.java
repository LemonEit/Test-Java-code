package te;

public class Test5 {
    public static void main(String[] args) {
        int count = 0,sum=0;//统计个数
        for (int i = 1000; i <= 9999; i++) {
            int ab = i / 100;
            int cd = i % 100;
            if(((ab+cd)*(ab+cd))==i){
                count = count + 1;
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println("个数是"+count+"和是"+ sum);
    }

}
