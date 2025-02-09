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
    public ListNode middleNode(ListNode head) {
        //if a slow person runs 5km and fast runs 10km , then slow is at middle
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while(fastPointer!= null && fastPointer.next!=null){
            
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            
        }
        return slowPointer;
        
    }
}