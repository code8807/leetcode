package merge_sorted_array;

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = 0;
        int y = 0;
        int z = 0;
        int[] nums1_copy = new int[m];
        System.arraycopy(nums1, 0, nums1_copy, 0, m);
        while (x < nums1.length && y<m && z<n){
            nums1[x] = nums1_copy[y] < nums2[z]?nums1_copy[y++]:nums2[z++];
            x++;
        }
        if (y == m){
            System.arraycopy(nums2, z, nums1, x, n-z);
        }
        if (z == n){
            System.arraycopy(nums1_copy, y, nums1, x,m-y);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1,2,3};
        int n = 3;
        Solution solution = new Solution();
        solution.merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
}
