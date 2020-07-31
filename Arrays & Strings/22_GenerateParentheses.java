/***********************************************

Time Complexity : O(4^n / sqrt(n))
Space Complexity : O(4^n / sqrt(n))

https://leetcode.com/problems/generate-parentheses/

https://leetcode.com/problems/generate-parentheses/solution/

***********************************************/

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList();
        backTrack(n, result, "", 0, 0);
        return result;
    }
    
    private void backTrack(int max, List<String> result, String cur, int open, int close) {
        if(cur.length() == 2 * max) {
            result.add(cur);
            return;
        }
            
        if(open < max) {
            backTrack(max, result, cur + "(", open + 1, close);
        }
        if(close < open) {
            backTrack(max, result, cur + ")", open, close + 1);
        }
    }
}