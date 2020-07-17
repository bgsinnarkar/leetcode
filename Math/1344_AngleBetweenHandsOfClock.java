/***********************************************

Time complexity : O(1) 
Space complexity : O(1)

https://leetcode.com/problems/angle-between-hands-of-a-clock/

***********************************************/

class Solution {
    public double angleClock(int hour, int minutes) {
        
        double hourAngle = (hour * 30) + (minutes * 0.5);
        double minuteAngle = minutes * 6;
        double difference = 0;
        
        difference = Math.abs(hourAngle - minuteAngle);        
        
        return Math.min(difference, 360 - difference);
    }
}