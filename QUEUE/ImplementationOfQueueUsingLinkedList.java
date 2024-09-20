package QUEUE;

public class ImplementationOfQueueUsingLinkedList {
    class QueueNode
    {
        int data;
        QueueNode next;
        QueueNode(int a)
        {
            data = a;
            next = null;
        }
    }
    QueueNode front, rear;
    MyQueue()
    {
        this.front=null;
        this.rear=null;
    }
    //Function to push an element into the queue.
    void push(int a)
    {
        QueueNode newNode=new QueueNode (a);
        if(rear==null)
        {
            front=rear=newNode;
        }
        else  {
            rear.next=newNode;
            rear=newNode;
        }
    }

    //Function to pop front element from the queue.
    int pop()
    {
        // Your code here
        if(front!=null)
        {
            int x=front.data;
            front=front.next;
            if(front==null)
                rear=null;
            return x;
        }
        return -1;
    }
    public static void main(String[] args) {

    }

}
