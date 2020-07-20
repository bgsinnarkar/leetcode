/***********************************************

Time Complexity : O(n)
Space Complexity : O(1)

https://leetcode.com/problems/remove-linked-list-elements/

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
    public ListNode removeElements(ListNode head, int val) {
        
        if(head == null)
            return head;
        
        ListNode temp = head;
        
        while(temp.next != null) {
            if(temp.next.val == val)
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }
        
        return head.val == val ? head.next : head;
    }
}
