package two_sum;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] z = new int[2];
        for (int x = 0;x<nums.length-1;x++){
            for (int y = x;y<nums.length;y++){
                if (nums[x]+nums[y] == target && x != y){
                    z[0] = x;
                    z[1] = y;
                }
            }
        }
        return z;
    }
}
