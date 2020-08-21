/***********************************************

Time Complexity : O(n)
Space Complexity : O(1)

https://leetcode.com/problems/jump-game/

https://leetcode.com/problems/jump-game/solution/

https://www.youtube.com/watch?v=Zb4eRjuPHbM

***********************************************/

class Solution {
    public boolean canJump(int[] nums) {
        int lastGoodIndexPosition = nums.length - 1;
        
        for(int i = nums.length - 1; i >= 0; i--) {
            if(i + nums[i] >= lastGoodIndexPosition) {
                lastGoodIndexPosition = i;
            }
        }
        
        return lastGoodIndexPosition == 0;
    }
}