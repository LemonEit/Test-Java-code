import java.util.Arrays;
import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//创建Scanner对象
        int[] arr = new int[5];//创建数组
        for (int i = 0; i < arr.length; i++) {//遍历数组
            System.out.println("请输入第" + (i + 1) + "个整数");//提示信息
            arr[i] = sc.nextInt();//录入数据
        }//录入数据
        int coumt = 0;//统计个数
        int max=arr[0], min=arr[0];//定义变量保存最大值和最小值
        for (int i = 0; i < arr.length; i++) {//遍历数组
            if (arr[i] > 10) {//判断是否大于10
                coumt++;//统计个数
            }
            if (arr[i]>max) max=arr[i];//找出最大值
            if (arr[i]<max) min=arr[i];//找出最小值

        }
        System.out.println("比10大的个数是：" + coumt);//输出个数
        System.out.println("最大值是：" + max);//输出最大值
        System.out.println("最小值是：" + min);//输出最小值
        System.out.println("请输入一个要查找的数：");
        int index=sc.nextInt();//键盘输入一个数，找出这个数在数组中的索引
        for (int i = 0; i < arr.length; i++) {//遍历数组
            if (arr[i]==index) {//判断是否等于键盘输入的数
                System.out.println("索引是：" + i);//输出索引
            }else {
                System.out.println("没有找到");//输出没有找到
            }

        }//遍历数组寻找index
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {//升序排序
                    //System.out.println("i:" + arr[i] + "j:" + arr[j]);
                    int temp = arr[i];//临时变量
                    arr[i] = arr[j];//赋值给i
                    arr[j] = temp;//赋值给j
                }

            }
        }
        System.out.println(Arrays.toString(arr));


    }
}
