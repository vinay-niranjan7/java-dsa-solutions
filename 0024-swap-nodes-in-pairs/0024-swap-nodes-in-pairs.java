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
    public ListNode swapPairs(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }

        ListNode temp=head;
        ListNode prevLast=null;

        while(temp!=null && temp.next!=null){

            ListNode first=temp;
            ListNode second=temp.next;
            ListNode nextNode=second.next;

            second.next=first;
            first.next=nextNode;

            //First pair
            if(prevLast==null){
                head=second;
            } 
            //Other pairs
            else {
                prevLast.next=second;
            }
            prevLast=first;
            temp=nextNode;
        }
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna