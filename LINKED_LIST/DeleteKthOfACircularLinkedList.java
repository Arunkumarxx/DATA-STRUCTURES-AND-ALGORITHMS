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
        if(head==null)
        {
            head=new Node(data);;
            head.next=head;
        }
        else{
            Node temp=head;
            Node newNode=new Node(data);
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

            temp=temp.next;
            System.out.print(temp.data+" ");
        }
        while(temp!=head);
        System.out.println();
    }
    private static Node deleteKthElement(int pos,Node head)
    {
        if(head==null)
            return head;

        Node temp=head;
        for(int i=1; i<pos-1; ++i)
            temp=temp.next;
        if(temp==head)
        {
            Node temp2=head;
            while(temp2.next!=head)
                temp2=temp2.next;
            System.out.println(temp2.data);
            temp2.next=temp2.next.next;
            head=temp2;
            return head;
        }
        temp.next=temp.next.next;
        head=temp;
        return head;
    }


    public static void main(String[] args) {
        for(int i=1; i<=10; ++i)
            head=insert(head,i);
       head= deleteKthElement(1,head);
        printList(head);
    }

}
