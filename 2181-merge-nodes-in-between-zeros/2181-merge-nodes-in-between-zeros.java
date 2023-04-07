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
        ListNode back_node = head;
        ListNode front_node = head.next;
        int sum = 0;
        while(front_node != null){
            sum += front_node.val;
            front_node.val = 0;
            front_node = front_node.next;
            back_node = back_node.next;
            if(front_node.val == 0){
                back_node.val = sum;
                sum = 0;
                front_node = front_node.next;
                back_node = back_node.next;
            }
        }
        // while(head != null){
        //     System.out.println(head.val);
        //     head = head.next;
        // }
        while(head.val == 0)
            head = head.next;
        // System.out.println(head.val);
        back_node = head;
        front_node = head.next;
        while(front_node.next != null){
            while(front_node.val == 0)
                front_node = front_node.next;
            back_node.next = front_node;
            front_node = front_node.next;
            back_node = back_node.next;
        }
        back_node.next = null;
        return head;
    }
}