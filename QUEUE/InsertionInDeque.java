package QUEUE;


public class InsertionInDeque {
    private class DequeNode{
        int data;
        DequeNode next;
        DequeNode prev;
        DequeNode(int value)
        {
            this.data=value;
            this.next=null;
            this.prev=null;
        }
    }
    DequeNode front,rear;
    private void addFirst(int value)
    {
        DequeNode newNode =new DequeNode(value);
        if(front==null)
            front=rear=newNode;
        else
        {
            front.prev=newNode;
            newNode.next=front;
            front=newNode;
        }
    }
    private int popLast()
    {
        if(rear==null)
            return -1;
        int x=rear.data;
        rear=rear.prev;
        if(rear==null)
            front=null;
        else
        {
            rear.next=null;
        }
        return x;
    }
    private int popFirst()
    {
        if(front==null)
            return -1;
        int x=front.data;
        front=front.next;
        if(front==null)
            rear = null;
        else
        {
            front.prev=null;
        }
        return x;
    }
    private void addLast(int value)
    {
        DequeNode newNode = new DequeNode(value);
        if(rear==null)
            front=rear=newNode;
        else
        {
            rear.next=newNode;
            newNode.prev=rear;
            rear=newNode;
        }
    }
    private boolean isEmpty()
    {
        return rear==null;
    }
    private void printDeque() {
        DequeNode current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertionInDeque Deque =new InsertionInDeque();
        for(int i=1 ;i<=5; ++i)
        {
            Deque.addLast(i);
        }
        for(int i=1;i<=5;++i)
            Deque.addFirst(i);
        Deque.printDeque();

    }

}
