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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode first=list1;
        while(a!=1 && first.next!=null)
        {
            first=first.next;
            a--;
        }
        
        ListNode last=list1;
        while(b!=-1 && last!=null)
        {
            last=last.next;
            b--;
        }
        first.next=list2;
        
        ListNode temp=list2;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=last;
        
        return list1;
    }
}