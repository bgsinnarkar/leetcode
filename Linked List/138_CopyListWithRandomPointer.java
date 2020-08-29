/***********************************************

Time Complexity : O(n)
Space Complexity : O(n)

https://leetcode.com/problems/copy-list-with-random-pointer/

https://www.youtube.com/watch?v=nlKGb5cvvmU

***********************************************/

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        if(head == null) 
            return head;
        
        Map<Node, Node> map = new HashMap();
        Node ptr1 = new Node(head.val);
        map.put(head, ptr1);
        Node ptr2 = head;
        
        while(ptr2 != null) {
            Node random = ptr2.random;
            Node next = ptr2.next;
            
            if(random != null) {
                if(!map.containsKey(random))
                    map.put(random, new Node(random.val));
                ptr1.random = map.get(random);
            }
            if(next != null) {
                if(!map.containsKey(next))
                    map.put(next, new Node(next.val));
                ptr1.next = map.get(next);
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        
        return map.get(head);
    }
}