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
            System.out.print(temp.data+" ");
            temp=temp.next;

        }
        while(temp!=head);
        System.out.println();
    }
    private static Node deleteKthElement(int pos,Node head)
    {
        if(head==null)
            return null;

        if(pos==1)
        {
            if(head.next==head)
                return null;
            Node last=head;
            while(last.next!=head)
            {
                last=last.next;
            }
            last.next=head.next;
            head=head.next;
            return head;
        }
        Node temp=head;

        for(int i=1; i<pos-1; ++i)
            temp=temp.next;

        if(temp.next==head)
            
    }


    public static void main(String[] args) {
        for(int i=10; i>=0; --i)
            head=insert(head,i);
       head= deleteKthElement(4,head);
        printList(head);
    }

}
