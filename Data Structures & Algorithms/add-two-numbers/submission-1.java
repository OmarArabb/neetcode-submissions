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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int mod = 0, res = 0;
        ListNode temp = new ListNode();
        ListNode ans = temp;
        while (l1 != null && l2 != null){

            mod = (l1.val + l2.val + res) % 10;
            res = (l1.val + l2.val + res) / 10;
            temp.next = new ListNode(mod);
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        if(l1 != null){
            while (l1 != null){
                mod = (l1.val + res) % 10;
                res = (l1.val + res) / 10;
                temp.next = new ListNode(mod);
                temp = temp.next;
                l1 = l1.next;
            }
        }else if(l2 != null){
            while (l2 != null){
                mod = (l2.val + res) % 10;
                res = (l2.val + res) / 10;
                temp.next = new ListNode(mod);
                temp = temp.next;
                l2 = l2.next;
            }
        }
        if (res > 0){
            temp.next = new ListNode(res);
        }
        return ans.next;
    }
}
