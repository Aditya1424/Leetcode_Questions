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
        
        // middle of the linkedList
        ListNode slow= head;
        ListNode fast= head;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;
        }
        // reverse of linkedlist
        ListNode curr= slow.next;
        ListNode prev= slow;
        slow.next= null;

        while(curr!=null){
            ListNode temp = curr.next;
            curr.next= prev;
            prev= curr;
            curr= temp;
        }

        // comparing them
        ListNode first=head;
        ListNode second = prev;

        while(second!=null){
            if(first.val!=second.val){
                return false;
            }
            first= first.next;
            second= second.next;
        }
        return true;
    }
}