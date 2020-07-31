/***********************************************

Time Complexity : O(2^n)
Space Complexity : O(2^n)

https://leetcode.com/problems/word-break-ii/

https://www.youtube.com/watch?v=uR3RElKnrkU

In the worst case the runtime of this algorithm is O(2^n).

Consider the input "aaaaaa", with wordDict = ["a", "aa", "aaa", "aaaa", "aaaaa", "aaaaa"]. Every possible partition is a valid sentence, and there are 2^n-1 such partitions. It should be clear that the algorithm cannot do better than this since it generates all valid sentences. The cost of iterating over cached results will be exponential, as every possible partition will be cached, resulting in the same runtime as regular backtracking. Likewise, the space complexity will also be O(2^n) for the same reason - every partition is stored in memory.

Where this algorithm improves on regular backtracking is in a case like this: "aaaaab", with wordDict = ["a", "aa", "aaa", "aaaa", "aaaaa", "aaaaa"], i.e. the worst case scenario for Word Break I, where no partition is valid due to the last letter 'b'. In this case there are no cached results, and the runtime improves from O(2^n) to O(n^2).

***********************************************/

class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        return wordBreakHelper(s, wordDict, new HashMap<String, List<String>>());
    }
    
    private List<String> wordBreakHelper(String s, List<String> wordDict, HashMap<String, List<String>> memo) {
        
        if(memo.containsKey(s)) {
            return memo.get(s);
        }
        
        List<String> result = new ArrayList();
        
        if(s == null || s.length() <=0) {
            result.add("");
            return result;
        }
        
        for(String word : wordDict) {
            if(s.startsWith(word)) {
                String sub = s.substring(word.length());
                List<String> subStrings = wordBreakHelper(sub, wordDict, memo);
                               
                for(String subString : subStrings) {
                    String optionalString = subString.isEmpty() ? "" : " ";
                    result.add(word + optionalString + subString);
                }
            }
        }
        
        memo.put(s, result);
        
        return result;
    }
}