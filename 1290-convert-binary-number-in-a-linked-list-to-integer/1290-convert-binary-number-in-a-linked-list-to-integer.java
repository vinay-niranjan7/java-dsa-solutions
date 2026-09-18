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
    public int getDecimalValue(ListNode head) {

        int[] arr=new int[32];
        int length=0;

        ListNode temp=head;
        while(temp!= null){
            arr[length]=temp.val;
            length++;
            temp=temp.next;
        }

        int pos=length-1;
        int result=0;
        for (int i=0;i<length;i++) {
            result+=arr[i]*Math.pow(2,pos);
            pos--;
        }
        return (int)result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna