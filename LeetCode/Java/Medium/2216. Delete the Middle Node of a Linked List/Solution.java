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
    public ListNode deleteMiddle(ListNode head) {
        ListNode sp=head, fp=head;
        if(head==null || head.next==null)
            return null;
        fp=fp.next.next;
        while(fp!=null && fp.next!=null)
        {
            sp=sp.next;
            fp=fp.next.next;
        }
        sp.next=sp.next.next;
        return head;
    }
}