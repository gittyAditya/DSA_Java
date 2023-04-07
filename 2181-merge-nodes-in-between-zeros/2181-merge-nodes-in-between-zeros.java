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
    public ListNode mergeNodes(ListNode head) {
        ListNode node = head.next;
        ListNode new_head = new ListNode();
        ListNode temp = new_head;
        int sum = 0;
        while(node != null){
            sum += node.val;
            node = node.next;
            if(node != null && node.val == 0){
                ListNode new_node = new ListNode(sum);
                sum = 0;
                temp.next = new_node;
                temp = temp.next;
            }
        }
        return new_head.next;
    }
}