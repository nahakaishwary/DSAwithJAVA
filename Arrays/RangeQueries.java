package DSAwithJAVA.Arrays;

import java.util.Scanner;
import java.util.Stack;

public class RangeQueries {

    static int[] prefixSumWithoutNewAry(int[] arr){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int size=sc.nextInt();

        int arr[]=new int[size+1];
        System.out.print("Enter its elements: ");
        for(int i=1;i<=arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int [] prefSum=prefixSumWithoutNewAry(arr);

        System.out.print("Enter number of queries: ");
        int q=sc.nextInt();

        while(q-->0){
            System.out.println("Enter range: ");
            int l= sc.nextInt();
            int r=sc.nextInt();

            int ans=prefSum[r]-prefSum[l-1];
            System.out.println("sum = "+ans);
        }



    }
}
