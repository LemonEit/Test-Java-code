import java.util.Arrays;

public class A3 {

    public static void main(String[] args) {
        int []arr={1,3,5,7,9,11,13,15,17,19};//创建一个数组
        int []newArr=new int[arr.length];//创建一个新数与旧的数组长度一致
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {//倒序遍历
            newArr[i] = arr[j];//赋值给新数组
        }
        System.out.println(Arrays.toString(newArr));//使用Arrays数组工具类的toString方法输出新数组

    }
}
