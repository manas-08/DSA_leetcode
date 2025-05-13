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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode node = lists[i];
            while(node != null){
                l.add(node.val);
                node = node.next;
            }
        }
        if(lists.length==0 || l.size()==0){
            return null;
        }
        Collections.sort(l);
        ListNode head = new ListNode(l.get(0));
        ListNode node = head;
        for(int i=1;i<l.size();i++){
            ListNode aN = new ListNode(l.get(i));
            node.next = aN;
            node = node.next;
        }
        node.next = null;
        return head;
    }
}