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

    ListNode tmp1 = headA;
    
    while (tmp1 != null) 
    {
        ListNode tmp2 = headB;
        while (tmp2 != null) 
        {
            if (tmp1 == tmp2) {
                return tmp1;
            }
            tmp2 = tmp2.next;
        }
        tmp1 = tmp1.next;
    }
    return null;  
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna