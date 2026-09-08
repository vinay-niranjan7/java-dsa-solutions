/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        ListNode tmp1=headA;
        ListNode tmp2=headB;
        while(tmp1!=tmp2){
            tmp1=tmp1.next;
            tmp2=tmp2.next;

            if(tmp1==tmp2) return tmp1;

            if(tmp1==null) tmp1=headB;
            if(tmp2==null) tmp2=headA;
        }
        return tmp1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna