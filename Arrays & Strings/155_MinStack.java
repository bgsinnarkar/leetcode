/***********************************************

Time Complexity : O(1)
Space Complexity : O(1)

https://leetcode.com/problems/min-stack/

***********************************************/

class MinStack {

    Stack<Integer> st = new Stack();
    Stack<Integer> minVal = new Stack();
    
    public void push(int x) {
        
        if(minVal.isEmpty() || x <= minVal.peek()) {
            minVal.push(x);
        }
        st.push(x);
    }
    
    public void pop() {
        if(st.peek().equals(minVal.peek())) {
            minVal.pop();
        }            
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minVal.peek();
    }
}

//////////////////////////////////////////////////////

class MinStack {
    
	private Node head;
    
    public void push(int x) {
        if(head == null) 
            head = new Node(x, x);
        else 
            head = new Node(x, Math.min(x, head.min), head);
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }
    
    private class Node {
        int val;
        int min;
        Node next;
        
        private Node(int val, int min) {
            this(val, min, null);
        }
        
        private Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}