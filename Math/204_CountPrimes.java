/***********************************************

Time Complexity : O(sqrt(n) log log n)
Space Complexity : O(n)

https://leetcode.com/problems/count-primes/

https://www.youtube.com/watch?v=UMVa5fRKC8I

https://leetcode.com/problems/count-primes/discuss/473021/Time-Complexity-O(log(log(n)

***********************************************/

class Solution {
    public int countPrimes(int n) {
        
        boolean[] primes = new boolean[n];
        
        Arrays.fill(primes, true);
        
        for(int i = 2; i * i < n; i++) {
            if(primes[i]) {
                for(int j = 2; i * j < n; j++) {                
                    primes[i * j] = false;
                }
            }            
        }
        
        int primeCount = 0;
        
        for(int i = 2; i < n; i++) {
            if(primes[i] == true)
                primeCount++;
        }
        
        return primeCount;
    }
}