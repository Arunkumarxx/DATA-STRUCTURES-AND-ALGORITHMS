package STACK;

import java.util.Stack;

public class StockSpanProblem {
    private StackNode head;

    private class StackNode
    {
        int [] data;
        StackNode next;

        StackNode(int data1,int data2)
        {
            this.data[0]=data1;
            this.data[1]=data2;
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
