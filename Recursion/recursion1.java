package DSAwithJAVA.Recursion;

import java.util.Scanner;

public class recursion1 {
    // Factorial
    static int printFactorial(int n){
        // Base case
        if(n==0)   return 1;

//        // Recursive work
//        int smallAns = printFactorial(n-1);
//
//        // self work
//        int ans=n*smallAns;
//        return ans;
        return n*printFactorial(n-1);
    }

    // Fibonacci series
    static int fibonacci(int n){
        if(n==0 || n==1) return n;


        return fibonacci(n-1)+fibonacci(n-2) ;
    }
    public static void main(String[] args) {
        for (int i=0;i<=10;i++){
            System.out.println(fibonacci(i));
        }

    }
}
