package DSAwithJAVA.Arrays;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class arrayL15 {

    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int ArrayOccurence(int[] arr,int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }

    static int LastOccurence(int[] arr,int x){
        int lastIndex=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                lastIndex=i;
            }
        }
        System.out.println(lastIndex);
        return lastIndex;
    }

    static int greaterInArray(int arr[],int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    static boolean isSorted(int[] arr){
        boolean check=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                check=false;
                break;
            }

        }
        return check;

    }

    static void ascendingOrder(int[] arr){
        Arrays.sort(arr);
        int i;
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int a=arr[0];
        int b=arr[arr.length-1];
        System.out.println(a+" "+b);

    }
    static int[] smalletAndlargestElement(int arr[]){
        Arrays.sort(arr);
        ascendingOrder(arr);
        int ans[]={arr[0],arr[arr.length-1]};
        System.out.println(ans[0]+"-" +ans[1]);
        return ans;
    }


    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the size of an array: ");
//        int size=sc.nextInt();
//
//        int arr[]=new int[size];
//        System.out.print("Enter its elements: ");
//        for(int i=0;i<arr.length;i++){
//            arr[i]= sc.nextInt();
//        }
//        System.out.print("Your array list: ");
//        printArray(arr);
//
//        System.out.println();
//
//        int[] arr_2= Arrays.copyOfRange(arr,0,3);
//        System.out.print("copied Array: ");
//        printArray(arr_2);
//
//        System.out.println();
//        printArray(arr);
//        System.out.println("--------");
//        printArray(arr_2);

        //x occurence in an array
//        System.out.print("Enter x: ");
//        int x=sc.nextInt();










    }
}
