package STACK;

import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {
    private StackNode head;

    private class StackNode
    {
        int [] data;
        StackNode next;

        StackNode(int data1,int data2)
        {
            this.data=new int[2];
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
       return head!=null? head.data:null;
    }
    private int [] pop()
    {
        if(isEmpty()) return null;
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
        int [] res =new int[n];
        for(int i=0; i<n; ++i)
        {
            while((!stack.isEmpty()) && stack.top()[0]<=arr[i])
                stack.pop();
            res[i]=stack.isEmpty()?i+1:i-stack.top()[1];
            stack.push(arr[i],i);
        }
        return res;
    }
    public static void main(String[] args) {
        int [] arr = {10,4,5,90,120,80};
        System.out.println(Arrays.toString(calculateSpan(arr, arr.length)));
    }

}
