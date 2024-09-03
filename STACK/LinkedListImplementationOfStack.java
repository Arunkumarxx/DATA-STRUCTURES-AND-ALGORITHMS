package STACK;

public class LinkedListImplementationOfStack {
   private  Node head;
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
        int res;
        if(head!=null) {
            head = head.next;
            res=head.data;
        }
        else return -1;
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
    public  void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println("|"+temp.data+"|");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedListImplementationOfStack myStack = new LinkedListImplementationOfStack();
        myStack.push(1);
        myStack.push(2);
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.print();
    }
}
