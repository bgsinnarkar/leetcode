/***********************************************

Time Complexity : O(log n)
Space Complexity : O(1)

https://leetcode.com/problems/happy-number/

***********************************************/

class Solution {
    public boolean isHappy(int n) {
        
        if(n < 10){
            if(n == 1 || n == 7) 
                return true;
            else
                return false;
        }
        
        int b; int sum = 0;
        while(n > 0) {
            b = n % 10;
            sum = sum + (b * b);
            n = n / 10;
        }
        
        return isHappy(sum);
    }
}

////////////////////////////////////////////////

class Solution {
	
	public boolean isHappy(int n) {
		Set<Integer> inLoop = new HashSet<Integer>();
		int squareSum,remain;
		
		while (inLoop.add(n)) {
			squareSum = 0;
			
			while (n > 0) {
				remain = n%10;
				squareSum += remain*remain;
				n /= 10;
			}
			
			if (squareSum == 1)
				return true;
			else
				n = squareSum;

		}
		return false;
	}
}