/***********************************************

Time Complexity : O(n)
Space Complexity : O(1)

https://leetcode.com/problems/next-permutation/

https://www.youtube.com/watch?v=PYXl_yY-rms

***********************************************/

class Solution {
    public void nextPermutation(int[] nums) {
        
        int k = nums.length - 2;
        
        while(k >= 0 && nums[k] >= nums[k + 1]) {
            k--;
        }
        
        if(k == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        
        for(int l = nums.length - 1; l > k; l--) {
            if(nums[l] > nums[k]) {
                int tmp = nums[k];
                nums[k] = nums[l];
                nums[l] = tmp;
                break;
            }
        }
        
        reverse(nums, k + 1, nums.length - 1);
        return;
    }
    
    private void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int tmp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = tmp;
        }
    }
}