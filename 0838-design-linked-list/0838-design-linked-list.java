class MyLinkedList {

    static class Node {
        int val;
        Node next = null;

        Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private Node tail;

    public MyLinkedList() {
        head = null;
        tail = null;
    }
    
    public int get(int idx) {
        Node curr = head;
        for (int i = 0; i < idx; i++) {
            if (curr == null) return -1;
            curr = curr.next;
        }
        if (curr == null) return -1;
        return curr.val;
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);
        if (head == null) {
            tail = node;
        }
        node.next = head;
        head = node;
    }
    
    public void addAtTail(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        tail = node;
    }
    
    public void addAtIndex(int idx, int val) {
        Node node = new Node(val);
        Node curr = head;
        if (idx == 0) {
            node.next = head;
            head = node;
            return;
        }
        for (int i = 0; i < idx-1; i++) {
            if (curr == null) {
                return;
            }
            curr = curr.next;
        }
        if (curr == null) return;
        node.next = curr.next;
        curr.next = node;
        if (node.next == null) {
            tail = node;
        }
    }
    
    public void deleteAtIndex(int idx) {
        if (head == null) {
            return;
        }
        if (idx == 0) {
            head = head.next;
            return;
        }
        Node curr = head;
        for (int i = 0; i < idx - 1; i++) {
            if (curr == null) return;
            curr= curr.next;
        }
        if (curr != null && curr.next != null) {
            curr.next = curr.next.next;
            if (curr.next == null) {
                tail = curr;
            }
        }
        
    }
}
/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */