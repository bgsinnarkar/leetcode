/***********************************************

Time Complexity : O(log n)
Space Complexity : O(1)

https://leetcode.com/problems/powx-n/

***********************************************/

class Solution {
    public double myPow(double x, int n) {
        
        if(n == 0)
            return 1;
        
        if(n < 0) {
            if(n == Integer.MIN_VALUE) {
                n += 2;
            }
            n = -n;
            x = 1/x;
        }
        
        if(n % 2 == 0) {            
            return myPow(x*x, n/2);
        }
        else {
            return x * myPow(x*x, n/2);
        }
    }
}