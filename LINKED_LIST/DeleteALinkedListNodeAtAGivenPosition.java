package LINKED_LIST;

public class DeleteALinkedListNodeAtAGivenPosition {

    private static Node head;
    private static Node tail;

    private static class Node {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    private static void  deleteElePos(int x)
    {
        if (head == null || x <= 0) {
            return;
        }
        if (x == 1) {
             head=head.next;
             return;
        }
        Node temp = head;
        int ind = 1;
        while (temp != null && ind < x) {

            temp = temp.next;
            ind++;
        }
        if (temp == null || temp.next == null) {
            return;
        }
        temp.next = temp.next.next;

    }
    private static void insert(int data)
    {
        Node newNode=new Node(data);

        if(head==null)
         head=tail=newNode;
        else {
            tail.next=newNode;
            tail=newNode;
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
        System.out.println();
    }
    public static void main(String[] args) {

        insert(10);
        insert(20);
        insert(30);
        printList();
        deleteElePos(1);
        printList();
    }
}
