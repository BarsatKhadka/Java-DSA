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
        ListNode dummy = new ListNode(0);
        ListNode result = dummy;
        int carry = 0;
        while(l1!=null || l2!=null){
            int l1val = l1 !=null ? l1.val : 0;
            int l2val = l2!=null ? l2.val : 0;
            int total = (l1val + l2val + carry) ;
            int sum = total%10;
            carry = total/10;
            ListNode nextNode = new ListNode(sum);
            result.next = nextNode;
            result = result.next;

            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        }

        if(carry>0){
            result.next = new ListNode(carry);
        }

        return dummy.next;
        
    }
}