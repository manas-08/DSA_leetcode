/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode middleHead = middleNode(head); // middle node finding
        ListNode headFirst = head;
        ListNode headSecond = reverse(middleHead);     // after reversing the list is actually broken from middle node
        
        // reaarange
        ListNode temp;
        while (headFirst != null && headSecond != null) {
            temp = headFirst.next;
            headFirst.next = headSecond;
            headFirst = temp;
            temp = headSecond.next;
            headSecond.next = headFirst;
            headSecond = temp;
        }
        // set next of tail to head;   we are doing this because 
        if(headFirst != null){
             headFirst.next = null;
        } 
    }   
    // middle node
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode middleHead) {
        ListNode head = middleHead;
        if (head == null)
            return null;
        ListNode prev = null;
        ListNode current = head;
        ListNode next = current.next;
        while (current != null) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null)
                next = next.next;
        }
        return prev;
    }
}