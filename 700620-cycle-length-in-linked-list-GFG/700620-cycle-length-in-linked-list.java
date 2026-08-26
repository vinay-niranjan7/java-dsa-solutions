/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public int lengthOfLoop(Node head) {
       Node slow=head;
       Node fast=head;
       int count=0;
       while(fast!=null && fast.next!=null)
       {
           slow=slow.next;
           fast=fast.next.next;

           if(slow==fast)
           {
               count=1;
               slow=slow.next;
               while(slow!=fast)
               {
                   slow=slow.next;
                   count++;
               }
               return count;
           }
       }
       return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna