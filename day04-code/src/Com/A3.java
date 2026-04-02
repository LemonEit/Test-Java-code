package Com;

public class A3 {
    public static void main(String[] args) {
        int []arr=new int[6];
        for (int i=0;i<arr.length;i++)
        {
            //随机数赋值给arr[i]
            arr[i]=(int)(Math.random()*100);
        }
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
            System.out.print("\t");
        }

    }

}
