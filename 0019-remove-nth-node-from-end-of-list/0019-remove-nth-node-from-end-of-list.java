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
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode left = dummyNode;
        ListNode right = head;
        
        int count = 1;
        while(count !=n){
            right = right.next;
            count++;
        }

        while(right.next !=null){
            left = left.next;
            right = right.next;
        }

        left.next = left.next.next;
        return dummyNode.next;


        
    }
}