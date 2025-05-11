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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) return null;
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode head3 = null;
        ListNode finalHead = null;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                if(head3 == null){
                    head3 = list1;
                    finalHead = head3;
                }
                else{
                    head3.next = list1;
                    head3 = head3.next;
                }
                list1 = list1.next; // move head1 ptr
            }
            else{
                if(head3 == null){
                    head3 = list2;
                    finalHead = head3;
                }
                else{
                    head3.next = list2;
                    head3 = head3.next;
                }
                list2 = list2.next; // move head2 ptr
            }
        }
        while(list1 != null){
            head3.next = list1;
            head3 = head3.next;
            list1 = list1.next;
        }
        while(list2 != null){
            head3.next = list2;
            head3 = head3.next;
            list2 = list2.next;
        }
        return finalHead; // head of merged ll 
    }
}