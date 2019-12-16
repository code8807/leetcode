package move_zeroes;

public class Solution {
    public void moveZeroes(int[] nums) {
        for (int n=0;n<nums.length;n++){
            if (nums[n] == 0){
                for (int j=n+1;j<nums.length;j++){
                    if (nums[j] != 0){
                        nums[n] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
            }
        }
    }
}
