/***********************************************

Time Complexity : O(n * m)
Space Complexity : O(n)

https://leetcode.com/problems/word-break/

https://www.youtube.com/watch?v=6UcUFUCCpjY

***********************************************/

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        
        for(int lo = 0; lo < n; lo++) {
            if(!dp[lo])
                continue;
            
            for(String word : wordDict) {
                int hi = lo + word.length();
                if(hi <= n && s.substring(lo, hi).equals(word))
                    dp[hi] = true;
            }
        }
        
        return dp[n];
    }
}