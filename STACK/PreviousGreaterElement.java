package STACK;

import java.util.Arrays;

public class PreviousGreaterElement {
    private  StackNode head;

    private class StackNode
    {
        int data;
        StackNode next;

        public StackNode(int value)
        {
            this.data=value;
            this.next=null;
        }
    }
    private void push(int value)
    {
        StackNode newData =new StackNode(value);
        newData.next=head;
        head=newData;
    }
    private int pop()
    {
        int x=head.data;
        head=head.next;
        return x;
    }
    private int top()
    {
        return head.data;
    }
    private boolean isEmpty()
    {
        return head==null;
    }
    public static void main(String[] args) {
        PreviousGreaterElement stack =new PreviousGreaterElement();
        int [] arr = {10, 4, 2, 20, 40, 12, 30};
        int n= arr.length;
        int [] res = new int[n];
        for(int i=0; i<n; ++i)
        {
            while(!stack.isEmpty() && stack.top()<=arr[i])
                stack.pop();
            res[i]=stack.isEmpty()?-1: stack.top();
            stack.push(arr[i]);
        }
        System.out.println(Arrays.toString(res));
    }

}
