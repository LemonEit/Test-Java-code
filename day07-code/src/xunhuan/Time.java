package xunhuan;

public class Time {
    public static void main(String[] args) {
        int count = 0;
        for (int j = 0; j < 24; j++) {
            for (int i = 0; i < 60; i++) {
                System.out.print(j + "时");
                System.out.print(i + "分");
                count++;
                if (count % 10==0){System.out.println("\n");}

            }

        }
    }

    }
