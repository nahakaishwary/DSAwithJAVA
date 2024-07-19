package DSAwithJAVA.Arrays;

import java.util.Scanner;

public class transposeMatrix {
    static void printMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void reverseArray(int arr[]){
        int i=0,j=arr.length-1;
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rotate(int [][] matrix,int n){
        // transpose
        transposeInPlace(matrix,n,n);
        //reverse
        for (int i=0;i<n;i++){
            reverseArray(matrix[i]);
        }
    }

    static int[][] findTranspose (int matrix[][],int r,int c){
        int ans[][]=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j]=matrix[j][i];

            }
        }
        return ans;
    }

    // without using ans matrix
    static void transposeInPlace(int [][] matrix, int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                //swap matrix[i][j],matrix[j][i]
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the matrix rows and column :");
        int r=sc.nextInt();
        int c=sc.nextInt();

        int matrix[][]=new int[c][r];
        System.out.println("Enter "+r*c+" elements: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
//        int ans[][]=findTranspose(matrix,r,c);
//        printMatrix(ans);
//        transposeInPlace(matrix,r,c);
//        printMatrix(matrix);
        System.out.println("input matrix:");
        printMatrix(matrix);
        rotate(matrix,r);
        System.out.println("output matrix");
        printMatrix(matrix);



    }
}
