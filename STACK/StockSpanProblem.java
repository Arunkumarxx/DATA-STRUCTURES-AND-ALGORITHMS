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
    private void push(int value1,int value2)
    {
        StackNode newNode =new StackNode(value1,value2);
        newNode.next=head;
        head=newNode;
    }

    private int [] top()
    {

        return head.data;
    }
    private int [] pop()
    {
            int[] res = head.data;
            head = head.next;
            return res;
    }
    private boolean isEmpty()
    {
        return head==null;
    }

    public static int[] calculateSpan(int arr[], int n) {
        StockSpanProblem stack =new StockSpanProblem();
        for(int i=0; i<n; ++i)
        {
            while((stack.isEmpty()))
        }
    }
    public static void main(String[] args) {

    }

}
