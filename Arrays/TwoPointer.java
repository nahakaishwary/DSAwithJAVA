package DSAwithJAVA.Arrays;

import java.util.Scanner;
import java.util.*;

public class TwoPointer {

    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    static void sortingZeroesAndOnes(int [] arr){
        int zeroes=0;
        // count number zeroes--
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zeroes++;
            }
        }

        // 0 to zeroes-1 : zeroes to n-1
        for(int i=0;i<arr.length;i++){
            if(i<zeroes){
                arr[i]=0;
            } else {
                arr[i]=1;
            }
        }
    }
    // using two pointer method
    static void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sortZeroesAndOnes(int arr[]){
        int n=arr.length;
        int left=0,right=n-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
    }
    //Q. arrange the array elements where even at start and odd after even
    static void sortArrayByParity(int arr[]){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }

        }

    }
    // array reverse method/function
    static void reverse(int []arr){
        int n = arr.length;
        int i=0,j=n-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static int[] sortSquares(int arr[]){
        int n=arr.length;
        int left=0,right=n-1;
        int [] ans = new int[n];
        int k=0;

        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k]=arr[left]*arr[left];
                k++;
                left++;
            } else {
                ans[k]=arr[right]*arr[right];
                k++;
                right--;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("size of array: ");
        int size=sc.nextInt();
        System.out.print("Enter its elements: ");
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("original array: ");
        printArray(arr);
//        int ans[]=sortSquares(arr);
//        System.out.print("squared array: ");
//        printArray(ans);
//        reverse(ans);
        System.out.print("answer array: ");
//        printArray(ans);






    }
}
