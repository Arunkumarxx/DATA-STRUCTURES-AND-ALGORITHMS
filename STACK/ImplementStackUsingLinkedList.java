package STACK;

public class ImplementStackUsingLinkedList {
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
        if(isEmpty())
            return -1;
        int res=head.data;
        head=head.next;
        return res;
    }
    public   void push(int data)
    {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;

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
    public boolean isEmpty()
    {
        return head==null;
    }
    public static void main(String[] args) {
        ImplementStackUsingLinkedList myStack = new ImplementStackUsingLinkedList();
        for(int i=1; i<=7;++i)
            myStack.push(i);
        myStack.pop();
        myStack.print();
    }
}
