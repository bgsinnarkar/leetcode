/***********************************************

Time Complexity : O(log n)
Space Complexity : O(1)

https://leetcode.com/problems/sqrtx/

***********************************************/

class Solution {
    public int mySqrt(int x) {
        
        if(x == 0 || x == 1)
            return x;
        
        int low = 1;
        int hi = x;
        
        while(low <= hi) {
            int mid = low + (hi - low) / 2;
            
            if(mid == x / mid)
                return mid;
            else if(mid > x / mid) {
                hi = mid - 1;
            }                
            else {
                low = mid + 1;
            }                           
        }        
        return hi;
    }
}