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
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        fast = slow;
        //here slow is prev
        slow = null;

        while(fast!=null){
            ListNode next = fast.next;
            ListNode current = fast;
            fast.next = slow;
            slow = current;
            fast = next;
        }

        fast = slow;
        slow = head;
        while(fast!=null){
            if(fast.val != slow.val){
                return false;
            }
            else{
                fast = fast.next;
                slow = slow.next;
            }
        }
        return true;


        

        
        
    }
}