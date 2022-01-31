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
        ListNode res = null;
        ListNode ans = null;
        ListNode temp,t;
        int k;
        int carry = 0;
        while(l1 != null || l2 != null) {
            temp = new ListNode();
            k = carry;
            if(l1 != null) {
                k+=l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                k+=l2.val;
                l2 = l2.next;
            }
            
            if(k > 9) {
                carry = k/10;
                k = k % 10;
            } else {
                carry = 0;
            }
            temp.val = k;
            temp.next = null;
            
            if(res == null){
                res = temp;
                ans = res;
            } else {
                res.next = temp;
                res = res.next;
            }
            
        }
        if(carry > 0) {
            t = new ListNode();
            t.val = carry;
            t.next = null;
            res.next = t;
        }
        return ans;
    }
}