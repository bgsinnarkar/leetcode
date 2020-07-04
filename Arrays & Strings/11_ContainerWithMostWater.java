/***********************************************

Time Complexity : O(n)
Space Complexity : O(1)

https://leetcode.com/problems/container-with-most-water/

***********************************************/

class Solution {
    public int maxArea(int[] height) {
        
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        
        while(left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
            
            if(height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        
        return maxArea;
    }
}