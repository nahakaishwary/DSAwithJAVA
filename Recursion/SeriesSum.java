package DSAwithJAVA.Recursion;

import java.util.Scanner;

public class SeriesSum {

    static int seriesSum(int n){
        if(n==0){
            return 0;
        }
        if(n%2==0){
            return seriesSum(n-1)-n;
        }else

            return seriesSum(n-1)+n;


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=seriesSum(n);
        System.out.println(a);

    }
}
