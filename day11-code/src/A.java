import java.lang.reflect.Array;
import java.util.Arrays;

public class A {
    public static void main(String[] args) {
        int[] arr = {1, 515, 615, 15, 5, 11, 541, 5};
        //fanzhan(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));//数组排序方法
    }

    private static void fanzhan(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            int temp = arr[j];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

}
