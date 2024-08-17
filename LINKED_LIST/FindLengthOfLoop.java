package LINKED_LIST;

public class FindLengthOfLoop {
    private static Node head;
    private static Node tail;
    private static class Node
    {
        int data;
        Node next;

        Node()
        {
        }
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    private static Node  getlastNode(Node head)
    {
        Node temp = head;
        while (temp != null && temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }
    private static Node search(Node head,int key)
    {
        Node temp = head;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        return temp;

    }

    private static void insertAtEnd(int data)
    {
        Node newNode =new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else {
            tail.next=newNode;
            tail=newNode;
        }
        if(data==5)
        {
            Node loopAdd = search(head,2);
            if(loopAdd!=null)
            {
                tail.next=loopAdd;
            }
        }
    }

    private static void printList()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        for(int i=1; i<=1; ++i)
        {
            insertAtEnd(i);
        }
        printList();
    }
}
