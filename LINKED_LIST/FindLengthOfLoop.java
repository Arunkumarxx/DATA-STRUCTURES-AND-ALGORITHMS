package LINKED_LIST;

public class FindLengthOfLoop {
    private static Node head;
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
        }
    }
    private static Node  getlastNode(Node head)
    {
        Node tail =head;
        while(head!=null)
        {
            tail=tail.next;
        }
        return tail;
    }
    private static Node search(Node head,int key)
    {
        Node temp=head;
        while(temp.data!=key)
            temp=temp.next;
        if(temp!=null)
            return temp;
        return null;
    }
    private static Node tail = getlastNode(head);
    private static void insertAtEnd(int data)
    {
        if(data==5) {
            tail = getlastNode(head);
            Node loopAdd=search(head,2);
            if(loopAdd!=null)
                tail.next=loopAdd;
        }
        Node newNode =new Node(data);
        tail.next=newNode;
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
        for(int i=1; i<=5; ++i)
        {
            insertAtEnd(i);
        }
        printList();
    }
}
