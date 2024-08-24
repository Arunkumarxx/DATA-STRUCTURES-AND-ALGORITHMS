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
        if(head==null)
        {
            head=new Node(data);
            head.next=head;
        }
        else {
            Node newNode =new Node(data);

            do {
                temp=temp.next;
            }
            while(temp.next!=head);


            newNode.next=head;
            temp.next=newNode;

        }
        return temp;
    }
    private static void printList(Node head)
    { if (head == null) {
        System.out.println("List is empty.");
        return;
    }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
    public static void main(String[] args) {
        for(int i=1; i<=10; ++i)
            head=insert(head,i);
        printList(head);
    }

}
