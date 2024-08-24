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
    private static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {

            head = newNode;
            head.next = head;
        } else {
            Node current = head;
            Node prev = null;
            do {
                prev = current;
                current = current.next;
            } while (current != head && current.data < data);


            prev.next = newNode;
            newNode.next = current;


            if (current == head && data < head.data) {
                head = newNode;
            }
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

        temp.next=temp.next.next;
        return temp;
    }

    public static void main(String[] args) {
        for(int i=10; i>=1; --i)
            head=insert(head,i);
//       head= deleteKthElement(,head);
        printList(head);
    }

}
