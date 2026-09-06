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
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }

        ArrayList<Integer> oddList=new ArrayList<>();
        ArrayList<Integer> evenList=new ArrayList<>();

        ListNode tmp=head;
        int pos=1;

        while(tmp!=null){
            if(pos % 2 == 1){
                oddList.add(tmp.val);
            }else{
                evenList.add(tmp.val);
            }
            tmp=tmp.next;
            pos++;
        }

        tmp = head;
        for (int i = 0; i < oddList.size(); i++) {
            tmp.val = oddList.get(i);
            tmp = tmp.next;
        }
        for (int i = 0; i < evenList.size(); i++) {
            tmp.val = evenList.get(i);
            tmp = tmp.next;
        }

        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna