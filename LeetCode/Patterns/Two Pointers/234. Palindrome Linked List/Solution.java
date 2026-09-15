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
    public boolean isPalindrome(ListNode head) {
        ListNode sp=head, fp=head;
        while(fp.next!=null && fp.next.next!=null)
        {
            sp=sp.next;
            fp=fp.next.next;
        }
        ListNode head1=head;
        ListNode head2=reverse(sp.next);
        while(head1!=null && head2!=null)
        {
            if(head1.val!=head2.val)
                return false;
            head1=head1.next;
            head2=head2.next;
        }
        return true;
    }
    public static ListNode reverse(ListNode head)
    {
        ListNode temp=head, prev=null;
        while(temp!=null)
        {
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}