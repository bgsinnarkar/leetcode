/***********************************************

Time Complexity : O(n)
Space Complexity : O(1)

https://leetcode.com/problems/populating-next-right-pointers-in-each-node/

https://www.youtube.com/watch?v=bmjAiDsIDas

***********************************************/

/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        
        Node leftNode = root;
        
        while(leftNode != null && leftNode.left != null) {
            populateLowerLevel(leftNode);
            leftNode = leftNode.left;
        }
        
        return root;
    }
    
    public void populateLowerLevel(Node startNode) {
        Node iter = startNode;
        
        while(iter != null) {
            iter.left.next = iter.right;
            if(iter.next != null) {
                iter.right.next = iter.next.left;
            }
            iter = iter.next;
        }
    }
}