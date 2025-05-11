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
    public ListNode rotateRight(ListNode head, int k) {
        if(k <= 0 || head == null || head.next == null){
            return head;
        }
        ListNode last = head;
        int length = 0;
        while(last.next != null){      //move the last ptr to the last node
            last = last.next;
            length++;
        }
        length++;  // now length will be exact, will now be able to count the last node as well
        int rotations = (k % length);
        ListNode newLast = head;
        for (int i = 1; i < length - rotations; i++) {
            newLast = newLast.next;
        }
        last.next = head;   // original last node will point to the head
        ListNode newHead;
        newHead = newLast.next;
        newLast.next = null;
        return newHead;
    }
}