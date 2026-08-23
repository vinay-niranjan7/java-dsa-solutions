/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    public static int getLength(Node head) {
        Node tmp = head;
        ArrayList<Node> list = new ArrayList<>();

        while (tmp != null) {
            if (list.contains(tmp)) {
                break;
            }

            list.add(tmp);
            tmp = tmp.next;
        }

        return list.size();
    }
}