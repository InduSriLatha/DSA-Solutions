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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode sp=head, fp=head;
        for(int i=1;i<=n;i++)
            fp=fp.next;
        if(fp==null)
            return head.next;
        while(fp.next!=null)
        {
            fp=fp.next;
            sp=sp.next;
        }
        sp.next=sp.next.next;
        return head;
    }
}