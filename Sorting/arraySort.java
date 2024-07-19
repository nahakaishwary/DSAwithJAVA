package DSAwithJAVA.Sorting;

import java.util.Arrays;

public class arraySort {

    public static void main(String[] args) {
        int arr[]={2,5,2,6,4,8,1,5,2,6,9,4};
//        Arrays.sort(arr);  // bubble sort
        Arrays.sort(arr,3,8);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
