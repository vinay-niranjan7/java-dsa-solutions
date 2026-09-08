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
    public ListNode findNode(ListNode longer, ListNode shorter, int distance) {

    while(distance > 0) {
        distance--;
        longer=longer.next;
    }
    while(longer != shorter) {
        longer=longer.next;
        shorter=shorter.next;
    }
    return longer;
}
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tmp1= headA;
        ListNode tmp2= headB;

        int len1=0;
        int len2=0;
        
        while(tmp1!=null){
            len1++;
            tmp1=tmp1.next;
        }
        while(tmp2!=null){
            len2++;
            tmp2=tmp2.next;
        }

        if(len1<len2) return findNode(headB,headA,len2-len1);
        else return findNode(headA,headB,len1-len2);
    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna