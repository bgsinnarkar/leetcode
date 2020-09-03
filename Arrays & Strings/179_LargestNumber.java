/***********************************************

Time Complexity : O(n log n)
Space Complexity : O(n)

https://leetcode.com/problems/largest-number/

https://leetcode.com/problems/largest-number/solution/

***********************************************/

class Solution {
    public String largestNumber(int[] nums) {
        
        if(nums == null || nums.length == 0)
            return "";
        
        String[] strArray = new String[nums.length];
        for(int i = 0; i < nums.length; i++) {
            strArray[i] = Integer.toString(nums[i]);
        }
        
        Arrays.sort(strArray, new Comparator<String>() {
           public int compare(String a, String b) {
               String o1 = a + b;
               String o2 = b + a;
               return o2.compareTo(o1);
           } 
        });
        
        if(strArray[0].equals("0"))
            return "0";
        
        StringBuilder sb = new StringBuilder();
        for(String str : strArray) {
            sb.append(str);
        }
        
        return sb.toString();
    }
}

