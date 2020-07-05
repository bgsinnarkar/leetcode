/***********************************************

Time Complexity : O(n)
Space Complexity : O(n)

https://leetcode.com/problems/ugly-number-ii/

***********************************************/

class Solution {
    public int nthUglyNumber(int n) {
        
        int[] ugly = new int[n];
        ugly[0] = 1;
        int idx2 = 0, idx3 = 0, idx5 = 0;
        int factor2 = 2, factor3 = 3, factor5 = 5;
        
        for(int i = 1; i < n; i++) {
            int min = Math.min(Math.min(factor2, factor3), factor5);
            ugly[i] = min;
            
            if(min == factor2) {
                factor2 = 2 * ugly[++idx2];
            }
            if(min == factor3) {
                factor3 = 3 * ugly[++idx3];
            }
            if(min == factor5) {
                factor5 = 5 * ugly[++idx5];
            }
        }        
        
        return ugly[n - 1];
    }
}