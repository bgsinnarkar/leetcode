/***********************************************

Time Complexity : O(n)
Space Complexity : O(1)

https://leetcode.com/problems/implement-strstr/

***********************************************/

class Solution {
    public int strStr(String haystack, String needle) {
        
        if(haystack == null || needle == null)
            return 0;
                
        int n = needle.length();
        
        for(int i = 0; i <= haystack.length() - n; i++) {
            if(haystack.substring(i, i + n).equals(needle))
                return i;
        }
        
        return -1;
    }
}