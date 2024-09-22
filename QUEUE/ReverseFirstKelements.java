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
        ReverseFirstKelements queue = new ReverseFirstKelements();
        int k = 3;
        for (int i = 1; i <= 5; i++) {
            queue.add(i);
        }
        System.out.println("Original Queue:");
        queue.print();
        System.out.println();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k && !queue.isEmpty(); i++) {
            stack.push(queue.poll());
        }

        ReverseFirstKelements result = new ReverseFirstKelements();
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }
        System.out.println("After reverse:");
        while (!queue.isEmpty()) {
            result.add(queue.poll());
        }


        result.print();
    }

}
