/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode , Integer> hm = new HashMap<>();

        while( head != null){
            int val = hm.getOrDefault(head,0);
            if(val == 0){
                hm.put(head,val - 1);
                head = head.next;
            }
            else{
                return head;
            }
        }
        return null;
    }
}