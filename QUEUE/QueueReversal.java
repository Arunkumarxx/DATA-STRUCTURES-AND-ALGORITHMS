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
    private  void revereseQueue(QueueReversal queue)
    {

        if(queue.isEmpty())
            return ;
        Integer ele=queue.poll();
        revereseQueue(queue);
        queue.add(ele);
    }
    public static void main(String[] args) {
        QueueReversal queue =new QueueReversal();
        queue.add(1);
        queue.add(10);
        queue.add(20);
       queue.revereseQueue(queue);
       QueueReversal temp =queue;
       while(temp.front!=null)
       {
           System.out.println(temp.front.data+" ");
           temp.front= temp.front.next;
       }
    }
}