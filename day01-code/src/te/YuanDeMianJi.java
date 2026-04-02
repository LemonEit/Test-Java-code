package te;

public class YuanDeMianJi {

    public static void main(String[] args) {
        final double pi=3.14;
        double r,mj,zc;
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("请输入圆的半径：");
        r=sc.nextDouble();
        mj=pi*r*r;
        zc=2*pi*r;
        System.out.println("圆的周长是"+zc);
        System.out.println("圆的面积是："+mj);
    }

}
