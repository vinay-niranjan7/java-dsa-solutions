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

        int len=0;
        ListNode temp=head;

        while(temp!=null){
            len++;
            temp=temp.next;
        }

        //kth node(start)
        temp=head;
        for (int i=1;i<k;i++) {
            temp=temp.next;
        }

        int firstVal=temp.val;

        //kth node(end)
        temp = head;
        for (int i=1;i<len-k+1;i++) {
            temp=temp.next;
        }

        int secondVal=temp.val;
        temp.val = firstVal;

        //traverse to kth node of start
        temp=head;
        for (int i=1;i<k;i++) {
            temp=temp.next;
        }
        temp.val=secondVal;
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna