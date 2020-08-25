/***********************************************

Time Complexity : O(n)
Space Complexity : O(1)

https://leetcode.com/problems/sort-colors/

https://www.youtube.com/watch?v=uvB-Ns_TVis

***********************************************/

class Solution {
    public void sortColors(int[] nums) {
        
        int start = 0;
        int end = nums.length - 1;
        int index = 0;
        
        while(index <= end && start < end)  {
            if(nums[index] == 0) {
                nums[index] = nums[start];
                nums[start] = 0;
                start++;
                index++;
            }
            else if(nums[index] == 2) {
                nums[index] = nums[end];
                nums[end] = 2;
                end--;
            }
            else {
                index++;
            }
        }
    }
}