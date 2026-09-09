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
    public ListNode addTwoNumbers(ListNode firstList, ListNode secondList) {

        ListNode dummyHead=new ListNode(-1);
        ListNode current=dummyHead;

        ListNode temp1=firstList;
        ListNode temp2=secondList;

        int carry=0;

        while(temp1!=null || temp2!=null){

            int sum=carry;

            if(temp1!=null){
                sum+=temp1.val;
            }

            if(temp2!=null){
                sum+=temp2.val;
            }

            ListNode newNode=new ListNode(sum % 10);

            carry=sum/10;

            current.next=newNode;
            current=current.next;

            if(temp1!=null){
                temp1=temp1.next;
            }

            if(temp2!=null){
                temp2=temp2.next;
            }
        }

        if(carry!=0){
            ListNode newNode=new ListNode(carry);
            current.next=newNode;
        }

        return dummyHead.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna