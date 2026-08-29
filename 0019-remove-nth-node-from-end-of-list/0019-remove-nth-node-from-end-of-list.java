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

        int size = 0;
        ListNode tmp = head;

        while (tmp != null) {
            size++;
            tmp = tmp.next;
        }

        if (n == size) {
            return head.next;
        }

        tmp = head;
        int pos = size - n;

        for (int i = 1; i < pos; i++) {
            tmp = tmp.next;
        }

        tmp.next = tmp.next.next;

        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna