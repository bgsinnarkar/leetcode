/***********************************************

Time Complexity : O(n)
Space Complexity : O(n)

https://leetcode.com/problems/reverse-words-in-a-string/

***********************************************/

class Solution {
    public String reverseWords(String s) {
        
        if(s == null) 
            return null;
        
        String[] parts = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        int len = parts.length;
        
        for(int i = 1; i <= len; i++) {
            sb.append(parts[len - i]);
            sb.append(" ");
        }
        
        return sb.toString().trim();
    }
}