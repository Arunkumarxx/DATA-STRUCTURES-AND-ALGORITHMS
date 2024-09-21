package QUEUE;

public class QueueReversal {
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
    private void push(int value)
    {
        QueueNode newNode =new QueueNode(value);
        if(rear==null)
        {
            front=rear=newNode;
        }
        else
        {
            newNode.next
        }
    }

    public static void main(String[] args) {

    }

}
