public class A5 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=5;i++){

            if (i==4) continue;
            sum+=+i;
        }
System.out.println(sum);
        int sum2=0;
        for(int i=1;i<=5;i++){
            sum2+=+i;
            if (i==3) break;

        }
        System.out.println(sum2);
    }
}
