import java.util.Arrays;

//选择排序算法练习
public class O1 {
    public static void main(String[] args) {
        int[] arr = {1, 565, 15, 5, 11, 541, 5, 8, 878};//创建一个数组

        for (int i = 0; i < arr.length - 1; i++) {//循环次数
            int min = arr[i], index = i;//创建一个变量，记录最小值和索引
            for (int j = i + 1; j < arr.length; j++) {//从i+1开始，找到最小值和索引
                if (arr[j] < min) {//升序排序
                    min = arr[j];//记录最小值
                    index = j;//记录索引
                }
            }
            int temp = arr[index];//创建一个临时变量，记录最小值
            arr[index] = arr[i];//将最小值赋给arr[i]
            arr[i] = temp;//将临时变量的值赋给arr[index]
        }
        System.out.println(Arrays.toString(arr));//输出数组
    }
}
