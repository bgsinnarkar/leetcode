/***********************************************

Time Complexity : O(1)
Space Complexity : O(1)

https://leetcode.com/problems/integer-to-roman/

***********************************************/

class Solution {
    public String intToRoman(int num) {
        
        if(num < 1 || num > 3999) 
            return "";        
        
        String[] M = {"", "M", "MM", "MMM"};
        String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};        
        
        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
    }
}