/***********************************************

Time Complexity : O(2 raised to cells.length)
Space Complexity : O(number of cycles)

https://leetcode.com/problems/prison-cells-after-n-days/

***********************************************/

class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        
        Set<String> set = new HashSet<>();
        int size = 0;
        boolean flag = false;
        
        for(int i = 0; i < N; i++) {
            int[] currentDay = new int[cells.length];
            
            for(int j = 1; j < cells.length - 1; j++) {
                currentDay[j] = cells[j - 1] == cells[j + 1] ? 1 : 0;
            }
            
            String s = Arrays.toString(currentDay);
            
            if(!set.contains(s)) {
                size++;
                set.add(s);
            }
            else {
                flag = true;
                break;
            }
            
            cells = currentDay;
        }
        
        if(flag) {
            N = N % size;     
            
            for(int i = 0; i < N; i++) {
                int[] currentDay = new int[cells.length];
            
                for(int j = 1; j < cells.length - 1; j++) {
                    currentDay[j] = cells[j - 1] == cells[j + 1] ? 1 : 0;
                }
                
                cells = currentDay;
            }
        }
        
        return cells;
    }
}