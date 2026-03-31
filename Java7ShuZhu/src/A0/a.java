package A0;

public class a {
    public static void main(String[] args) {
        //循环100次
        for (int i = 0; i < 100; i++) {
            //判断是否能被3整除，并且能被5整除
            if(i%3==0&&i%5==0){
                System.out.println(i);//可以被3整除，并且能被5整除输出
            }
        }
    }
}
