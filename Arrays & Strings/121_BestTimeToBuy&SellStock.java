/***********************************************

Time Complexity : O(n)
Space Complexity : O(n)

https://leetcode.com/problems/maximum-subarray/

Kadane's Algorith

***********************************************/

class Solution {
    public int maxProfit(int[] prices) {
        
        int maxCurr = 0;
        int maxSoFar = 0;
        
        for(int i = 1; i < prices.length; i++) {
            maxCurr = Math.max(0, maxCurr += prices[i] - prices[i - 1]);
            maxSoFar = Math.max(maxCurr, maxSoFar);
        }
        
        return maxSoFar;
    }
}