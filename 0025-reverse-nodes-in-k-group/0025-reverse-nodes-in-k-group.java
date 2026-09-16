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

    private ListNode getKthNode(ListNode temp, int k) {
        k--;
        while(temp!=null && k>0) {
            k--;
            temp=temp.next;
        }
        return temp;
    }

    private ListNode reverseLinkedList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;

        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp=head;
        ListNode prevLast=null;

        while(temp!=null){

            ListNode kThNode = getKthNode(temp, k);

            if(kThNode==null){
                if (prevLast!=null) {
                    prevLast.next=temp;
                }
                break;
            }

            ListNode nextNode = kThNode.next;
            kThNode.next = null;
            reverseLinkedList(temp);

            // First group
            if(temp==head){
                head=kThNode;
            } 
            // Other groups
            else{
                prevLast.next=kThNode;
            }

            prevLast=temp;
            temp=nextNode;
        }
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna