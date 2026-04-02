package Com;

public class A2 {
    public static void main(String[] args) {
        double arr[] = new double[]{12.9, 53.54, 75.0, 99.1, 3.14}; //定义小数数组arr
        double min = arr[0];//初始化最小值为第一个元素
        for(int i = 0; i < 5; i++) {//循环五次，遍历数组元素
            if(arr[i] < min) { //判断当前元素是否比最小值小
                min = arr[i];//改变最小值
            }
        }
        System.out.println(min);//输出最小值
    }

}
