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
        Node newNode =new Node(data);
        if(head==null)
            return newNode;

        else {
            head.next=newNode;
            return head;
        }
    }
    private static void NthNode(Node head,int n)
    {
        Node start=head;
        Node end=head;
        for(int i=1; i<=n;++i)
            end=end.next;
        while(end!=null)
        {
            start=start.next;
            end=end.next;
        }
        System.out.println(start.data);
    }
    private static Node head;
    public static void main(String[] args) {
        for(int i=1; i<=5;++i)
            head=insert(i,head);
        
    }

}
