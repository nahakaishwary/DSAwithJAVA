package DSAwithJAVA.BinarySearch;

import java.util.Scanner;

public class binarysearch {
    static boolean binarySrch(int arr[],int target){
        int n=arr.length;
        int start=0;
        int end=n-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(target==arr[mid]){
                return true;
            }else if(target<arr[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }

        }
        return false;

    }



    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target=0;
        while (target<=10){
            System.out.printf("%d exist in arr: %b\n",target,binarySrch(arr,target));
            target++;
        }


    }
}
