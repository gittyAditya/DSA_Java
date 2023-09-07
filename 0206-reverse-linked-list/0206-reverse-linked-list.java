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
    public ListNode reverseList(ListNode head) {    // Kitti boli badiya hai 
        if(head == null || head.next == null)
            return head;
        ListNode a = null;
        ListNode b = head;
        while(b.next != null){
            ListNode c = b.next;
            b.next = a;
            a = b;
            b = c;
        }
        b.next = a;
        return b;
    }
}