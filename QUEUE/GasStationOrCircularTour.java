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
        if(front==null)
            rear=null;
        return x;
    }
    private  boolean isEmpty()

    {
        return rear==null;
    }
    public static void main(String[] args) {
        int []petrol ={1,2,3,4,5};
        int [] distance ={3,4,5,1,2};
        GasStationOrCircularTour Queue =new GasStationOrCircularTour();
        int n1=petrol.length;
        int n2=distance.length;
        for(int i=0; i<n1 ;++i)
        {

        }
    }

}
