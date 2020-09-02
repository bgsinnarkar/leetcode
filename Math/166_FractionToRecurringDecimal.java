/***********************************************

Time Complexity : O(divisor)
Space Complexity : O(1)

https://leetcode.com/problems/fraction-to-recurring-decimal/

https://www.youtube.com/watch?v=a-62yK1S1O4

***********************************************/

class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        
        if(numerator == 0)
            return "0";
        
        StringBuilder sb = new StringBuilder();    
        sb.append(((numerator > 0) ^ (denominator > 0)) ? "-" : "");
        
        long divident = Math.abs((long) numerator) ;
        long divisor = Math.abs((long) denominator);
        long remainder = divident % divisor;
        
        sb.append(divident / divisor);
        
        if(remainder == 0) {           
            return sb.toString();
        }
        
        sb.append(".");
        Map<Long, Integer> map = new HashMap();
        
        while(remainder != 0) {
            if(map.containsKey(remainder)) {
                sb.insert(map.get(remainder), "(");
                sb.append(")");
                break;
            }
            
            map.put(remainder, sb.length());
            remainder = remainder * 10;
            sb.append(remainder / divisor);
            remainder = remainder % divisor;            
        }
        
        return sb.toString();
    }
}
