/***********************************************

Time Complexity : O(n)
Space Complexity : O(1)

https://leetcode.com/problems/roman-to-integer/

***********************************************/

class Solution {
    public int romanToInt(String s) {
        
        int num = 0;
        
        if(s.length() == 0) {
            return num;
        }
        
        for(int i=0; i < s.length() - 1; i++) {
            int current = getWeight(s.charAt(i));
            int next = getWeight(s.charAt(i+1));
            
            if(current < next) {
                num = num - current;
            }
            else {
                num = num + current;
            }
        }
        
        return num + getWeight(s.charAt(s.length()-1));
    }
    
    public int getWeight(char c) {              
        
        switch(c) {
            case 'I':
                return 1;                
            case 'V':
                return 5;                
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        
        throw new IllegalArgumentException("Not a Roman number");
    }
}