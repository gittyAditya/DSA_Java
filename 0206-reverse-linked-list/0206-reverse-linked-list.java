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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode prev = head;
        ListNode curr = head;
        ListNode ahead = head.next;
        while(ahead != null){
            curr = ahead;
            ahead = ahead.next;
            curr.next = prev;
            prev = curr;
        }
        head.next = null;
        return curr;
    }
}