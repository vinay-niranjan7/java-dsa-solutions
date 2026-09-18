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
    public ListNode modifiedList(int[] nums, ListNode head) {
    ArrayList<Integer> list = new ArrayList<>();

    for (int num:nums) {
        list.add(num);
    }

    while (head!=null && list.contains(head.val)) {
        head=head.next;
    }

    ListNode tmp=head;
    ListNode prev=null;

    while(tmp!=null)
    {
        if(list.contains(tmp.val)){
            prev.next=tmp.next;
        } else {
            prev=tmp;
        }
        tmp=tmp.next;
    }
    return head; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna