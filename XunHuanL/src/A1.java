public class A1 {
    public static void main(String[] args) {
        int js=0,os=0;//初始化奇数和和偶数和的值
    for (int i=1;i<=100;i++) //循环100次
    {
        if (i%2==0)//判断i是偶数还是奇数
            os=os+i;//偶数则加到偶数和os中
        else
            js=js+i;//奇数则加到奇数和js中
    }
    System.out.println("1-100奇数和="+js);
    System.out.println("1-100偶数和="+os);
    }
}
