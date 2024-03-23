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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        ListNode mid=findMid(head);
        ListNode revHead=findRev(mid.next);
        mid.next=null;

        ListNode c1=head;
        ListNode c2=revHead;
        ListNode f1,f2;
        while(c1!=null && c2!=null)
        {
            f1=c1.next;
            f2=c2.next;

            c1.next=c2;
            c2.next=f1;

            c1=f1;
            c2=f2;
        }
    }

    public ListNode findMid(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public ListNode findRev(ListNode head)
    {
        ListNode prev=null,forw=null;
        ListNode curr=head;
        while(curr!=null)
        {
            forw=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forw;
        }
        return prev;
    }
}
