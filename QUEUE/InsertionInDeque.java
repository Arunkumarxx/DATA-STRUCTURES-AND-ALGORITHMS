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
        {
            
        }
    }
    public static void main(String[] args) {

    }

}
