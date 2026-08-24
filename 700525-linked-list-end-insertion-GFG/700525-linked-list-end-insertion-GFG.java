/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        Node newNode=new Node(x);
        if (head == null) {
            return newNode;
        }
        
        Node tmp=head;
        while(tmp.next != null){
            tmp=tmp.next;
        }
        tmp.next=newNode;
        return head;
    }
}