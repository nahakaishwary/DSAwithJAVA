package DSAwithJAVA.Arrays;
import java.util.Scanner;

public class twoDarraymultiplication {
    static void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void printMatrix(int [][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void multiply(int[][] a, int r1,int c1,int [][]b ,int r2,int c2){
        if(c1!=r2){
            System.out.println("Wrong input-Multiplication not possible--");
            return;
        }
        int[][] mul=new int[r1][c2];
        for(int i=0;i<r1;i++){      //rows
            for(int j=0;j<c2;j++){  //column

                for(int k=0;k<c1;k++){
                    mul[i][j]=mul[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("result matrix: ");
        printMatrix(mul);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows os M1: ");
        int r1=sc.nextInt();
        System.out.print("Enter number of column of M1: ");
        int c1=sc.nextInt();
        int a[][]=new int[r1][c1];
        System.out.println("Enter its elements: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.print("Enter number of rows os M2: ");
        int r2=sc.nextInt();
        System.out.print("Enter number of column of M2: ");
        int c2=sc.nextInt();
        int b[][]=new int[r2][c2];
        System.out.println("Enter its elements: ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }

        System.out.println("matrix 1: ");
        printArray(a);
        System.out.println("matrix 2: ");
        printArray(b);
        multiply(a,r1,c1,b,r2,c2);






    }
}
