/***********************************************

Time Complexity : O(n)
Space Complexity : O(n)

https://leetcode.com/problems/valid-palindrome-ii/

***********************************************/

class Solution {
    public boolean validPalindrome(String s) {
        
        char[] ch = s.toCharArray();
        
        for(int i = 0, j = ch.length - 1; i < j; i++, j--) {
            if(ch[i] != ch[j]) {
                return isPalindromic(ch, i + 1, j) || isPalindromic(ch, i, j - 1);
            }
        }
        
        return true;
    }    
    
    public boolean isPalindromic(char[] ch, int l, int r) {
        for(int i = l, j = r; i < j; i++, j--) {
            if(ch[i] != ch[j]) {
                return false;
            }
        }
        
        return true;
    }
}