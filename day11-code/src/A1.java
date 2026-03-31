public class A1 {
    public static void main(String[] args) {
        char[] arr = {'我', '爱', '你'};//创建一个字符数组，存入我爱你，三个字符
        System.out.println(arr);//输出数组
        for (int i = arr.length - 1; i >= 0; i--) {//倒序输出
            System.out.print(arr[i]);//输出数组
        }

    }
}
