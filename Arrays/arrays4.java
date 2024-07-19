package DSAwithJAVA.Arrays;
import java.util.*;

import java.util.Scanner;

public class arrays4 {
    static void PrintingArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }

    }
    static int swappingtemp(int a,int b){

        System.out.println("before swap: "+a+","+b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("after swap: "+a+","+b);
        return 0;
    }
    static int swapping(int a,int b){

        System.out.println("before swap: "+a+","+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swap: "+a+","+b);
        return 0;
    }

    static int[] reverseArray(int arr[]){
        int n=arr.length;
        int ans[]=new int [n];
        int j=0;
        // traverse an array in reverse direction
        for(int i=n-1;i>=0;i--){
            ans[j++]=arr[i];
                         //POST INCREMENT

        }
        System.out.println(ans[j]);
        return ans;
    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int ans[]=reverseArray(arr);
        PrintingArray(arr);




    }
}
