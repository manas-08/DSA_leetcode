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
    public ListNode swapPairs(ListNode head) {
        ListNode nowLast = null;      // this will refer to the first node after reversing a group a pair. 
        if(head == null || head.next == null) return head;
        ListNode node = head;
        int len = length(node);
        System.out.println(len);
        ListNode prev = null;
        ListNode current = head;
        ListNode next = current.next;
        for (int i = 0; i < len / 2; i++) {
            int itr = 2;
            while((itr--) > 0){
                current.next = prev;
                prev = current;
                current = next;
                if(next != null) next = next.next;
            }
            if(i == 0) head = prev;
            // prev = current;
            // current = next;
            // if (next != null) next = next.next;
            int itr2 = 2;
            ListNode temp = prev;
            while(itr2-- > 1){
                temp = temp.next;
            }
            ListNode newLast = temp;
            if(nowLast == null) nowLast = newLast;
            else{
                nowLast.next = prev;
                nowLast = prev;
            }
            nowLast = newLast;
            newLast.next = current;
        }
        return head;
    }
    public int length(ListNode node){
        if (node == null) return 0;
        int count = 0;
        while (node != null){
            count++;
            node = node.next;
        }
        return count;
    }
}