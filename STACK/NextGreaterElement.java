package STACK;

import java.util.Arrays;
import java.util.Random;

public class NextGreaterElement {
    private StackNode head;
    private class StackNode
    {
        long data;
        StackNode next;

        StackNode(long value)
        {
            this.data=value;
            this.next=null;
        }
    }
    private void push(long value)
    {
        StackNode newNode =new StackNode (value);
        newNode.next=head;
        head=newNode;
    }
    private boolean isEmpty()
    {
        return head==null;
    }
    private long pop()
    {
        long value=head.data;
        head=head.next;
        return value;
    }
    private long top()
    {
        return head.data;
    }
    public static long[] nextLargerElement(long[] arr, int n)
    {
       NextGreaterElement stack =new NextGreaterElement();
        long [] res = new long[n];
        for(int i=n-1; i>=0; --i)
        {
            while(!stack.isEmpty() && stack.top()<=arr[i])
                stack.pop();
            res[i]=stack.isEmpty()?-1:stack.top();
            stack.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int n=4;
        long [] arr =new long[4];
        Random random =new Random();
        for(int i=0; i<n;++i)
        {
            arr[i]=random.nextInt(1,9);
        }
        System.out.println(Arrays.toString(nextLargerElement(arr,n)));
    }

}
