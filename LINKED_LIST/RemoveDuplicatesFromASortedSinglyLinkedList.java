package LINKED_LIST;

public class RemoveDuplicatesFromASortedSinglyLinkedList {
    private static class  Node {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    private static Node insert(int data,Node head)
    {
        Node newNode= new Node(data);
        if(head==null)
            return newNode;

        else
        {
            Node temp=head;
            while(temp.next!=null)
                temp=temp.next;
            
        }
    }

    public static void main(String[] args) {

    }

}
