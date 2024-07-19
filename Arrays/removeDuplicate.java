package DSAwithJAVA.Arrays;


class List{
    void listing(){
        int nums[]={2,3,4,3,4,5,6,7,8,6,4,5,6,8,4,6,9};

        for(int i=0;i<nums.length;i++){
            for(int j=1;j<18;j++){
                if(nums[i]!=nums[j]){
                    System.out.println(nums[i]);

                }
                i++;
            }
        }

    }
}
public class removeDuplicate {
    public static void main(String[] args) {
        List obj=new List();
        obj.listing();
    }
}
