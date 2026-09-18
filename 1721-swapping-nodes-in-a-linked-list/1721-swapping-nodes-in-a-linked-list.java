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
    public ListNode swapNodes(ListNode head, int k) {

        ListNode first=head;
        ListNode second=head;
        ListNode temp=head;

        for (int i=1;i<k;i++) {
            first=first.next;
        }

        temp=first;
        while(temp.next!=null){
            temp=temp.next;
            second=second.next;
        }

        int val=first.val;
        first.val=second.val;
        second.val=val;

        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna