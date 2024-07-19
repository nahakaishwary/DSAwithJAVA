package DSAwithJAVA.Arrays;
import java.util.Arrays;
import java.util.*;


public class removeDuplicateArray {
    public static void main(String[] args) {
        class Solution {
            public int removeDuplicates(int[] nums) {

                int j = 1;
                for (int i = 1; i < nums.length; i++) {
                    if (nums[i] != nums[i - 1]) {
                        nums[j] = nums[i];
                        j++;
                    }
                }
                return j;
            }
        }
    }
}
