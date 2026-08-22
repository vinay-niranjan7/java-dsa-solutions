/* Structure of a Node
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/
class Solution {
    public boolean areIdentical(Node head1, Node head2) {
        
        Node tmp1 = head1;
        Node tmp2 = head2;
        
        while(tmp1!=null && tmp2!=null){
            if(tmp1.data != tmp2.data){
                return false;
            }
            tmp1 = tmp1.next;
            tmp2 = tmp2.next;
        }
         return tmp1 == null && tmp2 == null;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna