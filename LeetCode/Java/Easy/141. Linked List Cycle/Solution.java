/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode p=head;
        HashSet<ListNode> hs=new HashSet<>();
        while(p!=null)
        {
            if(hs.contains(p))
                return true;
            hs.add(p);
            p=p.next;
        }
        return false;
    }
}