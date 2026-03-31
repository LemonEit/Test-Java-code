public class A2 {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);//创建一个Scanner对象用来获取键盘输入
        double []a =new double[6];//创建一个数组
        for (int i = 0; i < a.length; i++) {//循环获取键盘输入，赋值给数组
            System.out.println("请输入第" + (i + 1) + "个学生成绩");//提示信息

            a[i] = sc.nextDouble();//赋值给数组 //键盘获取一个小数
        }
        double sum = 0.0,avg=0.0,max=a[0],min=a[0];//定义变量保存和，平均数，最大值，最小值
int count=0;
        for (int i = 0; i < a.length; i++) {//循环遍历数组
          sum=sum+a[i];//累加求和
          if (a[i]>max) {
              max=a[i];
          }//找出最大值
          if (a[i]<min) {
              min=a[i];
          }//找出最小值
          if(a[i]>60){
              count++;
              System.out.println("及格的成绩"+a[i]);

          }//找出60分以上的分数，并计数
        }
        avg=sum/a.length;//求平均数
        System.out.println("总分是："+sum);//输出和
        System.out.println("平均分是："+avg);//输出平均数
        System.out.println("最高分是："+max);//输出最大值
        System.out.println("最小分是："+min);//输出最小值
        System.out.println("及格人数是："+count);

    }

}
