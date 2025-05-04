class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // 1. Get the length and tail of the list
        ListNode tail = head;
        int length = 1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // 2. Normalize k
        k = k % length;
        if (k == 0) return head;

        // 3. Find the new tail (length - k - 1) and new head (length - k)
        ListNode newTail = head;
        for (int i = 1; i < length - k; i++) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;

        // 4. Rotate
        newTail.next = null;   // break the link
        tail.next = head;      // connect the end to the start

        return newHead;
    }
}
