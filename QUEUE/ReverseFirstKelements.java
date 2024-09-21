package QUEUE;

import java.util.Stack;

public class ReverseFirstKelements {
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
    public static void main(String[] args) {
        ReverseFirstKelements queue =new ReverseFirstKelements();
        int k=3;
        int p=3;
        for(int i=0; i<=5; ++i)
            queue.add(1); // add ele to q

        Stack<Integer> stack =new Stack<>();
        while(!queue.isEmpty()&& p>=0) {
            stack.push(queue.poll());
            --p;
        }
        ReverseFirstKelements result =new ReverseFirstKelements();
        
    }

}
