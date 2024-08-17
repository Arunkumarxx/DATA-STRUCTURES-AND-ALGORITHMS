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
    private static Node search(int key)
    {
        Node temp =head;
        while(temp.data!=key)
            temp=temp.next;
        if(temp!=null)
            return temp;
        return null;
    }
    private static void insertAtBegin(int data)
    {
        if(data==5)
        {
            Node loopAddress=search(2);
            if(loopAddress!=null)
            {
                Node newNode =new Node(data);
                newNode.next=loopAddress;
                head=newNode;
            }
        }
        else {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
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
        for(int i=1; i<=5; ++i)
        {
            insertAtBegin(i);
        }
        printList();
    }
}
