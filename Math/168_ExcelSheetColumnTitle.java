/***********************************************

Time Complexity : O(log n)
Space Complexity : O(1)

https://leetcode.com/problems/excel-sheet-column-title/

https://leetcode.com/problems/excel-sheet-column-title/discuss/51399/Accepted-Java-solution

***********************************************/

class Solution {
    public String convertToTitle(int n) {
        
        StringBuilder sb = new StringBuilder();
        
        while(n > 0) {
            n--;
            sb.insert(0, (char) ('A' + n % 26));
            n = n / 26;
        }
        
        return sb.toString();
    }
}

