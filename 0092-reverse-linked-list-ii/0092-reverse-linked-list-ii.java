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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ArrayList<Integer> list = new ArrayList<>();

        ListNode temp = head;
        int counter = 1;

        //Store values 
        while (temp != null) {
            if (counter >= left && counter <= right) {
                list.add(temp.val);
            }

            temp = temp.next;
            counter++;
        }

        Collections.reverse(list);

        //Putting values 
        temp = head;
        counter = 1;
        int index = 0;

        while (temp != null) {
            if (counter >= left && counter <= right) {
                temp.val = list.get(index);
                index++;
            }

            temp = temp.next;
            counter++;
        }

        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna