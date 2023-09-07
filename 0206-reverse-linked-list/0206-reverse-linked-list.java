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
    public ListNode reverseList(ListNode head) {    // Kitti ka code hai haan :)
        if(head == null || head.next == null)
            return head;
        ListNode a = null;
        ListNode b = head;
        ListNode c = head.next;
        while(c != null){
            b.next = a;
            a = b;
            b = c;
            c = c.next;
        }
        b.next = a;
        return b;
    }
}