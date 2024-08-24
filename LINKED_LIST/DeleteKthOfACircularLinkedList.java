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
    private static Node  insert(int data)
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

            temp.next=newNode;
            newNode.next=head;
            head=newNode;
            
        }
        return temp;
    }

    public static void main(String[] args) {
        head=
    }

}
