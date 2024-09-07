package STACK;

public class StockSpanProblem {
    private StackNode head;

    private class StackNode
    {
        int data;
        StackNode next;

        StackNode(int data)
        {
            this.data=data;
            this.next=null;
        }

    }
    private void push(int value)
    {
        StackNode newNode =new StackNode(value);
    }
    public static int[] calculateSpan(int arr[], int n) {

    }
    public static void main(String[] args) {

    }

}
