/***********************************************

Time Complexity : O(m + n)
Space Complexity : O(1)

https://leetcode.com/problems/intersection-of-two-linked-lists/

https://leetcode.com/problems/intersection-of-two-linked-lists/solution/

***********************************************/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA == null || headB == null) 
            return null;
        
        ListNode a = headA;
        ListNode b = headB;
        
        while(a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        
        return a;
    }
}