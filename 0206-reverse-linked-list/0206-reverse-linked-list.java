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
    // BruteForce--> Using stack
    // TC--> O(2N)
    // SC--> O(N)
    public ListNode reverseList(ListNode head) {
        // TC--> O(N)
        // SC--> O(1)
        ListNode curr= head;
        ListNode prev= null;

        while(curr!=null){
            ListNode temp= curr.next;
            curr.next= prev;
            prev= curr;
            curr= temp;
        }
        return prev;
    }
}