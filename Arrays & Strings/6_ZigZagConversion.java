/***********************************************

Time Complexity : O(n) or O(m) whichever is greater
Space Complexity : O(m)

https://leetcode.com/problems/zigzag-conversion/

***********************************************/

class Solution {
    public String convert(String s, int numRows) {
        
        if(numRows <= 1) 
            return s;
        
        StringBuilder[] sb = new StringBuilder[numRows];
        
        for(int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }
        
        int increment = 1;
        int index = 0;
        
        for(int i = 0; i < s.length(); i++) {
            sb[index].append(s.charAt(i));
            if(index == 0)
                increment = 1;
            if(index == numRows - 1)
                increment = -1;
            index = index + increment;
        }
        
        for(int i = 1; i < numRows; i++) {
            sb[0].append(sb[i]);
        }
        
        return sb[0].toString();
    }
}