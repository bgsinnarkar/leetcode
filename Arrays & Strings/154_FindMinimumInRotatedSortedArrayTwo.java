/***********************************************

Time Complexity : O(n)
Space Complexity : O(1)

https://leetcode.com/problems/word-search/

***********************************************/

class Solution {
    public int findMin(int[] nums) {
		
		if(nums == null || nums.length < 0) 
            return -1;
        if(nums.length == 1) 
            return nums[0];
        
        int low = 0;
        int high = nums.length - 1;
        
        if(nums[high] > nums[low])
            return nums[low];
        
        while(low < high) {
            int mid = low + (high - low) / 2;
            
            if(nums[mid] > nums[high])
                low = mid + 1;
            else if(nums[low] > nums[mid]) {
                low++;
                high = mid;
            }
            else {
                high--;
            }
        }
        
        return nums[low];
    }
}