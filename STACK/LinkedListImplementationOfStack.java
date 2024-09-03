package STACK;

public class LinkedListImplementationOfStack {
   private Node head;
    private class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public int  pop()
    {
        int res=head.data;
        head=head.next;
        return res;
    }
    public   void push(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
            head=newNode;
        else
        {
            newNode.next=head;
            head=newNode;
        }
    }
    public static void main(String[] args) {

    }
}
