package DSAwithJAVA.Sorting;
import java.util.Scanner;

public class bubbleSort {
    static void bubbleSorting(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            boolean flag=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(flag==false){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr={9,8,7,6,2,3,5,7,0};
        bubbleSorting(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
//        for(int i: arr){
//            System.out.print(i+" ");
//        }
    }

}

