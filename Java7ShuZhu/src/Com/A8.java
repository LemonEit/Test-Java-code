package Com;

public class A8 {
    /**
     * 主方法 - 程序入口点
     * 功能：将数组中的偶数和奇数分别放置到目标数组的两端
     * 算法思路：使用双指针，偶数从左侧开始放置，奇数从右侧开始放置
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        // 初始化原始数组，包含 10 个整数
        int []arr=new int[]{72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        
        // 创建目标数组，用于存储重新排列后的元素
        int []tar=new int[10];
        
        // 初始化双指针：lift 指向左侧起始位置，right 指向右侧起始位置
        int lift=0,right=10;
        
        // 遍历原数组，根据奇偶性将元素放置到目标数组的不同位置
        for (int i=0;i<arr.length;i++)
        {
            // 当前元素为偶数时，从数组左侧开始放置
            if (arr[i]%2==0){
                tar[lift]=arr[i];
                lift++;
            }else{
                // 当前元素为奇数时，从数组右侧开始放置
                tar[right-1]=arr[i];
                right--;
            }

        }
        
        // 遍历并输出目标数组中的所有元素
        for (int i=0;i<tar.length;i++)
        System.out.print(tar[i]+"\t");
    }
}
