package QUEUE;

public class QueueUsingTwoStacks {
    private QueueNode front;
    private QueueNode rear;
    private  class QueueNode
    {
        int data;
        QueueNode next;
        QueueNode (int value)
        {
            this.data=value;
            this.next=null;
        }
    }
    private void add(int value)
    {
        QueueNode newNode =new QueueNode(value);
        if(rear==null)
        {
            front=rear=newNode;
        }
        else
        {
            rear.next=newNode;
            rear=newNode;
        }
    }
    private int poll()
    {
        if(isEmpty())
            return -1;
        int x=front.data;
        front= front.next;
        if(front==null)
            rear=null;
        return x;
    }
    private boolean isEmpty()
    {
        return rear==null;
    }
    private void print()
    {
        QueueNode temp = front;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        
    }

}
