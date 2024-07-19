package DSAwithJAVA.Recursion;

import java.util.Scanner;

public class recursion3 {


    static void multiple(int num,int k){  // by iteration
        for(int i=1;i<=k;i++){
            System.out.println(i*num);
        }
    }
    static void kMultiple(int num,int k){
        // base case
        if(k==0) return;
        if(k==1){
            System.out.println(num);
            return ;
        }


        // recursive work
        kMultiple(num,k-1);
        // self work
        System.out.println(num*k);


    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter num and K: ");
        int num=sc.nextInt();
        int k=sc.nextInt();

        kMultiple(num,k);


    }
}
