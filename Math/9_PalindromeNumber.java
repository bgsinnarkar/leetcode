/***********************************************

Time Complexity : O(number of digits in fiven integer)
Space Complexity : O(1)

https://leetcode.com/problems/palindrome-number/

***********************************************/

class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0) {
            return false;
        }
        
        int y = x;
        int rev = 0;
        
        while(x != 0) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        
        return (y == rev);        
    }    
}