/***********************************************

Time Complexity : O(n)
Space Complexity : O(1)

https://leetcode.com/problems/reverse-string/

***********************************************/

class Solution {
    public void reverseString(char[] s) {
        
        int left = 0, right = s.length - 1;
        
        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
    }
}