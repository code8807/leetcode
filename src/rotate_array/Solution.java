package rotate_array;

import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 1){
            return;
        }
        int a = 0;
        for (int n = 0; n<k; n++){
            a = nums[0];
            nums[0] = nums[nums.length-1];
            for (int j = 1; j<nums.length; j++){
                nums[nums.length-j] = nums[nums.length-j-1];
            }
            nums[1] = a;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1};
        Solution solution = new Solution();
        solution.rotate(nums,3);
        System.out.println(Arrays.toString(nums));
    }
}
