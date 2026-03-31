package com;

public class J1 {
    public static void main(String[] args) {
        int []arr=new int[]{5, 12, 90, 18, 77, 76, 45, 28, 159, 72};
        int index=-1;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]==59){
                index=i;
                break;
                }
            }
        System.out.println(index);
        }
    }


