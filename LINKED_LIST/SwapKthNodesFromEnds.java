package LINKED_LIST;

public class SwapKthNodesFromEnds {
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
    private static Node insert(int data,Node head)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            return newNode;
        }
            Node temp=head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=newNode;
            return head;
    }

    private static void printList(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    private static Node swapKthNode(Node head,int k)
    {
         int len=lenOfNode(head);
         Node first=head;
         for(int i=1; i<k;++i)
             first=first.next;

         Node second=head;
         for(int i=1; i<=k; ++i)
         second=second.next;

        System.out.println();
        System.out.println(first.data);
        System.out.println(second.data);
    return head;
    }
    private static int lenOfNode(Node head)
    {
        int i=0;
        while(head!=null)
        {
            head=head.next;
            ++i;
        }
        return i;
    }


    public static void main(String[] args) {
        for(int i=1; i<=10; ++i)
           head= insert(i,head);
        printList(head);
        System.out.println(swapKthNode(head,1));
    }

}
