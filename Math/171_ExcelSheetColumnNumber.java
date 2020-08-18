/***********************************************

Time Complexity : O(s.length())
Space Complexity : O(1)

https://leetcode.com/problems/excel-sheet-column-number/

https://leetcode.com/problems/excel-sheet-column-number/discuss/52091/Here-is-my-java-solution

***********************************************/

class Solution {
    public int titleToNumber(String s) {
        
        int result = 0;
        
        for(int i = 0; i < s.length(); i++) {
            result = result * 26 + (s.charAt(i) - 'A' + 1);
        }
        
        return result;
    }
}