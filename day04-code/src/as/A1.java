package as;

public class A1 {
    public static void main(String[] args) {
        int[] arr = new int[5];    //创建一个数组
        int max, min;//定义最大值和最小值
        for(int i = 0; i < arr.length; i++) {//遍历数组
            //生成随机数并赋值给arr[i]
            arr[i] = (int)(Math.random() * 100);

        }
        max = arr[0];    //初始化最大值为数组第一个元素
        min = arr[0];    //初始化最小值为数组第一个元素
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {    //如果当前元素大于最大值
                max = arr[i];    //更新最大值
            }
            if(arr[i] < min) {    //如果当前元素小于最小值
                min = arr[i];    //更新最小值
            }
        }
        //输出最大值和最小值
        System.out.println("Max: " + max);    //输出最大值
        System.out.println("Min: " + min);    //输出最小值

        //临时调试信息，输出所有元素，增强for循环
        //for(int i : arr) System.out.print(i + " ");

    }

}
