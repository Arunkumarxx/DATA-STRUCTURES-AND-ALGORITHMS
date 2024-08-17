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
    private static void insertAtBegin(int data)
    {
        Node newNode =new Node();
        newNode.next=head;
        head=newNode;
    }
    private static void printList()
    {
        Node temp=new Node();
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        insertAtBegin(1);
        printList();
    }
}
