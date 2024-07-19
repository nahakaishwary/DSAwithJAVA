package DSAwithJAVA.Recursion;
import java.util.Scanner;
public class recursion {

    static void printDecreasing(int n){
        // base case
        if(n==1){
            System.out.println(n);
            return;
        }
        //self work
        System.out.println(n);
        // recursive work
        printDecreasing(n-1);
    }
    static void printIncreasing(int n){
        // base case
        if(n==1){
            System.out.println(n);
            return;
        }
        // recursive work
        printIncreasing(n-1);
        // self work
        System.out.println(n);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printDecreasing(n);
    }
}
