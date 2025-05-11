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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null || left == right) return head;
        ListNode dummy = new ListNode(0);    // dummy Node
        dummy.next = head;              // dummy node is useful for test cases like when, left = 1... think!!!

        ListNode leftPre = dummy;
        ListNode curr = leftPre.next;
        // leftPre node contains node just before the reversing wala part..
        for(int i = 0; i < left - 1; i++){
            leftPre = leftPre.next;
            curr = leftPre.next;
        }

        ListNode prev = null; // this node will be used in reversing..
        ListNode subListHead = curr;
        for(int i = 0; i < right - left + 1; i++){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // join the pieces
        leftPre.next = prev;
        subListHead.next = curr;
        return dummy.next;   // it will always point to the final head...
    }
}