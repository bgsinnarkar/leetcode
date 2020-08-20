/***********************************************

Time Complexity : O(n)
Space Complexity : O(1)

https://leetcode.com/problems/move-zeroes/

https://leetcode.com/problems/move-zeroes/solution/

***********************************************/

class Solution {
    public void moveZeroes(int[] nums) {
        
        for(int curr = 0, slow = 0; curr < nums.length; curr++) {
            if(nums[curr] != 0) {
                int temp = nums[slow];
                nums[slow] = nums[curr];
                nums[curr] = temp;
                slow++;
            }
        }
    }
}