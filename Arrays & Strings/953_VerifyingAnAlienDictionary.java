/***********************************************

Time Complexity : O(C) content of words
Space Complexity : O(C)

https://leetcode.com/problems/verifying-an-alien-dictionary/

***********************************************/

class Solution {
    int[] mapping = new int[26];
    
    public boolean isAlienSorted(String[] words, String order) {
        
        for(int i = 0; i < order.length(); i++) {
            mapping[order.charAt(i) - 'a'] = i;
        }
        
        for(int i = 1; i < words.length; i++) {
            if(isBigger(words[i - 1], words[i])) {
                return false;
            }                 
        }
        
        return true;       
    }
    
    public boolean isBigger(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        
        for(int i = 0; i < m && i < n; i++) {
            if(word1.charAt(i) != word2.charAt(i)) {
                return mapping[word1.charAt(i) - 'a'] > mapping[word2.charAt(i) - 'a'];
            }
        }
        
        return m > n;
    }
}