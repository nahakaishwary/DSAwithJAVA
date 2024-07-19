package DSAwithJAVA.Arrays;
import java.util.*;

public class PrefixSumArray6 {

    static void PrintArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] makePrefixSumArray(int arr[]){
        int n=arr.length;
        int [] pref=new int[n];
        pref[0]=arr[0];

        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;
    }
    static int[] prefixSumWithoutNewAry(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int size=sc.nextInt();
        int arr[]=new int [size];
        System.out.print("Enter its elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("original array: ");
        PrintArray(arr);
//        int pref[]=makePrefixSumArray(arr);
//        prefixSumWithoutNewAry(arr);




    }


}
