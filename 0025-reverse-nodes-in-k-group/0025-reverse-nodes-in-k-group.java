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
    public ListNode reverseKGroup(ListNode head, int k) {

        ArrayList<ListNode> list = new ArrayList<>();

        // Store nodes
        ListNode temp = head;
        while (temp != null) {
            list.add(temp);
            temp = temp.next;
        }

        int n = list.size();

        // Reverse groups
        for (int i = 0; i + k <= n; i += k) {
            int left = i;
            int right = i + k - 1;

            while (left < right) {
                ListNode t = list.get(left);
                list.set(left, list.get(right));
                list.set(right, t);

                left++;
                right--;
            }
        }

        // Reconnect nodes
        for (int i = 0; i < n - 1; i++) {
            list.get(i).next = list.get(i + 1);
        }

        if (n > 0)
            list.get(n - 1).next = null;

        return n == 0 ? null : list.get(0);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna