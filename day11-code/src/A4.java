import java.util.Arrays;

public class A4 {
    public static void main(String[] args) {
        int[] a = {4, 7, 3, 4, 5, 1, 9, 8, 11, 12, 6, 18, 10, 2};//创建数组
        for (int i = 1; i < a.length; i++) {//使用冒泡排序法排序
            for (int j = 0; j < a.length - i; j++) {
                if (a[j] > a[j + 1]) {//前一个数比当前数大，则交换位置
                    int temp = a[j];//临时变量用来交换交换两数位置时使用
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(a));//打印排序后的数组a
        int end = a.length - 1, start = 0, mid, index = 12;//使用二分查找，index是要查找的数，即12，end和start是每次要查找的范围，mid位于end和start的中间位置
        while (true) {
            mid = (start + end) / 2;//找到中间位置
            if (a[mid]<index) {//要查找的数大于中间索引说明，这个数在左半边
                start = mid + 1;//起始位置变更为中间位置的右边

            } else if (a[mid]>index ) {//要查找的数小于中间索引说明，这个数在右半边

                end = mid - 1;//结束位置变更为中间索引左边
            }else {
                System.out.println("找到索引为：" + mid);//当index=a【mid】找到索引位置，输出
                break;//结束循环
            }
            if (start > end) {//走到这里说明这个数在该数组不存在
                System.out.println("没有找到");//输出提升
                break;
            }


        }


    }


}
