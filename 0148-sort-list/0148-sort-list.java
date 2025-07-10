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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        ListNode cur=head;
        while(cur != null){
            l.add(cur.val);
            cur=cur.next;
        }
        Collections.sort(l);
cur=head;
        for(int v:l){
            cur.val=v;
            cur=cur.next;
        }
        return head;
    }
}