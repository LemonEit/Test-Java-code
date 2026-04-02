package A0;

public class A2 {
    public static void main(String[] args) {
        int zmlmf=884888;//定义珠穆朗玛峰高度
        int count=0;//定义计数器
        for(int i=1;i<=zmlmf;i=i*2){//循环，从1开始，每次乘2
            count++;//计数器加1
            if(i==zmlmf){
                break;//如果i等于珠穆朗玛峰高度，跳出循环
            }
        }
        System.out.println(count);//输出计数器的值
    }
}
