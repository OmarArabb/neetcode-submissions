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
        public void reorderList(ListNode head) {

        ListNode slow = head , fast = head.next;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode sec = slow.next;
        ListNode prev = null;
        slow.next = null;

        while(sec != null){
            ListNode temp = sec.next;
            sec.next = prev;
            prev = sec;
            sec = temp;
        }

        ListNode first = head , second = prev;
        while(second != null){
            ListNode temp = first.next, temp2 = second.next;
            first.next = second;
            second.next = temp;
            first = temp;
            second = temp2;

        }
    }
}
