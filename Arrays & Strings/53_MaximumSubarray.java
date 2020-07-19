/***********************************************

Time Complexity : O(n)
Space Complexity : O(n)

https://leetcode.com/problems/maximum-subarray/

Kadane's Algorith

***********************************************/

class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        
        return maxSoFar;
    }
}