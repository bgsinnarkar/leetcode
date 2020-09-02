/***********************************************

Time Complexity : O(log n)
Space Complexity : O(1)

https://leetcode.com/problems/find-peak-element/

https://leetcode.com/problems/find-peak-element/solution/

***********************************************/

class Solution {
    public int findPeakElement(int[] nums) {
        
        if(nums == null || nums.length == 0)
            return 0;
        
        int left = 0;
        int right = nums.length - 1;
        
        while(left < right) {
            int mid = left + (right - left) / 2;
            
            if(nums[mid] > nums[mid + 1]) {
                right = mid;
            }
            else {
                left = mid + 1;
            }            
        }
        
        return left;
    }
}
