/***********************************************

Time Complexity : O(log n)
Space Complexity : O(1)

https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

https://www.youtube.com/watch?v=bU-q1OJ0KWw

***********************************************/

class Solution {
    public int[] searchRange(int[] nums, int target) {        
        int[] result = new int[2];
        result[0] = findStartingIndex(nums, target);
        result[1] = findEndingIndex(nums, target);
        return result;
    }
    
    private int findStartingIndex(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end) {
            int mid = start + (end - start) / 2;
            
            if(nums[mid] >= target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
            
            if(nums[mid] == target)
                index = mid;
        }
        
        return index;
    }
    
    private int findEndingIndex(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end) {
            int mid = start + (end - start) / 2;
            
            if(nums[mid] <= target) {
                start = mid + 1;                
            }
            else {
                end = mid - 1;
            }
            
            if(nums[mid] == target)
                index = mid;
        }
        
        return index;
    }
}

