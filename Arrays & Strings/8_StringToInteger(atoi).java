/***********************************************

Time Complexity : O(n)
Space Complexity : O(1)

https://leetcode.com/problems/string-to-integer-atoi/

***********************************************/

class Solution {
    public int myAtoi(String str) {
        
        if(str == null || str.length() == 0)
            return 0;        
        
        double result = 0;
        int index = 0;
        boolean isNegative = false;
        str = str.trim();
        
        if(str.length() == 0)
            return 0;
        
        if(str.charAt(0) == '+' || str.charAt(0) == '-')
            index++;
        
        if(str.charAt(0) == '-')
            isNegative = true;
        
        for(int i = index; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            
            if(digit > 9 || digit < 0)
                break;
            
            result = result * 10 + (double)digit;
        }
        
        result = isNegative ? -result : result;
        
        if(result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if(result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;            
    
        return (int)result;
    }
}