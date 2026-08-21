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
    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        ListNode temp = head;
        while(temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for(int i = list.size() - 1; i >= 0; i--) {
            curr.next = new ListNode(list.get(i));
            curr = curr.next;
        }

        return dummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna