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
        if(head==null)
        {
            
        }
    }

    private static void printList(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    private static Node head;
    public static void main(String[] args) {
        for(int i=1; i<=10; ++i)
           head= insert(i,head);
        printList(head);
    }

}
