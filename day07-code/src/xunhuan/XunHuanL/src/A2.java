public class A2 {
    public static void main(String[] args) {
        int count=0;//统计个数
        for (int i=1;i<=1000;i++)//循环1000
        {
            if (i%5==0){//判断是否能被5整除
                System.out.print(i+" ");//输出
            count++;//个数加1
                if (count%3==0)System.out.println();//每三个换行
            }


        }
    }
}
