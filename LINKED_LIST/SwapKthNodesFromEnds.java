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
        
         for(int i=1; i<=len-k; ++i)
         second=second.next;

        System.out.println();
        int temp=first.data;
        first.data=second.data;
        second.data=temp;

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
        printList(head);
    }

}

/*



class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head) {
        Node current = head;
        Node second = null;
        Node first = null;
        Node tail = null;

        while (current != null) {
            Node next = current.next;

            if (second != null) {
                if (tail == null) {
                    head = second;
                } else {
                    tail.next = second;
                }

                first.next = current;
                second.next = first;
                tail = first;
                first = current;
                second = null;
            } else if (first != null) {
                second = current;
            } else {
                first = current;
            }

            current = next;
        }

        if (second != null) {
            if (tail == null) {
                head = second;
            } else {
                tail.next = second;
            }

            first.next = current;
            second.next = first;
            tail = first;
            first = current;
            second = null;
        }
        return head;
    }
}
 */