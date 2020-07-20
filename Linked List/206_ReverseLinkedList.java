/***********************************************

Time Complexity : O(n)
Space Complexity : O(1)

https://leetcode.com/problems/reverse-linked-list/

***********************************************/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        return prev;
    }
}

/***********************************************

Time Complexity : O(n)
Space Complexity : O(n)

Recursive Way

***********************************************/


class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null) 
            return head;
        
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        
        return p;
    }
}