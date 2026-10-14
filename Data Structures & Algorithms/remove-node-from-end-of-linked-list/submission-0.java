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
       public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode f = head, s = dummy;
        for (int i = 0; i < n; i++) {
            f = f.next;
        }
        while (f != null) {
                f = f.next;
                s = s.next;
        }
        assert s.next != null;
        s.next = s.next.next;

        return dummy.next;

    }
}
