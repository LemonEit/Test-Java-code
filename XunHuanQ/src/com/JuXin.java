package com;

public class JuXin {
    public static void main(String[] args) {
        int j=0;
        while ( j<5){
            for (int i = 1; i < 9; i++){
                System.out.print("*");}
            System.out.print("\n");
            j++;
        }
        System.out.println("---------------");
        int k=0;
        while (k<5){
            if (k==0) System.out.print("     ");
            if (k==1) System.out.print("    ");
            if (k==2) System.out.print("   ");
            if (k==3) System.out.print("  ");
            if (k==4) System.out.print("");

            {for (int i = 1; i < 9; i++){
                System.out.print("*");}
            System.out.print("\n");}
            k++;
        }
        System.out.println("---------------");
        int r=0;
        while (r<=5)
        {
            if (r==1){System.out.println("    *");}
            if (r==2){System.out.println("   ***");}
            if (r==3){System.out.println("  *****");}
            if (r==4){System.out.println(" *******");}
            if (r==5){System.out.println("*********");}
            r++;
        }
    }
}
