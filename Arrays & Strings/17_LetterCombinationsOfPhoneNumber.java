/***********************************************

Time Complexity : O(3^N * 4^M) where N is the number of digits in the input that maps to 3 letters (e.g. 2, 3, 4, 5, 6, 8) 
				  and M is the number of digits in the input that maps to 4 letters (e.g. 7, 9), and N+M is the total number digits in the input.
Space Complexity : O(3^N * 4^M) since one has to keep these many solutions

https://leetcode.com/problems/letter-combinations-of-a-phone-number/

https://leetcode.com/problems/letter-combinations-of-a-phone-number/solution/

***********************************************/

class Solution {
    
    Map<String, String> phone = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};
    
    List<String> result = new ArrayList();
    
    public List<String> letterCombinations(String digits) {
        if(digits.length() != 0)
            backTrack("", digits);
        
        return result;
    }
    
    private void backTrack(String combination, String nextDigits) {
        
        if(nextDigits.length() == 0) {
            result.add(combination);
        }
        else {
            String digit = nextDigits.substring(0,1);
            String letters = phone.get(digit);
            
            for(int i = 0; i < letters.length(); i++) {
                String letter = letters.substring(i, i + 1);
                backTrack(combination + letter, nextDigits.substring(1));
            }
        }
    }
}