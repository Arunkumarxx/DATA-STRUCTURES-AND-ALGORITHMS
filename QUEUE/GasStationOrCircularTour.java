package QUEUE;

public class GasStationOrCircularTour {
    private class QueueNode
    {
        int data;
        QueueNode next;
        QueueNode(int x)
        {
            this.data=x;
            this.next=null;
        }
    }
    QueueNode front,rear;
    private void push(int x)
    {
        QueueNode newNode =new QueueNode(x);
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
    private int pop()
    {
        int x=front.data;
        front=front.next;
        return x;
    }
    public static void main(String[] args) {

    }

}
