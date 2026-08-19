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
    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> nodes = new ArrayList<>();
        ListNode tmp= head;
        int cnt=0;
        
        while(tmp != null){
            cnt++;
            tmp=tmp.next;
        }

        int mid=cnt/2;
        cnt=0;
        tmp=head;

        while(tmp != null){
            if(cnt>=mid) nodes.add(tmp);

            cnt++;
            tmp=tmp.next;   
        }
        return nodes.get(0);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna