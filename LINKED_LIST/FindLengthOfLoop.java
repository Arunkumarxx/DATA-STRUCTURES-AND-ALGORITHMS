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
    private static Node tail;
    private static void insertAtEnd(int data)
    {
        tail=getlastNode(head);
        
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
            insertAtBegin(i);
        }
        printList();
    }
}
