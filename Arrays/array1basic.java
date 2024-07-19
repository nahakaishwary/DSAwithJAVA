package DSAwithJAVA.Arrays;

import java.util.*;

class ArrayExample{

    void multiArrays(){
//        int [][] arr_1 = new int[3][2];
        int [][] arr = {{33,44,22},{4,5,9},{8,65,44}};  // array Literal
//        System.out.println(arr[0][0]);
//        System.out.println(arr[2][2]);
//        System.out.println(arr[1][1]);
//        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            for( int j=0;j< arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
    void arraySum(){
        int sum=0;
        int[] arrSum={1,4,5,6,1};
        for(int i=0;i<arrSum.length;i++){
            sum=sum+arrSum[i];
        }
        System.out.println(sum);
    }

    void maxOfArray(){
        int[] arrayMax={5,3,8,4,6,1,0,3,6,8,2,9,4,8,7};
        int current_value=0;
        for(int i=0;i<arrayMax.length;i++){
            if(arrayMax[i]>current_value){
                current_value=arrayMax[i];
            }
        }
        System.out.println("Max value "+current_value);
    }

    void SearchArray(){

        int SearchArr[]={10,5,3,6,2,8,4};
        int x=2;
        int ans=-1;

        for(int i=0;i<SearchArr.length;i++){
            if(SearchArr[i]==x){
                ans=i;

            }

        }
        System.out.println("found "+x+" at index "+ans);


    }

    void demoArrays(){
        int ages[]=new int[3];
        float[] weight=new float[3];
        String name[]=new String[3];

        ages[0]=32;
        ages[1]=21;
        ages[2]=23;
//        ages[5]=14; // out of bound

        weight[0]=55;
        weight[1]=90;
        weight[2]=75;

        name[0]="aishwary";
        name[1]="kumar";
        name[2]="nahak";

        System.out.println(ages[1]);
        System.out.println(weight[2]);
        System.out.println(name[1]);

    }
}

public class array1basic {
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
//        obj.demoArrays();
        obj.SearchArray();

    }
}
