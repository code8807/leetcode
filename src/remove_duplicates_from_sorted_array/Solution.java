package remove_duplicates_from_sorted_array;

import java.util.Arrays;

class Solution {
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 1){
            return nums.length;
        }
        int a = 0;
        int j = 0;
        for (int n = 1;n<nums.length;n++){
            if (nums[j] != nums[n]){
                j++;
                nums[j] = nums[n];
                a++;
            }
        }
        //System.out.println(Arrays.toString(nums));
        return a+1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}