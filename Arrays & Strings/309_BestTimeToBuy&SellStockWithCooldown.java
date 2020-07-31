/***********************************************

Time Complexity : O(n)
Space Complexity : O(1)

https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/

https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/discuss/75931/Easiest-JAVA-solution-with-explanations

***********************************************/

class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices == null || prices.length <= 1)
            return 0;
        
        int b0 = -prices[0];
        int b1 = b0;
        int s0 = 0, s1 = 0, s2 = 0;
        
        for(int i = 1; i < prices.length; i++) {
            b0 = Math.max(b1, s2 - prices[i]);
            s0 = Math.max(s1, b1 + prices[i]);
            b1 = b0;
            s2 = s1;
            s1 = s0;
        }
        
        return s0;
    }
}