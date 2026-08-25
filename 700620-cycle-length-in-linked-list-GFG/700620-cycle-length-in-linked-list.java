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
        Node tmp=head;
        ArrayList<Node> list= new ArrayList<>();
        while(tmp!=null){
            if(list.contains(tmp)) return list.size()-list.indexOf(tmp);
            
            list.add(tmp);
            tmp=tmp.next;
        }
        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna