/***********************************************

Time Complexity : O(n log n) n is total content of logs
Space Complexity : O(n)

https://leetcode.com/problems/reorder-data-in-log-files/

***********************************************/

class Solution {
    public String[] reorderLogFiles(String[] logs) {
        
        Arrays.sort(logs, (s1, s2) -> {
            
            String[] split1 = s1.split(" ", 2);
            String[] split2 = s2.split(" ", 2);
            
            boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
            boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
            
            if(!isDigit1 && !isDigit2) {
                int cmp = split1[1].compareTo(split2[1]);
                if(cmp == 0)
                    return split1[0].compareTo(split2[0]);
                else
                    return cmp;
            }
            else if(isDigit1 && isDigit2) {
                return 0;
            }
            else if(isDigit1 && !isDigit2) {
                return 1;
            }
            else {
                return -1;
            }
        });
        
        return logs;
    }
}
