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
        
        if(head==null) return false;
        ListNode middle=findMiddle(head);
        ListNode revhead=reverse(middle.next);
        
        ListNode temp=head,rtemp=revhead;
        while(temp!=null && rtemp!=null)
        {
            if(temp.val!=rtemp.val) return false;
            temp=temp.next;
            rtemp=rtemp.next;
        }
        return true;
    }
    
    public ListNode findMiddle(ListNode head)
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
    
    public ListNode reverse(ListNode head)
    {
        ListNode curr=head,prev=null,forw=null;
        
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