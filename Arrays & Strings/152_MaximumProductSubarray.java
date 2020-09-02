/***********************************************

Time Complexity : O(n)
Space Complexity : O(1)

https://leetcode.com/problems/maximum-product-subarray/

https://leetcode.com/problems/maximum-product-subarray/discuss/183483/JavaC%2B%2BPython-it-can-be-more-simple

***********************************************/

class Solution {
    public int maxProduct(int[] nums) {
        
        if(nums == null || nums.length == 0) 
            return 0;
        
        int result = nums[0];
        int left = 0;
        int right = 0;
        int n = nums.length;
        
        for(int i = 0; i < n; i++) {
            left = (left == 0 ? 1 : left) * nums[i];
            right = (right == 0 ? 1 : right) * nums[n - 1 - i];
            result = Math.max(result, Math.max(left, right));
        }
        
        return result;
    }
}

//////////////////////////////////////////////////////

public class Solution {
    public int maxProduct(int[] A) {
		
        if (A == null || A.length == 0) {
            return 0;
        }
		
        int max = A[0], min = A[0], result = A[0];
		
        for (int i = 1; i < A.length; i++) {
            int temp = max;
            max = Math.max(Math.max(max * A[i], min * A[i]), A[i]);
            min = Math.min(Math.min(temp * A[i], min * A[i]), A[i]);
            if (max > result) {
                result = max;
            }
        }
		
        return result;
    }
}