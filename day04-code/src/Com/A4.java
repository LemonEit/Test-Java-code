package Com;

public class A4 {
    /**
     * 主方法 - 程序入口点
     * 功能：将整型数组中的数字组合成一个整数并输出
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        // 初始化整型数组，包含元素 2, 1, 3, 5, 4
        int []arr=new int[]{2, 1, 3, 5, 4};
        
        // 用于存储组合后的数值
        int num=0;
        
        // 遍历数组，将数组元素组合成一个整数
        // 算法：每次将当前数值乘以 10 后加上数组元素，实现数字的位组合
        for (int i=0;i<=arr.length-1;i++)
        {
            num=num*10+arr[i];

        }
        
        // 输出组合后的整数结果
        System.out.println(num);

    }
}
