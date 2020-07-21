/***********************************************

Time Complexity : O(max(n1, n2))
Space Complexity : O(max(n1, n2))

https://leetcode.com/problems/add-strings/

***********************************************/

class Solution {
    public String addStrings(String num1, String num2) {
        
        StringBuilder sb = new StringBuilder();
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;
        int carry = 0;
        
        while(p1 >= 0 || p2 >=0) {
            int x1 = p1 >= 0 ? num1.charAt(p1) - '0' : 0;
            int x2 = p2 >= 0 ? num2.charAt(p2) - '0' : 0;
            int val = (carry + x1 + x2) % 10;
            carry = (carry + x1 + x2) / 10;
            sb.append(val);
            p1--;
            p2--;
        }
        
        if(carry != 0)
            sb.append(carry);
        
        return sb.reverse().toString();
    }
}