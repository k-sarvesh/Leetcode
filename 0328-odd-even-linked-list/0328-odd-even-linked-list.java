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
    public ListNode oddEvenList(ListNode head) {
        if(head != null){
            ListNode fast = head;
            ListNode slow = head.next;
            ListNode temp = slow;

            while(slow != null && slow.next != null){
                fast.next = fast.next.next;
                fast = fast.next ;
                slow.next = slow.next.next;
                slow = slow.next;

            }
            fast.next = temp;
            return head;
        }

        return head;
    }
}