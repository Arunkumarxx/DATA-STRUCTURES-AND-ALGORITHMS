package LINKED_LIST;

public class SwapKthNodesFromEnds {
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
    private static Node insert(int data,Node head)
    {
        Node newNode =new Node(data);
        if(head==null)
        {
            head=newNode;
            return head;
        }
        else {
            head.next=newNode;
            
        }
    }

    public static void main(String[] args) {

    }

}
