package LINKED_LIST;

public class DeleteKthOfACircularLinkedList {
    private static Node head;
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
    private static Node  insert(Node head,int data)
    {
        Node temp=head;
        Node newNode=head;
        if(head==null)
        {
            head=newNode;
            head.next=head;
        }
        else{
            while(temp.next!=head)
                temp=temp.next;

            newNode.next=head;
            temp.next=newNode;

        }
        return head;
    }
    private static void printList(Node head)
    {
        Node temp=head;
        do
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        while(temp!=head);
        System.out.println();
    }
    public static void main(String[] args) {
        for(int i=1; i<=10; ++i)
            head=insert(head,i);
        printList(head);
    }

}
