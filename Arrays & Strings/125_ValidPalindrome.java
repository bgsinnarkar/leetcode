/***********************************************

Time Complexity : O(n) 
Space Complexity : O(n) 

https://leetcode.com/problems/valid-palindrome/

https://leetcode.com/problems/valid-palindrome/discuss/40029/Accepted-pretty-Java-solution(271ms)

***********************************************/

class Solution {
    public boolean isPalindrome(String s) {
        
        char[] c = s.toCharArray();
        
        for(int i = 0, j = c.length - 1; i < j;) {
            if(!Character.isLetterOrDigit(c[i]))
                i++;
            else if(!Character.isLetterOrDigit(c[j]))
                j--;
            else if(Character.toLowerCase(c[i]) != Character.toLowerCase(c[j]))
                return false;
            else {
                i++;
                j--;
            }
        }
        
        return true;
    }
}

////////////////////////////////////

public class Solution {
    public boolean isPalindrome(String s) {
		
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuffer(actual).reverse().toString();
        
		return actual.equals(rev);
    }
}