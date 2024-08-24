package LINKED_LIST;

public class NthNodeFromEndOfLinkedList {
    private static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    private static Node insert(int data,Node head)
    {

    }
    private static void NthNode(Node head,int n)
    {
        Node start=head;
        Node end=head;
        for(int i=1; i<=n;++i)
            end=end.next;
        
    }
    public static void main(String[] args) {

    }

}
