/***********************************************

Time Complexity : O(1)
Space Complexity : O(1)

https://leetcode.com/problems/lru-cache/

https://www.youtube.com/watch?v=NDpwj0VWz1U

***********************************************/

class LRUCache {
    
    Node head = new Node();
    Node tail = new Node();
    int capacity;
    Map<Integer, Node> map;

    public LRUCache(int capacity) {
        map = new HashMap(capacity);
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        int result = -1;
        Node node = map.get(key);
        if(node != null) {
            result = node.value;
            remove(node);
            add(node);
        }
        
        return result;
    }
    
    public void put(int key, int value) {
        Node node = map.get(key);
        if(node != null) {
            remove(node);
            node.value = value;
            add(node);
        }
        else {
            if(map.size() == this.capacity) {
                map.remove(tail.prev.key);
                remove(tail.prev);
            }
            
            Node newNode = new Node();
            newNode.key = key;
            newNode.value = value;
            map.put(key, newNode);
            add(newNode);
        }
    }
    
    public void add(Node node) {
        Node headNext = head.next;
        node.next = headNext;
        headNext.prev = node;
        head.next = node;
        node.prev = head;
    }
    
    public void remove(Node node) {
        Node nextNode = node.next;
        Node prevNode = node.prev;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }
    
    class Node {
        int key;
        int value;
        Node prev;
        Node next;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */